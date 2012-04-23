/*
 * ex: set ro:
 * DO NOT EDIT.
 * generated by smc (http://smc.sourceforge.net/)
 * from file : ManagementOCU_ManagementOcuFSM.sm
 */

package src.urn_jts_example_management_ocu_1_0;

import framework.internalEvents.*;
import src.urn_jts_example_management_ocu_1_0.InternalEvents.*;
import src.urn_jts_example_management_ocu_1_0.Messages.*;
import java.io.PrintStream;

public class ManagementOCU_ManagementOcuFSMContext
    extends statemap.FSMContext
{
//---------------------------------------------------------------
// Member methods.
//

    public ManagementOCU_ManagementOcuFSMContext(ManagementOCU_ManagementOcuFSM owner)
    {
        super (ManagementOCU_ManagementOcuFSM_SM.WaitForControl);

        _owner = owner;
    }

    public ManagementOCU_ManagementOcuFSMContext(ManagementOCU_ManagementOcuFSM owner, ManagementOCU_ManagementOcuFSMState initState)
    {
        super (initState);

        _owner = owner;
    }

    public void enterStartState()
    {
        getState().Entry(this);
        return;
    }

    public void ConfirmControlTransition()
    {
        _transition = "ConfirmControlTransition";
        getState().ConfirmControlTransition(this);
        _transition = "";
        return;
    }

    public void ConfirmControlTransition(ConfirmControl msg)
    {
        _transition = "ConfirmControlTransition";
        getState().ConfirmControlTransition(this, msg);
        _transition = "";
        return;
    }

    public void InternalStateChange_To_ManagementOCU_ManagementOcuFSM_HandleMenuTransition(InternalEvent ie)
    {
        _transition = "InternalStateChange_To_ManagementOCU_ManagementOcuFSM_HandleMenuTransition";
        getState().InternalStateChange_To_ManagementOCU_ManagementOcuFSM_HandleMenuTransition(this, ie);
        _transition = "";
        return;
    }

    public void InternalStateChange_To_ManagementOCU_ManagementOcuFSM_WaitForControlTransition(InternalEvent ie)
    {
        _transition = "InternalStateChange_To_ManagementOCU_ManagementOcuFSM_WaitForControlTransition";
        getState().InternalStateChange_To_ManagementOCU_ManagementOcuFSM_WaitForControlTransition(this, ie);
        _transition = "";
        return;
    }

    public void MenuItemEnteredTransition()
    {
        _transition = "MenuItemEnteredTransition";
        getState().MenuItemEnteredTransition(this);
        _transition = "";
        return;
    }

    public void MenuItemEnteredTransition(MenuItemEntered msg)
    {
        _transition = "MenuItemEnteredTransition";
        getState().MenuItemEnteredTransition(this, msg);
        _transition = "";
        return;
    }

    public void RejectControlTransition()
    {
        _transition = "RejectControlTransition";
        getState().RejectControlTransition(this);
        _transition = "";
        return;
    }

    public void RejectControlTransition(RejectControl msg)
    {
        _transition = "RejectControlTransition";
        getState().RejectControlTransition(this, msg);
        _transition = "";
        return;
    }

    public void ReportControlTransition()
    {
        _transition = "ReportControlTransition";
        getState().ReportControlTransition(this);
        _transition = "";
        return;
    }

    public void ReportStatusTransition()
    {
        _transition = "ReportStatusTransition";
        getState().ReportStatusTransition(this);
        _transition = "";
        return;
    }

    public void ReportStatusTransition(ReportStatus msg)
    {
        _transition = "ReportStatusTransition";
        getState().ReportStatusTransition(this, msg);
        _transition = "";
        return;
    }

    public ManagementOCU_ManagementOcuFSMState getState()
        throws statemap.StateUndefinedException
    {
        if (_state == null)
        {
            throw(
                new statemap.StateUndefinedException());
        }

        return ((ManagementOCU_ManagementOcuFSMState) _state);
    }

    protected ManagementOCU_ManagementOcuFSM getOwner()
    {
        return (_owner);
    }

    public void setOwner(ManagementOCU_ManagementOcuFSM owner)
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

    transient private ManagementOCU_ManagementOcuFSM _owner;

//---------------------------------------------------------------
// Inner classes.
//

    public static abstract class ManagementOCU_ManagementOcuFSMState
        extends statemap.State
    {
    //-----------------------------------------------------------
    // Member methods.
    //

        protected ManagementOCU_ManagementOcuFSMState(String name, int id)
        {
            super (name, id);
        }

        protected void Entry(ManagementOCU_ManagementOcuFSMContext context) {}
        protected void Exit(ManagementOCU_ManagementOcuFSMContext context) {}

        protected void ConfirmControlTransition(ManagementOCU_ManagementOcuFSMContext context)
        {
            Default(context);
        }

        protected void ConfirmControlTransition(ManagementOCU_ManagementOcuFSMContext context, ConfirmControl msg)
        {
            Default(context);
        }

        protected void InternalStateChange_To_ManagementOCU_ManagementOcuFSM_HandleMenuTransition(ManagementOCU_ManagementOcuFSMContext context, InternalEvent ie)
        {
            Default(context);
        }

        protected void InternalStateChange_To_ManagementOCU_ManagementOcuFSM_WaitForControlTransition(ManagementOCU_ManagementOcuFSMContext context, InternalEvent ie)
        {
            Default(context);
        }

        protected void MenuItemEnteredTransition(ManagementOCU_ManagementOcuFSMContext context)
        {
            Default(context);
        }

        protected void MenuItemEnteredTransition(ManagementOCU_ManagementOcuFSMContext context, MenuItemEntered msg)
        {
            Default(context);
        }

        protected void RejectControlTransition(ManagementOCU_ManagementOcuFSMContext context)
        {
            Default(context);
        }

        protected void RejectControlTransition(ManagementOCU_ManagementOcuFSMContext context, RejectControl msg)
        {
            Default(context);
        }

        protected void ReportControlTransition(ManagementOCU_ManagementOcuFSMContext context)
        {
            Default(context);
        }

        protected void ReportStatusTransition(ManagementOCU_ManagementOcuFSMContext context)
        {
            Default(context);
        }

        protected void ReportStatusTransition(ManagementOCU_ManagementOcuFSMContext context, ReportStatus msg)
        {
            Default(context);
        }

        protected void Default(ManagementOCU_ManagementOcuFSMContext context)
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

    /* package */ static abstract class ManagementOCU_ManagementOcuFSM_SM
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
        public static final ManagementOCU_ManagementOcuFSM_SM_Default.ManagementOCU_ManagementOcuFSM_SM_WaitForControl WaitForControl =
            new ManagementOCU_ManagementOcuFSM_SM_Default.ManagementOCU_ManagementOcuFSM_SM_WaitForControl("ManagementOCU_ManagementOcuFSM_SM.WaitForControl", 0);
        public static final ManagementOCU_ManagementOcuFSM_SM_Default.ManagementOCU_ManagementOcuFSM_SM_HandleMenu HandleMenu =
            new ManagementOCU_ManagementOcuFSM_SM_Default.ManagementOCU_ManagementOcuFSM_SM_HandleMenu("ManagementOCU_ManagementOcuFSM_SM.HandleMenu", 1);
        public static final ManagementOCU_ManagementOcuFSM_SM_Default.ManagementOCU_ManagementOcuFSM_SM_Internally_Generated_State_DO_NOT_USE Internally_Generated_State_DO_NOT_USE =
            new ManagementOCU_ManagementOcuFSM_SM_Default.ManagementOCU_ManagementOcuFSM_SM_Internally_Generated_State_DO_NOT_USE("ManagementOCU_ManagementOcuFSM_SM.Internally_Generated_State_DO_NOT_USE", 2);
        private static final ManagementOCU_ManagementOcuFSM_SM_Default Default =
            new ManagementOCU_ManagementOcuFSM_SM_Default("ManagementOCU_ManagementOcuFSM_SM.Default", -1);

    }

    protected static class ManagementOCU_ManagementOcuFSM_SM_Default
        extends ManagementOCU_ManagementOcuFSMState
    {
    //-----------------------------------------------------------
    // Member methods.
    //

        protected ManagementOCU_ManagementOcuFSM_SM_Default(String name, int id)
        {
            super (name, id);
        }

    //-----------------------------------------------------------
    // Inner classse.
    //


        private static final class ManagementOCU_ManagementOcuFSM_SM_WaitForControl
            extends ManagementOCU_ManagementOcuFSM_SM_Default
        {
        //-------------------------------------------------------
        // Member methods.
        //

            private ManagementOCU_ManagementOcuFSM_SM_WaitForControl(String name, int id)
            {
                super (name, id);
            }

            protected void ConfirmControlTransition(ManagementOCU_ManagementOcuFSMContext context, ConfirmControl msg)
            {
                ManagementOCU_ManagementOcuFSM ctxt = context.getOwner();

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : ManagementOCU_ManagementOcuFSM_SM.WaitForControl.ConfirmControlTransition(ConfirmControl msg)");
                }

                if (! ctxt.isControlAccepted(msg))
                {

                    (context.getState()).Exit(context);
                    context.clearState();
                    try
                    {
                        ctxt.sendRequestControlAction();
                        ctxt.displayMenuAction();
                        ctxt.processNotifications("WaitForControl", null);
                    }
                    finally
                    {
                        context.setState(ManagementOCU_ManagementOcuFSM_SM.WaitForControl);
                        (context.getState()).Entry(context);
                    }
                }
                else if (ctxt.isControlAccepted(msg))
                {

                    (context.getState()).Exit(context);
                    context.clearState();
                    try
                    {
                        ctxt.displayMenuAction();
                        ctxt.processNotifications("HandleMenu", null);
                    }
                    finally
                    {
                        context.setState(ManagementOCU_ManagementOcuFSM_SM.HandleMenu);
                        (context.getState()).Entry(context);
                    }
                }                else
                {
                    super.ConfirmControlTransition(context, msg);
                }

                return;
            }

            protected void InternalStateChange_To_ManagementOCU_ManagementOcuFSM_HandleMenuTransition(ManagementOCU_ManagementOcuFSMContext context, InternalEvent ie)
            {
                ManagementOCU_ManagementOcuFSM ctxt = context.getOwner();

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : ManagementOCU_ManagementOcuFSM_SM.WaitForControl.InternalStateChange_To_ManagementOCU_ManagementOcuFSM_HandleMenuTransition(InternalEvent ie)");
                }


                (context.getState()).Exit(context);
                context.clearState();
                try
                {
                    ctxt.displayMenuAction();
                    ctxt.processNotifications("HandleMenu", ie);
                }
                finally
                {
                    context.setState(ManagementOCU_ManagementOcuFSM_SM.HandleMenu);
                    (context.getState()).Entry(context);
                }
                return;
            }

            protected void MenuItemEnteredTransition(ManagementOCU_ManagementOcuFSMContext context, MenuItemEntered msg)
            {
                ManagementOCU_ManagementOcuFSM ctxt = context.getOwner();

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : ManagementOCU_ManagementOcuFSM_SM.WaitForControl.MenuItemEnteredTransition(MenuItemEntered msg)");
                }

                if (!ctxt.isSelectionToEnd(msg))
                {

                    (context.getState()).Exit(context);
                    context.clearState();
                    try
                    {
                        ctxt.printMessageAction("waiting for AccessControl process to end");
                        ctxt.sendRequestControlAction();
                        ctxt.displayMenuAction();
                        ctxt.processNotifications("WaitForControl", null);
                    }
                    finally
                    {
                        context.setState(ManagementOCU_ManagementOcuFSM_SM.WaitForControl);
                        (context.getState()).Entry(context);
                    }
                }
                else if (ctxt.isSelectionToEnd(msg))
                {

                    (context.getState()).Exit(context);
                    context.clearState();
                    try
                    {
                        ctxt.terminateServiceAction();
                        ctxt.sendRequestControlAction();
                        ctxt.displayMenuAction();
                        ctxt.processNotifications("WaitForControl", null);
                    }
                    finally
                    {
                        context.setState(ManagementOCU_ManagementOcuFSM_SM.WaitForControl);
                        (context.getState()).Entry(context);
                    }
                }                else
                {
                    super.MenuItemEnteredTransition(context, msg);
                }

                return;
            }

        //-------------------------------------------------------
        // Member data.
        //
        }

        private static final class ManagementOCU_ManagementOcuFSM_SM_HandleMenu
            extends ManagementOCU_ManagementOcuFSM_SM_Default
        {
        //-------------------------------------------------------
        // Member methods.
        //

            private ManagementOCU_ManagementOcuFSM_SM_HandleMenu(String name, int id)
            {
                super (name, id);
            }

            protected void InternalStateChange_To_ManagementOCU_ManagementOcuFSM_WaitForControlTransition(ManagementOCU_ManagementOcuFSMContext context, InternalEvent ie)
            {
                ManagementOCU_ManagementOcuFSM ctxt = context.getOwner();

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : ManagementOCU_ManagementOcuFSM_SM.HandleMenu.InternalStateChange_To_ManagementOCU_ManagementOcuFSM_WaitForControlTransition(InternalEvent ie)");
                }


                (context.getState()).Exit(context);
                context.clearState();
                try
                {
                    ctxt.sendRequestControlAction();
                    ctxt.displayMenuAction();
                    ctxt.processNotifications("WaitForControl", ie);
                }
                finally
                {
                    context.setState(ManagementOCU_ManagementOcuFSM_SM.WaitForControl);
                    (context.getState()).Entry(context);
                }
                return;
            }

            protected void MenuItemEnteredTransition(ManagementOCU_ManagementOcuFSMContext context, MenuItemEntered msg)
            {
                ManagementOCU_ManagementOcuFSM ctxt = context.getOwner();

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : ManagementOCU_ManagementOcuFSM_SM.HandleMenu.MenuItemEnteredTransition(MenuItemEntered msg)");
                }

                if (!ctxt.isSelectionToEnd(msg))
                {

                    (context.getState()).Exit(context);
                    context.clearState();
                    try
                    {
                        ctxt.sendManagementMessageAction(msg);
                        ctxt.displayMenuAction();
                        ctxt.processNotifications("HandleMenu", null);
                    }
                    finally
                    {
                        context.setState(ManagementOCU_ManagementOcuFSM_SM.HandleMenu);
                        (context.getState()).Entry(context);
                    }
                }
                else if (ctxt.isSelectionToEnd(msg))
                {

                    (context.getState()).Exit(context);
                    context.clearState();
                    try
                    {
                        ctxt.terminateServiceAction();
                        ctxt.displayMenuAction();
                        ctxt.processNotifications("HandleMenu", null);
                    }
                    finally
                    {
                        context.setState(ManagementOCU_ManagementOcuFSM_SM.HandleMenu);
                        (context.getState()).Entry(context);
                    }
                }                else
                {
                    super.MenuItemEnteredTransition(context, msg);
                }

                return;
            }

            protected void RejectControlTransition(ManagementOCU_ManagementOcuFSMContext context, RejectControl msg)
            {
                ManagementOCU_ManagementOcuFSM ctxt = context.getOwner();

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : ManagementOCU_ManagementOcuFSM_SM.HandleMenu.RejectControlTransition(RejectControl msg)");
                }


                (context.getState()).Exit(context);
                context.clearState();
                try
                {
                    ctxt.sendRequestControlAction();
                    ctxt.displayMenuAction();
                    ctxt.processNotifications("WaitForControl", null);
                }
                finally
                {
                    context.setState(ManagementOCU_ManagementOcuFSM_SM.WaitForControl);
                    (context.getState()).Entry(context);
                }
                return;
            }

            protected void ReportStatusTransition(ManagementOCU_ManagementOcuFSMContext context, ReportStatus msg)
            {
                ManagementOCU_ManagementOcuFSM ctxt = context.getOwner();

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : ManagementOCU_ManagementOcuFSM_SM.HandleMenu.ReportStatusTransition(ReportStatus msg)");
                }


                (context.getState()).Exit(context);
                context.clearState();
                try
                {
                    ctxt.displayStatusAction(msg);
                    ctxt.displayMenuAction();
                    ctxt.processNotifications("HandleMenu", null);
                }
                finally
                {
                    context.setState(ManagementOCU_ManagementOcuFSM_SM.HandleMenu);
                    (context.getState()).Entry(context);
                }
                return;
            }

        //-------------------------------------------------------
        // Member data.
        //
        }

        private static final class ManagementOCU_ManagementOcuFSM_SM_Internally_Generated_State_DO_NOT_USE
            extends ManagementOCU_ManagementOcuFSM_SM_Default
        {
        //-------------------------------------------------------
        // Member methods.
        //

            private ManagementOCU_ManagementOcuFSM_SM_Internally_Generated_State_DO_NOT_USE(String name, int id)
            {
                super (name, id);
            }

            protected void ConfirmControlTransition(ManagementOCU_ManagementOcuFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : ManagementOCU_ManagementOcuFSM_SM.Internally_Generated_State_DO_NOT_USE.ConfirmControlTransition()");
                }


                return;
            }

            protected void MenuItemEnteredTransition(ManagementOCU_ManagementOcuFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : ManagementOCU_ManagementOcuFSM_SM.Internally_Generated_State_DO_NOT_USE.MenuItemEnteredTransition()");
                }


                return;
            }

            protected void RejectControlTransition(ManagementOCU_ManagementOcuFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : ManagementOCU_ManagementOcuFSM_SM.Internally_Generated_State_DO_NOT_USE.RejectControlTransition()");
                }


                return;
            }

            protected void ReportControlTransition(ManagementOCU_ManagementOcuFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : ManagementOCU_ManagementOcuFSM_SM.Internally_Generated_State_DO_NOT_USE.ReportControlTransition()");
                }


                return;
            }

            protected void ReportStatusTransition(ManagementOCU_ManagementOcuFSMContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : ManagementOCU_ManagementOcuFSM_SM.Internally_Generated_State_DO_NOT_USE.ReportStatusTransition()");
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
