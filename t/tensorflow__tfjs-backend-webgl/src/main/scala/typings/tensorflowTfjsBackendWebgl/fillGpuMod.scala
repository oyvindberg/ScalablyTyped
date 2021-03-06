package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLProgram
import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fillGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/fill_gpu", "FillProgram")
  @js.native
  class FillProgram protected () extends GPGPUProgram {
    def this(shape: js.Array[Double], value: Double) = this()
    
    def getCustomSetupFunc(value: Double): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
    
    var valueLoc: WebGLUniformLocation = js.native
  }
}
