package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackButtonClickEvent extends BackButtonEvent {
  
  var button: js.UndefOr[JQuery] = js.native
  
  var target: js.UndefOr[JQuery] = js.native
}
object BackButtonClickEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: BackButton): BackButtonClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackButtonClickEvent]
  }
  
  @scala.inline
  implicit class BackButtonClickEventMutableBuilder[Self <: BackButtonClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: JQuery): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
