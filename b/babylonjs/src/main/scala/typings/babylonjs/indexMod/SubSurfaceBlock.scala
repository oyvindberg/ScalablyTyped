package typings.babylonjs.indexMod

import typings.babylonjs.nodeMaterialBuildStateMod.NodeMaterialBuildState
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SubSurfaceBlock")
@js.native
class SubSurfaceBlock protected ()
  extends typings.babylonjs.materialsIndexMod.SubSurfaceBlock {
  /**
    * Create a new SubSurfaceBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
}
/* static members */
object SubSurfaceBlock {
  
  /**
    * Gets the main code of the block (fragment side)
    * @param state current state of the node material building
    * @param ssBlock instance of a SubSurfaceBlock or null if the code must be generated without an active sub surface module
    * @param reflectionBlock instance of a ReflectionBlock null if the code must be generated without an active reflection module
    * @param worldPosVarName name of the variable holding the world position
    * @returns the shader code
    */
  @JSImport("babylonjs/index", "SubSurfaceBlock.GetCode")
  @js.native
  def GetCode(
    state: NodeMaterialBuildState,
    ssBlock: Nullable[typings.babylonjs.subSurfaceBlockMod.SubSurfaceBlock],
    reflectionBlock: Nullable[typings.babylonjs.reflectionBlockMod.ReflectionBlock],
    worldPosVarName: String
  ): String = js.native
}
