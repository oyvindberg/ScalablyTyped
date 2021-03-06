package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTaskDefinitionFamiliesRequest extends StObject {
  
  /**
    * The familyPrefix is a string that is used to filter the results of ListTaskDefinitionFamilies. If you specify a familyPrefix, only task definition family names that begin with the familyPrefix string are returned.
    */
  var familyPrefix: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of task definition family results returned by ListTaskDefinitionFamilies in paginated output. When this parameter is used, ListTaskDefinitions only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListTaskDefinitionFamilies request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListTaskDefinitionFamilies returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The nextToken value returned from a ListTaskDefinitionFamilies request indicating that more results are available to fulfill the request and further calls will be needed. If maxResults was provided, it is possible the number of results to be fewer than maxResults.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The task definition family status with which to filter the ListTaskDefinitionFamilies results. By default, both ACTIVE and INACTIVE task definition families are listed. If this parameter is set to ACTIVE, only task definition families that have an ACTIVE task definition revision are returned. If this parameter is set to INACTIVE, only task definition families that do not have any ACTIVE task definition revisions are returned. If you paginate the resulting output, be sure to keep the status value constant in each subsequent request.
    */
  var status: js.UndefOr[TaskDefinitionFamilyStatus] = js.native
}
object ListTaskDefinitionFamiliesRequest {
  
  @scala.inline
  def apply(): ListTaskDefinitionFamiliesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskDefinitionFamiliesRequest]
  }
  
  @scala.inline
  implicit class ListTaskDefinitionFamiliesRequestMutableBuilder[Self <: ListTaskDefinitionFamiliesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamilyPrefix(value: String): Self = StObject.set(x, "familyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyPrefixUndefined: Self = StObject.set(x, "familyPrefix", js.undefined)
    
    @scala.inline
    def setMaxResults(value: BoxedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: TaskDefinitionFamilyStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
