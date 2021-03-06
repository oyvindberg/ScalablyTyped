package typings.plottable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dispatchers {
  
  @JSImport("plottable", "Dispatchers.Key")
  @js.native
  /**
    * This constructor should not be invoked directly.
    *
    * @constructor
    */
  class Key ()
    extends typings.plottable.dispatchersMod.Key
  /* static members */
  object Key {
    
    @JSImport("plottable", "Dispatchers.Key")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Dispatchers.Key._DISPATCHER_KEY")
    @js.native
    def _DISPATCHER_KEY: js.Any = js.native
    @scala.inline
    def _DISPATCHER_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DISPATCHER_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Dispatchers.Key._KEYDOWN_EVENT_NAME")
    @js.native
    def _KEYDOWN_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _KEYDOWN_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_KEYDOWN_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Dispatchers.Key._KEYUP_EVENT_NAME")
    @js.native
    def _KEYUP_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _KEYUP_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_KEYUP_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    /**
      * Gets a Key Dispatcher. If one already exists it will be returned;
      * otherwise, a new one will be created.
      *
      * @return {Dispatchers.Key}
      */
    @JSImport("plottable", "Dispatchers.Key.getDispatcher")
    @js.native
    def getDispatcher(): typings.plottable.dispatchersMod.Key = js.native
  }
  
  @JSImport("plottable", "Dispatchers.Mouse")
  @js.native
  /**
    * This constructor not be invoked directly.
    *
    * @constructor
    */
  class Mouse protected ()
    extends typings.plottable.dispatchersMod.Mouse
  /* static members */
  object Mouse {
    
    @JSImport("plottable", "Dispatchers.Mouse")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Dispatchers.Mouse._DBLCLICK_EVENT_NAME")
    @js.native
    def _DBLCLICK_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _DBLCLICK_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DBLCLICK_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Dispatchers.Mouse._DISPATCHER_KEY")
    @js.native
    def _DISPATCHER_KEY: js.Any = js.native
    @scala.inline
    def _DISPATCHER_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DISPATCHER_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Dispatchers.Mouse._MOUSEDOWN_EVENT_NAME")
    @js.native
    def _MOUSEDOWN_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _MOUSEDOWN_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MOUSEDOWN_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Dispatchers.Mouse._MOUSEMOVE_EVENT_NAME")
    @js.native
    def _MOUSEMOVE_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _MOUSEMOVE_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MOUSEMOVE_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Dispatchers.Mouse._MOUSEOUT_EVENT_NAME")
    @js.native
    def _MOUSEOUT_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _MOUSEOUT_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MOUSEOUT_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Dispatchers.Mouse._MOUSEOVER_EVENT_NAME")
    @js.native
    def _MOUSEOVER_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _MOUSEOVER_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MOUSEOVER_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Dispatchers.Mouse._MOUSEUP_EVENT_NAME")
    @js.native
    def _MOUSEUP_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _MOUSEUP_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MOUSEUP_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Dispatchers.Mouse._WHEEL_EVENT_NAME")
    @js.native
    def _WHEEL_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _WHEEL_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WHEEL_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    /**
      * Get a Mouse Dispatcher for the component tree.
      * If one already exists on that <svg>, it will be returned; otherwise, a new one will be created.
      *
      * @param {SVGElement} elem
      * @return {Dispatchers.Mouse}
      */
    @JSImport("plottable", "Dispatchers.Mouse.getDispatcher")
    @js.native
    def getDispatcher(component: typings.plottable.componentMod.Component): typings.plottable.dispatchersMod.Mouse = js.native
  }
  
  @JSImport("plottable", "Dispatchers.Touch")
  @js.native
  class Touch protected ()
    extends typings.plottable.dispatchersMod.Touch {
    /**
      * This constructor should not be invoked directly.
      *
      * @param {SVGElement} svg The root <svg> to attach to.
      */
    def this(component: typings.plottable.componentMod.Component) = this()
  }
  /* static members */
  object Touch {
    
    @JSImport("plottable", "Dispatchers.Touch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Dispatchers.Touch._DISPATCHER_KEY")
    @js.native
    def _DISPATCHER_KEY: js.Any = js.native
    @scala.inline
    def _DISPATCHER_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DISPATCHER_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Dispatchers.Touch._TOUCHCANCEL_EVENT_NAME")
    @js.native
    def _TOUCHCANCEL_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _TOUCHCANCEL_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOUCHCANCEL_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Dispatchers.Touch._TOUCHEND_EVENT_NAME")
    @js.native
    def _TOUCHEND_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _TOUCHEND_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOUCHEND_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Dispatchers.Touch._TOUCHMOVE_EVENT_NAME")
    @js.native
    def _TOUCHMOVE_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _TOUCHMOVE_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOUCHMOVE_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Dispatchers.Touch._TOUCHSTART_EVENT_NAME")
    @js.native
    def _TOUCHSTART_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _TOUCHSTART_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOUCHSTART_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    /**
      * Gets a Touch Dispatcher for the component.
      * If one already exists, it will be returned; otherwise, a new one will be created.
      *
      * @param component
      * @return {Dispatchers.Touch}
      */
    @JSImport("plottable", "Dispatchers.Touch.getDispatcher")
    @js.native
    def getDispatcher(component: typings.plottable.componentMod.Component): typings.plottable.dispatchersMod.Touch = js.native
  }
}
