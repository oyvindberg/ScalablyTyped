package typings.cathoQuantum

import typings.cathoQuantum.anon.BaseFontSizeColors
import typings.cathoQuantum.cathoQuantumStrings.bottom
import typings.cathoQuantum.cathoQuantumStrings.left
import typings.cathoQuantum.cathoQuantumStrings.right
import typings.cathoQuantum.cathoQuantumStrings.top
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("@catho/quantum/Tooltip", JSImport.Default)
  @js.native
  class default ()
    extends Component[TooltipProps, js.Object, js.Any]
  
  type Tooltip = Component[TooltipProps, js.Object, js.Any]
  
  @js.native
  trait TooltipProps extends StObject {
    
    var children: js.Array[ReactNode] | ReactNode = js.native
    
    var multiline: js.UndefOr[Boolean] = js.native
    
    var placement: js.UndefOr[top | right | bottom | left] = js.native
    
    var text: String = js.native
    
    var theme: js.UndefOr[BaseFontSizeColors] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object TooltipProps {
    
    @scala.inline
    def apply(text: String): TooltipProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit class TooltipPropsMutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setPlacement(value: top | right | bottom | left): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: BaseFontSizeColors): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
