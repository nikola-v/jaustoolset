/***********           LICENSE HEADER   *******************************JAUS Tool SetCopyright (c)  2010, United States GovernmentAll rights reserved.Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.Neither the name of the United States Government nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. *********************  END OF LICENSE ***********************************/package src;import junit.textui.TestRunner;import junit.framework.TestCase;import java.nio.ByteBuffer;
import java.nio.ByteOrder;import framework.internalEvents.Receive;import framework.messages.Message;import src.urn_org_jts_test_Child_1_0.Messages.*;public class Inheritence1_utst extends TestCase {	// Derive a class from the target component so we can instrument it...    class TestComponent extends Inheritence1_java	{	    public TestComponent(int subsystem, short node, short component)		{			super(subsystem, node, component);        }		public String getState(int layer)		{		    if (layer == 0) return ((src.urn_org_jts_test_Parent_1_0.ParentService) serviceList.get(layer)).pParent_Parent1FSM.getStateName();			if (layer == 1) return ((src.urn_org_jts_test_Intermediary_1_0.IntermediaryService) serviceList.get(layer)).pIntermediary_Parent1FSM.getStateName();			if (layer == 2) return ((src.urn_org_jts_test_Child_1_0.ChildService) serviceList.get(layer)).pChild_Parent1FSM.getStateName();			return "";        }        }	protected void sendMessage( Message msg, Inheritence1_java dest )	{		// First encode the message        long bufsize = msg.getSize();
        ByteBuffer buffer = ByteBuffer.allocate((int) bufsize);
		buffer.order(ByteOrder.LITTLE_ENDIAN);
		buffer.clear();	int pos = 0;
        msg.encode(buffer, pos);	     // To inject a message directly into the component, we need		 // to wrap it in a receive event and spoof the source.		 Receive event = new Receive();		 event.getBody().getReceiveRec().getMessagePayload().set( bufsize, buffer );		 event.getBody().getReceiveRec().setSrcSubsystemID(160);		 event.getBody().getReceiveRec().setSrcNodeID((short)1);		 event.getBody().getReceiveRec().setSrcComponentID((short)1);		 // Now wedge the event into the component...		 dest.processInternalEvent( event );		 // Sleep for a bit to let the event percolate through...		 try {			Thread.sleep(500);		} catch (Exception e) {}        }    public Inheritence1_utst(String name) {        super(name);    }    @Override    protected void setUp() {    }    @Override    protected void tearDown() {    }    public void testParentTransitions() {        System.out.println("");        System.out.print("Checking transitions between parent states: ");        TestComponent cmpt = new TestComponent(160, (short) 1, (short) 1);		cmpt.startComponent();        // Send it a message ParentInputMessage1 to transition        sendMessage( new ParentInputMessage1(), cmpt );		assertEquals("Parent_Parent1FSM_SM.Top2", cmpt.getState(0));		assertEquals("Intermediary_Parent1FSM_SM.Top2_Intermediary1", cmpt.getState(1));		assertEquals("Child_Parent1FSM_SM.Top2_Intermediary1", cmpt.getState(2));        // Put it back using ParentInputMessage2        sendMessage( new ParentInputMessage2(), cmpt );		assertEquals("Parent_Parent1FSM_SM.Top1", cmpt.getState(0));		assertEquals("Intermediary_Parent1FSM_SM.Top1_Intermediary1", cmpt.getState(1));		assertEquals("Child_Parent1FSM_SM.Top1_Intermediary1", cmpt.getState(2));		// and stop the component		cmpt.shutdownComponent();    }    public void testIntermediaryTransitions() {        System.out.println("");        System.out.print("Checking transitions between intermediary states:");        TestComponent cmpt = new TestComponent(160, (short) 1, (short) 1);		cmpt.startComponent();        // Send it a message ParentInputMessage1 to transition to Top2_Intermediary1        sendMessage( new ParentInputMessage1(), cmpt );		assertEquals("Parent_Parent1FSM_SM.Top2", cmpt.getState(0));		assertEquals("Intermediary_Parent1FSM_SM.Top2_Intermediary1", cmpt.getState(1));		assertEquals("Child_Parent1FSM_SM.Top2_Intermediary1", cmpt.getState(2));        // Put it into Top2_Intermediary2        sendMessage( new IntermediaryInputMessage1(), cmpt );		assertEquals("Parent_Parent1FSM_SM.Top2", cmpt.getState(0));		assertEquals("Intermediary_Parent1FSM_SM.Top2_Intermediary2", cmpt.getState(1));		assertEquals("Child_Parent1FSM_SM.Top2_Intermediary2", cmpt.getState(2));        // Put it back to the initial Top1_Intermediary1 state        sendMessage( new ParentInputMessage2(), cmpt );		assertEquals("Parent_Parent1FSM_SM.Top1", cmpt.getState(0));		assertEquals("Intermediary_Parent1FSM_SM.Top1_Intermediary1", cmpt.getState(1));		assertEquals("Child_Parent1FSM_SM.Top1_Intermediary1", cmpt.getState(2));		// and stop the component		cmpt.shutdownComponent();    }    public void testChildTransitions() {        System.out.println("");        System.out.print("Checking transitions between child states: ");        TestComponent cmpt = new TestComponent(160, (short) 1, (short) 1);		cmpt.startComponent();        // Send it a message ParentInputMessage1 to transition to Top2_Intermediary1        sendMessage( new ParentInputMessage1(), cmpt );		assertEquals("Parent_Parent1FSM_SM.Top2", cmpt.getState(0));		assertEquals("Intermediary_Parent1FSM_SM.Top2_Intermediary1", cmpt.getState(1));		assertEquals("Child_Parent1FSM_SM.Top2_Intermediary1", cmpt.getState(2));        // Top2_Intemediary1 does not support pim1 message.  Verify that this tickles the default transition        sendMessage( new ParentInputMessage1(), cmpt );		assertEquals("Parent_Parent1FSM_SM.Top2", cmpt.getState(0));		assertEquals("Intermediary_Parent1FSM_SM.Top2_Intermediary1", cmpt.getState(1));		assertEquals("Child_Parent1FSM_SM.Top2_Intermediary1", cmpt.getState(2));        // Lastly, the CIM3 message should transition back to the Top1_Intermediary1 state        sendMessage( new ChildInputMessage3(), cmpt );		assertEquals("Parent_Parent1FSM_SM.Top1", cmpt.getState(0));		assertEquals("Intermediary_Parent1FSM_SM.Top1_Intermediary1", cmpt.getState(1));		assertEquals("Child_Parent1FSM_SM.Top1_Intermediary1", cmpt.getState(2));        // Send it a message ParentInputMessage1 to transition to Top2_Intermediary1        sendMessage( new ParentInputMessage1(), cmpt );		assertEquals("Parent_Parent1FSM_SM.Top2", cmpt.getState(0));		assertEquals("Intermediary_Parent1FSM_SM.Top2_Intermediary1", cmpt.getState(1));		assertEquals("Child_Parent1FSM_SM.Top2_Intermediary1", cmpt.getState(2));        // Put it into Top2_Intermediary2        sendMessage( new IntermediaryInputMessage1(), cmpt );		assertEquals("Parent_Parent1FSM_SM.Top2", cmpt.getState(0));		assertEquals("Intermediary_Parent1FSM_SM.Top2_Intermediary2", cmpt.getState(1));		assertEquals("Child_Parent1FSM_SM.Top2_Intermediary2", cmpt.getState(2));        // From Top2_Intermediary2, pim1 and cim3 are not supported.  These should do nothing        sendMessage( new ParentInputMessage1(), cmpt );		assertEquals("Parent_Parent1FSM_SM.Top2", cmpt.getState(0));		assertEquals("Intermediary_Parent1FSM_SM.Top2_Intermediary2", cmpt.getState(1));		assertEquals("Child_Parent1FSM_SM.Top2_Intermediary2", cmpt.getState(2));        		sendMessage( new ChildInputMessage3(), cmpt );		assertEquals("Parent_Parent1FSM_SM.Top2", cmpt.getState(0));		assertEquals("Intermediary_Parent1FSM_SM.Top2_Intermediary2", cmpt.getState(1));		assertEquals("Child_Parent1FSM_SM.Top2_Intermediary2", cmpt.getState(2));        // From Top2_Intermediary2, a default internal transition causes us to stay in the same state        sendMessage( new ChildInputMessage2(), cmpt );		assertEquals("Parent_Parent1FSM_SM.Top2", cmpt.getState(0));		assertEquals("Intermediary_Parent1FSM_SM.Top2_Intermediary2", cmpt.getState(1));		assertEquals("Child_Parent1FSM_SM.Top2_Intermediary2", cmpt.getState(2));;        /*   As of Drew's update Dec 4, a simple default transition returns to the original nested state */        sendMessage( new ChildInputMessage1(), cmpt );		assertEquals("Parent_Parent1FSM_SM.Top2", cmpt.getState(0));		assertEquals("Intermediary_Parent1FSM_SM.Top2_Intermediary2", cmpt.getState(1));		assertEquals("Child_Parent1FSM_SM.Top2_Intermediary2", cmpt.getState(2));		// and stop the component		cmpt.shutdownComponent();    }    public static void main(String[] args) {        System.out.println("Executing suite JTSInheritenceTest");        TestRunner.run(Inheritence1_utst.class);        System.out.println("Completed suite JTSInheritenceTest");        System.out.println("------------------------------------------------");    }};