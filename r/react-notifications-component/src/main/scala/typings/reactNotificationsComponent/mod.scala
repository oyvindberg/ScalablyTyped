package typings.reactNotificationsComponent

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`bottom-center`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`bottom-left`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`bottom-right`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`ease-in-out`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`ease-in`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`ease-out`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`step-end`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`step-start`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`top-center`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`top-left`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`top-right`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.bottom
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.center
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.danger
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.ease
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.info
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.linear
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.success
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.top
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-notifications-component", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ReactNotificationProps, js.Object, js.Any] {
    def this(props: ReactNotificationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactNotificationProps, context: js.Any) = this()
  }
  
  object store {
    
    @JSImport("react-notifications-component", "store.addNotification")
    @js.native
    def addNotification(options: ReactNotificationOptions): String = js.native
    
    @JSImport("react-notifications-component", "store.removeNotification")
    @js.native
    def removeNotification(id: String): Unit = js.native
  }
  
  @js.native
  trait DismissOptions extends StObject {
    
    var click: js.UndefOr[Boolean] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var onScreen: js.UndefOr[Boolean] = js.native
    
    var pauseOnHover: js.UndefOr[Boolean] = js.native
    
    var showIcon: js.UndefOr[Boolean] = js.native
    
    var touch: js.UndefOr[Boolean] = js.native
    
    var waitForAnimation: js.UndefOr[Boolean] = js.native
  }
  object DismissOptions {
    
    @scala.inline
    def apply(): DismissOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DismissOptions]
    }
    
    @scala.inline
    implicit class DismissOptionsMutableBuilder[Self <: DismissOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: Boolean): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setOnScreen(value: Boolean): Self = StObject.set(x, "onScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScreenUndefined: Self = StObject.set(x, "onScreen", js.undefined)
      
      @scala.inline
      def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      @scala.inline
      def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      @scala.inline
      def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      @scala.inline
      def setWaitForAnimation(value: Boolean): Self = StObject.set(x, "waitForAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForAnimationUndefined: Self = StObject.set(x, "waitForAnimation", js.undefined)
    }
  }
  
  @js.native
  trait ReactNotificationOptions extends StObject {
    
    var animationIn: js.UndefOr[js.Array[String]] = js.native
    
    var animationOut: js.UndefOr[js.Array[String]] = js.native
    
    var container: `top-left` | `top-right` | `top-center` | center | `bottom-left` | `bottom-right` | `bottom-center` = js.native
    
    var content: js.UndefOr[
        (ComponentClass[js.Object, ComponentState]) | FunctionComponent[js.Object] | ReactNode
      ] = js.native
    
    var dismiss: js.UndefOr[DismissOptions] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var insert: js.UndefOr[top | bottom] = js.native
    
    var message: js.UndefOr[String | ReactNode | FunctionComponent[js.Object]] = js.native
    
    var onRemoval: js.UndefOr[js.Function2[/* id */ String, /* removedBy */ js.Any, Unit]] = js.native
    
    var slidingEnter: js.UndefOr[TransitionOptions] = js.native
    
    var slidingExit: js.UndefOr[TransitionOptions] = js.native
    
    var title: js.UndefOr[String | ReactNode | FunctionComponent[js.Object]] = js.native
    
    var touchRevert: js.UndefOr[TransitionOptions] = js.native
    
    var touchSlidingExit: js.UndefOr[TransitionOptions] = js.native
    
    var `type`: js.UndefOr[
        success | danger | info | typings.reactNotificationsComponent.reactNotificationsComponentStrings.default | warning
      ] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object ReactNotificationOptions {
    
    @scala.inline
    def apply(
      container: `top-left` | `top-right` | `top-center` | center | `bottom-left` | `bottom-right` | `bottom-center`
    ): ReactNotificationOptions = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactNotificationOptions]
    }
    
    @scala.inline
    implicit class ReactNotificationOptionsMutableBuilder[Self <: ReactNotificationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationIn(value: js.Array[String]): Self = StObject.set(x, "animationIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationInUndefined: Self = StObject.set(x, "animationIn", js.undefined)
      
      @scala.inline
      def setAnimationInVarargs(value: String*): Self = StObject.set(x, "animationIn", js.Array(value :_*))
      
      @scala.inline
      def setAnimationOut(value: js.Array[String]): Self = StObject.set(x, "animationOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationOutUndefined: Self = StObject.set(x, "animationOut", js.undefined)
      
      @scala.inline
      def setAnimationOutVarargs(value: String*): Self = StObject.set(x, "animationOut", js.Array(value :_*))
      
      @scala.inline
      def setContainer(
        value: `top-left` | `top-right` | `top-center` | center | `bottom-left` | `bottom-right` | `bottom-center`
      ): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: (ComponentClass[js.Object, ComponentState]) | FunctionComponent[js.Object] | ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDismiss(value: DismissOptions): Self = StObject.set(x, "dismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissUndefined: Self = StObject.set(x, "dismiss", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInsert(value: top | bottom): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      @scala.inline
      def setMessage(value: String | ReactNode | FunctionComponent[js.Object]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnRemoval(value: (/* id */ String, /* removedBy */ js.Any) => Unit): Self = StObject.set(x, "onRemoval", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRemovalUndefined: Self = StObject.set(x, "onRemoval", js.undefined)
      
      @scala.inline
      def setSlidingEnter(value: TransitionOptions): Self = StObject.set(x, "slidingEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidingEnterUndefined: Self = StObject.set(x, "slidingEnter", js.undefined)
      
      @scala.inline
      def setSlidingExit(value: TransitionOptions): Self = StObject.set(x, "slidingExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidingExitUndefined: Self = StObject.set(x, "slidingExit", js.undefined)
      
      @scala.inline
      def setTitle(value: String | ReactNode | FunctionComponent[js.Object]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTouchRevert(value: TransitionOptions): Self = StObject.set(x, "touchRevert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchRevertUndefined: Self = StObject.set(x, "touchRevert", js.undefined)
      
      @scala.inline
      def setTouchSlidingExit(value: TransitionOptions): Self = StObject.set(x, "touchSlidingExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchSlidingExitUndefined: Self = StObject.set(x, "touchSlidingExit", js.undefined)
      
      @scala.inline
      def setType(
        value: success | danger | info | typings.reactNotificationsComponent.reactNotificationsComponentStrings.default | warning
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ReactNotificationProps extends StObject {
    
    var breakpoint: js.UndefOr[Double] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var isMobile: js.UndefOr[Boolean] = js.native
    
    var types: js.UndefOr[js.Array[String]] = js.native
  }
  object ReactNotificationProps {
    
    @scala.inline
    def apply(): ReactNotificationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactNotificationProps]
    }
    
    @scala.inline
    implicit class ReactNotificationPropsMutableBuilder[Self <: ReactNotificationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoint(value: Double): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
      
      @scala.inline
      def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TransitionOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var timingFunction: js.UndefOr[
        ease | linear | `ease-in` | `ease-out` | `ease-in-out` | `step-start` | `step-end`
      ] = js.native
  }
  object TransitionOptions {
    
    @scala.inline
    def apply(): TransitionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionOptions]
    }
    
    @scala.inline
    implicit class TransitionOptionsMutableBuilder[Self <: TransitionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setTimingFunction(value: ease | linear | `ease-in` | `ease-out` | `ease-in-out` | `step-start` | `step-end`): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
    }
  }
}
