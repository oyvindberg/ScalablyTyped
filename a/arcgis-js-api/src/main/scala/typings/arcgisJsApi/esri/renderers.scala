package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A convenience module for importing [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/guide/typescript-setup/index.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers.html)
  */
object renderers {
  
  type ClassBreaksRenderer = typings.arcgisJsApi.esri.ClassBreaksRenderer
  
  type DotDensityRenderer = typings.arcgisJsApi.esri.DotDensityRenderer
  
  type HeatmapRenderer = typings.arcgisJsApi.esri.HeatmapRenderer
  
  /* Rewritten from type alias, can be one of: 
    - typings.arcgisJsApi.esri.HeatmapRenderer
    - typings.arcgisJsApi.esri.RendererWithVisualVariables
  */
  trait Renderer extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.arcgisJsApi.esri.SimpleRenderer
    - typings.arcgisJsApi.esri.ClassBreaksRenderer
    - typings.arcgisJsApi.esri.UniqueValueRenderer
    - typings.arcgisJsApi.esri.DotDensityRenderer
  */
  trait RendererWithVisualVariables extends StObject
  
  type SimpleRenderer = typings.arcgisJsApi.esri.SimpleRenderer
  
  type UniqueValueRenderer = typings.arcgisJsApi.esri.UniqueValueRenderer
}
