package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceMeasurement2DViewModelMeasurement extends Object {
  
  /**
    * Measurement line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement)
    */
  var geometry: js.Any = js.native
  
  /**
    * Line length (m).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement)
    */
  var length: Double = js.native
}
object DistanceMeasurement2DViewModelMeasurement {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    geometry: js.Any,
    hasOwnProperty: PropertyKey => Boolean,
    length: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): DistanceMeasurement2DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), length = length.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[DistanceMeasurement2DViewModelMeasurement]
  }
  
  @scala.inline
  implicit class DistanceMeasurement2DViewModelMeasurementMutableBuilder[Self <: DistanceMeasurement2DViewModelMeasurement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: js.Any): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
