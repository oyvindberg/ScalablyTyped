package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityListReposWatchedByUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReposWatchedByUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `609` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActivityListReposWatchedByUserEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActivityListReposWatchedByUserResponseData] = js.native
}
object `609` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActivityListReposWatchedByUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActivityListReposWatchedByUserResponseData]
  ): `609` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`609`]
  }
  
  @scala.inline
  implicit class `609MutableBuilder`[Self <: `609`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActivityListReposWatchedByUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListReposWatchedByUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
