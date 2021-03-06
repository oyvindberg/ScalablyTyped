package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesRemoveAssigneesEndpoint
import typings.octokitTypes.endpointsMod.IssuesRemoveAssigneesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `749` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesRemoveAssigneesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesRemoveAssigneesResponseData] = js.native
}
object `749` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesRemoveAssigneesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesRemoveAssigneesResponseData]
  ): `749` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`749`]
  }
  
  @scala.inline
  implicit class `749MutableBuilder`[Self <: `749`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesRemoveAssigneesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesRemoveAssigneesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
