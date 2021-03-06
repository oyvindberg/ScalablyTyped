package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusCompleteFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusCompleteFilled", JSImport.Default)
  @js.native
  val default: SFC[StatusCompleteFilledProps] = js.native
  
  @js.native
  trait StatusCompleteFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StatusCompleteFilledProps {
    
    @scala.inline
    def apply(): StatusCompleteFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusCompleteFilledProps]
    }
    
    @scala.inline
    implicit class StatusCompleteFilledPropsMutableBuilder[Self <: StatusCompleteFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StatusCompleteFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusCompleteFilledMod.foo` */
  override def _to: SFC[StatusCompleteFilledProps] = default
}
