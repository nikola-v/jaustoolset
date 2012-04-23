/***********           LICENSE HEADER   *******************************
JAUS Tool Set
Copyright (c)  2010, United States Government
All rights reserved.

Redistribution and use in source and binary forms, with or without 
modification, are permitted provided that the following conditions are met:

Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

Redistributions in binary form must reproduce the above copyright 
notice, this list of conditions and the following disclaimer in the 
documentation and/or other materials provided with the distribution.

Neither the name of the United States Government nor the names of 
its contributors may be used to endorse or promote products derived from 
this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
 *********************  END OF LICENSE ***********************************/
package org.jts.docGenerator.indexFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import org.jts.jsidl.binding.ServiceSet;
import org.jts.jsidl.binding.ServiceDef;
import org.jts.jsidl.binding.MessageDef;
import org.jts.jsidl.binding.MessageSet;
import org.jts.jsidl.binding.InputSet;
import org.jts.jsidl.binding.OutputSet;


import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.apache.commons.io.FilenameUtils;
import org.jts.docGenerator.AllDocGeneratorCommon;
import org.jts.docGenerator.indexFiles.binding.Index;
import org.jts.docGenerator.indexFiles.binding.Item;
import org.jts.docGenerator.indexFiles.binding.ObjectFactory;

import org.jts.docGenerator.util.IO;
import org.jts.docGenerator.util.DirectoryScanner;
import org.jts.docGenerator.util.FileFilter;
import org.jts.docGenerator.util.URLHelpers;

/** Builds AllMessageDefinitions.xml. This file contains the {name,url,description,target}
 * set for each file contained in the directory whole path is provided to the
 * build method.
 *
 * @author Eric Thorn $Date: 2008/09/17 16:38:56 $ $Revision: 1.1.1.1 $
 *
 */
public class AllMessageDefinitions {

    private ObjectFactory factory = null;
    Unmarshaller unmarshaller = null;
    private static final String MAIN_TARGET_FRAME = "MainFrame";
    private File path = null;

    public AllMessageDefinitions() {
        try {
            JAXBContext jc = JAXBContext.newInstance("org.jts.jsidl.binding");
            unmarshaller = jc.createUnmarshaller();
        } catch (JAXBException je) {
            je.printStackTrace();
        }

        factory = new ObjectFactory();
    }

    public void build(List serviceSetList, File path) {
        if (path == null) {
            throw new NullPointerException(" null path found. Cannot create allMessageDefinitions.xml");
        }
        if (!path.isDirectory()) {
            throw new IllegalArgumentException(path + " is not a directory. Cannot create allMessageDefinitions.xml");
        }
        if (path.toString().endsWith("messages")) {
            return;
        }

        //System.out.println("Generating allMessageDefinitions.xml for "+path+" ...");

        this.path = path;


        try {
            Index mdi = factory.createIndex();
            mdi.setName("All Message Definitions");
            mdi.setDescription("");

            List mdList = mdi.getItem();

            populateMessageDefinitionList(serviceSetList, mdList, path);

            JAXBContext jc = JAXBContext.newInstance("org.jts.docGenerator.indexFiles.binding");
            Marshaller marshaller = jc.createMarshaller();

            // create index xml file to write to
            FileOutputStream fos = new FileOutputStream(path + File.separator + "allMessageDefinitions.xml");

            // marshal JAXB index object to xml file
            marshaller.marshal(mdi, fos);

            fos.flush();

        } catch (Exception je) {
            je.printStackTrace();
        }
    }

