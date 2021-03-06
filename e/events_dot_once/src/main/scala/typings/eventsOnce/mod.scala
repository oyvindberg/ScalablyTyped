package typings.eventsOnce

import typings.node.eventsMod.DOMEventTarget
import typings.node.eventsMod.NodeEventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("events.once", JSImport.Namespace)
  @js.native
  def apply(emitter: DOMEventTarget, event: String): js.Promise[js.Array[_]] = js.native
  @JSImport("events.once", JSImport.Namespace)
  @js.native
  def apply(emitter: NodeEventTarget, event: String): js.Promise[js.Array[_]] = js.native
  @JSImport("events.once", JSImport.Namespace)
  @js.native
  def apply(emitter: NodeEventTarget, event: js.Symbol): js.Promise[js.Array[_]] = js.native
}
