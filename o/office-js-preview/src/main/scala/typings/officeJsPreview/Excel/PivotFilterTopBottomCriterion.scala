package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PivotFilterTopBottomCriterion extends StObject
/**
  *
  * Represents the criteria for the top/bottom values filter.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PivotFilterTopBottomCriterion")
@js.native
object PivotFilterTopBottomCriterion extends StObject {
  
  @js.native
  sealed trait bottomItems extends PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait bottomPercent extends PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait bottomSum extends PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait invalid extends PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait topItems extends PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait topPercent extends PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait topSum extends PivotFilterTopBottomCriterion
}
