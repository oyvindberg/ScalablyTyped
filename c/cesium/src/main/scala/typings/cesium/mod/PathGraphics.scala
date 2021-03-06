package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PathGraphics")
@js.native
class PathGraphics () extends StObject {
  def this(options: typings.cesium.anon.DistanceDisplayCondition) = this()
  
  def clone(result: PathGraphics): PathGraphics = js.native
  
  val definitionChanged: Event[js.Array[_]] = js.native
  
  var distanceDisplayCondition: Property = js.native
  
  var leadTime: Property | Double = js.native
  
  var material: MaterialProperty = js.native
  
  def merge(source: PathGraphics): PathGraphics = js.native
  
  var resolution: Property | Double = js.native
  
  var show: Property | Boolean = js.native
  
  var trailTime: Property | Double = js.native
  
  var width: Property | Double = js.native
}
