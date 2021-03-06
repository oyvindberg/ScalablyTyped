package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GesturePoint extends StObject {
  
  var captured: Boolean = js.native
  
  var contactPos: Point = js.native
  
  var contactTime: Double = js.native
  
  var currentPos: Point = js.native
  
  var currentTime: Double = js.native
  
  var direction: Double = js.native
  
  var id: Double = js.native
  
  var insideElement: Boolean = js.native
  
  var insideElementPressed: Boolean = js.native
  
  var isPrimary: Boolean = js.native
  
  var lastPos: Point = js.native
  
  var lastTime: Double = js.native
  
  var speed: Double = js.native
  
  var `type`: String = js.native
}
object GesturePoint {
  
  @scala.inline
  def apply(
    captured: Boolean,
    contactPos: Point,
    contactTime: Double,
    currentPos: Point,
    currentTime: Double,
    direction: Double,
    id: Double,
    insideElement: Boolean,
    insideElementPressed: Boolean,
    isPrimary: Boolean,
    lastPos: Point,
    lastTime: Double,
    speed: Double,
    `type`: String
  ): GesturePoint = {
    val __obj = js.Dynamic.literal(captured = captured.asInstanceOf[js.Any], contactPos = contactPos.asInstanceOf[js.Any], contactTime = contactTime.asInstanceOf[js.Any], currentPos = currentPos.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insideElement = insideElement.asInstanceOf[js.Any], insideElementPressed = insideElementPressed.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], lastPos = lastPos.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GesturePoint]
  }
  
  @scala.inline
  implicit class GesturePointMutableBuilder[Self <: GesturePoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptured(value: Boolean): Self = StObject.set(x, "captured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactPos(value: Point): Self = StObject.set(x, "contactPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactTime(value: Double): Self = StObject.set(x, "contactTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPos(value: Point): Self = StObject.set(x, "currentPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideElement(value: Boolean): Self = StObject.set(x, "insideElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideElementPressed(value: Boolean): Self = StObject.set(x, "insideElementPressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPos(value: Point): Self = StObject.set(x, "lastPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTime(value: Double): Self = StObject.set(x, "lastTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
