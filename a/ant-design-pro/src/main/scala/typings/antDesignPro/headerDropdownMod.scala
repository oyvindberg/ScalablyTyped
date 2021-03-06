package typings.antDesignPro

import typings.antDesignPro.antDesignProStrings.bottomCenter
import typings.antDesignPro.antDesignProStrings.bottomLeft
import typings.antDesignPro.antDesignProStrings.bottomRight
import typings.antDesignPro.antDesignProStrings.topCenter
import typings.antDesignPro.antDesignProStrings.topLeft
import typings.antDesignPro.antDesignProStrings.topRight
import typings.antd.dropdownDropdownMod.DropDownProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerDropdownMod {
  
  @JSImport("ant-design-pro/lib/HeaderDropdown", JSImport.Default)
  @js.native
  class default ()
    extends Component[HeaderDropdownProps, js.Any, js.Any]
  
  type HeaderDropdown = Component[HeaderDropdownProps, js.Any, js.Any]
  
  @js.native
  trait HeaderDropdownProps extends DropDownProps {
    
    @JSName("overlay")
    var overlay_HeaderDropdownProps: ReactNode | OverlayFunc = js.native
    
    @JSName("placement")
    var placement_HeaderDropdownProps: js.UndefOr[bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter] = js.native
  }
  object HeaderDropdownProps {
    
    @scala.inline
    def apply(): HeaderDropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderDropdownProps]
    }
    
    @scala.inline
    implicit class HeaderDropdownPropsMutableBuilder[Self <: HeaderDropdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverlay(value: ReactNode | OverlayFunc): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactNode): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPlacement(value: bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    }
  }
  
  type OverlayFunc = js.Function0[ReactNode]
}
