package typings.reactNativeCollapsible

import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typings.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typings.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-collapsible", JSImport.Default)
  @js.native
  class default ()
    extends Component[CollapsibleProps, js.Object, js.Any]
  
  type Collapsible = Component[CollapsibleProps, js.Object, js.Any]
  
  @js.native
  trait CollapsibleProps extends StObject {
    
    /**
      * Alignment of the content when transitioning, can be top, center or bottom
      *
      * @default top
      */
    var align: js.UndefOr[top | center | bottom] = js.native
    
    /**
      * Whether to show the child components or not
      *
      * @default true
      */
    var collapsed: js.UndefOr[Boolean] = js.native
    
    /**
      * Which height should the component collapse to
      *
      * @default 0
      */
    var collapsedHeight: js.UndefOr[Double] = js.native
    
    /**
      * Duration of transition in milliseconds
      *
      * @default 300
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * Function or function name from Easing (or tween-functions if < RN 0.8). Collapsible will try to combine Easing functions for you if you name them like tween-functions
      *
      * @default easeOutCubic
      */
    var easing: js.UndefOr[EasingMode | js.Any] = js.native
    
    /**
      * Enable pointer events on collapsed view
      *
      * @default false
      */
    var enablePointerEvents: js.UndefOr[Boolean] = js.native
    
    /**
      * Function called when the animation finished
      */
    var onAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Optional styling for the container
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object CollapsibleProps {
    
    @scala.inline
    def apply(): CollapsibleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapsibleProps]
    }
    
    @scala.inline
    implicit class CollapsiblePropsMutableBuilder[Self <: CollapsibleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedHeight(value: Double): Self = StObject.set(x, "collapsedHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedHeightUndefined: Self = StObject.set(x, "collapsedHeight", js.undefined)
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: EasingMode | js.Any): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEnablePointerEvents(value: Boolean): Self = StObject.set(x, "enablePointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePointerEventsUndefined: Self = StObject.set(x, "enablePointerEvents", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: () => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.linear
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuad
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuad
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuad
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCubic
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCubic
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCubic
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuart
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuart
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuart
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuint
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuint
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuint
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInSine
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutSine
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutSine
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInExpo
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutExpo
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutExpo
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCirc
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCirc
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCirc
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInElastic
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutElastic
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutElastic
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBack
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBack
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBack
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBounce
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBounce
    - typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBounce
  */
  trait EasingMode extends StObject
  object EasingMode {
    
    @scala.inline
    def easeInBack: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBack = "easeInBack".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBack]
    
    @scala.inline
    def easeInBounce: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBounce = "easeInBounce".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBounce]
    
    @scala.inline
    def easeInCirc: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCirc = "easeInCirc".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCirc]
    
    @scala.inline
    def easeInCubic: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCubic = "easeInCubic".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCubic]
    
    @scala.inline
    def easeInElastic: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInElastic = "easeInElastic".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInElastic]
    
    @scala.inline
    def easeInExpo: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInExpo = "easeInExpo".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInExpo]
    
    @scala.inline
    def easeInOutBack: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBack = "easeInOutBack".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBack]
    
    @scala.inline
    def easeInOutBounce: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBounce = "easeInOutBounce".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBounce]
    
    @scala.inline
    def easeInOutCirc: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCirc = "easeInOutCirc".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCirc]
    
    @scala.inline
    def easeInOutCubic: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCubic = "easeInOutCubic".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCubic]
    
    @scala.inline
    def easeInOutElastic: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutElastic = "easeInOutElastic".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutElastic]
    
    @scala.inline
    def easeInOutExpo: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutExpo = "easeInOutExpo".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutExpo]
    
    @scala.inline
    def easeInOutQuad: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuad = "easeInOutQuad".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuad]
    
    @scala.inline
    def easeInOutQuart: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuart = "easeInOutQuart".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuart]
    
    @scala.inline
    def easeInOutQuint: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuint = "easeInOutQuint".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuint]
    
    @scala.inline
    def easeInOutSine: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutSine = "easeInOutSine".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutSine]
    
    @scala.inline
    def easeInQuad: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuad = "easeInQuad".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuad]
    
    @scala.inline
    def easeInQuart: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuart = "easeInQuart".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuart]
    
    @scala.inline
    def easeInQuint: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuint = "easeInQuint".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuint]
    
    @scala.inline
    def easeInSine: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInSine = "easeInSine".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInSine]
    
    @scala.inline
    def easeOutBack: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBack = "easeOutBack".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBack]
    
    @scala.inline
    def easeOutBounce: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBounce = "easeOutBounce".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBounce]
    
    @scala.inline
    def easeOutCirc: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCirc = "easeOutCirc".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCirc]
    
    @scala.inline
    def easeOutCubic: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCubic = "easeOutCubic".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCubic]
    
    @scala.inline
    def easeOutElastic: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutElastic = "easeOutElastic".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutElastic]
    
    @scala.inline
    def easeOutExpo: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutExpo = "easeOutExpo".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutExpo]
    
    @scala.inline
    def easeOutQuad: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuad = "easeOutQuad".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuad]
    
    @scala.inline
    def easeOutQuart: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuart = "easeOutQuart".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuart]
    
    @scala.inline
    def easeOutQuint: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuint = "easeOutQuint".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuint]
    
    @scala.inline
    def easeOutSine: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutSine = "easeOutSine".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutSine]
    
    @scala.inline
    def linear: typings.reactNativeCollapsible.reactNativeCollapsibleStrings.linear = "linear".asInstanceOf[typings.reactNativeCollapsible.reactNativeCollapsibleStrings.linear]
  }
}
