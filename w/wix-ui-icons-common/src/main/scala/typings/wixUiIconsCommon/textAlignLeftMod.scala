package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAlignLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TextAlignLeft", JSImport.Default)
  @js.native
  val default: SFC[TextAlignLeftProps] = js.native
  
  @js.native
  trait TextAlignLeftProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAlignLeftProps {
    
    @scala.inline
    def apply(): TextAlignLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAlignLeftProps]
    }
    
    @scala.inline
    implicit class TextAlignLeftPropsMutableBuilder[Self <: TextAlignLeftProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TextAlignLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAlignLeftMod.foo` */
  override def _to: SFC[TextAlignLeftProps] = default
}
