#ifndef _H_ADDITIONSERVERSERVICEDEF_ADDITIONSERVERFSM_SM
#define _H_ADDITIONSERVERSERVICEDEF_ADDITIONSERVERFSM_SM

/*
 * ex: set ro:
 * DO NOT EDIT.
 * generated by smc (http://smc.sourceforge.net/)
 * from file : AdditionServerServiceDef_additionServerFSM.sm
 */


#define SMC_USES_IOSTREAMS

#include <statemap.h>

namespace urn_jaus_example_addition_server_1_0
{
    // Forward declarations.
    class AdditionServerServiceDef_additionServerFSM_SM;
    class AdditionServerServiceDef_additionServerFSM_SM_Init;
    class AdditionServerServiceDef_additionServerFSM_SM_Ready;
    class AdditionServerServiceDef_additionServerFSM_SM_Internally_Generated_State_DO_NOT_USE;
    class AdditionServerServiceDef_additionServerFSM_SM_Default;
    class AdditionServerServiceDef_additionServerFSMState;
    class AdditionServerServiceDef_additionServerFSMContext;
    class AdditionServerServiceDef_additionServerFSM;

    class AdditionServerServiceDef_additionServerFSMState :
        public statemap::State
    {
    public:

        AdditionServerServiceDef_additionServerFSMState(const char *name, int stateId)
        : statemap::State(name, stateId)
        {};

        virtual void Entry(AdditionServerServiceDef_additionServerFSMContext&) {};
        virtual void Exit(AdditionServerServiceDef_additionServerFSMContext&) {};

        virtual void InitToReadyEventDefTransition(AdditionServerServiceDef_additionServerFSMContext& context);
        virtual void InternalStateChange_To_AdditionServerServiceDef_additionServerFSM_InitTransition(AdditionServerServiceDef_additionServerFSMContext& context, JTS::InternalEvent* ie);
        virtual void InternalStateChange_To_AdditionServerServiceDef_additionServerFSM_ReadyTransition(AdditionServerServiceDef_additionServerFSMContext& context, JTS::InternalEvent* ie);
        virtual void QueryAdditionTransition(AdditionServerServiceDef_additionServerFSMContext& context);
        virtual void QueryAdditionTransition(AdditionServerServiceDef_additionServerFSMContext& context, QueryAddition msg, unsigned int sender);

    protected:

        virtual void Default(AdditionServerServiceDef_additionServerFSMContext& context);
    };

    class AdditionServerServiceDef_additionServerFSM_SM
    {
    public:

        static AdditionServerServiceDef_additionServerFSM_SM_Init Init;
        static AdditionServerServiceDef_additionServerFSM_SM_Ready Ready;
        static AdditionServerServiceDef_additionServerFSM_SM_Internally_Generated_State_DO_NOT_USE Internally_Generated_State_DO_NOT_USE;
    };

    class AdditionServerServiceDef_additionServerFSM_SM_Default :
        public AdditionServerServiceDef_additionServerFSMState
    {
    public:

        AdditionServerServiceDef_additionServerFSM_SM_Default(const char *name, int stateId)
        : AdditionServerServiceDef_additionServerFSMState(name, stateId)
        {};

    };

    class AdditionServerServiceDef_additionServerFSM_SM_Init :
        public AdditionServerServiceDef_additionServerFSM_SM_Default
    {
    public:
        AdditionServerServiceDef_additionServerFSM_SM_Init(const char *name, int stateId)
        : AdditionServerServiceDef_additionServerFSM_SM_Default(name, stateId)
        {};

        void InitToReadyEventDefTransition(AdditionServerServiceDef_additionServerFSMContext& context);
        void InternalStateChange_To_AdditionServerServiceDef_additionServerFSM_ReadyTransition(AdditionServerServiceDef_additionServerFSMContext& context, JTS::InternalEvent* ie);
    };

