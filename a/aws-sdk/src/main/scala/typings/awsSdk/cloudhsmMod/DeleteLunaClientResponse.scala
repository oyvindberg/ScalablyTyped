package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLunaClientResponse extends StObject {
  
  /**
    * The status of the action.
    */
  var Status: String = js.native
}
object DeleteLunaClientResponse {
  
  @scala.inline
  def apply(Status: String): DeleteLunaClientResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLunaClientResponse]
  }
  
  @scala.inline
  implicit class DeleteLunaClientResponseMutableBuilder[Self <: DeleteLunaClientResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
