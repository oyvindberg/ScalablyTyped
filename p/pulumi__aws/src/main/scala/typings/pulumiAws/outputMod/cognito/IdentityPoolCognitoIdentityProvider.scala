package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityPoolCognitoIdentityProvider extends StObject {
  
  /**
    * The client ID for the Amazon Cognito Identity User Pool.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * The provider name for an Amazon Cognito Identity User Pool.
    */
  var providerName: js.UndefOr[String] = js.native
  
  /**
    * Whether server-side token validation is enabled for the identity provider’s token or not.
    */
  var serverSideTokenCheck: js.UndefOr[Boolean] = js.native
}
object IdentityPoolCognitoIdentityProvider {
  
  @scala.inline
  def apply(): IdentityPoolCognitoIdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolCognitoIdentityProvider]
  }
  
  @scala.inline
  implicit class IdentityPoolCognitoIdentityProviderMutableBuilder[Self <: IdentityPoolCognitoIdentityProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
    
    @scala.inline
    def setServerSideTokenCheck(value: Boolean): Self = StObject.set(x, "serverSideTokenCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideTokenCheckUndefined: Self = StObject.set(x, "serverSideTokenCheck", js.undefined)
  }
}
