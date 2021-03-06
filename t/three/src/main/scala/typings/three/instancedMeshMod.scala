package typings.three

import typings.three.bufferAttributeMod.BufferAttribute
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.colorMod.Color
import typings.three.geometryMod.Geometry
import typings.three.materialMod.Material
import typings.three.matrix4Mod.Matrix4
import typings.three.meshMod.Mesh
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instancedMeshMod {
  
  @JSImport("three/src/objects/InstancedMesh", "InstancedMesh")
  @js.native
  class InstancedMesh[TGeometry /* <: Geometry | BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] protected () extends Mesh[TGeometry, TMaterial] {
    def this(geometry: TGeometry, material: TMaterial, count: Double) = this()
    
    var count: Double = js.native
    
    def getMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
    
    var instanceMatrix: BufferAttribute = js.native
    
    val isInstancedMesh: `true` = js.native
    
    def setColorAt(index: Double, color: Color): Unit = js.native
    
    def setMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
  }
}
