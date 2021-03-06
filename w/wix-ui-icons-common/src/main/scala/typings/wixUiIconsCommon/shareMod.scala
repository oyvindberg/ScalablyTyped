package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shareMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Share", JSImport.Default)
  @js.native
  val default: SFC[ShareProps] = js.native
  
  @js.native
  trait ShareProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ShareProps {
    
    @scala.inline
    def apply(): ShareProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShareProps]
    }
    
    @scala.inline
    implicit class SharePropsMutableBuilder[Self <: ShareProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ShareProps]
  
  /* This means you don't have to write `default`, but can instead just say `shareMod.foo` */
  override def _to: SFC[ShareProps] = default
}
