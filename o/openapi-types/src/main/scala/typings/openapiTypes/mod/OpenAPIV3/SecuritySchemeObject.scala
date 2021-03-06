package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.anon.AuthorizationCode
import typings.openapiTypes.openapiTypesStrings.apiKey
import typings.openapiTypes.openapiTypesStrings.http
import typings.openapiTypes.openapiTypesStrings.oauth2
import typings.openapiTypes.openapiTypesStrings.openIdConnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.openapiTypes.mod.OpenAPIV3.HttpSecurityScheme
  - typings.openapiTypes.mod.OpenAPIV3.ApiKeySecurityScheme
  - typings.openapiTypes.mod.OpenAPIV3.OAuth2SecurityScheme
  - typings.openapiTypes.mod.OpenAPIV3.OpenIdSecurityScheme
*/
trait SecuritySchemeObject extends StObject
object SecuritySchemeObject {
  
  @scala.inline
  def ApiKeySecurityScheme(in: String, name: String, `type`: apiKey): typings.openapiTypes.mod.OpenAPIV3.ApiKeySecurityScheme = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV3.ApiKeySecurityScheme]
  }
  
  @scala.inline
  def HttpSecurityScheme(scheme: String, `type`: http): typings.openapiTypes.mod.OpenAPIV3.HttpSecurityScheme = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV3.HttpSecurityScheme]
  }
  
  @scala.inline
  def OAuth2SecurityScheme(flows: AuthorizationCode, `type`: oauth2): typings.openapiTypes.mod.OpenAPIV3.OAuth2SecurityScheme = {
    val __obj = js.Dynamic.literal(flows = flows.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV3.OAuth2SecurityScheme]
  }
  
  @scala.inline
  def OpenIdSecurityScheme(openIdConnectUrl: String, `type`: openIdConnect): typings.openapiTypes.mod.OpenAPIV3.OpenIdSecurityScheme = {
    val __obj = js.Dynamic.literal(openIdConnectUrl = openIdConnectUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV3.OpenIdSecurityScheme]
  }
}
