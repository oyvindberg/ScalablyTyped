package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalRatioMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HorizontalRatio", JSImport.Default)
  @js.native
  val default: SFC[HorizontalRatioProps] = js.native
  
  @js.native
  trait HorizontalRatioProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HorizontalRatioProps {
    
    @scala.inline
    def apply(): HorizontalRatioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalRatioProps]
    }
    
    @scala.inline
    implicit class HorizontalRatioPropsMutableBuilder[Self <: HorizontalRatioProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HorizontalRatioProps]
  
  /* This means you don't have to write `default`, but can instead just say `horizontalRatioMod.foo` */
  override def _to: SFC[HorizontalRatioProps] = default
}
