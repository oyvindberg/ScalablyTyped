package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends StObject {
  
  var column: String = js.native
  
  var controlLabel: String = js.native
  
  var item: String = js.native
  
  var itemChecked: String = js.native
  
  var itemControl: String = js.native
  
  var itemDecorator: String = js.native
  
  var itemInline: String = js.native
  
  var itemNone: String = js.native
  
  var itemSelectAll: String = js.native
  
  var label: String = js.native
  
  var labelChecked: String = js.native
  
  var materialDecorator: String = js.native
  
  var other: String = js.native
  
  var root: String = js.native
}
object Column {
  
  @scala.inline
  def apply(
    column: String,
    controlLabel: String,
    item: String,
    itemChecked: String,
    itemControl: String,
    itemDecorator: String,
    itemInline: String,
    itemNone: String,
    itemSelectAll: String,
    label: String,
    labelChecked: String,
    materialDecorator: String,
    other: String,
    root: String
  ): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], controlLabel = controlLabel.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemControl = itemControl.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], itemInline = itemInline.asInstanceOf[js.Any], itemNone = itemNone.asInstanceOf[js.Any], itemSelectAll = itemSelectAll.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelChecked = labelChecked.asInstanceOf[js.Any], materialDecorator = materialDecorator.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlLabel(value: String): Self = StObject.set(x, "controlLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemChecked(value: String): Self = StObject.set(x, "itemChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemControl(value: String): Self = StObject.set(x, "itemControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDecorator(value: String): Self = StObject.set(x, "itemDecorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemInline(value: String): Self = StObject.set(x, "itemInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemNone(value: String): Self = StObject.set(x, "itemNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSelectAll(value: String): Self = StObject.set(x, "itemSelectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelChecked(value: String): Self = StObject.set(x, "labelChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialDecorator(value: String): Self = StObject.set(x, "materialDecorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
