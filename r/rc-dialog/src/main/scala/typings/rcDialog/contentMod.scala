package typings.rcDialog

import org.scalablytyped.runtime.Shortcut
import typings.rcDialog.dialogMod.IDialogChildProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefAttributes
import typings.std.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentMod extends Shortcut {
  
  @JSImport("rc-dialog/es/Dialog/Content", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ContentProps with RefAttributes[ContentRef]] = js.native
  
  @js.native
  trait ContentProps extends IDialogChildProps {
    
    var ariaId: String = js.native
    
    var motionName: String = js.native
    
    var onClick: MouseEventHandler[Element] = js.native
    
    def onVisibleChanged(visible: Boolean): Unit = js.native
  }
  object ContentProps {
    
    @scala.inline
    def apply(
      ariaId: String,
      getOpenCount: () => Double,
      motionName: String,
      onClick: MouseEvent[Element, NativeMouseEvent] => Unit,
      onVisibleChanged: Boolean => Unit
    ): ContentProps = {
      val __obj = js.Dynamic.literal(ariaId = ariaId.asInstanceOf[js.Any], getOpenCount = js.Any.fromFunction0(getOpenCount), motionName = motionName.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onVisibleChanged = js.Any.fromFunction1(onVisibleChanged))
      __obj.asInstanceOf[ContentProps]
    }
    
    @scala.inline
    implicit class ContentPropsMutableBuilder[Self <: ContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaId(value: String): Self = StObject.set(x, "ariaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionName(value: String): Self = StObject.set(x, "motionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChanged(value: Boolean => Unit): Self = StObject.set(x, "onVisibleChanged", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ContentRef extends StObject {
    
    def changeActive(next: Boolean): Unit = js.native
    
    def focus(): Unit = js.native
    
    def getDOM(): HTMLDivElement = js.native
  }
  object ContentRef {
    
    @scala.inline
    def apply(changeActive: Boolean => Unit, focus: () => Unit, getDOM: () => HTMLDivElement): ContentRef = {
      val __obj = js.Dynamic.literal(changeActive = js.Any.fromFunction1(changeActive), focus = js.Any.fromFunction0(focus), getDOM = js.Any.fromFunction0(getDOM))
      __obj.asInstanceOf[ContentRef]
    }
    
    @scala.inline
    implicit class ContentRefMutableBuilder[Self <: ContentRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeActive(value: Boolean => Unit): Self = StObject.set(x, "changeActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDOM(value: () => HTMLDivElement): Self = StObject.set(x, "getDOM", js.Any.fromFunction0(value))
    }
  }
  
  type _To = ForwardRefExoticComponent[ContentProps with RefAttributes[ContentRef]]
  
  /* This means you don't have to write `default`, but can instead just say `contentMod.foo` */
  override def _to: ForwardRefExoticComponent[ContentProps with RefAttributes[ContentRef]] = default
}
