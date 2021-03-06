package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thumbsUpSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ThumbsUpSmall", JSImport.Default)
  @js.native
  val default: SFC[ThumbsUpSmallProps] = js.native
  
  @js.native
  trait ThumbsUpSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ThumbsUpSmallProps {
    
    @scala.inline
    def apply(): ThumbsUpSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbsUpSmallProps]
    }
    
    @scala.inline
    implicit class ThumbsUpSmallPropsMutableBuilder[Self <: ThumbsUpSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ThumbsUpSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `thumbsUpSmallMod.foo` */
  override def _to: SFC[ThumbsUpSmallProps] = default
}
