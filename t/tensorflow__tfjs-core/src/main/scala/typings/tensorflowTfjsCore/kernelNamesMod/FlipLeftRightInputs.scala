package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'image'> */
@js.native
trait FlipLeftRightInputs extends StObject {
  
  var image: js.UndefOr[js.Any] = js.native
}
object FlipLeftRightInputs {
  
  @scala.inline
  def apply(): FlipLeftRightInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlipLeftRightInputs]
  }
  
  @scala.inline
  implicit class FlipLeftRightInputsMutableBuilder[Self <: FlipLeftRightInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: js.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
