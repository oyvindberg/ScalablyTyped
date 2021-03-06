package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceTypeprovidersGettype extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * The name of the type provider type for this request.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The name of the type provider for this request.
    */
  var typeProvider: js.UndefOr[String] = js.native
}
object ParamsResourceTypeprovidersGettype {
  
  @scala.inline
  def apply(): ParamsResourceTypeprovidersGettype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTypeprovidersGettype]
  }
  
  @scala.inline
  implicit class ParamsResourceTypeprovidersGettypeMutableBuilder[Self <: ParamsResourceTypeprovidersGettype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeProvider(value: String): Self = StObject.set(x, "typeProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeProviderUndefined: Self = StObject.set(x, "typeProvider", js.undefined)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
