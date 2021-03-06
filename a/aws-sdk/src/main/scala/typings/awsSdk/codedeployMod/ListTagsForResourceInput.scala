package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceInput extends StObject {
  
  /**
    * An identifier returned from the previous ListTagsForResource call. It can be used to return the next set of applications in the list.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codedeployMod.NextToken] = js.native
  
  /**
    *  The ARN of a CodeDeploy resource. ListTagsForResource returns all the tags associated with the resource that is identified by the ResourceArn. 
    */
  var ResourceArn: Arn = js.native
}
object ListTagsForResourceInput {
  
  @scala.inline
  def apply(ResourceArn: Arn): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @scala.inline
  implicit class ListTagsForResourceInputMutableBuilder[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
