package typings.reactDashMosaicDashComponent

import typings.react.reactMod.Component
import typings.react.reactMod.Context
import typings.reactDashMosaicDashComponent.libButtonsMosaicButtonMod.MosaicButtonProps
import typings.reactDashMosaicDashComponent.libContextTypesMod.MosaicWindowContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/buttons/SplitButton", JSImport.Namespace)
@js.native
object libButtonsSplitButtonMod extends js.Object {
  @js.native
  class SplitButton ()
    extends Component[MosaicButtonProps, js.Object, js.Any] {
    @JSName("context")
    var context_SplitButton: MosaicWindowContext = js.native
    var split: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object SplitButton extends js.Object {
    var contextType: Context[MosaicWindowContext] = js.native
  }
  
}

