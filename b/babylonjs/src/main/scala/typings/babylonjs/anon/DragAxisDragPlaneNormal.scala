package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragAxisDragPlaneNormal extends StObject {
  
  var dragAxis: js.UndefOr[Vector3] = js.native
  
  var dragPlaneNormal: js.UndefOr[Vector3] = js.native
}
object DragAxisDragPlaneNormal {
  
  @scala.inline
  def apply(): DragAxisDragPlaneNormal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAxisDragPlaneNormal]
  }
  
  @scala.inline
  implicit class DragAxisDragPlaneNormalMutableBuilder[Self <: DragAxisDragPlaneNormal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragAxis(value: Vector3): Self = StObject.set(x, "dragAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragAxisUndefined: Self = StObject.set(x, "dragAxis", js.undefined)
    
    @scala.inline
    def setDragPlaneNormal(value: Vector3): Self = StObject.set(x, "dragPlaneNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragPlaneNormalUndefined: Self = StObject.set(x, "dragPlaneNormal", js.undefined)
  }
}
