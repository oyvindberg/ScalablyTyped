package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseEvent extends StObject {
  
  var mozMovementX: Double = js.native
  
  var mozMovementY: Double = js.native
  
  var msMovementX: Double = js.native
  
  var msMovementY: Double = js.native
  
  var webkitMovementX: Double = js.native
  
  var webkitMovementY: Double = js.native
}
object MouseEvent {
  
  @scala.inline
  def apply(
    mozMovementX: Double,
    mozMovementY: Double,
    msMovementX: Double,
    msMovementY: Double,
    webkitMovementX: Double,
    webkitMovementY: Double
  ): MouseEvent = {
    val __obj = js.Dynamic.literal(mozMovementX = mozMovementX.asInstanceOf[js.Any], mozMovementY = mozMovementY.asInstanceOf[js.Any], msMovementX = msMovementX.asInstanceOf[js.Any], msMovementY = msMovementY.asInstanceOf[js.Any], webkitMovementX = webkitMovementX.asInstanceOf[js.Any], webkitMovementY = webkitMovementY.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEvent]
  }
  
  @scala.inline
  implicit class MouseEventMutableBuilder[Self <: MouseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMozMovementX(value: Double): Self = StObject.set(x, "mozMovementX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozMovementY(value: Double): Self = StObject.set(x, "mozMovementY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMovementX(value: Double): Self = StObject.set(x, "msMovementX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMovementY(value: Double): Self = StObject.set(x, "msMovementY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMovementX(value: Double): Self = StObject.set(x, "webkitMovementX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMovementY(value: Double): Self = StObject.set(x, "webkitMovementY", value.asInstanceOf[js.Any])
  }
}
