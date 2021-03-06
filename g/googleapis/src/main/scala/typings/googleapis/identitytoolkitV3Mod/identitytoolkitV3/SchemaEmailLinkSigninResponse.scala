package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of email signIn.
  */
@js.native
trait SchemaEmailLinkSigninResponse extends StObject {
  
  /**
    * The user&#39;s email.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Expiration time of STS id token in seconds.
    */
  var expiresIn: js.UndefOr[String] = js.native
  
  /**
    * The STS id token to login the newly signed in user.
    */
  var idToken: js.UndefOr[String] = js.native
  
  /**
    * Whether the user is new.
    */
  var isNewUser: js.UndefOr[Boolean] = js.native
  
  /**
    * The fixed string &quot;identitytoolkit#EmailLinkSigninResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The RP local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
  
  /**
    * The refresh token for the signed in user.
    */
  var refreshToken: js.UndefOr[String] = js.native
}
object SchemaEmailLinkSigninResponse {
  
  @scala.inline
  def apply(): SchemaEmailLinkSigninResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmailLinkSigninResponse]
  }
  
  @scala.inline
  implicit class SchemaEmailLinkSigninResponseMutableBuilder[Self <: SchemaEmailLinkSigninResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNewUserUndefined: Self = StObject.set(x, "isNewUser", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
