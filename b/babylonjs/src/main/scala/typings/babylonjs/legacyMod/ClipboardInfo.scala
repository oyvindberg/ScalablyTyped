package typings.babylonjs.legacyMod

import typings.std.ClipboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ClipboardInfo")
@js.native
class ClipboardInfo protected ()
  extends typings.babylonjs.indexMod.ClipboardInfo {
  /**
    *Creates an instance of ClipboardInfo.
    * @param type Defines the type of event (BABYLON.ClipboardEventTypes)
    * @param event Defines the related dom event
    */
  def this(
    /**
    * Defines the type of event (BABYLON.ClipboardEventTypes)
    */
  `type`: Double,
    /**
    * Defines the related dom event
    */
  event: ClipboardEvent
  ) = this()
}
/* static members */
object ClipboardInfo {
  
  /**
    *  Get the clipboard event's type from the keycode.
    * @param keyCode Defines the keyCode for the current keyboard event.
    * @return {number}
    */
  @JSImport("babylonjs/Legacy/legacy", "ClipboardInfo.GetTypeFromCharacter")
  @js.native
  def GetTypeFromCharacter(keyCode: Double): Double = js.native
}
