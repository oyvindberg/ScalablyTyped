package typings.babylonjs

import typings.babylonjs.cameraInputsManagerMod.CameraInputsManager
import typings.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
import typings.babylonjs.freeCameraMod.FreeCamera
import typings.babylonjs.freeCameraMouseInputMod.FreeCameraMouseInput
import typings.babylonjs.freeCameraMouseWheelInputMod.FreeCameraMouseWheelInput
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object freeCameraInputsManagerMod {
  
  /**
    * Interface representing a free camera inputs manager
    */
  @JSImport("babylonjs/Cameras/freeCameraInputsManager", "FreeCameraInputsManager")
  @js.native
  class FreeCameraInputsManager protected () extends CameraInputsManager[FreeCamera] {
    /**
      * Instantiates a new FreeCameraInputsManager.
      * @param camera Defines the camera the inputs belong to
      */
    def this(camera: FreeCamera) = this()
    
    /**
      * @hidden
      */
    var _deviceOrientationInput: Nullable[FreeCameraDeviceOrientationInput] = js.native
    
    /**
      * @hidden
      */
    var _mouseInput: Nullable[FreeCameraMouseInput] = js.native
    
    /**
      * @hidden
      */
    var _mouseWheelInput: Nullable[FreeCameraMouseWheelInput] = js.native
    
    /**
      * Add orientation input support to the input manager.
      * @returns the current input manager
      */
    def addDeviceOrientation(): typings.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
    
    /**
      * Adds gamepad input support to the FreeCameraInputsManager.
      * @returns the FreeCameraInputsManager
      */
    def addGamepad(): typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
    
    /**
      * Add keyboard input support to the input manager.
      * @returns the current input manager
      */
    def addKeyboard(): FreeCameraInputsManager = js.native
    
    /**
      * Add mouse input support to the input manager.
      * @param touchEnabled if the FreeCameraMouseInput should support touch (default: true)
      * @returns the current input manager
      */
    def addMouse(): FreeCameraInputsManager = js.native
    def addMouse(touchEnabled: Boolean): FreeCameraInputsManager = js.native
    
    /**
      * Add mouse wheel input support to the input manager.
      * @returns the current input manager
      */
    def addMouseWheel(): FreeCameraInputsManager = js.native
    
    /**
      * Add touch input support to the input manager.
      * @returns the current input manager
      */
    def addTouch(): FreeCameraInputsManager = js.native
    
    /**
      * Add virtual joystick input support to the input manager.
      * @returns the current input manager
      */
    def addVirtualJoystick(): typings.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
    
    /**
      * Removes the mouse input support from the manager
      * @returns the current input manager
      */
    def removeMouse(): FreeCameraInputsManager = js.native
    
    /**
      * Removes the mouse wheel input support from the manager
      * @returns the current input manager
      */
    def removeMouseWheel(): FreeCameraInputsManager = js.native
  }
}
