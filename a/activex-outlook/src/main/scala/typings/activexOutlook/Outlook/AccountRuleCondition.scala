package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRuleCondition extends StObject {
  
  var Account: typings.activexOutlook.Outlook.Account = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val ConditionType: OlRuleConditionType = js.native
  
  var Enabled: Boolean = js.native
  
  @JSName("Outlook.AccountRuleCondition_typekey")
  var OutlookDotAccountRuleCondition_typekey: AccountRuleCondition = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object AccountRuleCondition {
  
  @scala.inline
  def apply(
    Account: Account,
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotAccountRuleCondition_typekey: AccountRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): AccountRuleCondition = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AccountRuleCondition_typekey")(OutlookDotAccountRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRuleCondition]
  }
  
  @scala.inline
  implicit class AccountRuleConditionMutableBuilder[Self <: AccountRuleCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: Account): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionType(value: OlRuleConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotAccountRuleCondition_typekey(value: AccountRuleCondition): Self = StObject.set(x, "Outlook.AccountRuleCondition_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
