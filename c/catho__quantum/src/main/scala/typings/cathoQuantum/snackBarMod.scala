package typings.cathoQuantum

import typings.cathoQuantum.anon.BaseFontSizeBreakpoints
import typings.cathoQuantum.anon.CallbackFn
import typings.cathoQuantum.cathoQuantumStrings.error
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.cathoQuantum.cathoQuantumStrings.warning
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackBarMod {
  
  @JSImport("@catho/quantum/SnackBar", JSImport.Default)
  @js.native
  class default ()
    extends Component[SnackBarProps, js.Object, js.Any]
  
  type SnackBar = Component[SnackBarProps, js.Object, js.Any]
  
  @js.native
  trait SnackBarProps extends StObject {
    
    var actionTrigger: js.UndefOr[CallbackFn] = js.native
    
    var closeButtonAriaLabel: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inverted: js.UndefOr[Boolean] = js.native
    
    var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var secondsToClose: js.UndefOr[Double] = js.native
    
    var skin: js.UndefOr[primary | success | error | neutral | warning] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var theme: js.UndefOr[BaseFontSizeBreakpoints] = js.native
  }
  object SnackBarProps {
    
    @scala.inline
    def apply(): SnackBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnackBarProps]
    }
    
    @scala.inline
    implicit class SnackBarPropsMutableBuilder[Self <: SnackBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionTrigger(value: CallbackFn): Self = StObject.set(x, "actionTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTriggerUndefined: Self = StObject.set(x, "actionTrigger", js.undefined)
      
      @scala.inline
      def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setOnClose(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setSecondsToClose(value: Double): Self = StObject.set(x, "secondsToClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsToCloseUndefined: Self = StObject.set(x, "secondsToClose", js.undefined)
      
      @scala.inline
      def setSkin(value: primary | success | error | neutral | warning): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTheme(value: BaseFontSizeBreakpoints): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
