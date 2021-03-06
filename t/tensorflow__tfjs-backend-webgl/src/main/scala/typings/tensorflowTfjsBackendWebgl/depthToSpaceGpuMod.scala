package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.NCHW
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.NHWC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depthToSpaceGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/depth_to_space_gpu", "DepthToSpaceProgram")
  @js.native
  class DepthToSpaceProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double], blockSize: Double, dataFormat: NCHW) = this()
    def this(outputShape: js.Array[Double], blockSize: Double, dataFormat: NHWC) = this()
    
    var blockSize: Double = js.native
    
    var dataFormat: String = js.native
    
    var getDepthCoordString: js.Any = js.native
    
    var getHeightCoordString: js.Any = js.native
    
    var getInputSamplingString: js.Any = js.native
    
    var getOutputDepthSize: js.Any = js.native
    
    var getWidthCoordString: js.Any = js.native
  }
}
