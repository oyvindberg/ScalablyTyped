package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SpotLight")
@js.native
class SpotLight protected ()
  extends typings.babylonjs.BABYLON.SpotLight {
  /**
    * Creates a SpotLight object in the scene. A spot light is a simply light oriented cone.
    * It can cast shadows.
    * Documentation : https://doc.babylonjs.com/babylon101/lights
    * @param name The light friendly name
    * @param position The position of the spot light in the scene
    * @param direction The direction of the light in the scene
    * @param angle The cone angle of the light in Radians
    * @param exponent The light decay speed with the distance from the emission spot
    * @param scene The scene the lights belongs to
    */
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    direction: typings.babylonjs.BABYLON.Vector3,
    angle: Double,
    exponent: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
}
/* static members */
object SpotLight {
  
  @JSGlobal("BABYLON.SpotLight")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.SpotLight._IsProceduralTexture")
  @js.native
  def _IsProceduralTexture: js.Any = js.native
  @scala.inline
  def _IsProceduralTexture_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsProceduralTexture")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.SpotLight._IsTexture")
  @js.native
  def _IsTexture: js.Any = js.native
  @scala.inline
  def _IsTexture_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsTexture")(x.asInstanceOf[js.Any])
}
