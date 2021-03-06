package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalRatioSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VerticalRatioSmall", JSImport.Default)
  @js.native
  val default: SFC[VerticalRatioSmallProps] = js.native
  
  @js.native
  trait VerticalRatioSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object VerticalRatioSmallProps {
    
    @scala.inline
    def apply(): VerticalRatioSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalRatioSmallProps]
    }
    
    @scala.inline
    implicit class VerticalRatioSmallPropsMutableBuilder[Self <: VerticalRatioSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[VerticalRatioSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `verticalRatioSmallMod.foo` */
  override def _to: SFC[VerticalRatioSmallProps] = default
}
