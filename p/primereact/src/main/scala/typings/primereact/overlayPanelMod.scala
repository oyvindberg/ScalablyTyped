package typings.primereact

import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayPanelMod {
  
  @JSImport("primereact/components/overlaypanel/OverlayPanel", "OverlayPanel")
  @js.native
  class OverlayPanel protected ()
    extends Component[OverlayPanelProps, js.Any, js.Any] {
    def this(props: OverlayPanelProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OverlayPanelProps, context: js.Any) = this()
    
    def hide(): Unit = js.native
    
    def show(event: SyntheticEvent[Element, Event], target: EventTarget): Unit = js.native
    
    def toggle(event: SyntheticEvent[Element, Event]): Unit = js.native
  }
  
  @js.native
  trait OverlayPanelProps extends StObject {
    
    var appendTo: js.UndefOr[js.Any] = js.native
    
    var ariaCloseLabel: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dismissable: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.native
    
    var showCloseIcon: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object OverlayPanelProps {
    
    @scala.inline
    def apply(): OverlayPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayPanelProps]
    }
    
    @scala.inline
    implicit class OverlayPanelPropsMutableBuilder[Self <: OverlayPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setAriaCloseLabel(value: String): Self = StObject.set(x, "ariaCloseLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaCloseLabelUndefined: Self = StObject.set(x, "ariaCloseLabel", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDismissable(value: Boolean): Self = StObject.set(x, "dismissable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissableUndefined: Self = StObject.set(x, "dismissable", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setShowCloseIcon(value: Boolean): Self = StObject.set(x, "showCloseIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseIconUndefined: Self = StObject.set(x, "showCloseIcon", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
