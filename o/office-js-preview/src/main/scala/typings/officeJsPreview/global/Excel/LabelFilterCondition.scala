package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.Excel.LabelFilterCondition.equals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Enum representing all accepted conditions by which a label filter can be applied.
  Used to configure the type of PivotFilter that is applied to the field.
  `PivotFilter.criteria.exclusive` can be set to true to invert many of these conditions.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.LabelFilterCondition")
@js.native
object LabelFilterCondition extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.LabelFilterCondition with String] = js.native
  
  /* "BeginsWith" */ val beginsWith: typings.officeJsPreview.Excel.LabelFilterCondition.beginsWith with String = js.native
  
  /* "Between" */ val between: typings.officeJsPreview.Excel.LabelFilterCondition.between with String = js.native
  
  /* "Contains" */ val contains: typings.officeJsPreview.Excel.LabelFilterCondition.contains with String = js.native
  
  /* "EndsWith" */ val endsWith: typings.officeJsPreview.Excel.LabelFilterCondition.endsWith with String = js.native
  
  /* "Equals" */ @JSName("equals")
  val equals_ : equals with String = js.native
  
  /* "GreaterThan" */ val greaterThan: typings.officeJsPreview.Excel.LabelFilterCondition.greaterThan with String = js.native
  
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: typings.officeJsPreview.Excel.LabelFilterCondition.greaterThanOrEqualTo with String = js.native
  
  /* "LessThan" */ val lessThan: typings.officeJsPreview.Excel.LabelFilterCondition.lessThan with String = js.native
  
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: typings.officeJsPreview.Excel.LabelFilterCondition.lessThanOrEqualTo with String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJsPreview.Excel.LabelFilterCondition.unknown with String = js.native
}
