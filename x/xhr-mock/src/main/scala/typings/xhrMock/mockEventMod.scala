package typings.xhrMock

import typings.std.Element
import typings.std.Event
import typings.std.EventInit
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockEventMod {
  
  @JSImport("xhr-mock/lib/MockEvent", JSImport.Default)
  @js.native
  class default protected () extends MockEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: EventInit) = this()
  }
  
  @js.native
  trait MockEvent extends Event {
    
    @JSName("currentTarget")
    val currentTarget_MockEvent: EventTarget = js.native
    
    def deepPath(): js.Array[EventTarget] = js.native
    
    val scoped: Boolean = js.native
    
    @JSName("srcElement")
    val srcElement_MockEvent: Element | Null = js.native
    
    @JSName("target")
    val target_MockEvent: EventTarget = js.native
  }
}
