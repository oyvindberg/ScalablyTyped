package typings.officeUiFabricReact

import typings.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comboBoxMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ComboBox", "ComboBox")
  @js.native
  class ComboBox protected ()
    extends typings.officeUiFabricReact.comboBoxComboBoxMod.ComboBox {
    def this(props: IComboBoxProps) = this()
  }
  /* static members */
  object ComboBox {
    
    @JSImport("office-ui-fabric-react/lib/components/ComboBox", "ComboBox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ComboBox", "ComboBox.defaultProps")
    @js.native
    def defaultProps: IComboBoxProps = js.native
    @scala.inline
    def defaultProps_=(x: IComboBoxProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ComboBox", "SelectableOptionMenuItemType")
  @js.native
  object SelectableOptionMenuItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType with Double
      ] = js.native
    
    /* 1 */ val Divider: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Divider with Double = js.native
    
    /* 2 */ val Header: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Header with Double = js.native
    
    /* 0 */ val Normal: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Normal with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ComboBox", "VirtualizedComboBox")
  @js.native
  class VirtualizedComboBox protected ()
    extends typings.officeUiFabricReact.virtualizedComboBoxMod.VirtualizedComboBox {
    def this(props: IComboBoxProps) = this()
  }
}
