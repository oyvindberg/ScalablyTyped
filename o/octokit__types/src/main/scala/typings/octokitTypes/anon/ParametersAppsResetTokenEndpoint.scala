package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsResetTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsResetTokenRequestOptions
import typings.octokitTypes.endpointsMod.AppsResetTokenResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsResetTokenEndpoint extends StObject {
  
  var parameters: AppsResetTokenEndpoint = js.native
  
  var request: AppsResetTokenRequestOptions = js.native
  
  var response: OctokitResponse[AppsResetTokenResponseData] = js.native
}
object ParametersAppsResetTokenEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsResetTokenEndpoint,
    request: AppsResetTokenRequestOptions,
    response: OctokitResponse[AppsResetTokenResponseData]
  ): ParametersAppsResetTokenEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsResetTokenEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsResetTokenEndpointMutableBuilder[Self <: ParametersAppsResetTokenEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsResetTokenEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsResetTokenRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsResetTokenResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
