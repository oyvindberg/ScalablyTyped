package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityListWatchersForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActivityListWatchersForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `612` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActivityListWatchersForRepoEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActivityListWatchersForRepoResponseData] = js.native
}
object `612` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActivityListWatchersForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActivityListWatchersForRepoResponseData]
  ): `612` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`612`]
  }
  
  @scala.inline
  implicit class `612MutableBuilder`[Self <: `612`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActivityListWatchersForRepoEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListWatchersForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
