package typings.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.wordpressEditor.postVisibilityCheckMod.PostVisibilityCheck.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postVisibilityCheckMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-visibility/check", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostVisibilityCheck {
    
    @js.native
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      def render(props: RenderProps): Element = js.native
    }
    object Props {
      
      @scala.inline
      def apply(render: RenderProps => Element): Props = {
        val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRender(value: RenderProps => Element): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait RenderProps extends StObject {
      
      var canEdit: Boolean = js.native
    }
    object RenderProps {
      
      @scala.inline
      def apply(canEdit: Boolean): RenderProps = {
        val __obj = js.Dynamic.literal(canEdit = canEdit.asInstanceOf[js.Any])
        __obj.asInstanceOf[RenderProps]
      }
      
      @scala.inline
      implicit class RenderPropsMutableBuilder[Self <: RenderProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
      }
    }
  }
}
