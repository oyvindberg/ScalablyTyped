package typings.haversine

import typings.haversine.anon.Coordinates
import typings.haversine.haversineStrings.LeftcurlybracketlatCommalngRightcurlybracket
import typings.haversine.haversineStrings.LeftcurlybracketlonCommalatRightcurlybracket
import typings.haversine.haversineStrings.`[latCommalon]`
import typings.haversine.haversineStrings.`[lonCommalat]`
import typings.haversine.haversineStrings.geojson
import typings.haversine.haversineStrings.km
import typings.haversine.haversineStrings.meter
import typings.haversine.haversineStrings.mile
import typings.haversine.haversineStrings.nmi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Determines the great-circle distance between two points on a sphere given their longitudes and latitudes
    */
  @JSImport("haversine", JSImport.Namespace)
  @js.native
  def apply[OptionsT /* <: js.UndefOr[Options] */](start: ParamType[OptionsT], end: ParamType[OptionsT]): Return[OptionsT] = js.native
  @JSImport("haversine", JSImport.Namespace)
  @js.native
  def apply[OptionsT /* <: js.UndefOr[Options] */](start: ParamType[OptionsT], end: ParamType[OptionsT], options: OptionsT): Return[OptionsT] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.haversine.mod.CoordinateLongitudeLatitude
    - typings.haversine.mod.CoordinateLonLat
    - typings.haversine.mod.CoordinateLatLng
    - typings.haversine.mod.LatLonTuple
    - typings.haversine.mod.GeoJSON
  */
  type Coordinate = _Coordinate | LatLonTuple
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.haversine.mod._ParamType because Already inherited */ @js.native
  trait CoordinateLatLng extends _Coordinate {
    
    var lat: Double = js.native
    
    var lng: Double = js.native
  }
  object CoordinateLatLng {
    
    @scala.inline
    def apply(lat: Double, lng: Double): CoordinateLatLng = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoordinateLatLng]
    }
    
    @scala.inline
    implicit class CoordinateLatLngMutableBuilder[Self <: CoordinateLatLng] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.haversine.mod._ParamType because Already inherited */ @js.native
  trait CoordinateLonLat extends _Coordinate {
    
    var lat: Double = js.native
    
    var lon: Double = js.native
  }
  object CoordinateLonLat {
    
    @scala.inline
    def apply(lat: Double, lon: Double): CoordinateLonLat = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoordinateLonLat]
    }
    
    @scala.inline
    implicit class CoordinateLonLatMutableBuilder[Self <: CoordinateLonLat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.haversine.mod._ParamType because Already inherited */ @js.native
  trait CoordinateLongitudeLatitude extends _Coordinate {
    
    var latitude: Double = js.native
    
    var longitude: Double = js.native
  }
  object CoordinateLongitudeLatitude {
    
    @scala.inline
    def apply(latitude: Double, longitude: Double): CoordinateLongitudeLatitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoordinateLongitudeLatitude]
    }
    
    @scala.inline
    implicit class CoordinateLongitudeLatitudeMutableBuilder[Self <: CoordinateLongitudeLatitude] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.haversine.mod._ParamType because Already inherited */ @js.native
  trait GeoJSON extends _Coordinate {
    
    var geometry: Coordinates = js.native
  }
  object GeoJSON {
    
    @scala.inline
    def apply(geometry: Coordinates): GeoJSON = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJSON]
    }
    
    @scala.inline
    implicit class GeoJSONMutableBuilder[Self <: GeoJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeometry(value: Coordinates): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    }
  }
  
  type LatLonTuple = js.Tuple2[Double, Double]
  
  @js.native
  trait Options extends StObject {
    
    /** Format of coordinate arguments. */
    var format: js.UndefOr[
        `[latCommalon]` | `[lonCommalat]` | LeftcurlybracketlonCommalatRightcurlybracket | LeftcurlybracketlatCommalngRightcurlybracket | geojson
      ] = js.native
    
    /**
      * If passed, will result in library returning boolean value of whether or not the start and end points are within that supplied threshold.
      */
    var threshold: js.UndefOr[Double | Null] = js.native
    
    /** Unit of measurement applied to result. Default: "km". */
    var unit: js.UndefOr[km | mile | meter | nmi] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(
        value: `[latCommalon]` | `[lonCommalat]` | LeftcurlybracketlonCommalatRightcurlybracket | LeftcurlybracketlatCommalngRightcurlybracket | geojson
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdNull: Self = StObject.set(x, "threshold", null)
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      @scala.inline
      def setUnit(value: km | mile | meter | nmi): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  // The input & output types of haversine() both depend on the Options object.
  /* Rewritten from type alias, can be one of: 
    - typings.haversine.mod.Coordinate
    - typings.haversine.mod.GeoJSON
    - typings.haversine.mod.CoordinateLatLng
    - typings.haversine.mod.CoordinateLonLat
    - js.Tuple2[scala.Double, scala.Double]
    - typings.haversine.mod.CoordinateLongitudeLatitude
  */
  type ParamType[T /* <: js.UndefOr[Options] */] = _ParamType[T] | (js.Tuple2[Double, Double]) | LatLonTuple
  
  type Return[T /* <: js.UndefOr[Options] */] = Double | Boolean
  
  trait _Coordinate
    extends _ParamType[js.Any]
  object _Coordinate {
    
    @scala.inline
    def CoordinateLatLng(lat: Double, lng: Double): typings.haversine.mod.CoordinateLatLng = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.haversine.mod.CoordinateLatLng]
    }
    
    @scala.inline
    def CoordinateLonLat(lat: Double, lon: Double): typings.haversine.mod.CoordinateLonLat = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.haversine.mod.CoordinateLonLat]
    }
    
    @scala.inline
    def CoordinateLongitudeLatitude(latitude: Double, longitude: Double): typings.haversine.mod.CoordinateLongitudeLatitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.haversine.mod.CoordinateLongitudeLatitude]
    }
    
    @scala.inline
    def GeoJSON(geometry: Coordinates): typings.haversine.mod.GeoJSON = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.haversine.mod.GeoJSON]
    }
  }
  
  trait _ParamType[T /* <: js.UndefOr[Options] */] extends StObject
}
