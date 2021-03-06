package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnerGroupsForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnerGroupsForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnerGroupsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint extends StObject {
  
  var parameters: ActionsListSelfHostedRunnerGroupsForOrgEndpoint = js.native
  
  var request: ActionsListSelfHostedRunnerGroupsForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData] = js.native
}
object ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnerGroupsForOrgEndpoint,
    request: ActionsListSelfHostedRunnerGroupsForOrgRequestOptions,
    response: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData]
  ): ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelfHostedRunnerGroupsForOrgEndpointMutableBuilder[Self <: ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListSelfHostedRunnerGroupsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListSelfHostedRunnerGroupsForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
