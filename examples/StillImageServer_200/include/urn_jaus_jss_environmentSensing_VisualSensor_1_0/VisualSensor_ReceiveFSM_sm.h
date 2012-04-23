#ifndef _H_VISUALSENSOR_RECEIVEFSM_SM
#define _H_VISUALSENSOR_RECEIVEFSM_SM

/*
 * ex: set ro:
 * DO NOT EDIT.
 * generated by smc (http://smc.sourceforge.net/)
 * from file : VisualSensor_ReceiveFSM_sm.sm
 */


#define SMC_USES_IOSTREAMS

#include <statemap.h>

namespace urn_jaus_jss_environmentSensing_VisualSensor_1_0
{
    // Forward declarations.
    class VisualSensor_ReceiveFSM_SM;
    class VisualSensor_ReceiveFSM_SM_Receiving_Ready_NotControlled;
    class VisualSensor_ReceiveFSM_SM_Receiving_Ready_Controlled;
    class VisualSensor_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE;
    class VisualSensor_ReceiveFSM_SM_Default;
    class VisualSensor_ReceiveFSMState;
    class VisualSensor_ReceiveFSMContext;
    class VisualSensor_ReceiveFSM;

    class VisualSensor_ReceiveFSMState :
        public statemap::State
    {
    public:

        VisualSensor_ReceiveFSMState(const char *name, int stateId)
        : statemap::State(name, stateId)
        {};

        virtual void Entry(VisualSensor_ReceiveFSMContext&) {};
        virtual void Exit(VisualSensor_ReceiveFSMContext&) {};

        virtual void BroadcastGlobalTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void BroadcastLocalTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void CancelEventTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void CreateEventTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void EventErrorTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void EventOccurredTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void InternalStateChange_To_VisualSensor_ReceiveFSM_ReceivingTransition(VisualSensor_ReceiveFSMContext& context, JTS::InternalEvent* ie);
        virtual void InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_ReadyTransition(VisualSensor_ReceiveFSMContext& context, JTS::InternalEvent* ie);
        virtual void InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_Ready_ControlledTransition(VisualSensor_ReceiveFSMContext& context, JTS::InternalEvent* ie);
        virtual void InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_Ready_NotControlledTransition(VisualSensor_ReceiveFSMContext& context, JTS::InternalEvent* ie);
        virtual void QueryAuthorityTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void QueryControlTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void QueryEventsTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void QuerySensorGeometricPropertiesTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void QueryTimeoutTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void QueryVisualSensorCapabilitiesTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void QueryVisualSensorConfigurationTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void ReceiveTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void ReceiveTransition(VisualSensor_ReceiveFSMContext& context, QuerySensorGeometricProperties msg, Receive::Body::ReceiveRec transportData);
        virtual void ReceiveTransition(VisualSensor_ReceiveFSMContext& context, QueryVisualSensorCapabilities msg, Receive::Body::ReceiveRec transportData);
        virtual void ReceiveTransition(VisualSensor_ReceiveFSMContext& context, QueryVisualSensorConfiguration msg, Receive::Body::ReceiveRec transportData);
        virtual void ReceiveTransition(VisualSensor_ReceiveFSMContext& context, SetVisualSensorConfiguration msg, Receive::Body::ReceiveRec transportData);
        virtual void ReleaseControlTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void RequestControlTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void SendTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void SetAuthorityTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void SetVisualSensorConfigurationTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void TimeoutTransition(VisualSensor_ReceiveFSMContext& context);
        virtual void UpdateEventTransition(VisualSensor_ReceiveFSMContext& context);

    protected:

        virtual void Default(VisualSensor_ReceiveFSMContext& context);
    };

    class VisualSensor_ReceiveFSM_SM
    {
    public:

        static VisualSensor_ReceiveFSM_SM_Receiving_Ready_NotControlled Receiving_Ready_NotControlled;
        static VisualSensor_ReceiveFSM_SM_Receiving_Ready_Controlled Receiving_Ready_Controlled;
        static VisualSensor_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE Internally_Generated_State_DO_NOT_USE;
    };

