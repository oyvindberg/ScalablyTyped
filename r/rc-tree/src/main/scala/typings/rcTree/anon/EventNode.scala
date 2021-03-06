package typings.rcTree.anon

import typings.rcTree.interfaceMod.EventDataNode
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventNode extends StObject {
  
  var event: MouseEvent[Element, NativeMouseEvent] = js.native
  
  var node: EventDataNode = js.native
}
object EventNode {
  
  @scala.inline
  def apply(event: MouseEvent[Element, NativeMouseEvent], node: EventDataNode): EventNode = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventNode]
  }
  
  @scala.inline
  implicit class EventNodeMutableBuilder[Self <: EventNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: MouseEvent[Element, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: EventDataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
