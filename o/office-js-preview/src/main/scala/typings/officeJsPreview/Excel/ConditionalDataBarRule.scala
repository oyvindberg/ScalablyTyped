package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.Formula
import typings.officeJsPreview.officeJsPreviewStrings.HighestValue
import typings.officeJsPreview.officeJsPreviewStrings.Invalid
import typings.officeJsPreview.officeJsPreviewStrings.LowestValue
import typings.officeJsPreview.officeJsPreviewStrings.Number
import typings.officeJsPreview.officeJsPreviewStrings.Percent
import typings.officeJsPreview.officeJsPreviewStrings.Percentile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a rule-type for a Data Bar.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalDataBarRule extends StObject {
  
  /**
    *
    * The formula, if required, to evaluate the databar rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[String] = js.native
  
  /**
    *
    * The type of rule for the databar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatRuleType | Invalid | Automatic | LowestValue | HighestValue | Number | Percent | Formula | Percentile = js.native
}
object ConditionalDataBarRule {
  
  @scala.inline
  def apply(
    `type`: ConditionalFormatRuleType | Invalid | Automatic | LowestValue | HighestValue | Number | Percent | Formula | Percentile
  ): ConditionalDataBarRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalDataBarRule]
  }
  
  @scala.inline
  implicit class ConditionalDataBarRuleMutableBuilder[Self <: ConditionalDataBarRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setType(
      value: ConditionalFormatRuleType | Invalid | Automatic | LowestValue | HighestValue | Number | Percent | Formula | Percentile
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
