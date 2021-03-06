package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "DeviceInputSystem")
@js.native
class DeviceInputSystem protected ()
  extends typings.babylonjs.legacyMod.DeviceInputSystem
/* static members */
object DeviceInputSystem {
  
  @JSImport("babylonjs", "DeviceInputSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DeviceInputSystem instance
    * @param engine Engine to pull input element from
    * @returns The new instance
    */
  @JSImport("babylonjs", "DeviceInputSystem.Create")
  @js.native
  def Create(engine: typings.babylonjs.engineMod.Engine): typings.babylonjs.deviceInputSystemMod.DeviceInputSystem = js.native
  
  @JSImport("babylonjs", "DeviceInputSystem._MAX_KEYCODES")
  @js.native
  def _MAX_KEYCODES: js.Any = js.native
  @scala.inline
  def _MAX_KEYCODES_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_KEYCODES")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "DeviceInputSystem._MAX_POINTER_INPUTS")
  @js.native
  def _MAX_POINTER_INPUTS: js.Any = js.native
  @scala.inline
  def _MAX_POINTER_INPUTS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_POINTER_INPUTS")(x.asInstanceOf[js.Any])
}
