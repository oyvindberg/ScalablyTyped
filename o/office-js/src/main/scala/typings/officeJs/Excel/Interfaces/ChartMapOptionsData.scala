package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartMapAreaLevel
import typings.officeJs.Excel.ChartMapLabelStrategy
import typings.officeJs.Excel.ChartMapProjectionType
import typings.officeJs.officeJsStrings.Albers
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.BestFit
import typings.officeJs.officeJsStrings.City
import typings.officeJs.officeJsStrings.Continent
import typings.officeJs.officeJsStrings.Country
import typings.officeJs.officeJsStrings.County
import typings.officeJs.officeJsStrings.DataOnly
import typings.officeJs.officeJsStrings.Mercator
import typings.officeJs.officeJsStrings.Miller
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Robinson
import typings.officeJs.officeJsStrings.ShowAll
import typings.officeJs.officeJsStrings.State
import typings.officeJs.officeJsStrings.World
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartMapOptions.toJSON()`. */
@js.native
trait ChartMapOptionsData extends StObject {
  
  /**
    *
    * Specifies the series map labels strategy of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: js.UndefOr[ChartMapLabelStrategy | None | BestFit | ShowAll] = js.native
  
  /**
    *
    * Specifies the series mapping level of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[
    ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
  ] = js.native
  
  /**
    *
    * Specifies the series projection type of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: js.UndefOr[ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers] = js.native
}
object ChartMapOptionsData {
  
  @scala.inline
  def apply(): ChartMapOptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMapOptionsData]
  }
  
  @scala.inline
  implicit class ChartMapOptionsDataMutableBuilder[Self <: ChartMapOptionsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelStrategy(value: ChartMapLabelStrategy | None | BestFit | ShowAll): Self = StObject.set(x, "labelStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStrategyUndefined: Self = StObject.set(x, "labelStrategy", js.undefined)
    
    @scala.inline
    def setLevel(
      value: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setProjectionType(value: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers): Self = StObject.set(x, "projectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionTypeUndefined: Self = StObject.set(x, "projectionType", js.undefined)
  }
}
