package typings.tensorflowTfjsCore.mod

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object losses {
  
  @JSImport("@tensorflow/tfjs-core", "losses.absoluteDifference")
  @js.native
  def absoluteDifference[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.computeWeightedLoss")
  @js.native
  def computeWeightedLoss[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    losses: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.cosineDistance")
  @js.native
  def cosineDistance[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    axis: Double,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.hingeLoss")
  @js.native
  def hingeLoss[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.huberLoss")
  @js.native
  def huberLoss[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    delta: js.UndefOr[Double],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.logLoss")
  @js.native
  def logLoss[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    epsilon: js.UndefOr[Double],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.meanSquaredError")
  @js.native
  def meanSquaredError[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.sigmoidCrossEntropy")
  @js.native
  def sigmoidCrossEntropy[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    multiClassLabels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    logits: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    labelSmoothing: js.UndefOr[Double],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.softmaxCrossEntropy")
  @js.native
  def softmaxCrossEntropy[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    onehotLabels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    logits: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    labelSmoothing: js.UndefOr[Double],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
}
