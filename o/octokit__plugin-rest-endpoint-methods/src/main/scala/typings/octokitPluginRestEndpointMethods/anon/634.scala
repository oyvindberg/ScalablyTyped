package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `634` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsGetSubscriptionPlanForAccountStubbedEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData] = js.native
}
object `634` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsGetSubscriptionPlanForAccountStubbedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData]
  ): `634` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`634`]
  }
  
  @scala.inline
  implicit class `634MutableBuilder`[Self <: `634`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[AppsGetSubscriptionPlanForAccountStubbedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
