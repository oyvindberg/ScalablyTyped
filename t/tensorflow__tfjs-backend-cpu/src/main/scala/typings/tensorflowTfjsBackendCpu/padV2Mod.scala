package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsPadV2Attrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object padV2Mod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/PadV2", "padV2")
  @js.native
  def padV2(args: AttrsPadV2Attrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/PadV2", "padV2Config")
  @js.native
  val padV2Config: KernelConfig = js.native
}
