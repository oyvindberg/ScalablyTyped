package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropDownArrowMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/DropDownArrow", JSImport.Default)
  @js.native
  val default: SFC[DropDownArrowProps] = js.native
  
  @js.native
  trait DropDownArrowProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DropDownArrowProps {
    
    @scala.inline
    def apply(): DropDownArrowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropDownArrowProps]
    }
    
    @scala.inline
    implicit class DropDownArrowPropsMutableBuilder[Self <: DropDownArrowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DropDownArrowProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropDownArrowMod.foo` */
  override def _to: SFC[DropDownArrowProps] = default
}
