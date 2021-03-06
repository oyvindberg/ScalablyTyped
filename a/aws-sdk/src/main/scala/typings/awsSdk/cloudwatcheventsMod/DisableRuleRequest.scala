package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableRuleRequest extends StObject {
  
  /**
    * The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[EventBusNameOrArn] = js.native
  
  /**
    * The name of the rule.
    */
  var Name: RuleName = js.native
}
object DisableRuleRequest {
  
  @scala.inline
  def apply(Name: RuleName): DisableRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableRuleRequest]
  }
  
  @scala.inline
  implicit class DisableRuleRequestMutableBuilder[Self <: DisableRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventBusName(value: EventBusNameOrArn): Self = StObject.set(x, "EventBusName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBusNameUndefined: Self = StObject.set(x, "EventBusName", js.undefined)
    
    @scala.inline
    def setName(value: RuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
