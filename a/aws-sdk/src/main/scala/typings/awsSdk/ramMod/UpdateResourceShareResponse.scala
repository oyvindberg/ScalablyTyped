package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResourceShareResponse extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the resource share.
    */
  var resourceShare: js.UndefOr[ResourceShare] = js.native
}
object UpdateResourceShareResponse {
  
  @scala.inline
  def apply(): UpdateResourceShareResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResourceShareResponse]
  }
  
  @scala.inline
  implicit class UpdateResourceShareResponseMutableBuilder[Self <: UpdateResourceShareResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setResourceShare(value: ResourceShare): Self = StObject.set(x, "resourceShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareUndefined: Self = StObject.set(x, "resourceShare", js.undefined)
  }
}
