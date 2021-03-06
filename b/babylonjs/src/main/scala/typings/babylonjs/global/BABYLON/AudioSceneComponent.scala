package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AudioSceneComponent")
@js.native
class AudioSceneComponent protected ()
  extends typings.babylonjs.BABYLON.AudioSceneComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
}
/* static members */
object AudioSceneComponent {
  
  @JSGlobal("BABYLON.AudioSceneComponent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.AudioSceneComponent._CameraDirectionLH")
  @js.native
  def _CameraDirectionLH: js.Any = js.native
  @scala.inline
  def _CameraDirectionLH_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CameraDirectionLH")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.AudioSceneComponent._CameraDirectionRH")
  @js.native
  def _CameraDirectionRH: js.Any = js.native
  @scala.inline
  def _CameraDirectionRH_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CameraDirectionRH")(x.asInstanceOf[js.Any])
}