    private List populateMessageDefinitionList(List serviceSetList, List mdList, File path) {
        if (mdList == null || path == null) {
            return null;
        }

        // filter all message xml files
        FileFilter filter = new FileFilter() {

            ArrayList<String> mDefNames = new ArrayList<String>();
            boolean nameAlreadyExists = false;

            /* Accepts Files Ending in .xml extension.
             * @param name File Name.
             * @return Accept or Reject Flag
             */
            public boolean accept(File file) {
                // check to see if message def has already been added to list
                // no duplicates
                for (int nn = 0; nn < mDefNames.size(); nn++) {
                    String name = (String) mDefNames.get(nn);

                    if (name.equalsIgnoreCase(file.getName())) {
                        nameAlreadyExists = true;
                        break;
                    }
                }

                if (!nameAlreadyExists) {
                    mDefNames.add(file.getName());

                    if (file.getName().endsWith(".xml") && file.getParent().endsWith("messages")) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    nameAlreadyExists = false;
                    return false;
                }
            }
        };

        DirectoryScanner scanner = new DirectoryScanner(path, filter);
        List<File> files = scanner.getFileList();

        Collections.sort(files, AllDocGeneratorCommon.FilenameFileComparator.INSTANCE);

        // populate message definition list from file list
        for (File file : files) {
            try {
                String filePath = file.toString();

                // sanity check.
                if (!FilenameUtils.getExtension(filePath).equals("xml")) {
                    throw new RuntimeException(".xml file search returned a "
                            + "file without .xml extension!?");
                }

                InputStream is = IO.getInputStream(file);

                if (is != null) {
                    unmarshaller.unmarshal(is);
                    is.close();
                }

                Item item = factory.createItem();

                String name = FilenameUtils.getBaseName(filePath);
                
                item.setName(name);
                String url = getUrl(filePath);
                item.setUrl(url);

                boolean foundMessageDef = false;

                // get the actual description of the service set and set it as the service set item's description
                for (int jj = 0; jj < serviceSetList.size(); jj++) {
                    ServiceSet sSet = (ServiceSet) serviceSetList.get(jj);
                    List sDefList = sSet.getServiceDef();

                    for (int kk = 0; kk < sDefList.size(); kk++) {
                        ServiceDef sDef = (ServiceDef) sDefList.get(kk);

                        MessageSet mSet = sDef.getMessageSet();
                        InputSet iSet = mSet.getInputSet();
                        OutputSet oSet = mSet.getOutputSet();

                        List iList = iSet.getMessageDefOrDeclaredMessageDef();

                        for (int ll = 0; ll < iList.size(); ll++) {
                            MessageDef mDef = (MessageDef) iList.get(ll);

                            if (mDef.getName().equalsIgnoreCase(item.getName())) {
                                item.setDescription(mDef.getDescription().getContent());
                                foundMessageDef = true;
                                break;
                            }
                        }

                        if (foundMessageDef) {
                            break;
                        }

                        List oList = oSet.getMessageDefOrDeclaredMessageDef();

                        // repeat for output list
                        for (int mm = 0; mm < oList.size(); mm++) {
                            MessageDef mDef = (MessageDef) oList.get(mm);

                            if (mDef.getName().equalsIgnoreCase(item.getName())) {
                                item.setDescription(mDef.getDescription().getContent());
                                foundMessageDef = true;
                                break;
                            }
                        }

                        if (foundMessageDef) {
                            break;
                        }
                    }

                    if (foundMessageDef) {
                        break;
                    }
                }

                item.setTarget(MAIN_TARGET_FRAME);
                mdList.add(item);

            } catch (JAXBException je) {
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }

        return mdList;
    }

    private StringBuilder urlBuilder = new StringBuilder();

    private String getUrl(String url) {
        int len = urlBuilder.length();
        urlBuilder = urlBuilder.delete(0, len);
        urlBuilder.append(url);

        len = urlBuilder.length();
        if (urlBuilder.lastIndexOf(".xml") == (len - 4)) {
            // replace .xml with .html in url
            urlBuilder = urlBuilder.replace(len - 4, len, ".html");

            // remove parent directories
            urlBuilder = urlBuilder.delete(0, path.toString().length() + 1);
            URLHelpers.urlize(urlBuilder);

            return urlBuilder.toString();
        } else {
            //System.out.println("  Error: expected url to .xml file but found "+url);
            return url;
        }
    }
}
