
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
import java.nio.ByteBuffer;
import src.urn_org_jts_test_Array5_1_0.Messages.MsgIn;
import junit.textui.TestRunner;
import junit.framework.TestCase;

public class Array5_utst extends TestCase {

    private MsgIn m_MsgIn1;
    private MsgIn m_MsgIn2;

    public Array5_utst(String name) {
        super(name);
    }

    protected void setUp() {
        m_MsgIn1 = new MsgIn();
        m_MsgIn2 = new MsgIn();
    }

    protected void tearDown() {
    }

    public void testConstructionDefaults() {
        System.out.println("");
        System.out.print("[executing test (testConstructionDefaults)]: ");

        // verifying MsgIn constructs with correct default DimensionSize"
        assertEquals(9, m_MsgIn1.getBody().getRecord().getArray5().getDimension1Size());
        assertEquals(9, m_MsgIn2.getBody().getRecord().getArray5().getDimension1Size());
    }

    public void testSetGetOperations() {
        System.out.println("");
        System.out.print("[executing test (testSetGetOperations)(TP_3.3.5.1)]: ");

        // verifying setField/getField reciprocity"    
        int i;
        for (i = 0; i < m_MsgIn1.getBody().getRecord().getArray5().getDimension1Size(); i++) {
            m_MsgIn1.getBody().getRecord().getArray5().setField1(i, (byte)((i + 1) * 2));
            m_MsgIn2.getBody().getRecord().getArray5().setField1(i, (byte)((i + 3) * 2));
        }

        for (i = 0; i < m_MsgIn1.getBody().getRecord().getArray5().getDimension1Size(); i++) {
            assertEquals(((i + 1) * 2), m_MsgIn1.getBody().getRecord().getArray5().getField1(i));
            assertEquals(((i + 3) * 2), m_MsgIn2.getBody().getRecord().getArray5().getField1(i));
        }

    }

    public void testEncodeToSpec() {
        ByteBuffer buff = ByteBuffer.allocate(1024);
        int i;

        System.out.println("");
        System.out.print("[executing test (testEncodeToSpec)(TP_3.3.5.2)]: ");

        for (i = 0; i < m_MsgIn1.getBody().getRecord().getArray5().getDimension1Size(); i++) {
            m_MsgIn1.getBody().getRecord().getArray5().setField1(i, (byte)i);
        }

        // verifying message level encode is AS-5684 compliant"
        m_MsgIn1.encode(buff, 0);
        for (i = 0; i < m_MsgIn1.getSize(); i++) {
            assertEquals(i, buff.get(i));
        }

    }

    public void testEncodeDecodeOperations() {
        ByteBuffer buff = ByteBuffer.allocate(1024);
        int i;

        for (i = 0; i < 1024; i++) {
            buff.put(i, (byte) (((4101 * i) + 65543) % 256));
        }

        System.out.println("");
        System.out.print("[executing test (testEncodeDecodeOperations)(TP_3.3.5.3)]: ");

        // verifying message level encode/decode reciprocity"

        for (i = 0; i < m_MsgIn1.getBody().getRecord().getArray5().getDimension1Size(); i++) {
            m_MsgIn1.getBody().getRecord().getArray5().setField1(i, (byte)((i + 1) * 7));
            m_MsgIn2.getBody().getRecord().getArray5().setField1(i, (byte)0);
        }
        m_MsgIn1.encode(buff, 0);
        m_MsgIn2.decode(buff, 0);

        for (i = 0; i < m_MsgIn1.getBody().getRecord().getArray5().getDimension1Size(); i++) {
            assertEquals(((i + 1) * 7), m_MsgIn2.getBody().getRecord().getArray5().getField1(i));
        }

        // verifying record level encode/decode reciprocity"

        for (i = 0; i < m_MsgIn1.getBody().getRecord().getArray5().getDimension1Size(); i++) {
            m_MsgIn2.getBody().getRecord().getArray5().setField1(i, (byte)0);
        }

        m_MsgIn1.getBody().encode(buff, 0);
        m_MsgIn2.getBody().decode(buff, 0);
        for (i = 0; i < m_MsgIn1.getBody().getRecord().getArray5().getDimension1Size(); i++) {
            assertEquals(((i + 1) * 7), m_MsgIn2.getBody().getRecord().getArray5().getField1(i));
        }

        for (i = 0; i < m_MsgIn1.getBody().getRecord().getArray5().getDimension1Size(); i++) {
            m_MsgIn2.getBody().getRecord().getArray5().setField1(i, (byte)0);
        }

        m_MsgIn1.getBody().getRecord().encode(buff, 0);
        m_MsgIn2.getBody().getRecord().decode(buff, 0);
        for (i = 0; i < m_MsgIn1.getBody().getRecord().getArray5().getDimension1Size(); i++) {
            assertEquals(((i + 1) * 7), m_MsgIn2.getBody().getRecord().getArray5().getField1(i));
        }

        for (i = 0; i < m_MsgIn1.getBody().getRecord().getArray5().getDimension1Size(); i++) {
            m_MsgIn2.getBody().getRecord().getArray5().setField1(i, (byte)0);
        }

        m_MsgIn1.getBody().getRecord().getArray5().encode(buff, 0);
        m_MsgIn2.getBody().getRecord().getArray5().decode(buff, 0);
        for (i = 0; i < m_MsgIn1.getBody().getRecord().getArray5().getDimension1Size(); i++) {
            assertEquals(((i + 1) * 7), m_MsgIn2.getBody().getRecord().getArray5().getField1(i));
        }
    }

    public void testEquality() {
        System.out.println("");
        System.out.print("[executing test (testEquality)]: ");
        // verifying message equality operator"    
        assertEquals(true, m_MsgIn1.isEqual(m_MsgIn2));
    }

    public void testInequality() {
        System.out.println("");
        System.out.print("[executing test (testInequality)]: ");
        // verifying message inequality operator"    

        assertEquals(false, m_MsgIn1.notEquals(m_MsgIn2));
    }

    public static void main(String[] args) {
        System.out.println("Executing suite JTSArray5MessageTest");
        TestRunner.run(Array5_utst.class);
        System.out.println("Completed suite JTSArray5MessageTest");
        System.out.println("------------------------------------------------");
    }
};
