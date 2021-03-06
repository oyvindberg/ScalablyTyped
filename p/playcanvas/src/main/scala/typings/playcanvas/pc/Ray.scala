package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new infinite ray starting at a given origin and pointing in a given direction.
  * @example
  * // Create a new ray starting at the position of this entity and pointing down
  * // the entity's negative Z axis
  * var ray = new pc.Ray(this.entity.getPosition(), this.entity.forward);
  * @property origin - The starting point of the ray.
  * @property direction - The direction of the ray.
  * @param [origin] - The starting point of the ray. The constructor takes a reference of this parameter.
  * Defaults to the origin (0, 0, 0).
  * @param [direction] - The direction of the ray. The constructor takes a reference of this parameter.
  * Defaults to a direction down the world negative Z axis (0, 0, -1).
  */
@js.native
trait Ray extends StObject {
  
  /**
    * The direction of the ray.
    */
  var direction: Vec3 = js.native
  
  /**
    * The starting point of the ray.
    */
  var origin: Vec3 = js.native
  
  /**
    * Sets origin and direction to the supplied vector values.
    * @param origin - The starting point of the ray.
    * @param direction - The direction of the ray.
    * @returns Self for chaining.
    */
  def set(origin: Vec3, direction: Vec3): Ray = js.native
}
object Ray {
  
  @scala.inline
  def apply(direction: Vec3, origin: Vec3, set: (Vec3, Vec3) => Ray): Ray = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Ray]
  }
  
  @scala.inline
  implicit class RayMutableBuilder[Self <: Ray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: Vec3): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: Vec3): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: (Vec3, Vec3) => Ray): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
