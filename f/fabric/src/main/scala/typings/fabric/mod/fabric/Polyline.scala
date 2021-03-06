package typings.fabric.mod.fabric

import typings.fabric.anon.X
import typings.fabric.fabricImplMod.IPolylineOptions
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Polyline")
@js.native
class Polyline protected ()
  extends typings.fabric.fabricImplMod.Polyline {
  /**
    * Constructor
    * @param points Array of points (where each point is an object with x and y)
    * @param [options] Options object
    * @param [skipOffset] Whether points offsetting should be skipped
    */
  def this(points: js.Array[X]) = this()
  def this(points: js.Array[X], options: IPolylineOptions) = this()
}
/* static members */
object Polyline {
  
  @JSImport("fabric", "fabric.Polyline")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
    */
  @JSImport("fabric", "fabric.Polyline.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  @scala.inline
  def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Returns Polyline  instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  @JSImport("fabric", "fabric.Polyline.fromElement")
  @js.native
  def fromElement(element: SVGElement): typings.fabric.fabricImplMod.Polyline = js.native
  @JSImport("fabric", "fabric.Polyline.fromElement")
  @js.native
  def fromElement(element: SVGElement, options: IPolylineOptions): typings.fabric.fabricImplMod.Polyline = js.native
  
  /**
    * Returns fabric.Polyline instance from an object representation
    * @param object Object to create an instance from
    */
  @JSImport("fabric", "fabric.Polyline.fromObject")
  @js.native
  def fromObject(`object`: js.Any): typings.fabric.fabricImplMod.Polyline = js.native
}
