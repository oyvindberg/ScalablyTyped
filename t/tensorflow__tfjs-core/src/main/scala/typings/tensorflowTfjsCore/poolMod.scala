package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.avg
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poolMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/pool", "pool")
  @js.native
  def pool[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | max,
    pad: valid_ | same_ | Double,
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    strides: js.UndefOr[(js.Tuple2[Double, Double]) | Double]
  ): T = js.native
}
