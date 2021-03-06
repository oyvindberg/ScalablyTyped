package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.BinaryInputs */
@js.native
trait LessEqualInputs extends StObject {
  
  var a: js.UndefOr[js.Any] = js.native
  
  var b: js.UndefOr[js.Any] = js.native
}
object LessEqualInputs {
  
  @scala.inline
  def apply(): LessEqualInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LessEqualInputs]
  }
  
  @scala.inline
  implicit class LessEqualInputsMutableBuilder[Self <: LessEqualInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: js.Any): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUndefined: Self = StObject.set(x, "a", js.undefined)
    
    @scala.inline
    def setB(value: js.Any): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBUndefined: Self = StObject.set(x, "b", js.undefined)
  }
}
