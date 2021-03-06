package typings.uirouterAngularjs.mod.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "core.PathNode")
@js.native
class PathNode protected ()
  extends typings.uirouterCore.mod.PathNode {
  /** Creates a copy of a PathNode */
  def this(node: typings.uirouterCore.pathNodeMod.PathNode) = this()
  /** Creates a new (empty) PathNode for a State */
  def this(state: typings.uirouterCore.stateObjectMod.StateObject) = this()
}
/* static members */
object PathNode {
  
  /**
    * Returns a clone of the PathNode
    * @deprecated use instance method `node.clone()`
    */
  @JSImport("@uirouter/angularjs", "core.PathNode.clone")
  @js.native
  def clone(node: typings.uirouterCore.pathNodeMod.PathNode): typings.uirouterCore.pathNodeMod.PathNode = js.native
}
