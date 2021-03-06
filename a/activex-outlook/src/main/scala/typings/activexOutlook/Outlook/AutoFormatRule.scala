package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFormatRule extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var Enabled: Boolean = js.native
  
  var Filter: String = js.native
  
  var Font: ViewFont = js.native
  
  var Name: String = js.native
  
  @JSName("Outlook.AutoFormatRule_typekey")
  var OutlookDotAutoFormatRule_typekey: AutoFormatRule = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  val Standard: Boolean = js.native
}
object AutoFormatRule {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    Filter: String,
    Font: ViewFont,
    Name: String,
    OutlookDotAutoFormatRule_typekey: AutoFormatRule,
    Parent: js.Any,
    Session: NameSpace,
    Standard: Boolean
  ): AutoFormatRule = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AutoFormatRule_typekey")(OutlookDotAutoFormatRule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFormatRule]
  }
  
  @scala.inline
  implicit class AutoFormatRuleMutableBuilder[Self <: AutoFormatRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: ViewFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotAutoFormatRule_typekey(value: AutoFormatRule): Self = StObject.set(x, "Outlook.AutoFormatRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandard(value: Boolean): Self = StObject.set(x, "Standard", value.asInstanceOf[js.Any])
  }
}
