package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateMod.State
import typings.xstate.stateNodeMod.StateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateTransition[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var actions: js.Array[ActionObject[TContext, TEvent]] = js.native
  
  var configuration: js.Array[StateNode[TContext, _, TEvent, ContextTContext[TContext]]] = js.native
  
  var entrySet: js.Array[StateNode[TContext, _, TEvent, ContextTContext[TContext]]] = js.native
  
  var exitSet: js.Array[StateNode[TContext, _, TEvent, ContextTContext[TContext]]] = js.native
  
  /**
    * The source state that preceded the transition.
    */
  var source: js.UndefOr[State[TContext, EventObject, _, ContextTContext[TContext]]] = js.native
  
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]] = js.native
}
object StateTransition {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    configuration: js.Array[StateNode[TContext, _, TEvent, ContextTContext[TContext]]],
    entrySet: js.Array[StateNode[TContext, _, TEvent, ContextTContext[TContext]]],
    exitSet: js.Array[StateNode[TContext, _, TEvent, ContextTContext[TContext]]],
    transitions: js.Array[TransitionDefinition[TContext, TEvent]]
  ): StateTransition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], entrySet = entrySet.asInstanceOf[js.Any], exitSet = exitSet.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateTransition[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class StateTransitionMutableBuilder[Self <: StateTransition[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (StateTransition[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setConfiguration(value: js.Array[StateNode[TContext, _, TEvent, ContextTContext[TContext]]]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationVarargs(value: (StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]])*): Self = StObject.set(x, "configuration", js.Array(value :_*))
    
    @scala.inline
    def setEntrySet(value: js.Array[StateNode[TContext, _, TEvent, ContextTContext[TContext]]]): Self = StObject.set(x, "entrySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrySetVarargs(value: (StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]])*): Self = StObject.set(x, "entrySet", js.Array(value :_*))
    
    @scala.inline
    def setExitSet(value: js.Array[StateNode[TContext, _, TEvent, ContextTContext[TContext]]]): Self = StObject.set(x, "exitSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitSetVarargs(value: (StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]])*): Self = StObject.set(x, "exitSet", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: State[TContext, EventObject, _, ContextTContext[TContext]]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTransitions(value: js.Array[TransitionDefinition[TContext, TEvent]]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionsVarargs(value: (TransitionDefinition[TContext, TEvent])*): Self = StObject.set(x, "transitions", js.Array(value :_*))
  }
}
