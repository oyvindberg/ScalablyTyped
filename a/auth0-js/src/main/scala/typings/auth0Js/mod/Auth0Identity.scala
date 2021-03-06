package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0Identity extends StObject {
  
  var connection: String = js.native
  
  var isSocial: Boolean = js.native
  
  var provider: String = js.native
  
  var user_id: String = js.native
}
object Auth0Identity {
  
  @scala.inline
  def apply(connection: String, isSocial: Boolean, provider: String, user_id: String): Auth0Identity = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isSocial = isSocial.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0Identity]
  }
  
  @scala.inline
  implicit class Auth0IdentityMutableBuilder[Self <: Auth0Identity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSocial(value: Boolean): Self = StObject.set(x, "isSocial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
