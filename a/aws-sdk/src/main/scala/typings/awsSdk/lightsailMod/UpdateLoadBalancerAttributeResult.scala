package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateLoadBalancerAttributeResult extends StObject {
  
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operations: js.UndefOr[OperationList] = js.native
}
object UpdateLoadBalancerAttributeResult {
  
  @scala.inline
  def apply(): UpdateLoadBalancerAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLoadBalancerAttributeResult]
  }
  
  @scala.inline
  implicit class UpdateLoadBalancerAttributeResultMutableBuilder[Self <: UpdateLoadBalancerAttributeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperations(value: OperationList): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value :_*))
  }
}
