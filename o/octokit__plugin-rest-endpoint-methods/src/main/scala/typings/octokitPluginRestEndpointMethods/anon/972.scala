package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetTopPathsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetTopPathsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `972` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetTopPathsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetTopPathsResponseData] = js.native
}
object `972` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetTopPathsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetTopPathsResponseData]
  ): `972` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`972`]
  }
  
  @scala.inline
  implicit class `972MutableBuilder`[Self <: `972`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposGetTopPathsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetTopPathsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
