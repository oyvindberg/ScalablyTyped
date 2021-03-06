package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ListSmall", JSImport.Default)
  @js.native
  val default: SFC[ListSmallProps] = js.native
  
  @js.native
  trait ListSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ListSmallProps {
    
    @scala.inline
    def apply(): ListSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListSmallProps]
    }
    
    @scala.inline
    implicit class ListSmallPropsMutableBuilder[Self <: ListSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ListSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `listSmallMod.foo` */
  override def _to: SFC[ListSmallProps] = default
}
