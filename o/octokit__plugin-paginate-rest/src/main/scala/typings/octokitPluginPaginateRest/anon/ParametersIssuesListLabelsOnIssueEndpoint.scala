package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListLabelsOnIssueEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsOnIssueResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListLabelsOnIssueEndpoint extends StObject {
  
  var parameters: IssuesListLabelsOnIssueEndpoint = js.native
  
  var response: OctokitResponse[IssuesListLabelsOnIssueResponseData] = js.native
}
object ParametersIssuesListLabelsOnIssueEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListLabelsOnIssueEndpoint,
    response: OctokitResponse[IssuesListLabelsOnIssueResponseData]
  ): ParametersIssuesListLabelsOnIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListLabelsOnIssueEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListLabelsOnIssueEndpointMutableBuilder[Self <: ParametersIssuesListLabelsOnIssueEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListLabelsOnIssueEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListLabelsOnIssueResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
