package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categorySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CategorySmall", JSImport.Default)
  @js.native
  val default: SFC[CategorySmallProps] = js.native
  
  @js.native
  trait CategorySmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CategorySmallProps {
    
    @scala.inline
    def apply(): CategorySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CategorySmallProps]
    }
    
    @scala.inline
    implicit class CategorySmallPropsMutableBuilder[Self <: CategorySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CategorySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `categorySmallMod.foo` */
  override def _to: SFC[CategorySmallProps] = default
}
