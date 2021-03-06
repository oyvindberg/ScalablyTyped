package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends StObject {
  
  var point: typings.googleMapReact.mod.Point = js.native
}
object Point {
  
  @scala.inline
  def apply(point: typings.googleMapReact.mod.Point): Point = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoint(value: typings.googleMapReact.mod.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
