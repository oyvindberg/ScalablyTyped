package typings.tensorflowTfjsCore.mod

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bilinear
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object image {
  
  @JSImport("@tensorflow/tfjs-core", "image.cropAndResize")
  @js.native
  def cropAndResize(
    image: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R4],
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    boxInd: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    cropSize: js.Tuple2[Double, Double],
    method: js.UndefOr[nearest | bilinear],
    extrapolationValue: js.UndefOr[Double]
  ): Tensor[R4] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: String): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs-core", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: js.Array[Uint8Array]): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs-core", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: Boolean): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs-core", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: Double): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs-core", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: Float32Array): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs-core", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: Int32Array): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs-core", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: Uint8Array): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs-core", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: Tensor[R4]): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs-core", "image.flipLeftRight")
  @js.native
  def flipLeftRight(
    image: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]
  ): Tensor[R4] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "image.nonMaxSuppression")
  @js.native
  def nonMaxSuppression(
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double]
  ): Tensor[R1] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "image.nonMaxSuppressionAsync")
  @js.native
  def nonMaxSuppressionAsync(
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double]
  ): js.Promise[Tensor[R1]] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "image.nonMaxSuppressionPadded")
  @js.native
  def nonMaxSuppressionPadded(
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    padToMaxOutputSize: js.UndefOr[Boolean]
  ): NamedTensorMap = js.native
  
  @JSImport("@tensorflow/tfjs-core", "image.nonMaxSuppressionPaddedAsync")
  @js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    padToMaxOutputSize: js.UndefOr[Boolean]
  ): js.Promise[NamedTensorMap] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "image.nonMaxSuppressionWithScore")
  @js.native
  def nonMaxSuppressionWithScore(
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    softNmsSigma: js.UndefOr[Double]
  ): NamedTensorMap = js.native
  
  @JSImport("@tensorflow/tfjs-core", "image.nonMaxSuppressionWithScoreAsync")
  @js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    softNmsSigma: js.UndefOr[Double]
  ): js.Promise[NamedTensorMap] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: T, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: T, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    size: js.Tuple2[Double, Double]
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: T, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: T, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    size: js.Tuple2[Double, Double]
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core", "image.rotateWithOffset")
  @js.native
  def rotateWithOffset(
    image: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R4],
    radians: Double,
    fillValue: js.UndefOr[Double | (js.Tuple3[Double, Double, Double])],
    center: js.UndefOr[Double | (js.Tuple2[Double, Double])]
  ): Tensor[R4] = js.native
}
