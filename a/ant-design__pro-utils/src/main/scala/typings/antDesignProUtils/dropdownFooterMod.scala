package typings.antDesignProUtils

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownFooterMod extends Shortcut {
  
  @JSImport("@ant-design/pro-utils/lib/components/DropdownFooter", JSImport.Default)
  @js.native
  val default: FC[DropdownFooterProps] = js.native
  
  @js.native
  trait DropdownFooterProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var onClear: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.native
    
    var onConfirm: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.native
  }
  object DropdownFooterProps {
    
    @scala.inline
    def apply(): DropdownFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownFooterProps]
    }
    
    @scala.inline
    implicit class DropdownFooterPropsMutableBuilder[Self <: DropdownFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnClear(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    }
  }
  
  type _To = FC[DropdownFooterProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropdownFooterMod.foo` */
  override def _to: FC[DropdownFooterProps] = default
}
