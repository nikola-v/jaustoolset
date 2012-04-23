/***********           LICENSE HEADER   *******************************JAUS Tool SetCopyright (c)  2010, United States GovernmentAll rights reserved.Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.Neither the name of the United States Government nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. *********************  END OF LICENSE ***********************************/import java.nio.ByteBuffer;import src.urn_org_jts_test_Record3_1_0.Messages.MsgIn;import junit.textui.TestRunner;import junit.framework.TestCase;public class Body3_utst extends TestCase {    private MsgIn m_MsgIn1;    private MsgIn m_MsgIn2;    private MsgIn m_MsgIn3;    public Body3_utst(String name) {        super(name);    }    protected void setUp() {        m_MsgIn1 = new MsgIn();        m_MsgIn2 = new MsgIn();        m_MsgIn3 = new MsgIn();    }    protected void tearDown() {    }    public void testConstructionDefaults() {        System.out.println("");        System.out.print("[executing test (testConstructionDefaults)]: ");        // verifying MsgIn constructs with correct default MessageID"        assertEquals(1, m_MsgIn1.getHeader().getHeaderRec().getMessageID());        assertEquals(1, m_MsgIn2.getHeader().getHeaderRec().getMessageID());        assertEquals(1, m_MsgIn3.getHeader().getHeaderRec().getMessageID());    }    public void testSetGetOperations() {        System.out.println("");        System.out.print("[executing test (testSetGetOperations)(TP_3.3.5.1)]: ");        // verifying setMessageID/getMessageID reciprocity"        m_MsgIn1.getHeader().getHeaderRec().setMessageID(5);        assertEquals(5, m_MsgIn1.getHeader().getHeaderRec().getMessageID());        m_MsgIn1.getHeader().getHeaderRec().setMessageID(1);        assertEquals(1, m_MsgIn1.getHeader().getHeaderRec().getMessageID());        // verifying setField/getField reciprocity"            m_MsgIn1.getBody3().getRecord3().setField1((byte) 126);        m_MsgIn2.getBody3().getRecord3().setField1((byte) -127);        m_MsgIn1.getBody3().getRecord3().setField2(-40000);        m_MsgIn2.getBody3().getRecord3().setField2(43210);        m_MsgIn1.getBody3().getRecord3().setField3((float) 0.5);        m_MsgIn2.getBody3().getRecord3().setField3((float) -32.125);        m_MsgIn1.getBody3().getRecord3().setField4((short) 255);        m_MsgIn2.getBody3().getRecord3().setField4((short) 0);        assertEquals(126, m_MsgIn1.getBody3().getRecord3().getField1());        assertEquals(-127, m_MsgIn2.getBody3().getRecord3().getField1());        assertEquals(-40000, m_MsgIn1.getBody3().getRecord3().getField2());        assertEquals(43210, m_MsgIn2.getBody3().getRecord3().getField2());        assertEquals(0.5f, m_MsgIn1.getBody3().getRecord3().getField3(), 0.0001f);        assertEquals(-32.125f, m_MsgIn2.getBody3().getRecord3().getField3(), 0.0001f);        assertEquals(255, m_MsgIn1.getBody3().getRecord3().getField4());        assertEquals(0, m_MsgIn2.getBody3().getRecord3().getField4());    }    public void testEncodeToSpec() {        ByteBuffer buff = ByteBuffer.allocate(1024);        int i;        System.out.println("");        System.out.print("[executing test (testEncodeToSpec)(TP_3.3.5.2)]: ");        m_MsgIn1.getHeader().getHeaderRec().setMessageID(513);        m_MsgIn1.getBody3().getRecord3().setField1((byte) 4);        m_MsgIn1.getBody3().getRecord3().setField2(134678021);  //1.07112e-31        m_MsgIn1.getBody3().getRecord3().setField3((float) 0.00000000000000000000000000000010711190335780293799599209044936);        m_MsgIn1.getBody3().getRecord3().setField4((short) 13);        // verifying message level encode is AS-5684 compliant"        m_MsgIn1.encode(buff, 0);        for (i = 0; i < m_MsgIn1.getSize(); i++) {            assertEquals(i + 1, buff.get(i));        }        m_MsgIn3.getHeader().getHeaderRec().setMessageID(513);        m_MsgIn3.getBody3().getRecord3().setField1((byte) 1);        m_MsgIn3.getBody3().getRecord3().setField3((float) .000000000000000000000000000000000000094774254455822359527052518093217);        // verifying message level encode is AS-5684 compliant regarding optional fields"        m_MsgIn3.encode(buff, 0);        for (i = 0; i < m_MsgIn3.getSize(); i++) {            assertEquals(((i + 1) % 3), buff.get(i));        }    }    public void testEncodeDecodeOperations() {        ByteBuffer buff = ByteBuffer.allocate(1024);        int i;        for (i = 0; i < 1024; i++) {            buff.put(i, (byte) (((4101 * i) + 65543) % 256));        }        System.out.println("");        System.out.print("[executing test (testEncodeDecodeOperations)(TP_3.3.5.3)]: ");        // verifying message level encode/decode reciprocity"        m_MsgIn1.getHeader().getHeaderRec().setMessageID(41);        m_MsgIn1.getBody3().getRecord3().setField1((byte) 24);        m_MsgIn1.getBody3().getRecord3().setField2(25);        m_MsgIn1.getBody3().getRecord3().setField3((float) -16.75);        m_MsgIn1.getBody3().getRecord3().setField4((short) 27);        m_MsgIn2.getHeader().getHeaderRec().setMessageID(127);        m_MsgIn2.getBody3().getRecord3().setField1((byte) 127);        m_MsgIn2.getBody3().getRecord3().setField2(127);        m_MsgIn2.getBody3().getRecord3().setField3((float) 127);        m_MsgIn2.getBody3().getRecord3().setField4((short) 127);        m_MsgIn1.encode(buff, 0);        m_MsgIn2.decode(buff, 0);        assertEquals(41, m_MsgIn2.getHeader().getHeaderRec().getMessageID());        assertEquals(24, m_MsgIn2.getBody3().getRecord3().getField1());        assertEquals(25, m_MsgIn2.getBody3().getRecord3().getField2());        assertEquals(-16.75f, m_MsgIn2.getBody3().getRecord3().getField3(), 0.0001f);        assertEquals(27, m_MsgIn2.getBody3().getRecord3().getField4());        // verifying message level encode/decode reciprocity with optional fields"        m_MsgIn3.getHeader().getHeaderRec().setMessageID(513);        m_MsgIn3.getBody3().getRecord3().setField1((byte) 1);        m_MsgIn3.getBody3().getRecord3().setField3((float) 3.5);        m_MsgIn3.encode(buff, 0);        m_MsgIn2.decode(buff, 0);        assertEquals(513, m_MsgIn2.getHeader().getHeaderRec().getMessageID());        assertEquals(1, m_MsgIn2.getBody3().getRecord3().getField1());        assertEquals(25, m_MsgIn2.getBody3().getRecord3().getField2());        assertEquals(3.5f, m_MsgIn2.getBody3().getRecord3().getField3(), 0.0001f);        assertEquals(27, m_MsgIn2.getBody3().getRecord3().getField4());        // verifying header level encode/decode reciprocity"        m_MsgIn2.getHeader().getHeaderRec().setMessageID(0);        m_MsgIn1.getHeader().encode(buff, 0);        m_MsgIn2.getHeader().decode(buff, 0);        assertEquals(41, m_MsgIn2.getHeader().getHeaderRec().getMessageID());        m_MsgIn2.getHeader().getHeaderRec().setMessageID(0);        m_MsgIn1.getHeader().getHeaderRec().encode(buff, 0);        m_MsgIn2.getHeader().getHeaderRec().decode(buff, 0);        assertEquals(41, m_MsgIn2.getHeader().getHeaderRec().getMessageID());        // verifying record level encode/decode reciprocity"        m_MsgIn2.getBody3().getRecord3().setField1((byte) 0);        m_MsgIn2.getBody3().getRecord3().setField2(0);        m_MsgIn2.getBody3().getRecord3().setField3((float) 0);        m_MsgIn2.getBody3().getRecord3().setField4((short) 0);        m_MsgIn1.getBody3().encode(buff, 0);        m_MsgIn2.getBody3().decode(buff, 0);        assertEquals(24, m_MsgIn2.getBody3().getRecord3().getField1());        assertEquals(25, m_MsgIn2.getBody3().getRecord3().getField2());        assertEquals(-16.75f, m_MsgIn2.getBody3().getRecord3().getField3(), 0.0001f);        assertEquals(27, m_MsgIn2.getBody3().getRecord3().getField4());        m_MsgIn2.getBody3().getRecord3().setField1((byte) 0);        m_MsgIn2.getBody3().getRecord3().setField2(0);        m_MsgIn2.getBody3().getRecord3().setField3((float) 0);        m_MsgIn2.getBody3().getRecord3().setField4((short) 0);        m_MsgIn1.getBody3().getRecord3().encode(buff, 0);        m_MsgIn2.getBody3().getRecord3().decode(buff, 0);        assertEquals(24, m_MsgIn2.getBody3().getRecord3().getField1());        assertEquals(25, m_MsgIn2.getBody3().getRecord3().getField2());        assertEquals(-16.75f, m_MsgIn2.getBody3().getRecord3().getField3(), 0.0001f);        assertEquals(27, m_MsgIn2.getBody3().getRecord3().getField4());    }    public void testEquality() {        System.out.println("");        System.out.print("[executing test (testEquality)]: ");        // verifying message equality operator"            assertTrue(m_MsgIn1.isEqual(m_MsgIn1));        assertTrue(m_MsgIn1.isEqual(m_MsgIn2));        assertTrue(m_MsgIn2.isEqual(m_MsgIn1));    }    public void testInequality() {        System.out.println("");        System.out.print("[executing test (testInequality)]: ");        // verifying message inequality operator"            assertFalse(m_MsgIn1.notEquals(m_MsgIn2));        assertFalse(m_MsgIn2.notEquals(m_MsgIn1));    }    public static void main(String[] args) {        System.out.println("Executing suite JTSBody3MessageTest");        TestRunner.run(Body3_utst.class);        System.out.println("Completed suite JTSBody3MessageTest");        System.out.println("------------------------------------------------");    }};