package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposDeleteCommitCommentEndpoint extends StObject {
  
  var comment_id: Double = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposDeleteCommitCommentEndpoint {
  
  @scala.inline
  def apply(comment_id: Double, owner: String, repo: String): ReposDeleteCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteCommitCommentEndpoint]
  }
  
  @scala.inline
  implicit class ReposDeleteCommitCommentEndpointMutableBuilder[Self <: ReposDeleteCommitCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment_id(value: Double): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
