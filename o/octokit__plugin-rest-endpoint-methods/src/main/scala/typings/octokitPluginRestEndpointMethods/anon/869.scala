package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsUpdateBranchEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `869` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsUpdateBranchEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsUpdateBranchResponseData] = js.native
}
object `869` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsUpdateBranchEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsUpdateBranchResponseData]
  ): `869` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`869`]
  }
  
  @scala.inline
  implicit class `869MutableBuilder`[Self <: `869`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsUpdateBranchEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsUpdateBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