    class VisualSensor_ReceiveFSM_SM_Default :
        public VisualSensor_ReceiveFSMState
    {
    public:

        VisualSensor_ReceiveFSM_SM_Default(const char *name, int stateId)
        : VisualSensor_ReceiveFSMState(name, stateId)
        {};

    };

    class VisualSensor_ReceiveFSM_SM_Receiving_Ready_NotControlled :
        public VisualSensor_ReceiveFSM_SM_Default
    {
    public:
        VisualSensor_ReceiveFSM_SM_Receiving_Ready_NotControlled(const char *name, int stateId)
        : VisualSensor_ReceiveFSM_SM_Default(name, stateId)
        {};

        void InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_Ready_ControlledTransition(VisualSensor_ReceiveFSMContext& context, JTS::InternalEvent* ie);
        void ReceiveTransition(VisualSensor_ReceiveFSMContext& context, QuerySensorGeometricProperties msg, Receive::Body::ReceiveRec transportData);
        void ReceiveTransition(VisualSensor_ReceiveFSMContext& context, QueryVisualSensorCapabilities msg, Receive::Body::ReceiveRec transportData);
        void ReceiveTransition(VisualSensor_ReceiveFSMContext& context, QueryVisualSensorConfiguration msg, Receive::Body::ReceiveRec transportData);
    };

    class VisualSensor_ReceiveFSM_SM_Receiving_Ready_Controlled :
        public VisualSensor_ReceiveFSM_SM_Default
    {
    public:
        VisualSensor_ReceiveFSM_SM_Receiving_Ready_Controlled(const char *name, int stateId)
        : VisualSensor_ReceiveFSM_SM_Default(name, stateId)
        {};

        void InternalStateChange_To_VisualSensor_ReceiveFSM_ReceivingTransition(VisualSensor_ReceiveFSMContext& context, JTS::InternalEvent* ie);
        void InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_ReadyTransition(VisualSensor_ReceiveFSMContext& context, JTS::InternalEvent* ie);
        void InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_Ready_NotControlledTransition(VisualSensor_ReceiveFSMContext& context, JTS::InternalEvent* ie);
        void ReceiveTransition(VisualSensor_ReceiveFSMContext& context, QuerySensorGeometricProperties msg, Receive::Body::ReceiveRec transportData);
        void ReceiveTransition(VisualSensor_ReceiveFSMContext& context, QueryVisualSensorCapabilities msg, Receive::Body::ReceiveRec transportData);
        void ReceiveTransition(VisualSensor_ReceiveFSMContext& context, QueryVisualSensorConfiguration msg, Receive::Body::ReceiveRec transportData);
        void ReceiveTransition(VisualSensor_ReceiveFSMContext& context, SetVisualSensorConfiguration msg, Receive::Body::ReceiveRec transportData);
    };

    class VisualSensor_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE :
        public VisualSensor_ReceiveFSM_SM_Default
    {
    public:
        VisualSensor_ReceiveFSM_SM_Internally_Generated_State_DO_NOT_USE(const char *name, int stateId)
        : VisualSensor_ReceiveFSM_SM_Default(name, stateId)
        {};

        void BroadcastGlobalTransition(VisualSensor_ReceiveFSMContext& context);
        void BroadcastLocalTransition(VisualSensor_ReceiveFSMContext& context);
        void CancelEventTransition(VisualSensor_ReceiveFSMContext& context);
        void CreateEventTransition(VisualSensor_ReceiveFSMContext& context);
        void EventErrorTransition(VisualSensor_ReceiveFSMContext& context);
        void EventOccurredTransition(VisualSensor_ReceiveFSMContext& context);
        void QueryAuthorityTransition(VisualSensor_ReceiveFSMContext& context);
        void QueryControlTransition(VisualSensor_ReceiveFSMContext& context);
        void QueryEventsTransition(VisualSensor_ReceiveFSMContext& context);
        void QuerySensorGeometricPropertiesTransition(VisualSensor_ReceiveFSMContext& context);
        void QueryTimeoutTransition(VisualSensor_ReceiveFSMContext& context);
        void QueryVisualSensorCapabilitiesTransition(VisualSensor_ReceiveFSMContext& context);
        void QueryVisualSensorConfigurationTransition(VisualSensor_ReceiveFSMContext& context);
        void ReceiveTransition(VisualSensor_ReceiveFSMContext& context);
        void ReleaseControlTransition(VisualSensor_ReceiveFSMContext& context);
        void RequestControlTransition(VisualSensor_ReceiveFSMContext& context);
        void SendTransition(VisualSensor_ReceiveFSMContext& context);
        void SetAuthorityTransition(VisualSensor_ReceiveFSMContext& context);
        void SetVisualSensorConfigurationTransition(VisualSensor_ReceiveFSMContext& context);
        void TimeoutTransition(VisualSensor_ReceiveFSMContext& context);
        void UpdateEventTransition(VisualSensor_ReceiveFSMContext& context);
    };

