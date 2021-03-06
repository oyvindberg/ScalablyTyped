package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteQueuedReservedInstancesError extends StObject {
  
  /**
    * The error code.
    */
  var Code: js.UndefOr[DeleteQueuedReservedInstancesErrorCode] = js.native
  
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.native
}
object DeleteQueuedReservedInstancesError {
  
  @scala.inline
  def apply(): DeleteQueuedReservedInstancesError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteQueuedReservedInstancesError]
  }
  
  @scala.inline
  implicit class DeleteQueuedReservedInstancesErrorMutableBuilder[Self <: DeleteQueuedReservedInstancesError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: DeleteQueuedReservedInstancesErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
