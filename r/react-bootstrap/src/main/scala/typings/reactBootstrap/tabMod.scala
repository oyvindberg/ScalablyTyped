package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.TransitionCallbacks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod {
  
  @JSImport("react-bootstrap/lib/Tab", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[TabProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/Tab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Tab", "Container")
  @js.native
  class Container ()
    extends typings.reactBootstrap.tabContainerMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Tab", "Container")
  @js.native
  def Container: Instantiable0[typings.reactBootstrap.tabContainerMod.^] = js.native
  @scala.inline
  def Container_=(x: Instantiable0[typings.reactBootstrap.tabContainerMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Tab", "Content")
  @js.native
  class Content ()
    extends typings.reactBootstrap.tabContentMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Tab", "Content")
  @js.native
  def Content: Instantiable0[typings.reactBootstrap.tabContentMod.^] = js.native
  @scala.inline
  def Content_=(x: Instantiable0[typings.reactBootstrap.tabContentMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Tab", "Pane")
  @js.native
  class Pane ()
    extends typings.reactBootstrap.tabPaneMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Tab", "Pane")
  @js.native
  def Pane: Instantiable0[typings.reactBootstrap.tabPaneMod.^] = js.native
  @scala.inline
  def Pane_=(x: Instantiable0[typings.reactBootstrap.tabPaneMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pane")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Tab
    extends Component[TabProps, js.Object, js.Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Tab.Tab> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Tab.Tab>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Tab.Tab>[P]} */ @js.native
  trait TabProps extends TransitionCallbacks {
    
    var animation: js.UndefOr[Boolean] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var bsClass: js.UndefOr[String] = js.native
    
    var eventKey: js.UndefOr[js.Any] = js.native
    
    var tabClassName: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
    
    // TODO: Add more specific type
    var unmountOnExit: js.UndefOr[Boolean] = js.native
  }
  object TabProps {
    
    @scala.inline
    def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    @scala.inline
    implicit class TabPropsMutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setEventKey(value: js.Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      @scala.inline
      def setTabClassName(value: String): Self = StObject.set(x, "tabClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabClassNameUndefined: Self = StObject.set(x, "tabClassName", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUnmountOnExit(value: Boolean): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
}
