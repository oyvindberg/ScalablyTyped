package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetAppsWithAccessToProtectedBranchEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAppsWithAccessToProtectedBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `942` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetAppsWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetAppsWithAccessToProtectedBranchResponseData] = js.native
}
object `942` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetAppsWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetAppsWithAccessToProtectedBranchResponseData]
  ): `942` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`942`]
  }
  
  @scala.inline
  implicit class `942MutableBuilder`[Self <: `942`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposGetAppsWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetAppsWithAccessToProtectedBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
