package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.baseMod.BlockProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Text", JSImport.Default)
  @js.native
  val default: FC[TextProps] = js.native
  
  @js.native
  trait TextProps extends BlockProps {
    
    @JSName("ellipsis")
    var ellipsis_TextProps: js.UndefOr[Boolean] = js.native
  }
  object TextProps {
    
    @scala.inline
    def apply(): TextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProps]
    }
    
    @scala.inline
    implicit class TextPropsMutableBuilder[Self <: TextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    }
  }
  
  type _To = FC[TextProps]
  
  /* This means you don't have to write `default`, but can instead just say `textMod.foo` */
  override def _to: FC[TextProps] = default
}
