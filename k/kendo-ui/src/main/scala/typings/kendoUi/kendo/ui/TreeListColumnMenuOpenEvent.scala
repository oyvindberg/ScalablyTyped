package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListColumnMenuOpenEvent extends TreeListEvent {
  
  var container: js.UndefOr[JQuery] = js.native
  
  var field: js.UndefOr[String] = js.native
}
object TreeListColumnMenuOpenEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeList): TreeListColumnMenuOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumnMenuOpenEvent]
  }
  
  @scala.inline
  implicit class TreeListColumnMenuOpenEventMutableBuilder[Self <: TreeListColumnMenuOpenEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
