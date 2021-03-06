package typings.officeUiFabricReact

import typings.officeUiFabricReact.facepileTypesMod.IFacepileProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facepileMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Facepile", "Facepile")
  @js.native
  val Facepile: FunctionComponent[IFacepileProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Facepile", "FacepileBase")
  @js.native
  class FacepileBase protected ()
    extends typings.officeUiFabricReact.facepileBaseMod.FacepileBase {
    def this(props: IFacepileProps) = this()
  }
  /* static members */
  object FacepileBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Facepile", "FacepileBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Facepile", "FacepileBase.defaultProps")
    @js.native
    def defaultProps: IFacepileProps = js.native
    @scala.inline
    def defaultProps_=(x: IFacepileProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Facepile", "OverflowButtonType")
  @js.native
  object OverflowButtonType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.facepileTypesMod.OverflowButtonType with Double] = js.native
    
    /* 1 */ val descriptive: typings.officeUiFabricReact.facepileTypesMod.OverflowButtonType.descriptive with Double = js.native
    
    /* 3 */ val downArrow: typings.officeUiFabricReact.facepileTypesMod.OverflowButtonType.downArrow with Double = js.native
    
    /* 2 */ val more: typings.officeUiFabricReact.facepileTypesMod.OverflowButtonType.more with Double = js.native
    
    /* 0 */ val none: typings.officeUiFabricReact.facepileTypesMod.OverflowButtonType.none with Double = js.native
  }
}
