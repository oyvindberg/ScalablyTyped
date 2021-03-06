package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Max extends StObject {
  
  var max: Vector3 = js.native
  
  var min: Vector3 = js.native
}
object Max {
  
  @scala.inline
  def apply(max: Vector3, min: Vector3): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  
  @scala.inline
  implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Vector3): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Vector3): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
