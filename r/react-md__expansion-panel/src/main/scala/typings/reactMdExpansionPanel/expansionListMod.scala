package typings.reactMdExpansionPanel

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expansionListMod {
  
  @JSImport("@react-md/expansion-panel/types/ExpansionList", "ExpansionList")
  @js.native
  val ExpansionList: ForwardRefExoticComponent[ExpansionListProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait ExpansionListProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * This should be 2 or more expansion panel components.
      */
    @JSName("children")
    var children_ExpansionListProps: ReactNode = js.native
    
    /**
      * The keydown event handler that allows for focusing the next/previous panel
      * as well as the first/last with keyboard shortcuts. This is provided by the
      * `usePanels` hook automatically.
      */
    @JSName("onKeyDown")
    var onKeyDown_ExpansionListProps: KeyboardEventHandler[HTMLDivElement] = js.native
  }
  object ExpansionListProps {
    
    @scala.inline
    def apply(onKeyDown: KeyboardEvent[HTMLDivElement] => Unit): ExpansionListProps = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
      __obj.asInstanceOf[ExpansionListProps]
    }
    
    @scala.inline
    implicit class ExpansionListPropsMutableBuilder[Self <: ExpansionListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    }
  }
}
