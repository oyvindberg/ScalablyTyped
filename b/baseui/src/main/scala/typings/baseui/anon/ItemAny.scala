package typings.baseui.anon

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemAny extends StObject {
  
  var event: typings.std.Event | KeyboardEvent = js.native
  
  var item: js.Any = js.native
}
object ItemAny {
  
  @scala.inline
  def apply(event: typings.std.Event | KeyboardEvent, item: js.Any): ItemAny = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAny]
  }
  
  @scala.inline
  implicit class ItemAnyMutableBuilder[Self <: ItemAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: typings.std.Event | KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
