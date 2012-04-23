/*
 * ex: set ro:
 * DO NOT EDIT.
 * generated by smc (http://smc.sourceforge.net/)
 * from file : Events_ReceiveFSM.sm
 */

#include "urn_jaus_jss_core_Events_1_1/Messages/MessageSet.h"
#include "urn_jaus_jss_core_Events_1_1/Events_ReceiveFSM.h"
#include "include/urn_jaus_jss_core_Events_1_1/Events_ReceiveFSM_sm.h"

using namespace statemap;

namespace urn_jaus_jss_core_Events_1_1
{
    // Static class declarations.
    Events_ReceiveFSM_SM_Receiving_Ready Events_ReceiveFSM_SM::Receiving_Ready("Events_ReceiveFSM_SM::Receiving_Ready", 0);
    Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE Events_ReceiveFSM_SM::Internally_Generated_State_DO_NOT_USE("Events_ReceiveFSM_SM::Internally_Generated_State_DO_NOT_USE", 1);

    void Events_ReceiveFSMState::BroadcastGlobalTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::BroadcastLocalTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::CancelEventTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::CommandCompletedTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::CommandExpiredTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::CreateCommandEventTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::CreateEvntTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::EventErrorTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::EventOccurredTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::QueryEventTimeoutTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::QueryEventsTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::ReceiveTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::ReceiveTransition(Events_ReceiveFSMContext& context, CancelEvent msg, Receive::Body::ReceiveRec transportData)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::ReceiveTransition(Events_ReceiveFSMContext& context, CreateEvnt msg, Receive::Body::ReceiveRec transportData)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::ReceiveTransition(Events_ReceiveFSMContext& context, QueryEventTimeout msg, Receive::Body::ReceiveRec transportData)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::ReceiveTransition(Events_ReceiveFSMContext& context, QueryEvents msg, Receive::Body::ReceiveRec transportData)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::ReceiveTransition(Events_ReceiveFSMContext& context, UpdateEvent msg, Receive::Body::ReceiveRec transportData)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::SendTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::TimeoutTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::UpdateEventTransition(Events_ReceiveFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_ReceiveFSMState::Default(Events_ReceiveFSMContext& context)
    {
        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Default"
                << std::endl;
        }

        throw (
            TransitionUndefinedException(
                context.getState().getName(),
                context.getTransition()));

        return;
    }

    void Events_ReceiveFSM_SM_Receiving_Ready::EventErrorTransition(Events_ReceiveFSMContext& context)
    {
        Events_ReceiveFSM& ctxt(context.getOwner());

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM EventErrorTransition()"
                << std::endl;
        }

        if (ctxt.eventExists())
        {
            Events_ReceiveFSMState& endState = context.getState();

            context.clearState();
            try
            {
                ctxt.sendRejectEventRequestAction();
                context.setState(endState);
            }
            catch (...)
            {
                context.setState(endState);
                throw;
            }
        }
        else
        {
             Events_ReceiveFSM_SM_Default::EventErrorTransition(context);
        }

