package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsGetEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `793` extends StObject {
  
  var parameters: RequestParameters with (Omit[OrgsGetEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[OrgsGetResponseData] = js.native
}
object `793` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsGetResponseData]
  ): `793` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`793`]
  }
  
  @scala.inline
  implicit class `793MutableBuilder`[Self <: `793`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[OrgsGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
