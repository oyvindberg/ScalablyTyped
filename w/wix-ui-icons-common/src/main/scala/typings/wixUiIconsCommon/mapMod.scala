package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Map", JSImport.Default)
  @js.native
  val default: SFC[MapProps] = js.native
  
  @js.native
  trait MapProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MapProps {
    
    @scala.inline
    def apply(): MapProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapProps]
    }
    
    @scala.inline
    implicit class MapPropsMutableBuilder[Self <: MapProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MapProps]
  
  /* This means you don't have to write `default`, but can instead just say `mapMod.foo` */
  override def _to: SFC[MapProps] = default
}
