package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PhoneSmall", JSImport.Default)
  @js.native
  val default: SFC[PhoneSmallProps] = js.native
  
  @js.native
  trait PhoneSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PhoneSmallProps {
    
    @scala.inline
    def apply(): PhoneSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneSmallProps]
    }
    
    @scala.inline
    implicit class PhoneSmallPropsMutableBuilder[Self <: PhoneSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PhoneSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `phoneSmallMod.foo` */
  override def _to: SFC[PhoneSmallProps] = default
}
