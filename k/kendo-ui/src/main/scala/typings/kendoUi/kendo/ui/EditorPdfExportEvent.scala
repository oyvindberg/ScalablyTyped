package typings.kendoUi.kendo.ui

import typings.kendoUi.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorPdfExportEvent extends EditorEvent {
  
  var promise: js.UndefOr[JQueryPromise[_]] = js.native
}
object EditorPdfExportEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Editor_): EditorPdfExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorPdfExportEvent]
  }
  
  @scala.inline
  implicit class EditorPdfExportEventMutableBuilder[Self <: EditorPdfExportEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPromise(value: JQueryPromise[_]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
  }
}
