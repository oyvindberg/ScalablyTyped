package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMarketSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AppMarketSmall", JSImport.Default)
  @js.native
  val default: SFC[AppMarketSmallProps] = js.native
  
  @js.native
  trait AppMarketSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AppMarketSmallProps {
    
    @scala.inline
    def apply(): AppMarketSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppMarketSmallProps]
    }
    
    @scala.inline
    implicit class AppMarketSmallPropsMutableBuilder[Self <: AppMarketSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AppMarketSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `appMarketSmallMod.foo` */
  override def _to: SFC[AppMarketSmallProps] = default
}
