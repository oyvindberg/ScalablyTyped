package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsScanconfigsCreate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required. The parent resource name where the scan is created, which
    * should be a project resource name in the format 'projects/{projectId}'.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaScanConfig] = js.native
}
object ParamsResourceProjectsScanconfigsCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsScanconfigsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsScanconfigsCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsScanconfigsCreateMutableBuilder[Self <: ParamsResourceProjectsScanconfigsCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaScanConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
