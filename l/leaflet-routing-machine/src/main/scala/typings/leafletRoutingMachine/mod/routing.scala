package typings.leafletRoutingMachine.mod

import typings.leaflet.mod.LatLng_
import typings.leafletRoutingMachine.mod.Routing_.AutoCompleteOptions
import typings.leafletRoutingMachine.mod.Routing_.AutoComplete_
import typings.leafletRoutingMachine.mod.Routing_.Control_
import typings.leafletRoutingMachine.mod.Routing_.ErrorControlOptions
import typings.leafletRoutingMachine.mod.Routing_.ErrorControl_
import typings.leafletRoutingMachine.mod.Routing_.FormatterOptions
import typings.leafletRoutingMachine.mod.Routing_.Formatter_
import typings.leafletRoutingMachine.mod.Routing_.GeocoderElementOptions
import typings.leafletRoutingMachine.mod.Routing_.GeocoderElement_
import typings.leafletRoutingMachine.mod.Routing_.IRoute
import typings.leafletRoutingMachine.mod.Routing_.ItineraryBuilderOptions
import typings.leafletRoutingMachine.mod.Routing_.ItineraryBuilder_
import typings.leafletRoutingMachine.mod.Routing_.ItineraryOptions
import typings.leafletRoutingMachine.mod.Routing_.Itinerary_
import typings.leafletRoutingMachine.mod.Routing_.LineOptions
import typings.leafletRoutingMachine.mod.Routing_.Line_
import typings.leafletRoutingMachine.mod.Routing_.LocalizationOptions
import typings.leafletRoutingMachine.mod.Routing_.Localization_
import typings.leafletRoutingMachine.mod.Routing_.MapBox_
import typings.leafletRoutingMachine.mod.Routing_.OSRMOptions
import typings.leafletRoutingMachine.mod.Routing_.OSRMv1_
import typings.leafletRoutingMachine.mod.Routing_.PlanOptions
import typings.leafletRoutingMachine.mod.Routing_.Plan_
import typings.leafletRoutingMachine.mod.Routing_.RoutingControlOptions
import typings.leafletRoutingMachine.mod.Routing_.WaypointOptions
import typings.leafletRoutingMachine.mod.Routing_.Waypoint_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routing {
  
  @JSImport("leaflet", "routing.autocomplete")
  @js.native
  def autocomplete(element: HTMLElement, callback: js.Any, context: js.Any, options: AutoCompleteOptions): AutoComplete_ = js.native
  
  @JSImport("leaflet", "routing.control")
  @js.native
  def control(): Control_ = js.native
  @JSImport("leaflet", "routing.control")
  @js.native
  def control(options: RoutingControlOptions): Control_ = js.native
  
  @JSImport("leaflet", "routing.errorControl")
  @js.native
  def errorControl(routingControl: Control_, options: ErrorControlOptions): ErrorControl_ = js.native
  
  @JSImport("leaflet", "routing.formatter")
  @js.native
  def formatter(): Formatter_ = js.native
  @JSImport("leaflet", "routing.formatter")
  @js.native
  def formatter(options: FormatterOptions): Formatter_ = js.native
  
  @JSImport("leaflet", "routing.geocoderElement")
  @js.native
  def geocoderElement(waypoint: Waypoint_, i: Double, numberWaypoints: Double, options: GeocoderElementOptions): GeocoderElement_ = js.native
  
  @JSImport("leaflet", "routing.itinerary")
  @js.native
  def itinerary(): Itinerary_ = js.native
  @JSImport("leaflet", "routing.itinerary")
  @js.native
  def itinerary(options: ItineraryOptions): Itinerary_ = js.native
  
  @JSImport("leaflet", "routing.itineraryBuilder")
  @js.native
  def itineraryBuilder(): ItineraryBuilder_ = js.native
  @JSImport("leaflet", "routing.itineraryBuilder")
  @js.native
  def itineraryBuilder(options: ItineraryBuilderOptions): ItineraryBuilder_ = js.native
  
  @JSImport("leaflet", "routing.line")
  @js.native
  def line(route: IRoute): Line_ = js.native
  @JSImport("leaflet", "routing.line")
  @js.native
  def line(route: IRoute, options: LineOptions): Line_ = js.native
  
  @JSImport("leaflet", "routing.localization")
  @js.native
  def localization(): Localization_ = js.native
  @JSImport("leaflet", "routing.localization")
  @js.native
  def localization(options: LocalizationOptions): Localization_ = js.native
  
  @JSImport("leaflet", "routing.mapbox")
  @js.native
  def mapbox(accessToken: String, options: OSRMOptions): MapBox_ = js.native
  
  @JSImport("leaflet", "routing.osrmv1")
  @js.native
  def osrmv1(): OSRMv1_ = js.native
  @JSImport("leaflet", "routing.osrmv1")
  @js.native
  def osrmv1(options: OSRMOptions): OSRMv1_ = js.native
  
  @JSImport("leaflet", "routing.plan")
  @js.native
  def plan(waypoints: js.Array[LatLng_ | Waypoint_]): Plan_ = js.native
  @JSImport("leaflet", "routing.plan")
  @js.native
  def plan(waypoints: js.Array[LatLng_ | Waypoint_], options: PlanOptions): Plan_ = js.native
  
  @JSImport("leaflet", "routing.waypoint")
  @js.native
  def waypoint(latLng: LatLng_): Waypoint_ = js.native
  @JSImport("leaflet", "routing.waypoint")
  @js.native
  def waypoint(latLng: LatLng_, name: js.UndefOr[scala.Nothing], options: WaypointOptions): Waypoint_ = js.native
  @JSImport("leaflet", "routing.waypoint")
  @js.native
  def waypoint(latLng: LatLng_, name: String): Waypoint_ = js.native
  @JSImport("leaflet", "routing.waypoint")
  @js.native
  def waypoint(latLng: LatLng_, name: String, options: WaypointOptions): Waypoint_ = js.native
}
