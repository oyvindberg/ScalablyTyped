package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceWebappsUpdate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWebApp] = js.native
  
  /**
    * The ID of the web app.
    */
  var webAppId: js.UndefOr[String] = js.native
}
object ParamsResourceWebappsUpdate {
  
  @scala.inline
  def apply(): ParamsResourceWebappsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceWebappsUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceWebappsUpdateMutableBuilder[Self <: ParamsResourceWebappsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaWebApp): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setWebAppId(value: String): Self = StObject.set(x, "webAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAppIdUndefined: Self = StObject.set(x, "webAppId", js.undefined)
  }
}
