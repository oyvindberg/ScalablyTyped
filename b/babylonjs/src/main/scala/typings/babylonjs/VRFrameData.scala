package typings.babylonjs

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRFrameData extends StObject {
  
  val leftProjectionMatrix: Float32Array = js.native
  
  val leftViewMatrix: Float32Array = js.native
  
  val pose: VRPose = js.native
  
  val rightProjectionMatrix: Float32Array = js.native
  
  val rightViewMatrix: Float32Array = js.native
  
  val timestamp: Double = js.native
}
object VRFrameData {
  
  @scala.inline
  def apply(
    leftProjectionMatrix: Float32Array,
    leftViewMatrix: Float32Array,
    pose: VRPose,
    rightProjectionMatrix: Float32Array,
    rightViewMatrix: Float32Array,
    timestamp: Double
  ): VRFrameData = {
    val __obj = js.Dynamic.literal(leftProjectionMatrix = leftProjectionMatrix.asInstanceOf[js.Any], leftViewMatrix = leftViewMatrix.asInstanceOf[js.Any], pose = pose.asInstanceOf[js.Any], rightProjectionMatrix = rightProjectionMatrix.asInstanceOf[js.Any], rightViewMatrix = rightViewMatrix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRFrameData]
  }
  
  @scala.inline
  implicit class VRFrameDataMutableBuilder[Self <: VRFrameData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftProjectionMatrix(value: Float32Array): Self = StObject.set(x, "leftProjectionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftViewMatrix(value: Float32Array): Self = StObject.set(x, "leftViewMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPose(value: VRPose): Self = StObject.set(x, "pose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightProjectionMatrix(value: Float32Array): Self = StObject.set(x, "rightProjectionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightViewMatrix(value: Float32Array): Self = StObject.set(x, "rightViewMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
