package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataField extends StObject {
  
  var component: js.UndefOr[dxDataGrid] = js.native
  
  var dataField: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var editorElement: js.UndefOr[dxElement] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var parentType: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var row: js.UndefOr[dxDataGridRowObject] = js.native
  
  var rtlEnabled: js.UndefOr[Boolean] = js.native
  
  var setValue: js.UndefOr[js.Any] = js.native
  
  var updateValueTimeout: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DataField {
  
  @scala.inline
  def apply(): DataField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataField]
  }
  
  @scala.inline
  implicit class DataFieldMutableBuilder[Self <: DataField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEditorElement(value: dxElement): Self = StObject.set(x, "editorElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorElementUndefined: Self = StObject.set(x, "editorElement", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setParentType(value: String): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTypeUndefined: Self = StObject.set(x, "parentType", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRow(value: dxDataGridRowObject): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    @scala.inline
    def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtlEnabledUndefined: Self = StObject.set(x, "rtlEnabled", js.undefined)
    
    @scala.inline
    def setSetValue(value: js.Any): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    @scala.inline
    def setUpdateValueTimeout(value: Double): Self = StObject.set(x, "updateValueTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateValueTimeoutUndefined: Self = StObject.set(x, "updateValueTimeout", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
