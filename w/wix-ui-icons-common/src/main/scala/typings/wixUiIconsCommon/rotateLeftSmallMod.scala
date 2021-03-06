package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateLeftSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RotateLeftSmall", JSImport.Default)
  @js.native
  val default: SFC[RotateLeftSmallProps] = js.native
  
  @js.native
  trait RotateLeftSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object RotateLeftSmallProps {
    
    @scala.inline
    def apply(): RotateLeftSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateLeftSmallProps]
    }
    
    @scala.inline
    implicit class RotateLeftSmallPropsMutableBuilder[Self <: RotateLeftSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[RotateLeftSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `rotateLeftSmallMod.foo` */
  override def _to: SFC[RotateLeftSmallProps] = default
}
