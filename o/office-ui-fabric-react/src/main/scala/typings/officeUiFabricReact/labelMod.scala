package typings.officeUiFabricReact

import typings.officeUiFabricReact.labelTypesMod.ILabelProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Label", "Label")
  @js.native
  val Label: FunctionComponent[ILabelProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Label", "LabelBase")
  @js.native
  class LabelBase protected ()
    extends typings.officeUiFabricReact.labelBaseMod.LabelBase {
    def this(props: ILabelProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ILabelProps, context: js.Any) = this()
  }
}
