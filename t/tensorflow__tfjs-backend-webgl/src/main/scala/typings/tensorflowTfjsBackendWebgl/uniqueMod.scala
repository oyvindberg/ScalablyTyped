package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsUniqueAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniqueMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Unique", "unique")
  @js.native
  def unique(args: AttrsUniqueAttrs): js.Array[TensorInfo] = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Unique", "uniqueConfig")
  @js.native
  val uniqueConfig: KernelConfig = js.native
}
