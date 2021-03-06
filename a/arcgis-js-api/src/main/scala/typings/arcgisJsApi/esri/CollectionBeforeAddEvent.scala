package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionBeforeAddEvent extends StObject {
  
  var cancellable: Boolean = js.native
  
  var defaultPrevented: Boolean = js.native
  
  var item: js.Any = js.native
  
  var preventDefault: js.Function = js.native
}
object CollectionBeforeAddEvent {
  
  @scala.inline
  def apply(cancellable: Boolean, defaultPrevented: Boolean, item: js.Any, preventDefault: js.Function): CollectionBeforeAddEvent = {
    val __obj = js.Dynamic.literal(cancellable = cancellable.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionBeforeAddEvent]
  }
  
  @scala.inline
  implicit class CollectionBeforeAddEventMutableBuilder[Self <: CollectionBeforeAddEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancellable(value: Boolean): Self = StObject.set(x, "cancellable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
  }
}
