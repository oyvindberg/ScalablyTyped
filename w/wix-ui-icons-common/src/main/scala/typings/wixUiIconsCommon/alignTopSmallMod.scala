package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignTopSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignTopSmall", JSImport.Default)
  @js.native
  val default: SFC[AlignTopSmallProps] = js.native
  
  @js.native
  trait AlignTopSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AlignTopSmallProps {
    
    @scala.inline
    def apply(): AlignTopSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignTopSmallProps]
    }
    
    @scala.inline
    implicit class AlignTopSmallPropsMutableBuilder[Self <: AlignTopSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AlignTopSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignTopSmallMod.foo` */
  override def _to: SFC[AlignTopSmallProps] = default
}
