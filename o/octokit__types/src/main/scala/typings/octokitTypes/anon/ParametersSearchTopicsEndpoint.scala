package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchTopicsEndpoint
import typings.octokitTypes.endpointsMod.SearchTopicsRequestOptions
import typings.octokitTypes.endpointsMod.SearchTopicsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersSearchTopicsEndpoint extends StObject {
  
  var parameters: SearchTopicsEndpoint = js.native
  
  var request: SearchTopicsRequestOptions = js.native
  
  var response: OctokitResponse[SearchTopicsResponseData] = js.native
}
object ParametersSearchTopicsEndpoint {
  
  @scala.inline
  def apply(
    parameters: SearchTopicsEndpoint,
    request: SearchTopicsRequestOptions,
    response: OctokitResponse[SearchTopicsResponseData]
  ): ParametersSearchTopicsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchTopicsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchTopicsEndpointMutableBuilder[Self <: ParametersSearchTopicsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SearchTopicsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: SearchTopicsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchTopicsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
