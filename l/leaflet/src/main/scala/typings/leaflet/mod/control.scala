package typings.leaflet.mod

import typings.leaflet.mod.Control_.Attribution
import typings.leaflet.mod.Control_.AttributionOptions
import typings.leaflet.mod.Control_.Layers
import typings.leaflet.mod.Control_.LayersObject
import typings.leaflet.mod.Control_.LayersOptions
import typings.leaflet.mod.Control_.Scale
import typings.leaflet.mod.Control_.ScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object control {
  
  @JSImport("leaflet", "control.attribution")
  @js.native
  def attribution(): Attribution = js.native
  @JSImport("leaflet", "control.attribution")
  @js.native
  def attribution(options: AttributionOptions): Attribution = js.native
  
  @JSImport("leaflet", "control.layers")
  @js.native
  def layers(): Layers = js.native
  @JSImport("leaflet", "control.layers")
  @js.native
  def layers(baseLayers: js.UndefOr[scala.Nothing], overlays: js.UndefOr[scala.Nothing], options: LayersOptions): Layers = js.native
  @JSImport("leaflet", "control.layers")
  @js.native
  def layers(baseLayers: js.UndefOr[scala.Nothing], overlays: LayersObject): Layers = js.native
  @JSImport("leaflet", "control.layers")
  @js.native
  def layers(baseLayers: js.UndefOr[scala.Nothing], overlays: LayersObject, options: LayersOptions): Layers = js.native
  @JSImport("leaflet", "control.layers")
  @js.native
  def layers(baseLayers: LayersObject): Layers = js.native
  @JSImport("leaflet", "control.layers")
  @js.native
  def layers(baseLayers: LayersObject, overlays: js.UndefOr[scala.Nothing], options: LayersOptions): Layers = js.native
  @JSImport("leaflet", "control.layers")
  @js.native
  def layers(baseLayers: LayersObject, overlays: LayersObject): Layers = js.native
  @JSImport("leaflet", "control.layers")
  @js.native
  def layers(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions): Layers = js.native
  
  @JSImport("leaflet", "control.scale")
  @js.native
  def scale(): Scale = js.native
  @JSImport("leaflet", "control.scale")
  @js.native
  def scale(options: ScaleOptions): Scale = js.native
  
  @JSImport("leaflet", "control.zoom")
  @js.native
  def zoom(): typings.leaflet.mod.Control_.Zoom = js.native
  @JSImport("leaflet", "control.zoom")
  @js.native
  def zoom(options: typings.leaflet.mod.Control_.ZoomOptions): typings.leaflet.mod.Control_.Zoom = js.native
}
