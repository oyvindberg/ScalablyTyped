package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renameMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Rename", JSImport.Default)
  @js.native
  val default: SFC[RenameProps] = js.native
  
  @js.native
  trait RenameProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object RenameProps {
    
    @scala.inline
    def apply(): RenameProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenameProps]
    }
    
    @scala.inline
    implicit class RenamePropsMutableBuilder[Self <: RenameProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[RenameProps]
  
  /* This means you don't have to write `default`, but can instead just say `renameMod.foo` */
  override def _to: SFC[RenameProps] = default
}
