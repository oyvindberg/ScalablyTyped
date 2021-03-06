package typings.officeUiFabricReact

import typings.officeUiFabricReact.spinnerTypesMod.ISpinnerProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpinnerMod {
  
  @JSImport("office-ui-fabric-react/lib/Spinner", "Spinner")
  @js.native
  val Spinner: FunctionComponent[ISpinnerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Spinner", "SpinnerBase")
  @js.native
  class SpinnerBase protected ()
    extends typings.officeUiFabricReact.spinnerMod.SpinnerBase {
    def this(props: ISpinnerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ISpinnerProps, context: js.Any) = this()
  }
  /* static members */
  object SpinnerBase {
    
    @JSImport("office-ui-fabric-react/lib/Spinner", "SpinnerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Spinner", "SpinnerBase.defaultProps")
    @js.native
    def defaultProps: ISpinnerProps = js.native
    @scala.inline
    def defaultProps_=(x: ISpinnerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Spinner", "SpinnerSize")
  @js.native
  object SpinnerSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.spinnerTypesMod.SpinnerSize with Double] = js.native
    
    /* 3 */ val large: typings.officeUiFabricReact.spinnerTypesMod.SpinnerSize.large with Double = js.native
    
    /* 2 */ val medium: typings.officeUiFabricReact.spinnerTypesMod.SpinnerSize.medium with Double = js.native
    
    /* 1 */ val small: typings.officeUiFabricReact.spinnerTypesMod.SpinnerSize.small with Double = js.native
    
    /* 0 */ val xSmall: typings.officeUiFabricReact.spinnerTypesMod.SpinnerSize.xSmall with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Spinner", "SpinnerType")
  @js.native
  object SpinnerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.spinnerTypesMod.SpinnerType with Double] = js.native
    
    /* 1 */ val large: typings.officeUiFabricReact.spinnerTypesMod.SpinnerType.large with Double = js.native
    
    /* 0 */ val normal: typings.officeUiFabricReact.spinnerTypesMod.SpinnerType.normal with Double = js.native
  }
}
