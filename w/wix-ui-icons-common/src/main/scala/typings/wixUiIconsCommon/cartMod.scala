package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cartMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Cart", JSImport.Default)
  @js.native
  val default: SFC[CartProps] = js.native
  
  @js.native
  trait CartProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CartProps {
    
    @scala.inline
    def apply(): CartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CartProps]
    }
    
    @scala.inline
    implicit class CartPropsMutableBuilder[Self <: CartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CartProps]
  
  /* This means you don't have to write `default`, but can instead just say `cartMod.foo` */
  override def _to: SFC[CartProps] = default
}
