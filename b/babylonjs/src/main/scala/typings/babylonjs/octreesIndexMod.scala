package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.octreeBlockMod.IOctreeContainer
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subMeshMod.SubMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object octreesIndexMod {
  
  @JSImport("babylonjs/Culling/Octrees/index", "Octree")
  @js.native
  class Octree[T] protected ()
    extends typings.babylonjs.octreeMod.Octree[T] {
    /**
      * Creates a octree
      * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
      * @param creationFunc function to be used to instatiate the octree
      * @param maxBlockCapacity defines the maximum number of meshes you want on your octree's leaves (default: 64)
      * @param maxDepth defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.)
      */
    def this(creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit]) = this()
    def this(
      creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit],
      maxBlockCapacity: Double
    ) = this()
    def this(
      creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit],
      maxBlockCapacity: js.UndefOr[scala.Nothing],
      /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
    maxDepth: Double
    ) = this()
    def this(
      creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit],
      maxBlockCapacity: Double,
      /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
    maxDepth: Double
    ) = this()
  }
  /* static members */
  object Octree {
    
    /**
      * Adds a mesh into the octree block if it intersects the block
      */
    @JSImport("babylonjs/Culling/Octrees/index", "Octree.CreationFuncForMeshes")
    @js.native
    def CreationFuncForMeshes(entry: AbstractMesh, block: typings.babylonjs.octreeBlockMod.OctreeBlock[AbstractMesh]): Unit = js.native
    
    /**
      * Adds a submesh into the octree block if it intersects the block
      */
    @JSImport("babylonjs/Culling/Octrees/index", "Octree.CreationFuncForSubMeshes")
    @js.native
    def CreationFuncForSubMeshes(entry: SubMesh, block: typings.babylonjs.octreeBlockMod.OctreeBlock[SubMesh]): Unit = js.native
  }
  
  @JSImport("babylonjs/Culling/Octrees/index", "OctreeBlock")
  @js.native
  class OctreeBlock[T] protected ()
    extends typings.babylonjs.octreeBlockMod.OctreeBlock[T] {
    /**
      * Creates a new block
      * @param minPoint defines the minimum vector (in world space) of the block's bounding box
      * @param maxPoint defines the maximum vector (in world space) of the block's bounding box
      * @param capacity defines the maximum capacity of this block (if capacity is reached the block will be split into sub blocks)
      * @param depth defines the current depth of this block in the octree
      * @param maxDepth defines the maximal depth allowed (beyond this value, the capacity is ignored)
      * @param creationFunc defines a callback to call when an element is added to the block
      */
    def this(
      minPoint: Vector3,
      maxPoint: Vector3,
      capacity: Double,
      depth: Double,
      maxDepth: Double,
      creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit]
    ) = this()
  }
  /* static members */
  object OctreeBlock {
    
    /**
      * @hidden
      */
    @JSImport("babylonjs/Culling/Octrees/index", "OctreeBlock._CreateBlocks")
    @js.native
    def _CreateBlocks[T](
      worldMin: Vector3,
      worldMax: Vector3,
      entries: js.Array[T],
      maxBlockCapacity: Double,
      currentDepth: Double,
      maxDepth: Double,
      target: IOctreeContainer[T],
      creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit]
    ): Unit = js.native
  }
  
  @JSImport("babylonjs/Culling/Octrees/index", "OctreeSceneComponent")
  @js.native
  class OctreeSceneComponent protected ()
    extends typings.babylonjs.octreeSceneComponentMod.OctreeSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    @js.native
    trait AbstractMesh extends StObject {
      
      /**
        * @hidden
        * Backing Field
        */
      var _submeshesOctree: typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
      
      /**
        * This function will create an octree to help to select the right submeshes for rendering, picking and collision computations.
        * Please note that you must have a decent number of submeshes to get performance improvements when using an octree
        * @param maxCapacity defines the maximum size of each block (64 by default)
        * @param maxDepth defines the maximum depth to use (no more than 2 levels by default)
        * @returns the new octree
        * @see https://www.babylonjs-playground.com/#NA4OQ#12
        * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
        */
      def createOrUpdateSubmeshesOctree(): typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
      def createOrUpdateSubmeshesOctree(maxCapacity: js.UndefOr[scala.Nothing], maxDepth: Double): typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
      def createOrUpdateSubmeshesOctree(maxCapacity: Double): typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
      def createOrUpdateSubmeshesOctree(maxCapacity: Double, maxDepth: Double): typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /**
        * @hidden
        * Backing Filed
        */
      var _selectionOctree: typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
      
      /**
        * Creates or updates the octree used to boost selection (picking)
        * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
        * @param maxCapacity defines the maximum capacity per leaf
        * @param maxDepth defines the maximum depth of the octree
        * @returns an octree of AbstractMesh
        */
      def createOrUpdateSelectionOctree(): typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
      def createOrUpdateSelectionOctree(maxCapacity: js.UndefOr[scala.Nothing], maxDepth: Double): typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
      def createOrUpdateSelectionOctree(maxCapacity: Double): typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
      def createOrUpdateSelectionOctree(maxCapacity: Double, maxDepth: Double): typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
      
      /**
        * Gets the octree used to boost mesh selection (picking)
        * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
        */
      var selectionOctree: typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
    }
  }
}
