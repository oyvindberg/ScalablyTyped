package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullsGetReviewEndpoint extends StObject {
  
  var owner: String = js.native
  
  var pull_number: Double = js.native
  
  var repo: String = js.native
  
  var review_id: Double = js.native
}
object PullsGetReviewEndpoint {
  
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String, review_id: Double): PullsGetReviewEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsGetReviewEndpoint]
  }
  
  @scala.inline
  implicit class PullsGetReviewEndpointMutableBuilder[Self <: PullsGetReviewEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_number(value: Double): Self = StObject.set(x, "pull_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReview_id(value: Double): Self = StObject.set(x, "review_id", value.asInstanceOf[js.Any])
  }
}
