package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AddCredentialRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AddVirtualAuthenticatorRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AddVirtualAuthenticatorResponse
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.ClearCredentialsRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialResponse
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialsRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialsResponse
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.RemoveCredentialRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.RemoveVirtualAuthenticatorRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.SetAutomaticPresenceSimulationRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.SetUserVerifiedRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAuthnApi extends StObject {
  
  /**
    * Adds the credential to the specified authenticator.
    */
  def addCredential(params: AddCredentialRequest): js.Promise[Unit] = js.native
  
  /**
    * Creates and adds a virtual authenticator.
    */
  def addVirtualAuthenticator(params: AddVirtualAuthenticatorRequest): js.Promise[AddVirtualAuthenticatorResponse] = js.native
  
  /**
    * Clears all the credentials from the specified device.
    */
  def clearCredentials(params: ClearCredentialsRequest): js.Promise[Unit] = js.native
  
  /**
    * Disable the WebAuthn domain.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enable the WebAuthn domain and start intercepting credential storage and
    * retrieval with a virtual authenticator.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Returns a single credential stored in the given virtual authenticator that
    * matches the credential ID.
    */
  def getCredential(params: GetCredentialRequest): js.Promise[GetCredentialResponse] = js.native
  
  /**
    * Returns all the credentials stored in the given virtual authenticator.
    */
  def getCredentials(params: GetCredentialsRequest): js.Promise[GetCredentialsResponse] = js.native
  
  /**
    * Removes a credential from the authenticator.
    */
  def removeCredential(params: RemoveCredentialRequest): js.Promise[Unit] = js.native
  
  /**
    * Removes the given authenticator.
    */
  def removeVirtualAuthenticator(params: RemoveVirtualAuthenticatorRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets whether tests of user presence will succeed immediately (if true) or fail to resolve (if false) for an authenticator.
    * The default is true.
    */
  def setAutomaticPresenceSimulation(params: SetAutomaticPresenceSimulationRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets whether User Verification succeeds or fails for an authenticator.
    * The default is true.
    */
  def setUserVerified(params: SetUserVerifiedRequest): js.Promise[Unit] = js.native
}
object WebAuthnApi {
  
  @scala.inline
  def apply(
    addCredential: AddCredentialRequest => js.Promise[Unit],
    addVirtualAuthenticator: AddVirtualAuthenticatorRequest => js.Promise[AddVirtualAuthenticatorResponse],
    clearCredentials: ClearCredentialsRequest => js.Promise[Unit],
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    getCredential: GetCredentialRequest => js.Promise[GetCredentialResponse],
    getCredentials: GetCredentialsRequest => js.Promise[GetCredentialsResponse],
    removeCredential: RemoveCredentialRequest => js.Promise[Unit],
    removeVirtualAuthenticator: RemoveVirtualAuthenticatorRequest => js.Promise[Unit],
    setAutomaticPresenceSimulation: SetAutomaticPresenceSimulationRequest => js.Promise[Unit],
    setUserVerified: SetUserVerifiedRequest => js.Promise[Unit]
  ): WebAuthnApi = {
    val __obj = js.Dynamic.literal(addCredential = js.Any.fromFunction1(addCredential), addVirtualAuthenticator = js.Any.fromFunction1(addVirtualAuthenticator), clearCredentials = js.Any.fromFunction1(clearCredentials), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getCredential = js.Any.fromFunction1(getCredential), getCredentials = js.Any.fromFunction1(getCredentials), removeCredential = js.Any.fromFunction1(removeCredential), removeVirtualAuthenticator = js.Any.fromFunction1(removeVirtualAuthenticator), setAutomaticPresenceSimulation = js.Any.fromFunction1(setAutomaticPresenceSimulation), setUserVerified = js.Any.fromFunction1(setUserVerified))
    __obj.asInstanceOf[WebAuthnApi]
  }
  
  @scala.inline
  implicit class WebAuthnApiMutableBuilder[Self <: WebAuthnApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCredential(value: AddCredentialRequest => js.Promise[Unit]): Self = StObject.set(x, "addCredential", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddVirtualAuthenticator(value: AddVirtualAuthenticatorRequest => js.Promise[AddVirtualAuthenticatorResponse]): Self = StObject.set(x, "addVirtualAuthenticator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearCredentials(value: ClearCredentialsRequest => js.Promise[Unit]): Self = StObject.set(x, "clearCredentials", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCredential(value: GetCredentialRequest => js.Promise[GetCredentialResponse]): Self = StObject.set(x, "getCredential", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCredentials(value: GetCredentialsRequest => js.Promise[GetCredentialsResponse]): Self = StObject.set(x, "getCredentials", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveCredential(value: RemoveCredentialRequest => js.Promise[Unit]): Self = StObject.set(x, "removeCredential", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveVirtualAuthenticator(value: RemoveVirtualAuthenticatorRequest => js.Promise[Unit]): Self = StObject.set(x, "removeVirtualAuthenticator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutomaticPresenceSimulation(value: SetAutomaticPresenceSimulationRequest => js.Promise[Unit]): Self = StObject.set(x, "setAutomaticPresenceSimulation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUserVerified(value: SetUserVerifiedRequest => js.Promise[Unit]): Self = StObject.set(x, "setUserVerified", js.Any.fromFunction1(value))
  }
}
