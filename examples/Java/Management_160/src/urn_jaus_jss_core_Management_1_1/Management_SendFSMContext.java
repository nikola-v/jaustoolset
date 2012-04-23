/*
 * ex: set ro:
 * DO NOT EDIT.
 * generated by smc (http://smc.sourceforge.net/)
 * from file : Management_SendFSM.sm
 */

package src.urn_jaus_jss_core_Management_1_1;

import framework.internalEvents.*;
import src.urn_jaus_jss_core_Management_1_1.InternalEvents.*;
import src.urn_jaus_jss_core_Management_1_1.Messages.*;
import java.io.PrintStream;

public class Management_SendFSMContext
    extends statemap.FSMContext
{
//---------------------------------------------------------------
// Member methods.
//

    public Management_SendFSMContext(Management_SendFSM owner)
    {
        super (Management_SendFSM_SM.Sending);

        _owner = owner;
    }

    public Management_SendFSMContext(Management_SendFSM owner, Management_SendFSMState initState)
    {
        super (initState);

        _owner = owner;
    }

    public void enterStartState()
    {
        getState().Entry(this);
        return;
    }

    public void BroadcastGlobalTransition()
    {
        _transition = "BroadcastGlobalTransition";
        getState().BroadcastGlobalTransition(this);
        _transition = "";
        return;
    }

    public void BroadcastLocalTransition()
    {
        _transition = "BroadcastLocalTransition";
        getState().BroadcastLocalTransition(this);
        _transition = "";
        return;
    }

    public void CancelEventTransition()
    {
        _transition = "CancelEventTransition";
        getState().CancelEventTransition(this);
        _transition = "";
        return;
    }

    public void ClearEmergencyTransition()
    {
        _transition = "ClearEmergencyTransition";
        getState().ClearEmergencyTransition(this);
        _transition = "";
        return;
    }

    public void CommandCompletedTransition()
    {
        _transition = "CommandCompletedTransition";
        getState().CommandCompletedTransition(this);
        _transition = "";
        return;
    }

    public void CommandExpiredTransition()
    {
        _transition = "CommandExpiredTransition";
        getState().CommandExpiredTransition(this);
        _transition = "";
        return;
    }

    public void CreateCommandEventTransition()
    {
        _transition = "CreateCommandEventTransition";
        getState().CreateCommandEventTransition(this);
        _transition = "";
        return;
    }

    public void CreateEventTransition()
    {
        _transition = "CreateEventTransition";
        getState().CreateEventTransition(this);
        _transition = "";
        return;
    }

    public void EventErrorTransition()
    {
        _transition = "EventErrorTransition";
        getState().EventErrorTransition(this);
        _transition = "";
        return;
    }

    public void EventOccurredTransition()
    {
        _transition = "EventOccurredTransition";
        getState().EventOccurredTransition(this);
        _transition = "";
        return;
    }

    public void FailureTransition()
    {
        _transition = "FailureTransition";
        getState().FailureTransition(this);
        _transition = "";
        return;
    }

    public void InitializedTransition()
    {
        _transition = "InitializedTransition";
        getState().InitializedTransition(this);
        _transition = "";
        return;
    }

    public void QueryAuthorityTransition()
    {
        _transition = "QueryAuthorityTransition";
        getState().QueryAuthorityTransition(this);
        _transition = "";
        return;
    }

    public void QueryControlTransition()
    {
        _transition = "QueryControlTransition";
        getState().QueryControlTransition(this);
        _transition = "";
        return;
    }

    public void QueryEventTimeoutTransition()
    {
        _transition = "QueryEventTimeoutTransition";
        getState().QueryEventTimeoutTransition(this);
        _transition = "";
        return;
    }

    public void QueryEventsTransition()
    {
        _transition = "QueryEventsTransition";
        getState().QueryEventsTransition(this);
        _transition = "";
        return;
    }

    public void QueryStatusTransition()
    {
        _transition = "QueryStatusTransition";
        getState().QueryStatusTransition(this);
        _transition = "";
        return;
    }

    public void QueryTimeoutTransition()
    {
        _transition = "QueryTimeoutTransition";
        getState().QueryTimeoutTransition(this);
        _transition = "";
        return;
    }

    public void ReceiveTransition()
    {
        _transition = "ReceiveTransition";
        getState().ReceiveTransition(this);
        _transition = "";
        return;
    }

    public void ReleaseControlTransition()
    {
        _transition = "ReleaseControlTransition";
        getState().ReleaseControlTransition(this);
        _transition = "";
        return;
    }

    public void RequestControlTransition()
    {
        _transition = "RequestControlTransition";
        getState().RequestControlTransition(this);
        _transition = "";
        return;
    }

    public void ResetTransition()
    {
        _transition = "ResetTransition";
        getState().ResetTransition(this);
        _transition = "";
        return;
    }

    public void ResumeTransition()
    {
        _transition = "ResumeTransition";
        getState().ResumeTransition(this);
        _transition = "";
        return;
    }

    public void SendTransition()
    {
        _transition = "SendTransition";
        getState().SendTransition(this);
        _transition = "";
        return;
    }

    public void SetAuthorityTransition()
    {
        _transition = "SetAuthorityTransition";
        getState().SetAuthorityTransition(this);
        _transition = "";
        return;
    }

    public void SetEmergencyTransition()
    {
        _transition = "SetEmergencyTransition";
        getState().SetEmergencyTransition(this);
        _transition = "";
        return;
    }

    public void ShutdownTransition()
    {
        _transition = "ShutdownTransition";
        getState().ShutdownTransition(this);
        _transition = "";
        return;
    }

    public void StandbyTransition()
    {
        _transition = "StandbyTransition";
        getState().StandbyTransition(this);
        _transition = "";
        return;
    }

    public void TimeoutTransition()
    {
        _transition = "TimeoutTransition";
        getState().TimeoutTransition(this);
        _transition = "";
        return;
    }

    public void UpdateEventTransition()
    {
        _transition = "UpdateEventTransition";
        getState().UpdateEventTransition(this);
        _transition = "";
        return;
    }

    public Management_SendFSMState getState()
        throws statemap.StateUndefinedException
    {
        if (_state == null)
        {
            throw(
                new statemap.StateUndefinedException());
        }

        return ((Management_SendFSMState) _state);
    }

    protected Management_SendFSM getOwner()
    {
        return (_owner);
    }

    public void setOwner(Management_SendFSM owner)
    {
        if (owner == null)
        {
            throw (
                new NullPointerException(
                    "null owner"));
        }
        else
        {
            _owner = owner;
        }

        return;
    }

//---------------------------------------------------------------
// Member data.
//

    transient private Management_SendFSM _owner;

//---------------------------------------------------------------
// Inner classes.
//

    public static abstract class Management_SendFSMState
        extends statemap.State
    {
    //-----------------------------------------------------------
    // Member methods.
    //

        protected Management_SendFSMState(String name, int id)
        {
            super (name, id);
        }

        protected void Entry(Management_SendFSMContext context) {}
        protected void Exit(Management_SendFSMContext context) {}

        protected void BroadcastGlobalTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void BroadcastLocalTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void CancelEventTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void ClearEmergencyTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void CommandCompletedTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void CommandExpiredTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void CreateCommandEventTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void CreateEventTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void EventErrorTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void EventOccurredTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void FailureTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void InitializedTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void QueryAuthorityTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void QueryControlTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void QueryEventTimeoutTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void QueryEventsTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void QueryStatusTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void QueryTimeoutTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void ReceiveTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void ReleaseControlTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void RequestControlTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void ResetTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void ResumeTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void SendTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void SetAuthorityTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void SetEmergencyTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void ShutdownTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void StandbyTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void TimeoutTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void UpdateEventTransition(Management_SendFSMContext context)
        {
            Default(context);
        }

        protected void Default(Management_SendFSMContext context)
        {
            if (context.getDebugFlag() == true)
            {
                PrintStream str = 
                    context.getDebugStream();

                str.println(
                    "TRANSITION   : Default");
            }

            throw (
                new statemap.TransitionUndefinedException(
                    "State: " +
                    context.getState().getName() +
                    ", Transition: " +
                    context.getTransition()));
        }

    //-----------------------------------------------------------
    // Member data.
    //
    }

    /* package */ static abstract class Management_SendFSM_SM
    {
    //-----------------------------------------------------------
    // Member methods.
    //

    //-----------------------------------------------------------
    // Member data.
    //

        //-------------------------------------------------------
        // Constants.
        //
        public static final Management_SendFSM_SM_Default.Management_SendFSM_SM_Sending Sending =
            new Management_SendFSM_SM_Default.Management_SendFSM_SM_Sending("Management_SendFSM_SM.Sending", 0);
        public static final Management_SendFSM_SM_Default.Management_SendFSM_SM_Internally_Generated_State_DO_NOT_USE Internally_Generated_State_DO_NOT_USE =
            new Management_SendFSM_SM_Default.Management_SendFSM_SM_Internally_Generated_State_DO_NOT_USE("Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE", 1);
        private static final Management_SendFSM_SM_Default Default =
            new Management_SendFSM_SM_Default("Management_SendFSM_SM.Default", -1);

    }

    protected static class Management_SendFSM_SM_Default
        extends Management_SendFSMState
    {
    //-----------------------------------------------------------
    // Member methods.
    //

        protected Management_SendFSM_SM_Default(String name, int id)
        {
            super (name, id);
        }

    //-----------------------------------------------------------
    // Inner classse.
    //


        private static final class Management_SendFSM_SM_Sending
            extends Management_SendFSM_SM_Default
        {
        //-------------------------------------------------------
        // Member methods.
        //

            private Management_SendFSM_SM_Sending(String name, int id)
            {
                super (name, id);
            }

        //-------------------------------------------------------
        // Member data.
        //
        }

        private static final class Management_SendFSM_SM_Internally_Generated_State_DO_NOT_USE
            extends Management_SendFSM_SM_Default
        {
        //-------------------------------------------------------
        // Member methods.
        //

            private Management_SendFSM_SM_Internally_Generated_State_DO_NOT_USE(String name, int id)
            {
                super (name, id);
            }

            protected void BroadcastGlobalTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.BroadcastGlobalTransition()");
                }


                return;
            }

            protected void BroadcastLocalTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.BroadcastLocalTransition()");
                }


                return;
            }

            protected void CancelEventTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.CancelEventTransition()");
                }


                return;
            }

            protected void ClearEmergencyTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.ClearEmergencyTransition()");
                }


                return;
            }

            protected void CommandCompletedTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.CommandCompletedTransition()");
                }


                return;
            }

            protected void CommandExpiredTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.CommandExpiredTransition()");
                }


                return;
            }

            protected void CreateCommandEventTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.CreateCommandEventTransition()");
                }


                return;
            }

            protected void CreateEventTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.CreateEventTransition()");
                }


                return;
            }

            protected void EventErrorTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.EventErrorTransition()");
                }


                return;
            }

            protected void EventOccurredTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.EventOccurredTransition()");
                }


                return;
            }

            protected void FailureTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.FailureTransition()");
                }


                return;
            }

            protected void InitializedTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.InitializedTransition()");
                }


                return;
            }

            protected void QueryAuthorityTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.QueryAuthorityTransition()");
                }


                return;
            }

            protected void QueryControlTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.QueryControlTransition()");
                }


                return;
            }

            protected void QueryEventTimeoutTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.QueryEventTimeoutTransition()");
                }


                return;
            }

            protected void QueryEventsTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.QueryEventsTransition()");
                }


                return;
            }

            protected void QueryStatusTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.QueryStatusTransition()");
                }


                return;
            }

            protected void QueryTimeoutTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.QueryTimeoutTransition()");
                }


                return;
            }

            protected void ReceiveTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.ReceiveTransition()");
                }


                return;
            }

            protected void ReleaseControlTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.ReleaseControlTransition()");
                }


                return;
            }

            protected void RequestControlTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.RequestControlTransition()");
                }


                return;
            }

            protected void ResetTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.ResetTransition()");
                }


                return;
            }

            protected void ResumeTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.ResumeTransition()");
                }


                return;
            }

            protected void SendTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.SendTransition()");
                }


                return;
            }

            protected void SetAuthorityTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.SetAuthorityTransition()");
                }


                return;
            }

            protected void SetEmergencyTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.SetEmergencyTransition()");
                }


                return;
            }

            protected void ShutdownTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.ShutdownTransition()");
                }


                return;
            }

            protected void StandbyTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.StandbyTransition()");
                }


                return;
            }

            protected void TimeoutTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.TimeoutTransition()");
                }


                return;
            }

            protected void UpdateEventTransition(Management_SendFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : Management_SendFSM_SM.Internally_Generated_State_DO_NOT_USE.UpdateEventTransition()");
                }


                return;
            }

        //-------------------------------------------------------
        // Member data.
        //
        }

    //-----------------------------------------------------------
    // Member data.
    //
    }
}

/*
 * Local variables:
 *  buffer-read-only: t
 * End:
 */