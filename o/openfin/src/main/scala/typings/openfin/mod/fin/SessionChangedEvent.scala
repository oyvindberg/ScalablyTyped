package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`remote-connect`
import typings.openfin.openfinStrings.`remote-disconnect`
import typings.openfin.openfinStrings.`session-changed`
import typings.openfin.openfinStrings.lock
import typings.openfin.openfinStrings.system
import typings.openfin.openfinStrings.unknown
import typings.openfin.openfinStrings.unlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionChangedEvent extends StObject {
  
  /**
    * the action that triggered this event:
    */
  var reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown = js.native
  
  var topic: system = js.native
  
  var `type`: `session-changed` = js.native
}
object SessionChangedEvent {
  
  @scala.inline
  def apply(
    reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown,
    topic: system,
    `type`: `session-changed`
  ): SessionChangedEvent = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionChangedEvent]
  }
  
  @scala.inline
  implicit class SessionChangedEventMutableBuilder[Self <: SessionChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: lock | unlock | `remote-connect` | `remote-disconnect` | unknown): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: system): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `session-changed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
