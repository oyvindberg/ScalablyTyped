package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pivotToolsMod {
  
  @JSImport("babylonjs/Misc/pivotTools", "PivotTools")
  @js.native
  class PivotTools () extends StObject
  /* static members */
  object PivotTools {
    
    @JSImport("babylonjs/Misc/pivotTools", "PivotTools")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Misc/pivotTools", "PivotTools._OldPivotPoint")
    @js.native
    def _OldPivotPoint: js.Any = js.native
    @scala.inline
    def _OldPivotPoint_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OldPivotPoint")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/pivotTools", "PivotTools._PivotCached")
    @js.native
    def _PivotCached: js.Any = js.native
    @scala.inline
    def _PivotCached_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotCached")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/pivotTools", "PivotTools._PivotPostMultiplyPivotMatrix")
    @js.native
    def _PivotPostMultiplyPivotMatrix: js.Any = js.native
    @scala.inline
    def _PivotPostMultiplyPivotMatrix_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotPostMultiplyPivotMatrix")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/pivotTools", "PivotTools._PivotTmpVector")
    @js.native
    def _PivotTmpVector: js.Any = js.native
    @scala.inline
    def _PivotTmpVector_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotTmpVector")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/pivotTools", "PivotTools._PivotTranslation")
    @js.native
    def _PivotTranslation: js.Any = js.native
    @scala.inline
    def _PivotTranslation_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotTranslation")(x.asInstanceOf[js.Any])
    
    /** @hidden */
    @JSImport("babylonjs/Misc/pivotTools", "PivotTools._RemoveAndStorePivotPoint")
    @js.native
    def _RemoveAndStorePivotPoint(mesh: AbstractMesh): Unit = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Misc/pivotTools", "PivotTools._RestorePivotPoint")
    @js.native
    def _RestorePivotPoint(mesh: AbstractMesh): Unit = js.native
  }
}
