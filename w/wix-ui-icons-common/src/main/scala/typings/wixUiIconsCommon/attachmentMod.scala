package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachmentMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Attachment", JSImport.Default)
  @js.native
  val default: SFC[AttachmentProps] = js.native
  
  @js.native
  trait AttachmentProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AttachmentProps {
    
    @scala.inline
    def apply(): AttachmentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachmentProps]
    }
    
    @scala.inline
    implicit class AttachmentPropsMutableBuilder[Self <: AttachmentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AttachmentProps]
  
  /* This means you don't have to write `default`, but can instead just say `attachmentMod.foo` */
  override def _to: SFC[AttachmentProps] = default
}
