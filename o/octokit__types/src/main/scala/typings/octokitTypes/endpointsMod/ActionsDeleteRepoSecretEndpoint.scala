package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsDeleteRepoSecretEndpoint extends StObject {
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  var secret_name: String = js.native
}
object ActionsDeleteRepoSecretEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, secret_name: String): ActionsDeleteRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDeleteRepoSecretEndpoint]
  }
  
  @scala.inline
  implicit class ActionsDeleteRepoSecretEndpointMutableBuilder[Self <: ActionsDeleteRepoSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
