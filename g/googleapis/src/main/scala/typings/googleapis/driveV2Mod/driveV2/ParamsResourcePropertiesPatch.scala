package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePropertiesPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the file.
    */
  var fileId: js.UndefOr[String] = js.native
  
  /**
    * The key of the property.
    */
  var propertyKey: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProperty] = js.native
  
  /**
    * The visibility of the property. Allowed values are PRIVATE and PUBLIC.
    * (Default: PRIVATE)
    */
  var visibility: js.UndefOr[String] = js.native
}
object ParamsResourcePropertiesPatch {
  
  @scala.inline
  def apply(): ParamsResourcePropertiesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesPatch]
  }
  
  @scala.inline
  implicit class ParamsResourcePropertiesPatchMutableBuilder[Self <: ParamsResourcePropertiesPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setPropertyKey(value: String): Self = StObject.set(x, "propertyKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyKeyUndefined: Self = StObject.set(x, "propertyKey", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaProperty): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
