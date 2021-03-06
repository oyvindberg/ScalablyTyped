package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotAbandsTopLineStylesOptions extends StObject {
  
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.native
}
object PlotAbandsTopLineStylesOptions {
  
  @scala.inline
  def apply(): PlotAbandsTopLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAbandsTopLineStylesOptions]
  }
  
  @scala.inline
  implicit class PlotAbandsTopLineStylesOptionsMutableBuilder[Self <: PlotAbandsTopLineStylesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
  }
}
