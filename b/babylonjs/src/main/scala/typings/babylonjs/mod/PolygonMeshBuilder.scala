package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PolygonMeshBuilder")
@js.native
class PolygonMeshBuilder protected ()
  extends typings.babylonjs.legacyMod.PolygonMeshBuilder {
  def this(name: String, contours: js.Any) = this()
  def this(name: String, contours: js.Array[typings.babylonjs.mathVectorMod.Vector2]) = this()
  /**
    * Creates a PolygonMeshBuilder
    * @param name name of the builder
    * @param contours Path of the polygon
    * @param scene scene to add to when creating the mesh
    * @param earcutInjection can be used to inject your own earcut reference
    */
  def this(name: String, contours: typings.babylonjs.mathPathMod.Path2) = this()
  def this(name: String, contours: js.Any, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(
    name: String,
    contours: js.Array[typings.babylonjs.mathVectorMod.Vector2],
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    contours: typings.babylonjs.mathPathMod.Path2,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(name: String, contours: js.Any, scene: js.UndefOr[scala.Nothing], earcutInjection: js.Any) = this()
  def this(name: String, contours: js.Any, scene: typings.babylonjs.sceneMod.Scene, earcutInjection: js.Any) = this()
  def this(
    name: String,
    contours: js.Array[typings.babylonjs.mathVectorMod.Vector2],
    scene: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ) = this()
  def this(
    name: String,
    contours: js.Array[typings.babylonjs.mathVectorMod.Vector2],
    scene: typings.babylonjs.sceneMod.Scene,
    earcutInjection: js.Any
  ) = this()
  def this(
    name: String,
    contours: typings.babylonjs.mathPathMod.Path2,
    scene: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ) = this()
  def this(
    name: String,
    contours: typings.babylonjs.mathPathMod.Path2,
    scene: typings.babylonjs.sceneMod.Scene,
    earcutInjection: js.Any
  ) = this()
}
