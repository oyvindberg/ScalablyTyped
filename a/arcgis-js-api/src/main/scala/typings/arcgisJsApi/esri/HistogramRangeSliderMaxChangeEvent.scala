package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`max-change`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramRangeSliderMaxChangeEvent extends StObject {
  
  var oldValue: Double = js.native
  
  var `type`: `max-change` = js.native
  
  var value: Double = js.native
}
object HistogramRangeSliderMaxChangeEvent {
  
  @scala.inline
  def apply(oldValue: Double, `type`: `max-change`, value: Double): HistogramRangeSliderMaxChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramRangeSliderMaxChangeEvent]
  }
  
  @scala.inline
  implicit class HistogramRangeSliderMaxChangeEventMutableBuilder[Self <: HistogramRangeSliderMaxChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `max-change`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
