package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object favoriteSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FavoriteSmall", JSImport.Default)
  @js.native
  val default: SFC[FavoriteSmallProps] = js.native
  
  @js.native
  trait FavoriteSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FavoriteSmallProps {
    
    @scala.inline
    def apply(): FavoriteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FavoriteSmallProps]
    }
    
    @scala.inline
    implicit class FavoriteSmallPropsMutableBuilder[Self <: FavoriteSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FavoriteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `favoriteSmallMod.foo` */
  override def _to: SFC[FavoriteSmallProps] = default
}
