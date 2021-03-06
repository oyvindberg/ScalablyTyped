package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/X", JSImport.Default)
  @js.native
  val default: SFC[XProps] = js.native
  
  @js.native
  trait XProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object XProps {
    
    @scala.inline
    def apply(): XProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XProps]
    }
    
    @scala.inline
    implicit class XPropsMutableBuilder[Self <: XProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[XProps]
  
  /* This means you don't have to write `default`, but can instead just say `xMod.foo` */
  override def _to: SFC[XProps] = default
}
