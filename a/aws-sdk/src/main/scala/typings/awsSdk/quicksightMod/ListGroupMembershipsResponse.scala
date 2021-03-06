package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGroupMembershipsResponse extends StObject {
  
  /**
    * The list of the members of the group.
    */
  var GroupMemberList: js.UndefOr[typings.awsSdk.quicksightMod.GroupMemberList] = js.native
  
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object ListGroupMembershipsResponse {
  
  @scala.inline
  def apply(): ListGroupMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupMembershipsResponse]
  }
  
  @scala.inline
  implicit class ListGroupMembershipsResponseMutableBuilder[Self <: ListGroupMembershipsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupMemberList(value: GroupMemberList): Self = StObject.set(x, "GroupMemberList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupMemberListUndefined: Self = StObject.set(x, "GroupMemberList", js.undefined)
    
    @scala.inline
    def setGroupMemberListVarargs(value: GroupMember*): Self = StObject.set(x, "GroupMemberList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
