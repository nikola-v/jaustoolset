/** 
 *  This Promela file was auto-generated using JTS on Wed Apr 13 15:57:02 EDT 2011.
 *  ID=MAIN  vsersion=1.1
 *  DO NOT MODIFY
 *  This file contains type definitions found in the JSIDL that was used to generate it.
 */ 

/** 
 *  This is the main model file and will contain instances of all message channels and state machines.
 */ 

#include "userEditableConfig.pml"
#include "urn_jts_MessageTest_static.pml"

// Create channels for all the messages and events.
#include "channels.pml"


// These includes should come after message and event channels are declared.
#include "userEditableEvents.pml"
#include "userEditableGuardsAndActions.pml"
#include "userEditableClients.pml"


// starting state machine definition : MessageTest
active proctype MessageTest(){
	pid incoming_pid = 0;
	pid current_client_pid = 0;
	urn_jts_MessageTest_UnsignedTestMsg urn_jts_MessageTest_UnsignedTestMsg_inst;
goto MessageTest_State4;
	// Start Entry Actions
	MessageTest_State4:
	do
		:: true ->
		goto MessageTest_State4_IMPL;
	od;
	// End Entry Actions
	MessageTest_State4_IMPL:
	do
		:: UnsignedTestMsg ? incoming_pid, urn_jts_MessageTest_UnsignedTestMsg_inst ->
			if
			// unguarded transition 
			:: true ->
				Action_sendResponse();
				Action_printData();
			fi
			
	od;
}
// ending state machine definition : MessageTest
