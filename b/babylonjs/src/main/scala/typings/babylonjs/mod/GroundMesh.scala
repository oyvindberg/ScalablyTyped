package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "GroundMesh")
@js.native
class GroundMesh protected ()
  extends typings.babylonjs.legacyMod.GroundMesh {
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object GroundMesh {
  
  /**
    * Parses a serialized ground mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the ground mesh in
    * @returns the created ground mesh
    */
  @JSImport("babylonjs", "GroundMesh.Parse")
  @js.native
  def Parse(parsedMesh: js.Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.groundMeshMod.GroundMesh = js.native
}
