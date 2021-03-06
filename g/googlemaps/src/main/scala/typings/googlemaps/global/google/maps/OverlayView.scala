package typings.googlemaps.global.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.OverlayView")
@js.native
class OverlayView ()
  extends typings.googlemaps.google.maps.OverlayView
object OverlayView {
  
  /**
    * Stops click, tap, drag, and wheel events on the element from bubbling up to the map. Use this to prevent map dragging and zooming, as well as map "click" events.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#OverlayView.preventMapHitsAndGesturesFrom Maps JavaScript API}
    */
  /* static member */
  @JSGlobal("google.maps.OverlayView.preventMapHitsAndGesturesFrom")
  @js.native
  def preventMapHitsAndGesturesFrom(element: Element): Unit = js.native
  
  /**
    * Stops click or tap on the element from bubbling up to the map. Use this to prevent the map from triggering "click" events.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#OverlayView.preventMapHitsFrom Maps JavaScript API}
    */
  /* static member */
  @JSGlobal("google.maps.OverlayView.preventMapHitsFrom")
  @js.native
  def preventMapHitsFrom(element: Element): Unit = js.native
}