    class VisualSensor_ReceiveFSMContext :
        public statemap::FSMContext
    {
    public:

        VisualSensor_ReceiveFSMContext(VisualSensor_ReceiveFSM& owner)
        : FSMContext(VisualSensor_ReceiveFSM_SM::Receiving_Ready_NotControlled),
          _owner(owner)
        {};

        VisualSensor_ReceiveFSMContext(VisualSensor_ReceiveFSM& owner, const statemap::State& state)
        : FSMContext(state),
          _owner(owner)
        {};

        virtual void enterStartState()
        {
            getState().Entry(*this);
            return;
        }

        VisualSensor_ReceiveFSM& getOwner() const
        {
            return (_owner);
        };

        VisualSensor_ReceiveFSMState& getState() const
        {
            if (_state == NULL)
            {
                throw statemap::StateUndefinedException();
            }

            return (dynamic_cast<VisualSensor_ReceiveFSMState&>(*_state));
        };

        void BroadcastGlobalTransition()
        {
            setTransition("BroadcastGlobalTransition");
            (getState()).BroadcastGlobalTransition(*this);
            setTransition(NULL);
        };

        void BroadcastLocalTransition()
        {
            setTransition("BroadcastLocalTransition");
            (getState()).BroadcastLocalTransition(*this);
            setTransition(NULL);
        };

        void CancelEventTransition()
        {
            setTransition("CancelEventTransition");
            (getState()).CancelEventTransition(*this);
            setTransition(NULL);
        };

        void CreateEventTransition()
        {
            setTransition("CreateEventTransition");
            (getState()).CreateEventTransition(*this);
            setTransition(NULL);
        };

        void EventErrorTransition()
        {
            setTransition("EventErrorTransition");
            (getState()).EventErrorTransition(*this);
            setTransition(NULL);
        };

        void EventOccurredTransition()
        {
            setTransition("EventOccurredTransition");
            (getState()).EventOccurredTransition(*this);
            setTransition(NULL);
        };

        void InternalStateChange_To_VisualSensor_ReceiveFSM_ReceivingTransition(JTS::InternalEvent* ie)
        {
            setTransition("InternalStateChange_To_VisualSensor_ReceiveFSM_ReceivingTransition");
            (getState()).InternalStateChange_To_VisualSensor_ReceiveFSM_ReceivingTransition(*this, ie);
            setTransition(NULL);
        };

        void InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_ReadyTransition(JTS::InternalEvent* ie)
        {
            setTransition("InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_ReadyTransition");
            (getState()).InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_ReadyTransition(*this, ie);
            setTransition(NULL);
        };

        void InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_Ready_ControlledTransition(JTS::InternalEvent* ie)
        {
            setTransition("InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_Ready_ControlledTransition");
            (getState()).InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_Ready_ControlledTransition(*this, ie);
            setTransition(NULL);
        };

        void InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_Ready_NotControlledTransition(JTS::InternalEvent* ie)
        {
            setTransition("InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_Ready_NotControlledTransition");
            (getState()).InternalStateChange_To_VisualSensor_ReceiveFSM_Receiving_Ready_NotControlledTransition(*this, ie);
            setTransition(NULL);
        };

        void QueryAuthorityTransition()
        {
            setTransition("QueryAuthorityTransition");
            (getState()).QueryAuthorityTransition(*this);
            setTransition(NULL);
        };

        void QueryControlTransition()
        {
            setTransition("QueryControlTransition");
            (getState()).QueryControlTransition(*this);
            setTransition(NULL);
        };

        void QueryEventsTransition()
        {
            setTransition("QueryEventsTransition");
            (getState()).QueryEventsTransition(*this);
            setTransition(NULL);
        };

        void QuerySensorGeometricPropertiesTransition()
        {
            setTransition("QuerySensorGeometricPropertiesTransition");
            (getState()).QuerySensorGeometricPropertiesTransition(*this);
            setTransition(NULL);
        };

        void QueryTimeoutTransition()
        {
            setTransition("QueryTimeoutTransition");
            (getState()).QueryTimeoutTransition(*this);
            setTransition(NULL);
        };

        void QueryVisualSensorCapabilitiesTransition()
        {
            setTransition("QueryVisualSensorCapabilitiesTransition");
            (getState()).QueryVisualSensorCapabilitiesTransition(*this);
            setTransition(NULL);
        };

        void QueryVisualSensorConfigurationTransition()
        {
            setTransition("QueryVisualSensorConfigurationTransition");
            (getState()).QueryVisualSensorConfigurationTransition(*this);
            setTransition(NULL);
        };

        void ReceiveTransition()
        {
            setTransition("ReceiveTransition");
            (getState()).ReceiveTransition(*this);
            setTransition(NULL);
        };

        void ReceiveTransition(QuerySensorGeometricProperties msg, Receive::Body::ReceiveRec transportData)
        {
            setTransition("ReceiveTransition");
            (getState()).ReceiveTransition(*this, msg, transportData);
            setTransition(NULL);
        };

        void ReceiveTransition(QueryVisualSensorCapabilities msg, Receive::Body::ReceiveRec transportData)
        {
            setTransition("ReceiveTransition");
            (getState()).ReceiveTransition(*this, msg, transportData);
            setTransition(NULL);
        };

        void ReceiveTransition(QueryVisualSensorConfiguration msg, Receive::Body::ReceiveRec transportData)
        {
            setTransition("ReceiveTransition");
            (getState()).ReceiveTransition(*this, msg, transportData);
            setTransition(NULL);
        };

        void ReceiveTransition(SetVisualSensorConfiguration msg, Receive::Body::ReceiveRec transportData)
        {
            setTransition("ReceiveTransition");
            (getState()).ReceiveTransition(*this, msg, transportData);
            setTransition(NULL);
        };

        void ReleaseControlTransition()
        {
            setTransition("ReleaseControlTransition");
            (getState()).ReleaseControlTransition(*this);
            setTransition(NULL);
        };

        void RequestControlTransition()
        {
            setTransition("RequestControlTransition");
            (getState()).RequestControlTransition(*this);
            setTransition(NULL);
        };

        void SendTransition()
        {
            setTransition("SendTransition");
            (getState()).SendTransition(*this);
            setTransition(NULL);
        };

        void SetAuthorityTransition()
        {
            setTransition("SetAuthorityTransition");
            (getState()).SetAuthorityTransition(*this);
            setTransition(NULL);
        };

        void SetVisualSensorConfigurationTransition()
        {
            setTransition("SetVisualSensorConfigurationTransition");
            (getState()).SetVisualSensorConfigurationTransition(*this);
            setTransition(NULL);
        };

        void TimeoutTransition()
        {
            setTransition("TimeoutTransition");
            (getState()).TimeoutTransition(*this);
            setTransition(NULL);
        };

        void UpdateEventTransition()
        {
            setTransition("UpdateEventTransition");
            (getState()).UpdateEventTransition(*this);
            setTransition(NULL);
        };

    private:

        VisualSensor_ReceiveFSM& _owner;
    };
}


/*
 * Local variables:
 *  buffer-read-only: t
 * End:
 */

#endif // _H_VISUALSENSOR_RECEIVEFSM_SM
