package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduceMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/reduce", "reduce")
  @js.native
  def reduce(x: TensorInfo, dtype: DataType, reductionType: ReduceTypes, backend: MathBackendWebGL): TensorInfo = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.all
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.any
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.sum
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.prod
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.mean
  */
  trait ReduceTypes extends StObject
  object ReduceTypes {
    
    @scala.inline
    def all: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.all = "all".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.all]
    
    @scala.inline
    def any: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.any = "any".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.any]
    
    @scala.inline
    def max: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max = "max".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max]
    
    @scala.inline
    def mean: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.mean = "mean".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.mean]
    
    @scala.inline
    def min: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min = "min".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min]
    
    @scala.inline
    def prod: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.prod = "prod".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.prod]
    
    @scala.inline
    def sum: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.sum = "sum".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.sum]
  }
}
