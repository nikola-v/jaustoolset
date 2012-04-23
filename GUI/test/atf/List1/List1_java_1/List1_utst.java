/***********           LICENSE HEADER   *******************************JAUS Tool SetCopyright (c)  2010, United States GovernmentAll rights reserved.Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.Neither the name of the United States Government nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. *********************  END OF LICENSE ***********************************/import java.nio.ByteBuffer;import src.urn_org_jts_test_List1_1_0.Messages.MsgIn;import junit.textui.TestRunner;import junit.framework.TestCase;public class List1_utst extends TestCase {    private MsgIn m_MsgIn1;    private MsgIn m_MsgIn2;    public List1_utst(String name) {        super(name);    }    protected void setUp() {        m_MsgIn1 = new MsgIn();        m_MsgIn2 = new MsgIn();    }    protected void tearDown() {    }    public void testConstructionDefaults() {        System.out.println("");        System.out.print("[executing test (testConstructionDefaults)]: ");        // verifying MsgIn constructs with correct default MessageID"        assertEquals(1, m_MsgIn1.getHeader().getHeaderRec().getMessageID());        assertEquals(1, m_MsgIn2.getHeader().getHeaderRec().getMessageID());        // verifying MsgIn constructs with default empty lists"        assertEquals(0, m_MsgIn1.getBody().getList1().getNumberOfElements());        assertEquals(0, m_MsgIn2.getBody().getList1().getNumberOfElements());    }    public void testSetGetOperations() {        System.out.println("");        System.out.print("[executing test (testSetGetOperations)(TP_3.3.5.1)]: ");        // verifying setMessageID/getMessageID reciprocity"        m_MsgIn1.getHeader().getHeaderRec().setMessageID(5);        assertEquals(5, m_MsgIn1.getHeader().getHeaderRec().getMessageID());        m_MsgIn1.getHeader().getHeaderRec().setMessageID(1);        assertEquals(1, m_MsgIn1.getHeader().getHeaderRec().getMessageID());        // verifying setField/getField reciprocity"        MsgIn.Body.List1.Record1 R1 = new MsgIn.Body.List1.Record1();        MsgIn.Body.List1.Record1 R2 = new MsgIn.Body.List1.Record1();        R1.setField1((byte) 5);        R1.setField2(500);        R2.setField1((byte) 6);        R2.setField2(600);        m_MsgIn1.getBody().getList1().addElement(R1);        m_MsgIn2.getBody().getList1().addElement(R2);        assertEquals(5, m_MsgIn1.getBody().getList1().getElement(0).getField1());        assertEquals(500, m_MsgIn1.getBody().getList1().getElement(0).getField2());        assertEquals(6, m_MsgIn2.getBody().getList1().getElement(0).getField1());        assertEquals(600, m_MsgIn2.getBody().getList1().getElement(0).getField2());        m_MsgIn2.getBody().getList1().getElement(0).setField1((byte) 5);        m_MsgIn2.getBody().getList1().getElement(0).setField2(500);        assertEquals(m_MsgIn2.getBody().getList1().getElement(0).getField1(), m_MsgIn1.getBody().getList1().getElement(0).getField1());        assertEquals(m_MsgIn2.getBody().getList1().getElement(0).getField2(), m_MsgIn1.getBody().getList1().getElement(0).getField2());        // Test copy constructor        // verifying copy constructor"        MsgIn copy1 = m_MsgIn1;        assertEquals(copy1, m_MsgIn1);        assertEquals(copy1.getBody().getList1().getNumberOfElements(), m_MsgIn1.getBody().getList1().getNumberOfElements());    }    public void testEncodeToSpec() {        ByteBuffer buff = ByteBuffer.allocate(1024);        int i;        MsgIn.Body.List1.Record1 R1 = new MsgIn.Body.List1.Record1();        MsgIn.Body.List1.Record1 R2 = new MsgIn.Body.List1.Record1();        System.out.println("");        System.out.print("[executing test (testEncodeToSpec)(TP_3.3.5.2)]: ");        m_MsgIn1.getHeader().getHeaderRec().setMessageID(256);        R1.setField1((byte) 3);        R1.setField2(117835012);        R2.setField1((byte) 8);        R2.setField2(202050057);        m_MsgIn1.getBody().getList1().addElement(R1);        m_MsgIn1.getBody().getList1().addElement(R2);        // verifying message level encode is AS-5684 compliant"        m_MsgIn1.encode(buff, 0);        for (i = 0; i < m_MsgIn1.getSize(); i++) {            assertEquals(i, buff.get(i));        }    }    public void testEncodeDecodeOperations() {        ByteBuffer buff = ByteBuffer.allocate(1024);        int i;        MsgIn.Body.List1.Record1 R1 = new MsgIn.Body.List1.Record1();        MsgIn.Body.List1.Record1 R2 = new MsgIn.Body.List1.Record1();        MsgIn.Body.List1.Record1 R3 = new MsgIn.Body.List1.Record1();        for (i = 0; i < 1024; i++) {            buff.put(i, (byte) (((2101 * i) + 65543) % 256));        }        System.out.println("");        System.out.print("[executing test (testEncodeDecodeOperations)(TP_3.3.5.3)]: ");        // verifying message level encode/decode reciprocity"        m_MsgIn1.getHeader().getHeaderRec().setMessageID(41);        m_MsgIn1.getBody().getList1().addElement(R1);        m_MsgIn1.getBody().getList1().addElement(R2);        m_MsgIn1.getBody().getList1().getElement(0).setField1((byte) 15);        m_MsgIn1.getBody().getList1().getElement(0).setField2(300);        m_MsgIn1.getBody().getList1().getElement(1).setField1((byte) 0);        m_MsgIn1.getBody().getList1().getElement(1).setField2(65825);        m_MsgIn2.getHeader().getHeaderRec().setMessageID(127);        m_MsgIn2.getBody().getList1().addElement(R3);        m_MsgIn2.getBody().getList1().getElement(0).setField1((byte) 127);        m_MsgIn2.getBody().getList1().getElement(0).setField2(127);        m_MsgIn1.encode(buff, 0);        m_MsgIn2.decode(buff, 0);        assertEquals(41, m_MsgIn2.getHeader().getHeaderRec().getMessageID());        assertEquals(2, m_MsgIn2.getBody().getList1().getNumberOfElements());        assertEquals(15, m_MsgIn2.getBody().getList1().getElement(0).getField1());        assertEquals(300, m_MsgIn2.getBody().getList1().getElement(0).getField2());        assertEquals(0, m_MsgIn2.getBody().getList1().getElement(1).getField1());        assertEquals(65825, m_MsgIn2.getBody().getList1().getElement(1).getField2());        // verifying header level encode/decode reciprocity"        m_MsgIn2.getHeader().getHeaderRec().setMessageID(0);        m_MsgIn1.getHeader().encode(buff, 0);        m_MsgIn2.getHeader().decode(buff, 0);        assertEquals(41, m_MsgIn2.getHeader().getHeaderRec().getMessageID());        m_MsgIn2.getHeader().getHeaderRec().setMessageID(0);        m_MsgIn1.getHeader().getHeaderRec().encode(buff, 0);        m_MsgIn2.getHeader().getHeaderRec().decode(buff, 0);        assertEquals(41, m_MsgIn2.getHeader().getHeaderRec().getMessageID());        // verifying body level encode/decode reciprocity"        m_MsgIn2.getBody().getList1().getElement(0).setField1((byte) 255);        m_MsgIn2.getBody().getList1().getElement(0).setField2(255);        m_MsgIn2.getBody().getList1().getElement(1).setField1((byte) 255);        m_MsgIn2.getBody().getList1().getElement(1).setField2(255);        R1 = new MsgIn.Body.List1.Record1();        R1.setField1((byte) 255);        R1.setField2(255);        m_MsgIn2.getBody().getList1().addElement(R1);        m_MsgIn1.getBody().encode(buff, 0);        m_MsgIn2.getBody().decode(buff, 0);        assertEquals(2, m_MsgIn2.getBody().getList1().getNumberOfElements());        assertEquals(15, m_MsgIn2.getBody().getList1().getElement(0).getField1());        assertEquals(300, m_MsgIn2.getBody().getList1().getElement(0).getField2());        assertEquals(0, m_MsgIn2.getBody().getList1().getElement(1).getField1());        assertEquals(65825, m_MsgIn2.getBody().getList1().getElement(1).getField2());        // verifying list level encode/decode reciprocity"        m_MsgIn2.getBody().getList1().getElement(0).setField1((byte) 255);        m_MsgIn2.getBody().getList1().getElement(0).setField2(255);        m_MsgIn2.getBody().getList1().getElement(1).setField1((byte) 255);        m_MsgIn2.getBody().getList1().getElement(1).setField2(255);        R1 = new MsgIn.Body.List1.Record1();        R1.setField1((byte) 255);        R1.setField2(255);        m_MsgIn2.getBody().getList1().addElement(R1);        m_MsgIn1.getBody().getList1().encode(buff, 0);        m_MsgIn2.getBody().getList1().decode(buff, 0);        assertEquals(2, m_MsgIn2.getBody().getList1().getNumberOfElements());        assertEquals(15, m_MsgIn2.getBody().getList1().getElement(0).getField1());        assertEquals(300, m_MsgIn2.getBody().getList1().getElement(0).getField2());        assertEquals(0, m_MsgIn2.getBody().getList1().getElement(1).getField1());        assertEquals(65825, m_MsgIn2.getBody().getList1().getElement(1).getField2());        // verifying record level encode/decode reciprocity"        m_MsgIn2.getBody().getList1().getElement(0).setField1((byte) 255);        m_MsgIn2.getBody().getList1().getElement(0).setField2(255);        m_MsgIn1.getBody().getList1().getElement(0).encode(buff, 0);        m_MsgIn2.getBody().getList1().getElement(0).decode(buff, 0);        assertEquals(15, m_MsgIn2.getBody().getList1().getElement(0).getField1());        assertEquals(300, m_MsgIn2.getBody().getList1().getElement(0).getField2());    }    public void testEquality() {        System.out.println("");        System.out.print("[executing test (testEquality)]: ");        // verifying message equality operator"            assertTrue(m_MsgIn1.isEqual(m_MsgIn1));        assertTrue(m_MsgIn1.isEqual(m_MsgIn2));        assertTrue(m_MsgIn2.isEqual(m_MsgIn1));    }    public void testInequality() {        System.out.println("");        System.out.print("[executing test (testInequality)]: ");        // verifying message inequality operator"            assertFalse(m_MsgIn1.notEquals(m_MsgIn2));        assertFalse(m_MsgIn2.notEquals(m_MsgIn1));    }    public void testListOperations() {        MsgIn.Body.List1.Record1 R1 = new MsgIn.Body.List1.Record1();        int i, j;        System.out.println("");        System.out.print("[executing test (testListOperations)]: ");        // verifying MsgIn getNumberOfElements with Add and Delete operations"            i = j = 0;        for (i = 0; i < 4; i++) {            assertEquals(i, m_MsgIn1.getBody().getList1().getNumberOfElements());            for (j = 0; j < 4; j++) {                R1 = new MsgIn.Body.List1.Record1();                assertEquals((i * 4) + j, m_MsgIn2.getBody().getList1().getNumberOfElements());                m_MsgIn2.getBody().getList1().addElement(R1);            }            R1 = new MsgIn.Body.List1.Record1();            m_MsgIn1.getBody().getList1().addElement(R1);        }        for (j = 0, i = 16; j < 16; j++, i--) {            assertEquals(i, m_MsgIn2.getBody().getList1().getNumberOfElements());            m_MsgIn2.getBody().getList1().deleteLastElement();        }        // verifying deleteElement preserves order & corrects count of remaining elements"                                  for (i = 0; i < 4; i++) {            m_MsgIn1.getBody().getList1().getElement(i).setField1((byte) (i + 1));            m_MsgIn1.getBody().getList1().getElement(i).setField2((i + 1) * 10);        }        m_MsgIn1.getBody().getList1().deleteElement(0);        assertEquals(3, m_MsgIn1.getBody().getList1().getNumberOfElements());        assertEquals(2, m_MsgIn1.getBody().getList1().getElement(0).getField1());        assertEquals(20, m_MsgIn1.getBody().getList1().getElement(0).getField2());        assertEquals(3, m_MsgIn1.getBody().getList1().getElement(1).getField1());        assertEquals(30, m_MsgIn1.getBody().getList1().getElement(1).getField2());        assertEquals(4, m_MsgIn1.getBody().getList1().getElement(2).getField1());        assertEquals(40, m_MsgIn1.getBody().getList1().getElement(2).getField2());        m_MsgIn1.getBody().getList1().deleteElement(1);        assertEquals(2, m_MsgIn1.getBody().getList1().getNumberOfElements());        assertEquals(2, m_MsgIn1.getBody().getList1().getElement(0).getField1());        assertEquals(20, m_MsgIn1.getBody().getList1().getElement(0).getField2());        assertEquals(4, m_MsgIn1.getBody().getList1().getElement(1).getField1());        assertEquals(40, m_MsgIn1.getBody().getList1().getElement(1).getField2());        m_MsgIn1.getBody().getList1().deleteElement(1);        assertEquals(1, m_MsgIn1.getBody().getList1().getNumberOfElements());        assertEquals(2, m_MsgIn1.getBody().getList1().getElement(0).getField1());        assertEquals(20, m_MsgIn1.getBody().getList1().getElement(0).getField2());        m_MsgIn1.getBody().getList1().deleteElement(0);        assertEquals(0, m_MsgIn1.getBody().getList1().getNumberOfElements());    }    public static void main(String[] args) {        System.out.println("Executing suite JTSList1MessageTest");        TestRunner.run(List1_utst.class);        System.out.println("Completed suite JTSList1MessageTest");        System.out.println("------------------------------------------------");    }}