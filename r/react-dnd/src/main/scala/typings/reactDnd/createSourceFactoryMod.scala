package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropMonitor
import typings.dndCore.interfacesMod.DragSource
import typings.dndCore.interfacesMod.Identifier
import typings.react.mod.RefObject
import typings.reactDnd.interfacesMod.DragSourceSpec
import typings.reactDnd.monitorsMod.DragSourceMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSourceFactoryMod {
  
  @JSImport("react-dnd/lib/decorators/createSourceFactory", "createSourceFactory")
  @js.native
  def createSourceFactory[Props, DragObject](spec: DragSourceSpec[Props, DragObject]): js.Function2[/* monitor */ DragSourceMonitor, /* ref */ RefObject[_], Source] = js.native
  
  @js.native
  trait Source extends DragSource {
    
    def receiveProps(props: js.Any): Unit = js.native
  }
  object Source {
    
    @scala.inline
    def apply(
      beginDrag: (DragDropMonitor, Identifier) => Unit,
      canDrag: (DragDropMonitor, Identifier) => Boolean,
      endDrag: (DragDropMonitor, Identifier) => Unit,
      isDragging: (DragDropMonitor, Identifier) => Boolean,
      receiveProps: js.Any => Unit
    ): Source = {
      val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction2(beginDrag), canDrag = js.Any.fromFunction2(canDrag), endDrag = js.Any.fromFunction2(endDrag), isDragging = js.Any.fromFunction2(isDragging), receiveProps = js.Any.fromFunction1(receiveProps))
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReceiveProps(value: js.Any => Unit): Self = StObject.set(x, "receiveProps", js.Any.fromFunction1(value))
    }
  }
}
