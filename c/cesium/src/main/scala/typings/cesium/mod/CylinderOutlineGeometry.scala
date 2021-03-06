package typings.cesium.mod

import typings.cesium.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CylinderOutlineGeometry")
@js.native
class CylinderOutlineGeometry protected () extends Packable {
  def this(options: Length) = this()
}
object CylinderOutlineGeometry {
  
  /* static member */
  @JSImport("cesium", "CylinderOutlineGeometry.createGeometry")
  @js.native
  def createGeometry(cylinderGeometry: CylinderOutlineGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "CylinderOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): CylinderOutlineGeometry = js.native
  @JSImport("cesium", "CylinderOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: CylinderOutlineGeometry): CylinderOutlineGeometry = js.native
  @JSImport("cesium", "CylinderOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): CylinderOutlineGeometry = js.native
  @JSImport("cesium", "CylinderOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: CylinderOutlineGeometry): CylinderOutlineGeometry = js.native
}
