package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minusMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Minus", JSImport.Default)
  @js.native
  val default: SFC[MinusProps] = js.native
  
  @js.native
  trait MinusProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MinusProps {
    
    @scala.inline
    def apply(): MinusProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinusProps]
    }
    
    @scala.inline
    implicit class MinusPropsMutableBuilder[Self <: MinusProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MinusProps]
  
  /* This means you don't have to write `default`, but can instead just say `minusMod.foo` */
  override def _to: SFC[MinusProps] = default
}
