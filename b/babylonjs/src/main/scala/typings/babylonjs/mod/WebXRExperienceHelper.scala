package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRExperienceHelper")
@js.native
/**
  * Creates a WebXRExperienceHelper
  * @param scene The scene the helper should be created in
  */
class WebXRExperienceHelper protected ()
  extends typings.babylonjs.legacyMod.WebXRExperienceHelper
/* static members */
object WebXRExperienceHelper {
  
  /**
    * Creates the experience helper
    * @param scene the scene to attach the experience helper to
    * @returns a promise for the experience helper
    */
  @JSImport("babylonjs", "WebXRExperienceHelper.CreateAsync")
  @js.native
  def CreateAsync(scene: typings.babylonjs.sceneMod.Scene): js.Promise[typings.babylonjs.webXRExperienceHelperMod.WebXRExperienceHelper] = js.native
}
