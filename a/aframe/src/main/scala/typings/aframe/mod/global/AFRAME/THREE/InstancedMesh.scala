package typings.aframe.mod.global.AFRAME.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.InstancedMesh")
@js.native
class InstancedMesh[TGeometry /* <: typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry */, TMaterial /* <: typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material] */] protected ()
  extends typings.three.mod.InstancedMesh[TGeometry, TMaterial] {
  def this(
    geometry: /* import warning: RewrittenClass.unapply cls was tparam TGeometry */ js.Any,
    material: /* import warning: RewrittenClass.unapply cls was tparam TMaterial */ js.Any,
    count: Double
  ) = this()
}
