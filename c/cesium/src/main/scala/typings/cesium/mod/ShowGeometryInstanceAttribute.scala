package typings.cesium.mod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ShowGeometryInstanceAttribute")
@js.native
class ShowGeometryInstanceAttribute () extends StObject {
  def this(show: Boolean) = this()
  
  var componentDatatype: ComponentDatatype = js.native
  
  var componentsPerAttribute: Double = js.native
  
  var normalize: Boolean = js.native
  
  var value: Uint8Array = js.native
}
object ShowGeometryInstanceAttribute {
  
  /* static member */
  @JSImport("cesium", "ShowGeometryInstanceAttribute.toValue")
  @js.native
  def toValue(show: Boolean): Uint8Array = js.native
  @JSImport("cesium", "ShowGeometryInstanceAttribute.toValue")
  @js.native
  def toValue(show: Boolean, result: Uint8Array): Uint8Array = js.native
}
