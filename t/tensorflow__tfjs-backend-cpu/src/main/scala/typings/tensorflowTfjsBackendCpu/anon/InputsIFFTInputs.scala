package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.IFFTInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputsIFFTInputs extends StObject {
  
  var backend: MathBackendCPU = js.native
  
  var inputs: IFFTInputs = js.native
}
object InputsIFFTInputs {
  
  @scala.inline
  def apply(backend: MathBackendCPU, inputs: IFFTInputs): InputsIFFTInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsIFFTInputs]
  }
  
  @scala.inline
  implicit class InputsIFFTInputsMutableBuilder[Self <: InputsIFFTInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: IFFTInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
