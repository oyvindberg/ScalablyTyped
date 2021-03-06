package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusStopFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusStopFilledSmall", JSImport.Default)
  @js.native
  val default: SFC[StatusStopFilledSmallProps] = js.native
  
  @js.native
  trait StatusStopFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StatusStopFilledSmallProps {
    
    @scala.inline
    def apply(): StatusStopFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusStopFilledSmallProps]
    }
    
    @scala.inline
    implicit class StatusStopFilledSmallPropsMutableBuilder[Self <: StatusStopFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StatusStopFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusStopFilledSmallMod.foo` */
  override def _to: SFC[StatusStopFilledSmallProps] = default
}
