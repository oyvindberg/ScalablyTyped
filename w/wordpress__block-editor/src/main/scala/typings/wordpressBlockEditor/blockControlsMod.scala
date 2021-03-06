package typings.wordpressBlockEditor

import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.anon.OmitPropsname
import typings.wordpressBlockEditor.blockControlsMod.BlockControls.Props
import typings.wordpressComponents.toolbarMod.Toolbar.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockControlsMod {
  
  object default {
    
    @JSImport("@wordpress/block-editor/components/block-controls", JSImport.Default)
    @js.native
    def apply(props: Props): Element = js.native
    @JSImport("@wordpress/block-editor/components/block-controls", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor/components/block-controls", "default.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  object BlockControls {
    
    /* Inlined parent std.Pick<@wordpress/components.@wordpress/components.Toolbar.Props, 'controls'> */
    @js.native
    trait Props extends StObject {
      
      var children: ReactNode = js.native
      
      var controls: js.UndefOr[js.Array[js.Array[Control] | Control]] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setControls(value: js.Array[js.Array[Control] | Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
        
        @scala.inline
        def setControlsVarargs(value: (js.Array[Control] | Control)*): Self = StObject.set(x, "controls", js.Array(value :_*))
      }
    }
  }
}
