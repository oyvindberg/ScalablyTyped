package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsListPlansEndpoint
import typings.octokitTypes.endpointsMod.AppsListPlansResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `641` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsListPlansEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsListPlansResponseData] = js.native
}
object `641` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsListPlansEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListPlansResponseData]
  ): `641` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`641`]
  }
  
  @scala.inline
  implicit class `641MutableBuilder`[Self <: `641`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[AppsListPlansEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListPlansResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