    class AdditionServerServiceDef_additionServerFSM_SM_Ready :
        public AdditionServerServiceDef_additionServerFSM_SM_Default
    {
    public:
        AdditionServerServiceDef_additionServerFSM_SM_Ready(const char *name, int stateId)
        : AdditionServerServiceDef_additionServerFSM_SM_Default(name, stateId)
        {};

        void InternalStateChange_To_AdditionServerServiceDef_additionServerFSM_InitTransition(AdditionServerServiceDef_additionServerFSMContext& context, JTS::InternalEvent* ie);
        void QueryAdditionTransition(AdditionServerServiceDef_additionServerFSMContext& context, QueryAddition msg, unsigned int sender);
    };

    class AdditionServerServiceDef_additionServerFSM_SM_Internally_Generated_State_DO_NOT_USE :
        public AdditionServerServiceDef_additionServerFSM_SM_Default
    {
    public:
        AdditionServerServiceDef_additionServerFSM_SM_Internally_Generated_State_DO_NOT_USE(const char *name, int stateId)
        : AdditionServerServiceDef_additionServerFSM_SM_Default(name, stateId)
        {};

        void InitToReadyEventDefTransition(AdditionServerServiceDef_additionServerFSMContext& context);
        void QueryAdditionTransition(AdditionServerServiceDef_additionServerFSMContext& context);
    };

    class AdditionServerServiceDef_additionServerFSMContext :
        public statemap::FSMContext
    {
    public:

        AdditionServerServiceDef_additionServerFSMContext(AdditionServerServiceDef_additionServerFSM& owner)
        : FSMContext(AdditionServerServiceDef_additionServerFSM_SM::Init),
          _owner(owner)
        {};

        AdditionServerServiceDef_additionServerFSMContext(AdditionServerServiceDef_additionServerFSM& owner, const statemap::State& state)
        : FSMContext(state),
          _owner(owner)
        {};

        virtual void enterStartState()
        {
            getState().Entry(*this);
            return;
        }

        AdditionServerServiceDef_additionServerFSM& getOwner() const
        {
            return (_owner);
        };

        AdditionServerServiceDef_additionServerFSMState& getState() const
        {
            if (_state == NULL)
            {
                throw statemap::StateUndefinedException();
            }

            return (dynamic_cast<AdditionServerServiceDef_additionServerFSMState&>(*_state));
        };

        void InitToReadyEventDefTransition()
        {
            setTransition("InitToReadyEventDefTransition");
            (getState()).InitToReadyEventDefTransition(*this);
            setTransition(NULL);
        };

        void InternalStateChange_To_AdditionServerServiceDef_additionServerFSM_InitTransition(JTS::InternalEvent* ie)
        {
            setTransition("InternalStateChange_To_AdditionServerServiceDef_additionServerFSM_InitTransition");
            (getState()).InternalStateChange_To_AdditionServerServiceDef_additionServerFSM_InitTransition(*this, ie);
            setTransition(NULL);
        };

        void InternalStateChange_To_AdditionServerServiceDef_additionServerFSM_ReadyTransition(JTS::InternalEvent* ie)
        {
            setTransition("InternalStateChange_To_AdditionServerServiceDef_additionServerFSM_ReadyTransition");
            (getState()).InternalStateChange_To_AdditionServerServiceDef_additionServerFSM_ReadyTransition(*this, ie);
            setTransition(NULL);
        };

        void QueryAdditionTransition()
        {
            setTransition("QueryAdditionTransition");
            (getState()).QueryAdditionTransition(*this);
            setTransition(NULL);
        };

        void QueryAdditionTransition(QueryAddition msg, unsigned int sender)
        {
            setTransition("QueryAdditionTransition");
            (getState()).QueryAdditionTransition(*this, msg, sender);
            setTransition(NULL);
        };

    private:

        AdditionServerServiceDef_additionServerFSM& _owner;
    };
}


/*
 * Local variables:
 *  buffer-read-only: t
 * End:
 */

#endif // _H_ADDITIONSERVERSERVICEDEF_ADDITIONSERVERFSM_SM
