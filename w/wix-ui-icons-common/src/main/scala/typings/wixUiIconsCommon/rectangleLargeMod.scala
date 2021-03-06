package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectangleLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RectangleLarge", JSImport.Default)
  @js.native
  val default: SFC[RectangleLargeProps] = js.native
  
  @js.native
  trait RectangleLargeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object RectangleLargeProps {
    
    @scala.inline
    def apply(): RectangleLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectangleLargeProps]
    }
    
    @scala.inline
    implicit class RectangleLargePropsMutableBuilder[Self <: RectangleLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[RectangleLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `rectangleLargeMod.foo` */
  override def _to: SFC[RectangleLargeProps] = default
}
