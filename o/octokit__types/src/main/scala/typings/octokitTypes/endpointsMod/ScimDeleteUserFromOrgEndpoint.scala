package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScimDeleteUserFromOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String = js.native
  
  /**
    * Identifier generated by the GitHub SCIM endpoint.
    */
  var scim_user_id: String = js.native
}
object ScimDeleteUserFromOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, scim_user_id: String): ScimDeleteUserFromOrgEndpoint = {
    val __obj = js.Dynamic.literal(scim_user_id = scim_user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimDeleteUserFromOrgEndpoint]
  }
  
  @scala.inline
  implicit class ScimDeleteUserFromOrgEndpointMutableBuilder[Self <: ScimDeleteUserFromOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScim_user_id(value: String): Self = StObject.set(x, "scim_user_id", value.asInstanceOf[js.Any])
  }
}
