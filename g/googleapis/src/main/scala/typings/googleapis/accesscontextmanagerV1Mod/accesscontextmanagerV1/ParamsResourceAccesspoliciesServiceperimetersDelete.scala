package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAccesspoliciesServiceperimetersDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required. Resource name for the Service Perimeter.  Format:
    * `accessPolicies/{policy_id}/servicePerimeters/{service_perimeter_id}`
    */
  var name: js.UndefOr[String] = js.native
}
object ParamsResourceAccesspoliciesServiceperimetersDelete {
  
  @scala.inline
  def apply(): ParamsResourceAccesspoliciesServiceperimetersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccesspoliciesServiceperimetersDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceAccesspoliciesServiceperimetersDeleteMutableBuilder[Self <: ParamsResourceAccesspoliciesServiceperimetersDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
