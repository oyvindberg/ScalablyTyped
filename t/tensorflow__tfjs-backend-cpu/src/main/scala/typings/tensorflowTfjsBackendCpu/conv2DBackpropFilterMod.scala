package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsConv2DBackpropFilterAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conv2DBackpropFilterMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv2DBackpropFilter", "conv2DBackpropFilter")
  @js.native
  def conv2DBackpropFilter(args: AttrsConv2DBackpropFilterAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv2DBackpropFilter", "conv2DBackpropFilterConfig")
  @js.native
  val conv2DBackpropFilterConfig: KernelConfig = js.native
}
