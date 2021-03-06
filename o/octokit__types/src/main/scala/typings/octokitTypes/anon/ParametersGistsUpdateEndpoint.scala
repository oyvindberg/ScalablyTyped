package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsUpdateEndpoint
import typings.octokitTypes.endpointsMod.GistsUpdateRequestOptions
import typings.octokitTypes.endpointsMod.GistsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsUpdateEndpoint extends StObject {
  
  var parameters: GistsUpdateEndpoint = js.native
  
  var request: GistsUpdateRequestOptions = js.native
  
  var response: OctokitResponse[GistsUpdateResponseData] = js.native
}
object ParametersGistsUpdateEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsUpdateEndpoint,
    request: GistsUpdateRequestOptions,
    response: OctokitResponse[GistsUpdateResponseData]
  ): ParametersGistsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsUpdateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsUpdateEndpointMutableBuilder[Self <: ParametersGistsUpdateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsUpdateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsUpdateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
