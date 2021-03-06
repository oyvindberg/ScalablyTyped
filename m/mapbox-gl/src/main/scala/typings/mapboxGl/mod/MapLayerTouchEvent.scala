package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.touchcancel
import typings.mapboxGl.mapboxGlStrings.touchend
import typings.mapboxGl.mapboxGlStrings.touchstart
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mapbox-gl.mapbox-gl.MapTouchEvent & {  features :std.Array<mapbox-gl.mapbox-gl.MapboxGeoJSONFeature> | undefined} */
@js.native
trait MapLayerTouchEvent extends StObject {
  
  var defaultPrevented: Boolean = js.native
  
  var features: js.UndefOr[js.Array[MapboxGeoJSONFeature]] = js.native
  
  var lngLat: LngLat = js.native
  
  var lngLats: js.Array[LngLat] = js.native
  
  var originalEvent: TouchEvent = js.native
  
  var point: Point = js.native
  
  var points: js.Array[Point] = js.native
  
  def preventDefault(): Unit = js.native
  
  var target: Map = js.native
  
  var `type`: touchstart | touchend | touchcancel = js.native
}
object MapLayerTouchEvent {
  
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    lngLat: LngLat,
    lngLats: js.Array[LngLat],
    originalEvent: TouchEvent,
    point: Point,
    points: js.Array[Point],
    preventDefault: () => Unit,
    target: Map,
    `type`: touchstart | touchend | touchcancel
  ): MapLayerTouchEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], lngLat = lngLat.asInstanceOf[js.Any], lngLats = lngLats.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerTouchEvent]
  }
  
  @scala.inline
  implicit class MapLayerTouchEventMutableBuilder[Self <: MapLayerTouchEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatures(value: js.Array[MapboxGeoJSONFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: MapboxGeoJSONFeature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setLngLat(value: LngLat): Self = StObject.set(x, "lngLat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLngLats(value: js.Array[LngLat]): Self = StObject.set(x, "lngLats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLngLatsVarargs(value: LngLat*): Self = StObject.set(x, "lngLats", js.Array(value :_*))
    
    @scala.inline
    def setOriginalEvent(value: TouchEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: Map): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: touchstart | touchend | touchcancel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
