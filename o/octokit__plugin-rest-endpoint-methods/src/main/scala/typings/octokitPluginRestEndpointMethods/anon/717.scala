package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForRepoEndpoint
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `717` extends StObject {
  
  var parameters: RequestParameters with (Omit[InteractionsSetRestrictionsForRepoEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[InteractionsSetRestrictionsForRepoResponseData] = js.native
}
object `717` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[InteractionsSetRestrictionsForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[InteractionsSetRestrictionsForRepoResponseData]
  ): `717` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`717`]
  }
  
  @scala.inline
  implicit class `717MutableBuilder`[Self <: `717`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[InteractionsSetRestrictionsForRepoEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[InteractionsSetRestrictionsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
