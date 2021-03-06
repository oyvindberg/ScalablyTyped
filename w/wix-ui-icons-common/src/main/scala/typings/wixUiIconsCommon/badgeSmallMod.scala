package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BadgeSmall", JSImport.Default)
  @js.native
  val default: SFC[BadgeSmallProps] = js.native
  
  @js.native
  trait BadgeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BadgeSmallProps {
    
    @scala.inline
    def apply(): BadgeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeSmallProps]
    }
    
    @scala.inline
    implicit class BadgeSmallPropsMutableBuilder[Self <: BadgeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BadgeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `badgeSmallMod.foo` */
  override def _to: SFC[BadgeSmallProps] = default
}
