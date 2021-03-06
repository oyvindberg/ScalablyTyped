package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twitterSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TwitterSmall", JSImport.Default)
  @js.native
  val default: SFC[TwitterSmallProps] = js.native
  
  @js.native
  trait TwitterSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TwitterSmallProps {
    
    @scala.inline
    def apply(): TwitterSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwitterSmallProps]
    }
    
    @scala.inline
    implicit class TwitterSmallPropsMutableBuilder[Self <: TwitterSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TwitterSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `twitterSmallMod.foo` */
  override def _to: SFC[TwitterSmallProps] = default
}
