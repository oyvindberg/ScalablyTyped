package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "ScreenSpaceReflectionPostProcess")
@js.native
class ScreenSpaceReflectionPostProcess protected ()
  extends typings.babylonjs.screenSpaceReflectionPostProcessMod.ScreenSpaceReflectionPostProcess {
  /**
    * Creates a new instance of ScreenSpaceReflectionPostProcess.
    * @param name The name of the effect.
    * @param scene The scene containing the objects to calculate reflections.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: true)
    * @param forceGeometryBuffer If this post process should use geometry buffer instead of prepass (default: false)
    */
  def this(
    name: String,
    scene: Scene,
    options: Double | PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean],
    forceGeometryBuffer: js.UndefOr[Boolean]
  ) = this()
}
/* static members */
object ScreenSpaceReflectionPostProcess {
  
  /** @hidden */
  @JSImport("babylonjs/PostProcesses/index", "ScreenSpaceReflectionPostProcess._Parse")
  @js.native
  def _Parse(parsedPostProcess: js.Any, targetCamera: Camera, scene: Scene, rootUrl: String): typings.babylonjs.screenSpaceReflectionPostProcessMod.ScreenSpaceReflectionPostProcess = js.native
}
