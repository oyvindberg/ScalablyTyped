package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetWorkflowRunEndpoint extends StObject {
  
  var parameters: ActionsGetWorkflowRunEndpoint = js.native
  
  var request: ActionsGetWorkflowRunRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetWorkflowRunResponseData] = js.native
}
object ParametersActionsGetWorkflowRunEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetWorkflowRunEndpoint,
    request: ActionsGetWorkflowRunRequestOptions,
    response: OctokitResponse[ActionsGetWorkflowRunResponseData]
  ): ParametersActionsGetWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetWorkflowRunEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetWorkflowRunEndpointMutableBuilder[Self <: ParametersActionsGetWorkflowRunEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsGetWorkflowRunEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetWorkflowRunRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetWorkflowRunResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
