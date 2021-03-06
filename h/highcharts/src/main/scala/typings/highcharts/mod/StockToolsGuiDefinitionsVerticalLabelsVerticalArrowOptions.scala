package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions extends StObject {
  
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.native
}
object StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
