package typings.three

import typings.three.anon.Width
import typings.three.geometryMod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object planeGeometryMod {
  
  @JSImport("three/src/geometries/PlaneGeometry", "PlaneGeometry")
  @js.native
  /**
  	 * @param [width=1] — Width of the sides on the X axis.
  	 * @param [height=1] — Height of the sides on the Y axis.
  	 * @param [widthSegments=1] — Number of segmented faces along the width of the sides.
  	 * @param [heightSegments=1] — Number of segmented faces along the height of the sides.
  	 */
  class PlaneGeometry () extends Geometry {
    def this(width: Double) = this()
    def this(width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: js.UndefOr[scala.Nothing], height: js.UndefOr[scala.Nothing], widthSegments: Double) = this()
    def this(width: js.UndefOr[scala.Nothing], height: Double, widthSegments: Double) = this()
    def this(width: Double, height: js.UndefOr[scala.Nothing], widthSegments: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double) = this()
    def this(
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      widthSegments: js.UndefOr[scala.Nothing],
      heightSegments: Double
    ) = this()
    def this(
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      widthSegments: Double,
      heightSegments: Double
    ) = this()
    def this(
      width: js.UndefOr[scala.Nothing],
      height: Double,
      widthSegments: js.UndefOr[scala.Nothing],
      heightSegments: Double
    ) = this()
    def this(width: js.UndefOr[scala.Nothing], height: Double, widthSegments: Double, heightSegments: Double) = this()
    def this(
      width: Double,
      height: js.UndefOr[scala.Nothing],
      widthSegments: js.UndefOr[scala.Nothing],
      heightSegments: Double
    ) = this()
    def this(width: Double, height: js.UndefOr[scala.Nothing], widthSegments: Double, heightSegments: Double) = this()
    def this(width: Double, height: Double, widthSegments: js.UndefOr[scala.Nothing], heightSegments: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double, heightSegments: Double) = this()
    
    var parameters: Width = js.native
  }
}
