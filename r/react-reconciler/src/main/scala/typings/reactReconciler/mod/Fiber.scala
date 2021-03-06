package typings.reactReconciler.mod

import typings.reactReconciler.anon.StringRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// react-reconciler/ReactFiber
// A Fiber is work on a Component that needs to be done or was done. There can
// be more than one per component.
@js.native
trait Fiber extends StObject {
  
  // Conceptual aliases
  // workInProgress : Fiber ->  alternate The alternate used for reuse happens
  // to be the same as work in progress.
  // __DEV__ only
  var _debugID: js.UndefOr[Double] = js.native
  
  var _debugIsCurrentlyTiming: js.UndefOr[Boolean] = js.native
  
  var _debugOwner: js.UndefOr[Fiber | Null] = js.native
  
  var _debugSource: js.UndefOr[Source | Null] = js.native
  
  // Time spent rendering this Fiber and its descendants for the current update.
  // This tells us how well the tree makes use of sCU for memoization.
  // It is reset to 0 each time we render and only updated when we don't bailout.
  // This field is only set when the enableProfilerTimer flag is enabled.
  var actualDuration: js.UndefOr[Double] = js.native
  
  // If the Fiber is currently active in the "render" phase,
  // This marks the time at which the work began.
  // This field is only set when the enableProfilerTimer flag is enabled.
  var actualStartTime: js.UndefOr[Double] = js.native
  
  // This is a pooled version of a Fiber. Every fiber that gets updated will
  // eventually have a pair. There are cases when we can clean up pairs to save
  // memory if we need to.
  var alternate: Fiber | Null = js.native
  
  // Singly Linked List Tree Structure.
  var child: Fiber | Null = js.native
  
  // This is used to quickly determine if a subtree has no pending changes.
  var childExpirationTime: ExpirationTime = js.native
  
  // Effect
  var effectTag: SideEffectTag = js.native
  
  // The value of element.type which is used to preserve the identity during
  // reconciliation of this child.
  var elementType: js.Any = js.native
  
  // Represents a time in the future by which this work should be completed.
  // Does not include work found in its subtree.
  var expirationTime: ExpirationTime = js.native
  
  // A linked-list of contexts that this fiber depends on
  var firstContextDependency: ContextDependency[_] | Null = js.native
  
  // The first and last fiber with side-effect within this subtree. This allows
  // us to reuse a slice of the linked list when we reuse the work done within
  // this fiber.
  var firstEffect: Fiber | Null = js.native
  
  var index: Double = js.native
  
  // Unique identifier of this child.
  var key: Null | String = js.native
  
  var lastEffect: Fiber | Null = js.native
  
  // This type will be more specific once we overload the tag.
  var memoizedProps: js.Any = js.native
  
  // The state used to create the output
  var memoizedState: js.Any = js.native
  
  // Bitfield that describes properties about the fiber and its subtree. E.g.
  // the ConcurrentMode flag indicates whether the subtree should be async-by-
  // default. When a fiber is created, it inherits the mode of its
  // parent. Additional flags can be set at creation time, but after that the
  // value should remain unchanged throughout the fiber's lifetime, particularly
  // before its child fibers are created.
  var mode: TypeOfMode = js.native
  
  // Singly linked list fast path to the next fiber with side-effects.
  var nextEffect: Fiber | Null = js.native
  
  // Input is the data coming into process this fiber. Arguments. Props.
  var pendingProps: js.Any = js.native
  
  // The ref last used to attach this node.
  // I'll avoid adding an owner field for prod and model that as functions.
  var ref: Null | ((js.Function1[/* handle */ js.Any, Unit]) with StringRef) | RefObject = js.native
  
  // Conceptual aliases
  // parent : Instance -> return The parent happens to be the same as the
  // return fiber since we've merged the fiber and instance.
  // Remaining fields belong to Fiber
  // The Fiber to return to after finishing processing this one.
  // This is effectively the parent, but there can be multiple parents (two)
  // so this is only the parent of the thing we're currently processing.
  // It is conceptually the same as the return address of a stack frame.
  var `return`: Fiber | Null = js.native
  
  // Duration of the most recent render time for this Fiber.
  // This value is not updated when we bailout for memoization purposes.
  // This field is only set when the enableProfilerTimer flag is enabled.
  var selfBaseDuration: js.UndefOr[Double] = js.native
  
  var sibling: Fiber | Null = js.native
  
  // The local state associated with this fiber.
  var stateNode: js.Any = js.native
  
  // These first fields are conceptually members of an Instance. This used to
  // be split into a separate type and intersected with the other Fiber fields,
  // but until Flow fixes its intersection bugs, we've merged them into a
  // single type.
  // An Instance is shared between all versions of a component. We can easily
  // break this out into a separate object to avoid copying so much to the
  // alternate versions of the tree. We put this on a single object for now to
  // minimize the number of objects created during the initial render.
  // Tag identifying the type of fiber.
  var tag: WorkTag = js.native
  
  // Sum of base times for all descedents of this Fiber.
  // This value bubbles up during the "complete" phase.
  // This field is only set when the enableProfilerTimer flag is enabled.
  var treeBaseDuration: js.UndefOr[Double] = js.native
  
