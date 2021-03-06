package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mirrorVerticalMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MirrorVertical", JSImport.Default)
  @js.native
  val default: SFC[MirrorVerticalProps] = js.native
  
  @js.native
  trait MirrorVerticalProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MirrorVerticalProps {
    
    @scala.inline
    def apply(): MirrorVerticalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MirrorVerticalProps]
    }
    
    @scala.inline
    implicit class MirrorVerticalPropsMutableBuilder[Self <: MirrorVerticalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MirrorVerticalProps]
  
  /* This means you don't have to write `default`, but can instead just say `mirrorVerticalMod.foo` */
  override def _to: SFC[MirrorVerticalProps] = default
}
