package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ArrowheadLength
import typings.officeJsPreview.Excel.ArrowheadStyle
import typings.officeJsPreview.Excel.ArrowheadWidth
import typings.officeJsPreview.Excel.ConnectorType
import typings.officeJsPreview.officeJsPreviewStrings.Curve
import typings.officeJsPreview.officeJsPreviewStrings.Diamond
import typings.officeJsPreview.officeJsPreviewStrings.Elbow
import typings.officeJsPreview.officeJsPreviewStrings.Long
import typings.officeJsPreview.officeJsPreviewStrings.Medium
import typings.officeJsPreview.officeJsPreviewStrings.Narrow
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Open
import typings.officeJsPreview.officeJsPreviewStrings.Oval
import typings.officeJsPreview.officeJsPreviewStrings.Short
import typings.officeJsPreview.officeJsPreviewStrings.Stealth
import typings.officeJsPreview.officeJsPreviewStrings.Straight
import typings.officeJsPreview.officeJsPreviewStrings.Triangle
import typings.officeJsPreview.officeJsPreviewStrings.Wide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Line object, for use in `line.set({ ... })`. */
@js.native
trait LineUpdateData extends StObject {
  
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.native
  
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.native
  
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.native
  
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: js.UndefOr[ConnectorType | Straight | Elbow | Curve] = js.native
  
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.native
  
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.native
  
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.native
}
object LineUpdateData {
  
  @scala.inline
  def apply(): LineUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineUpdateData]
  }
  
  @scala.inline
  implicit class LineUpdateDataMutableBuilder[Self <: LineUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginArrowheadLength(value: ArrowheadLength | Short | Medium | Long): Self = StObject.set(x, "beginArrowheadLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginArrowheadLengthUndefined: Self = StObject.set(x, "beginArrowheadLength", js.undefined)
    
    @scala.inline
    def setBeginArrowheadStyle(value: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open): Self = StObject.set(x, "beginArrowheadStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginArrowheadStyleUndefined: Self = StObject.set(x, "beginArrowheadStyle", js.undefined)
    
    @scala.inline
    def setBeginArrowheadWidth(value: ArrowheadWidth | Narrow | Medium | Wide): Self = StObject.set(x, "beginArrowheadWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginArrowheadWidthUndefined: Self = StObject.set(x, "beginArrowheadWidth", js.undefined)
    
    @scala.inline
    def setConnectorType(value: ConnectorType | Straight | Elbow | Curve): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
    
    @scala.inline
    def setEndArrowheadLength(value: ArrowheadLength | Short | Medium | Long): Self = StObject.set(x, "endArrowheadLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndArrowheadLengthUndefined: Self = StObject.set(x, "endArrowheadLength", js.undefined)
    
    @scala.inline
    def setEndArrowheadStyle(value: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open): Self = StObject.set(x, "endArrowheadStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndArrowheadStyleUndefined: Self = StObject.set(x, "endArrowheadStyle", js.undefined)
    
    @scala.inline
    def setEndArrowheadWidth(value: ArrowheadWidth | Narrow | Medium | Wide): Self = StObject.set(x, "endArrowheadWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndArrowheadWidthUndefined: Self = StObject.set(x, "endArrowheadWidth", js.undefined)
  }
}
