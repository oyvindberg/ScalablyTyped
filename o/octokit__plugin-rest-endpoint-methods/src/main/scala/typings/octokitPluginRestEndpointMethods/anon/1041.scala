package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1041` extends StObject {
  
  var parameters: RequestParameters with (Omit[TeamsCheckPermissionsForProjectInOrgEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[TeamsCheckPermissionsForProjectInOrgResponseData] = js.native
}
object `1041` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsCheckPermissionsForProjectInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsCheckPermissionsForProjectInOrgResponseData]
  ): `1041` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1041`]
  }
  
  @scala.inline
  implicit class `1041MutableBuilder`[Self <: `1041`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[TeamsCheckPermissionsForProjectInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCheckPermissionsForProjectInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
