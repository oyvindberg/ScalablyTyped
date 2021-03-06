package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cutOutMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CutOut", JSImport.Default)
  @js.native
  val default: SFC[CutOutProps] = js.native
  
  @js.native
  trait CutOutProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CutOutProps {
    
    @scala.inline
    def apply(): CutOutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CutOutProps]
    }
    
    @scala.inline
    implicit class CutOutPropsMutableBuilder[Self <: CutOutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CutOutProps]
  
  /* This means you don't have to write `default`, but can instead just say `cutOutMod.foo` */
  override def _to: SFC[CutOutProps] = default
}
