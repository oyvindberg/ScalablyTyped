package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnackbarProps extends StObject {
  
  var action: js.UndefOr[ReactNode] = js.native
  
  var autoHideDuration: js.UndefOr[Double] = js.native
  
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  
  var message: ReactNode = js.native
  
  var onActionClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  var onRequestClose: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.native
  
  var open: Boolean = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object SnackbarProps {
  
  @scala.inline
  def apply(open: Boolean): SnackbarProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
  
  @scala.inline
  implicit class SnackbarPropsMutableBuilder[Self <: SnackbarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ReactNode): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
    
    @scala.inline
    def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    @scala.inline
    def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOnActionClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onActionClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
    
    @scala.inline
    def setOnRequestClose(value: /* reason */ String => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