  // The resolved function/class/ associated with this fiber.
  var `type`: js.Any = js.native
  
  // The props used to create the output.
  // A queue of state updates and callbacks.
  var updateQueue: UpdateQueue[_] | Null = js.native
}
object Fiber {
  
  @scala.inline
  def apply(
    childExpirationTime: ExpirationTime,
    effectTag: SideEffectTag,
    elementType: js.Any,
    expirationTime: ExpirationTime,
    index: Double,
    memoizedProps: js.Any,
    memoizedState: js.Any,
    mode: TypeOfMode,
    pendingProps: js.Any,
    stateNode: js.Any,
    tag: WorkTag,
    `type`: js.Any
  ): Fiber = {
    val __obj = js.Dynamic.literal(childExpirationTime = childExpirationTime.asInstanceOf[js.Any], effectTag = effectTag.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], memoizedProps = memoizedProps.asInstanceOf[js.Any], memoizedState = memoizedState.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], pendingProps = pendingProps.asInstanceOf[js.Any], stateNode = stateNode.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fiber]
  }
  
  @scala.inline
  implicit class FiberMutableBuilder[Self <: Fiber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualDuration(value: Double): Self = StObject.set(x, "actualDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualDurationUndefined: Self = StObject.set(x, "actualDuration", js.undefined)
    
    @scala.inline
    def setActualStartTime(value: Double): Self = StObject.set(x, "actualStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualStartTimeUndefined: Self = StObject.set(x, "actualStartTime", js.undefined)
    
    @scala.inline
    def setAlternate(value: Fiber): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateNull: Self = StObject.set(x, "alternate", null)
    
    @scala.inline
    def setChild(value: Fiber): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildExpirationTime(value: ExpirationTime): Self = StObject.set(x, "childExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNull: Self = StObject.set(x, "child", null)
    
    @scala.inline
    def setEffectTag(value: SideEffectTag): Self = StObject.set(x, "effectTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementType(value: js.Any): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: ExpirationTime): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstContextDependency(value: ContextDependency[_]): Self = StObject.set(x, "firstContextDependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstContextDependencyNull: Self = StObject.set(x, "firstContextDependency", null)
    
    @scala.inline
    def setFirstEffect(value: Fiber): Self = StObject.set(x, "firstEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstEffectNull: Self = StObject.set(x, "firstEffect", null)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setLastEffect(value: Fiber): Self = StObject.set(x, "lastEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEffectNull: Self = StObject.set(x, "lastEffect", null)
    
    @scala.inline
    def setMemoizedProps(value: js.Any): Self = StObject.set(x, "memoizedProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoizedState(value: js.Any): Self = StObject.set(x, "memoizedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: TypeOfMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextEffect(value: Fiber): Self = StObject.set(x, "nextEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextEffectNull: Self = StObject.set(x, "nextEffect", null)
    
    @scala.inline
    def setPendingProps(value: js.Any): Self = StObject.set(x, "pendingProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: ((js.Function1[/* handle */ js.Any, Unit]) with StringRef) | RefObject): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setReturn(value: Fiber): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnNull: Self = StObject.set(x, "return", null)
    
    @scala.inline
    def setSelfBaseDuration(value: Double): Self = StObject.set(x, "selfBaseDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfBaseDurationUndefined: Self = StObject.set(x, "selfBaseDuration", js.undefined)
    
    @scala.inline
    def setSibling(value: Fiber): Self = StObject.set(x, "sibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiblingNull: Self = StObject.set(x, "sibling", null)
    
    @scala.inline
    def setStateNode(value: js.Any): Self = StObject.set(x, "stateNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: WorkTag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeBaseDuration(value: Double): Self = StObject.set(x, "treeBaseDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeBaseDurationUndefined: Self = StObject.set(x, "treeBaseDuration", js.undefined)
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateQueue(value: UpdateQueue[_]): Self = StObject.set(x, "updateQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateQueueNull: Self = StObject.set(x, "updateQueue", null)
    
    @scala.inline
    def set_debugID(value: Double): Self = StObject.set(x, "_debugID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_debugIDUndefined: Self = StObject.set(x, "_debugID", js.undefined)
    
    @scala.inline
    def set_debugIsCurrentlyTiming(value: Boolean): Self = StObject.set(x, "_debugIsCurrentlyTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_debugIsCurrentlyTimingUndefined: Self = StObject.set(x, "_debugIsCurrentlyTiming", js.undefined)
    
    @scala.inline
    def set_debugOwner(value: Fiber): Self = StObject.set(x, "_debugOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_debugOwnerNull: Self = StObject.set(x, "_debugOwner", null)
    
    @scala.inline
    def set_debugOwnerUndefined: Self = StObject.set(x, "_debugOwner", js.undefined)
    
    @scala.inline
    def set_debugSource(value: Source): Self = StObject.set(x, "_debugSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_debugSourceNull: Self = StObject.set(x, "_debugSource", null)
    
    @scala.inline
    def set_debugSourceUndefined: Self = StObject.set(x, "_debugSource", js.undefined)
  }
}
