package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.CodeScanningUpdateAlertEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningUpdateAlertResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `671` extends StObject {
  
  var parameters: RequestParameters with (Omit[CodeScanningUpdateAlertEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[CodeScanningUpdateAlertResponseData] = js.native
}
object `671` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[CodeScanningUpdateAlertEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[CodeScanningUpdateAlertResponseData]
  ): `671` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`671`]
  }
  
  @scala.inline
  implicit class `671MutableBuilder`[Self <: `671`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[CodeScanningUpdateAlertEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodeScanningUpdateAlertResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
