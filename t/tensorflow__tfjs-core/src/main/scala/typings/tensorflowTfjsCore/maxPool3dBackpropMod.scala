package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTensorMod.Tensor5D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxPool3dBackpropMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/max_pool_3d_backprop", "maxPool3dBackprop")
  @js.native
  def maxPool3dBackprop[T /* <: Tensor4D | Tensor5D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    output: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    dilations: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = js.native
}
