package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragAndDropLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/DragAndDropLarge", JSImport.Default)
  @js.native
  val default: SFC[DragAndDropLargeProps] = js.native
  
  @js.native
  trait DragAndDropLargeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DragAndDropLargeProps {
    
    @scala.inline
    def apply(): DragAndDropLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragAndDropLargeProps]
    }
    
    @scala.inline
    implicit class DragAndDropLargePropsMutableBuilder[Self <: DragAndDropLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DragAndDropLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `dragAndDropLargeMod.foo` */
  override def _to: SFC[DragAndDropLargeProps] = default
}
