package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListObjectAttributesResponse extends StObject {
  
  /**
    * The attributes map that is associated with the object. AttributeArn is the key; attribute value is the value.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
}
object BatchListObjectAttributesResponse {
  
  @scala.inline
  def apply(): BatchListObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListObjectAttributesResponse]
  }
  
  @scala.inline
  implicit class BatchListObjectAttributesResponseMutableBuilder[Self <: BatchListObjectAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeKeyAndValueList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: AttributeKeyAndValue*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
