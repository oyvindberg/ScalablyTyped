package typings.googleapis.appengineV1Mod.appengineV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAppsAuthorizedcertificatesGet extends StandardParameters {
  
  /**
    * Part of `name`. Name of the resource requested. Example:
    * apps/myapp/authorizedCertificates/12345.
    */
  var appsId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var authorizedCertificatesId: js.UndefOr[String] = js.native
  
  /**
    * Controls the set of fields returned in the GET response.
    */
  var view: js.UndefOr[String] = js.native
}
object ParamsResourceAppsAuthorizedcertificatesGet {
  
  @scala.inline
  def apply(): ParamsResourceAppsAuthorizedcertificatesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsAuthorizedcertificatesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceAppsAuthorizedcertificatesGetMutableBuilder[Self <: ParamsResourceAppsAuthorizedcertificatesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setAuthorizedCertificatesId(value: String): Self = StObject.set(x, "authorizedCertificatesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedCertificatesIdUndefined: Self = StObject.set(x, "authorizedCertificatesId", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
