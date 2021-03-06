package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** a helper service for chart documents which supply primary and secondary y-axes. */
@js.native
trait ChartTwoAxisYSupplier
  extends XTwoAxisYSupplier
     with ChartAxisYSupplier {
  
  /**
    * determines if the secondary y-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasSecondaryYAxis: Boolean = js.native
  
  /** determines for the secondary y-axis if the labels at the tick marks are shown or hidden. */
  var HasSecondaryYAxisDescription: Boolean = js.native
  
  /**
    * determines if the title of the secondary y-axis is shown or hidden.
    * @see ChartTitle
    * @since OOo 3.0
    */
  var HasSecondaryYAxisTitle: Boolean = js.native
}
object ChartTwoAxisYSupplier {
  
  @scala.inline
  def apply(
    HasSecondaryYAxis: Boolean,
    HasSecondaryYAxisDescription: Boolean,
    HasSecondaryYAxisTitle: Boolean,
    HasYAxis: Boolean,
    HasYAxisDescription: Boolean,
    HasYAxisGrid: Boolean,
    HasYAxisHelpGrid: Boolean,
    HasYAxisTitle: Boolean,
    SecondaryYAxis: XPropertySet,
    YAxis: XPropertySet,
    YAxisTitle: XShape,
    YHelpGrid: XPropertySet,
    YMainGrid: XPropertySet,
    acquire: () => Unit,
    getSecondaryYAxis: () => XPropertySet,
    getYAxis: () => XPropertySet,
    getYAxisTitle: () => XShape,
    getYHelpGrid: () => XPropertySet,
    getYMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ChartTwoAxisYSupplier = {
    val __obj = js.Dynamic.literal(HasSecondaryYAxis = HasSecondaryYAxis.asInstanceOf[js.Any], HasSecondaryYAxisDescription = HasSecondaryYAxisDescription.asInstanceOf[js.Any], HasSecondaryYAxisTitle = HasSecondaryYAxisTitle.asInstanceOf[js.Any], HasYAxis = HasYAxis.asInstanceOf[js.Any], HasYAxisDescription = HasYAxisDescription.asInstanceOf[js.Any], HasYAxisGrid = HasYAxisGrid.asInstanceOf[js.Any], HasYAxisHelpGrid = HasYAxisHelpGrid.asInstanceOf[js.Any], HasYAxisTitle = HasYAxisTitle.asInstanceOf[js.Any], SecondaryYAxis = SecondaryYAxis.asInstanceOf[js.Any], YAxis = YAxis.asInstanceOf[js.Any], YAxisTitle = YAxisTitle.asInstanceOf[js.Any], YHelpGrid = YHelpGrid.asInstanceOf[js.Any], YMainGrid = YMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSecondaryYAxis = js.Any.fromFunction0(getSecondaryYAxis), getYAxis = js.Any.fromFunction0(getYAxis), getYAxisTitle = js.Any.fromFunction0(getYAxisTitle), getYHelpGrid = js.Any.fromFunction0(getYHelpGrid), getYMainGrid = js.Any.fromFunction0(getYMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ChartTwoAxisYSupplier]
  }
  
  @scala.inline
  implicit class ChartTwoAxisYSupplierMutableBuilder[Self <: ChartTwoAxisYSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasSecondaryYAxis(value: Boolean): Self = StObject.set(x, "HasSecondaryYAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSecondaryYAxisDescription(value: Boolean): Self = StObject.set(x, "HasSecondaryYAxisDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSecondaryYAxisTitle(value: Boolean): Self = StObject.set(x, "HasSecondaryYAxisTitle", value.asInstanceOf[js.Any])
  }
}
