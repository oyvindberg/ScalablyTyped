package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListKeyPhrasesDetectionJobsRequest extends StObject {
  
  /**
    * Filters the jobs that are returned. You can filter jobs on their name, status, or the date and time that they were submitted. You can only set one filter at a time.
    */
  var Filter: js.UndefOr[KeyPhrasesDetectionJobFilter] = js.native
  
  /**
    * The maximum number of results to return in each page. The default is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.native
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListKeyPhrasesDetectionJobsRequest {
  
  @scala.inline
  def apply(): ListKeyPhrasesDetectionJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyPhrasesDetectionJobsRequest]
  }
  
  @scala.inline
  implicit class ListKeyPhrasesDetectionJobsRequestMutableBuilder[Self <: ListKeyPhrasesDetectionJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: KeyPhrasesDetectionJobFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