        return;
    }

    void Events_ReceiveFSM_SM_Receiving_Ready::EventOccurredTransition(Events_ReceiveFSMContext& context)
    {
        Events_ReceiveFSM& ctxt(context.getOwner());

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM EventOccurredTransition()"
                << std::endl;
        }

        if (ctxt.eventExists())
        {
            Events_ReceiveFSMState& endState = context.getState();

            context.clearState();
            try
            {
                ctxt.sendEventAction();
                context.setState(endState);
            }
            catch (...)
            {
                context.setState(endState);
                throw;
            }
        }
        else
        {
             Events_ReceiveFSM_SM_Default::EventOccurredTransition(context);
        }

        return;
    }

    void Events_ReceiveFSM_SM_Receiving_Ready::ReceiveTransition(Events_ReceiveFSMContext& context, CancelEvent msg, Receive::Body::ReceiveRec transportData)
    {
        Events_ReceiveFSM& ctxt(context.getOwner());

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM ReceiveTransition(CancelEvent msg, Receive::Body::ReceiveRec transportData)"
                << std::endl;
        }

        if (! ctxt.eventExists(msg))
        {
            Events_ReceiveFSMState& endState = context.getState();

            context.clearState();
            try
            {
                ctxt.SendAction("RejectEventRequest", msg, transportData);
                context.setState(endState);
            }
            catch (...)
            {
                context.setState(endState);
                throw;
            }
        }
        else if (ctxt.eventExists(msg))
    
    {
            Events_ReceiveFSMState& endState = context.getState();

            context.clearState();
            try
            {
                ctxt.cancelEventAction(msg);
                ctxt.SendAction("ConfirmEventRequest", msg, transportData);
                ctxt.stopEventTimerAction();
                context.setState(endState);
            }
            catch (...)
            {
                context.setState(endState);
                throw;
            }
        }        else
        {
             Events_ReceiveFSM_SM_Default::ReceiveTransition(context, msg, transportData);
        }

        return;
    }

    void Events_ReceiveFSM_SM_Receiving_Ready::ReceiveTransition(Events_ReceiveFSMContext& context, CreateEvnt msg, Receive::Body::ReceiveRec transportData)
    {
        Events_ReceiveFSM& ctxt(context.getOwner());

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM ReceiveTransition(CreateEvnt msg, Receive::Body::ReceiveRec transportData)"
                << std::endl;
        }

        if (ctxt.isSupported(msg) && ! ctxt.eventExists(msg))
        {
            Events_ReceiveFSMState& endState = context.getState();

            context.clearState();
            try
            {
                ctxt.createEventAction(msg);
                ctxt.SendAction("ConfirmEventRequest", msg, transportData);
                ctxt.resetEventTimerAction();
                context.setState(endState);
            }
            catch (...)
            {
                context.setState(endState);
                throw;
            }
        }
        else if (ctxt.isSupported(msg) && ctxt.eventExists(msg))
    
    {
            Events_ReceiveFSMState& endState = context.getState();

            context.clearState();
            try
            {
                ctxt.updateEventAction(msg);
                ctxt.SendAction("ConfirmEventRequest", msg, transportData);
                ctxt.resetEventTimerAction();
                context.setState(endState);
            }
            catch (...)
            {
                context.setState(endState);
                throw;
            }
        }
        else if (! ctxt.isSupported(msg))
    
    {
            Events_ReceiveFSMState& endState = context.getState();

            context.clearState();
            try
            {
                ctxt.SendAction("RejectEventRequest", msg, transportData);
                context.setState(endState);
            }
            catch (...)
            {
                context.setState(endState);
                throw;
            }
        }        else
        {
             Events_ReceiveFSM_SM_Default::ReceiveTransition(context, msg, transportData);
        }

        return;
    }

    void Events_ReceiveFSM_SM_Receiving_Ready::ReceiveTransition(Events_ReceiveFSMContext& context, QueryEventTimeout msg, Receive::Body::ReceiveRec transportData)
    {
        Events_ReceiveFSM& ctxt(context.getOwner());

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM ReceiveTransition(QueryEventTimeout msg, Receive::Body::ReceiveRec transportData)"
                << std::endl;
        }

        Events_ReceiveFSMState& endState = context.getState();

        context.clearState();
        try
        {
            ctxt.SendAction("ReportEventTimeout", msg, transportData);
            context.setState(endState);
        }
        catch (...)
        {
            context.setState(endState);
            throw;
        }

        return;
    }

    void Events_ReceiveFSM_SM_Receiving_Ready::ReceiveTransition(Events_ReceiveFSMContext& context, QueryEvents msg, Receive::Body::ReceiveRec transportData)
    {
        Events_ReceiveFSM& ctxt(context.getOwner());

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM ReceiveTransition(QueryEvents msg, Receive::Body::ReceiveRec transportData)"
                << std::endl;
        }

        Events_ReceiveFSMState& endState = context.getState();

        context.clearState();
        try
        {
            ctxt.SendAction("ReportEvents", msg, transportData);
            context.setState(endState);
        }
        catch (...)
        {
            context.setState(endState);
            throw;
        }

        return;
    }

    void Events_ReceiveFSM_SM_Receiving_Ready::ReceiveTransition(Events_ReceiveFSMContext& context, UpdateEvent msg, Receive::Body::ReceiveRec transportData)
    {
        Events_ReceiveFSM& ctxt(context.getOwner());

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM ReceiveTransition(UpdateEvent msg, Receive::Body::ReceiveRec transportData)"
                << std::endl;
        }

        if (ctxt.isSupported(msg) && ctxt.eventExists(msg))
        {
            Events_ReceiveFSMState& endState = context.getState();

            context.clearState();
            try
            {
                ctxt.updateEventAction(msg);
                ctxt.SendAction("ConfirmEventRequest", msg, transportData);
                ctxt.resetEventTimerAction();
                context.setState(endState);
            }
            catch (...)
            {
                context.setState(endState);
                throw;
            }
        }
        else if (! ctxt.isSupported(msg) || ! ctxt.eventExists(msg))
    
    {
            Events_ReceiveFSMState& endState = context.getState();

            context.clearState();
            try
            {
                ctxt.SendAction("RejectEventRequest", msg, transportData);
                context.setState(endState);
            }
            catch (...)
            {
                context.setState(endState);
                throw;
            }
        }        else
        {
             Events_ReceiveFSM_SM_Default::ReceiveTransition(context, msg, transportData);
        }

        return;
    }

    void Events_ReceiveFSM_SM_Receiving_Ready::TimeoutTransition(Events_ReceiveFSMContext& context)
    {
        Events_ReceiveFSM& ctxt(context.getOwner());

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM TimeoutTransition()"
                << std::endl;
        }

        Events_ReceiveFSMState& endState = context.getState();

        context.clearState();
        try
        {
            ctxt.cancelEventAction();
            ctxt.SendAction("ConfirmEventRequest");
            ctxt.stopEventTimerAction();
            context.setState(endState);
        }
        catch (...)
        {
            context.setState(endState);
            throw;
        }

        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::BroadcastGlobalTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM BroadcastGlobalTransition()"
                << std::endl;
        }


        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::BroadcastLocalTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM BroadcastLocalTransition()"
                << std::endl;
        }


        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::CancelEventTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM CancelEventTransition()"
                << std::endl;
        }


        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::CommandCompletedTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM CommandCompletedTransition()"
                << std::endl;
        }


        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::CommandExpiredTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM CommandExpiredTransition()"
                << std::endl;
        }


        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::CreateCommandEventTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM CreateCommandEventTransition()"
                << std::endl;
        }


        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::CreateEvntTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM CreateEvntTransition()"
                << std::endl;
        }


        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::EventErrorTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM EventErrorTransition()"
                << std::endl;
        }


        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::EventOccurredTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM EventOccurredTransition()"
                << std::endl;
        }


        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::QueryEventTimeoutTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM QueryEventTimeoutTransition()"
                << std::endl;
        }


        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::QueryEventsTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM QueryEventsTransition()"
                << std::endl;
        }


        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::ReceiveTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM ReceiveTransition()"
                << std::endl;
        }


        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::SendTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM SendTransition()"
                << std::endl;
        }


        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::TimeoutTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM TimeoutTransition()"
                << std::endl;
        }


        return;
    }

    void Events_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE::UpdateEventTransition(Events_ReceiveFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_ReceiveFSM_SM UpdateEventTransition()"
                << std::endl;
        }


        return;
    }
}

/*
 * Local variables:
 *  buffer-read-only: t
 * End:
 */
