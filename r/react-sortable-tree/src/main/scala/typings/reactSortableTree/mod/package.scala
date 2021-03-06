package typings.reactSortableTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def default: typings.react.mod.ComponentType[typings.reactSortableTree.mod.ReactSortableTreeProps] = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[typings.react.mod.ComponentType[typings.reactSortableTree.mod.ReactSortableTreeProps]]
  
  type GetTreeItemChildrenFn = js.Function1[/* data */ typings.reactSortableTree.mod.GetTreeItemChildren, scala.Unit]
  
  type NodeRenderer = typings.react.mod.ComponentType[typings.reactSortableTree.mod.NodeRendererProps]
  
  type NumberOrStringArray = js.Array[java.lang.String | scala.Double]
  
  type PlaceholderRenderer = typings.react.mod.ComponentType[typings.reactSortableTree.mod.PlaceholderRendererProps]
  
  @scala.inline
  def SortableTreeWithoutDndContext: typings.react.mod.ComponentType[typings.reactSortableTree.mod.ReactSortableTreeProps] = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SortableTreeWithoutDndContext").asInstanceOf[typings.react.mod.ComponentType[typings.reactSortableTree.mod.ReactSortableTreeProps]]
  
  type TreeRenderer = typings.react.mod.ComponentType[typings.reactSortableTree.mod.TreeRendererProps]
  
  @scala.inline
  def addNodeUnderParent(data: typings.reactSortableTree.anon.FullTreenewNodeTreeItempa): typings.reactSortableTree.mod.FullTree with typings.reactSortableTree.mod.TreeIndex = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addNodeUnderParent")(data.asInstanceOf[js.Any]).asInstanceOf[typings.reactSortableTree.mod.FullTree with typings.reactSortableTree.mod.TreeIndex]
  
  @scala.inline
  def changeNodeAtPath(data: typings.reactSortableTree.anon.FullTreeTreePathnewNodeFu): js.Array[typings.reactSortableTree.mod.TreeItem] = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("changeNodeAtPath")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.reactSortableTree.mod.TreeItem]]
  
  @scala.inline
  def defaultGetNodeKey(data: typings.reactSortableTree.mod.TreeIndex): scala.Double = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetNodeKey")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def defaultSearchMethod(data: typings.reactSortableTree.mod.SearchData): scala.Boolean = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultSearchMethod")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def find(data: typings.reactSortableTree.anon.FullTreegetNodeKeyGetNodeExpandAllMatchPaths): typings.reactSortableTree.anon.matchesArrayNodeDataFullT = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("find")(data.asInstanceOf[js.Any]).asInstanceOf[typings.reactSortableTree.anon.matchesArrayNodeDataFullT]
  
  @scala.inline
  def getDepth(node: typings.reactSortableTree.mod.TreeItem): scala.Double = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDepth")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  @scala.inline
  def getDepth(node: typings.reactSortableTree.mod.TreeItem, depth: scala.Double): scala.Double = (typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDepth")(node.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def getDescendantCount(data: typings.reactSortableTree.anon.TreeNodeignoreCollapsedbo): scala.Double = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDescendantCount")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def getFlatDataFromTree(data: typings.reactSortableTree.anon.FullTreegetNodeKeyGetNode): js.Array[typings.reactSortableTree.mod.FlatDataItem] = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getFlatDataFromTree")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.reactSortableTree.mod.FlatDataItem]]
  
  @scala.inline
  def getNodeAtPath(data: typings.reactSortableTree.anon.FullTreeTreePathgetNodeKe): (typings.reactSortableTree.mod.TreeNode with typings.reactSortableTree.mod.TreeIndex) | scala.Null = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAtPath")(data.asInstanceOf[js.Any]).asInstanceOf[(typings.reactSortableTree.mod.TreeNode with typings.reactSortableTree.mod.TreeIndex) | scala.Null]
  
  @scala.inline
  def getTreeFromFlatData[T, K /* <: /* keyof T */ java.lang.String */, P /* <: /* keyof T */ java.lang.String */, I /* <: java.lang.String | scala.Double */](data: typings.reactSortableTree.anon.FlatData[T, I, K, P]): js.Array[typings.reactSortableTree.mod.TreeItem] = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTreeFromFlatData")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.reactSortableTree.mod.TreeItem]]
  
  @scala.inline
  def getVisibleNodeCount(data: typings.reactSortableTree.mod.FullTree): scala.Double = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleNodeCount")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def getVisibleNodeInfoAtIndex(data: typings.reactSortableTree.anon.FullTreeindexnumbergetNod): typings.reactSortableTree.anon.TreeNodeTreePathlowerSibl | scala.Null = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleNodeInfoAtIndex")(data.asInstanceOf[js.Any]).asInstanceOf[typings.reactSortableTree.anon.TreeNodeTreePathlowerSibl | scala.Null]
  
  @scala.inline
  def insertNode(data: typings.reactSortableTree.anon.FullTreedepthnumbernewNod): typings.reactSortableTree.anon.FullTreeTreeIndexTreePath = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(data.asInstanceOf[js.Any]).asInstanceOf[typings.reactSortableTree.anon.FullTreeTreeIndexTreePath]
  
  @scala.inline
  def isDescendant(older: typings.reactSortableTree.mod.TreeItem, younger: typings.reactSortableTree.mod.TreeItem): scala.Boolean = (typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isDescendant")(older.asInstanceOf[js.Any], younger.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def map(data: typings.reactSortableTree.treeDataUtilsMod.WalkAndMapFunctionParameters): js.Array[typings.reactSortableTree.mod.TreeItem] = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.reactSortableTree.mod.TreeItem]]
  
  @scala.inline
  def removeNode(data: typings.reactSortableTree.anon.FullTreeTreePathgetNodeKe): (typings.reactSortableTree.mod.FullTree with typings.reactSortableTree.mod.TreeNode with typings.reactSortableTree.mod.TreeIndex) | scala.Null = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(data.asInstanceOf[js.Any]).asInstanceOf[(typings.reactSortableTree.mod.FullTree with typings.reactSortableTree.mod.TreeNode with typings.reactSortableTree.mod.TreeIndex) | scala.Null]
  
  @scala.inline
  def removeNodeAtPath(data: typings.reactSortableTree.anon.FullTreeTreePathgetNodeKe): js.Array[typings.reactSortableTree.mod.TreeItem] = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeNodeAtPath")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.reactSortableTree.mod.TreeItem]]
  
  @scala.inline
  def toggleExpandedForAll(data: typings.reactSortableTree.anon.FullTreeexpandedbooleanun): js.Array[typings.reactSortableTree.mod.TreeItem] = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toggleExpandedForAll")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.reactSortableTree.mod.TreeItem]]
  
  @scala.inline
  def walk(data: typings.reactSortableTree.treeDataUtilsMod.WalkAndMapFunctionParameters): scala.Unit = typings.reactSortableTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("walk")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
