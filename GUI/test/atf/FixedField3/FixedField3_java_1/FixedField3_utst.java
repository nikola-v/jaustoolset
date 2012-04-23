/***********           LICENSE HEADER   *******************************JAUS Tool SetCopyright (c)  2010, United States GovernmentAll rights reserved.Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.Neither the name of the United States Government nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. *********************  END OF LICENSE ***********************************/import java.nio.ByteBuffer;import src.urn_org_jts_test_FixedField3_1_0.Messages.MsgIn;import junit.textui.TestRunner;import junit.framework.TestCase;public class FixedField3_utst extends TestCase {    private MsgIn m_MsgIn1;    private MsgIn m_MsgIn2;    public FixedField3_utst(String name) {        super(name);    }    protected void setUp() {        m_MsgIn1 = new MsgIn();        m_MsgIn2 = new MsgIn();    }    protected void tearDown() {    }    public void testConstructionDefaults() {        System.out.println("");        System.out.print("[executing test (testConstructionDefaults)]: ");        // verifying MsgIn constructs with correct default MessageID"        assertEquals(1, m_MsgIn1.getHeader().getHeaderRec().getMessageID());        assertEquals(1, m_MsgIn2.getHeader().getHeaderRec().getMessageID());    }    public void testSetGetOperations() {        System.out.println("");        System.out.print("[executing test (testSetGetOperations)(TP_3.3.5.1)]: ");        // verifying setMessageID/getMessageID reciprocity"        m_MsgIn1.getHeader().getHeaderRec().setMessageID(5);        assertEquals(5, m_MsgIn1.getHeader().getHeaderRec().getMessageID());        m_MsgIn1.getHeader().getHeaderRec().setMessageID(1);        assertEquals(1, m_MsgIn1.getHeader().getHeaderRec().getMessageID());        // verifying setFixedField3/getFixedField3 reciprocity"            m_MsgIn1.getBody().getRecord1().setFixedField3(0);        m_MsgIn2.getBody().getRecord1().setFixedField3(10);        assertEquals(0, m_MsgIn1.getBody().getRecord1().getFixedField3());        assertEquals(10, m_MsgIn2.getBody().getRecord1().getFixedField3());        m_MsgIn1.getBody().getRecord1().setFixedField3(3);        m_MsgIn2.getBody().getRecord1().setFixedField3(5);        assertEquals(3, m_MsgIn1.getBody().getRecord1().getFixedField3());        assertEquals(5, m_MsgIn2.getBody().getRecord1().getFixedField3());        // verifying setFixedField3/getFixedField3 enforcement of bounds"        m_MsgIn1.getBody().getRecord1().setFixedField3(12);        m_MsgIn2.getBody().getRecord1().setFixedField3(2000);        assertEquals(3, m_MsgIn1.getBody().getRecord1().getFixedField3());        assertEquals(5, m_MsgIn2.getBody().getRecord1().getFixedField3());    }    public void testEncodeToSpec() {        ByteBuffer buff = ByteBuffer.allocate(1024);        int i;        System.out.println("");        System.out.print("[executing test (testEncodeToSpec)(TP_3.3.5.2)]: ");        m_MsgIn1.getHeader().getHeaderRec().setMessageID(256);        m_MsgIn1.getBody().getRecord1().setFixedField3(2);        // verifying message level encode is AS-5684 compliant"        m_MsgIn1.encode(buff, 0);        for (i = 0; i < m_MsgIn1.getSize() - 1; i++) {            assertEquals(i, buff.get(i));        }        assertEquals(0, buff.get((int) (m_MsgIn1.getSize() - 1)));    }    public void testEncodeDecodeOperations() {        ByteBuffer buff = ByteBuffer.allocate(1024);        int i;        for (i = 0; i < 1024; i++) {            buff.put(i, (byte) (((2101 * i) + 65543) % 256));        }        System.out.println("");        System.out.print("[executing test (testEncodeDecodeOperations)(TP_3.3.5.3)]: ");        // verifying message level encode/decode reciprocity"        m_MsgIn1.getHeader().getHeaderRec().setMessageID(41);        m_MsgIn1.getBody().getRecord1().setFixedField3(5);        m_MsgIn2.getHeader().getHeaderRec().setMessageID(127);        m_MsgIn2.getBody().getRecord1().setFixedField3(127);        m_MsgIn1.encode(buff, 0);        m_MsgIn2.decode(buff, 0);        assertEquals(41, m_MsgIn2.getHeader().getHeaderRec().getMessageID());        assertEquals(5, m_MsgIn2.getBody().getRecord1().getFixedField3());        // verifying header level encode/decode reciprocity"        m_MsgIn2.getHeader().getHeaderRec().setMessageID(0);        m_MsgIn1.getHeader().encode(buff, 0);        m_MsgIn2.getHeader().decode(buff, 0);        assertEquals(41, m_MsgIn2.getHeader().getHeaderRec().getMessageID());        m_MsgIn2.getHeader().getHeaderRec().setMessageID(0);        m_MsgIn1.getHeader().getHeaderRec().encode(buff, 0);        m_MsgIn2.getHeader().getHeaderRec().decode(buff, 0);        assertEquals(41, m_MsgIn2.getHeader().getHeaderRec().getMessageID());        // verifying record level encode/decode reciprocity"        m_MsgIn2.getBody().getRecord1().setFixedField3(0);        m_MsgIn1.getBody().encode(buff, 0);        m_MsgIn2.getBody().decode(buff, 0);        assertEquals(5, m_MsgIn2.getBody().getRecord1().getFixedField3());        m_MsgIn2.getBody().getRecord1().setFixedField3(0);        m_MsgIn1.getBody().getRecord1().encode(buff, 0);        m_MsgIn2.getBody().getRecord1().decode(buff, 0);        assertEquals(5, m_MsgIn2.getBody().getRecord1().getFixedField3());    }    public void testEquality() {        System.out.println("");        System.out.print("[executing test (testEquality)]: ");        // verifying message equality operator"            assertTrue(m_MsgIn1.isEqual(m_MsgIn1));        assertTrue(m_MsgIn1.isEqual(m_MsgIn2));        assertTrue(m_MsgIn2.isEqual(m_MsgIn1));    }    public void testInequality() {        System.out.println("");        System.out.print("[executing test (testInequality)]: ");        // verifying message inequality operator"            assertFalse(m_MsgIn1.notEquals(m_MsgIn2));        assertFalse(m_MsgIn2.notEquals(m_MsgIn1));    }    public static void main(String[] args) {        System.out.println("Executing suite JTSFixedField3MessageTest");        TestRunner.run(FixedField3_utst.class);        System.out.println("Completed suite JTSFixedField3MessageTest");        System.out.println("------------------------------------------------");    }}