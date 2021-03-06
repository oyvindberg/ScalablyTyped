package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.reactstrap.reactstrapStrings.next
import typings.reactstrap.reactstrapStrings.prev
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselControlMod {
  
  @JSImport("reactstrap/lib/CarouselControl", JSImport.Default)
  @js.native
  class default ()
    extends Component[CarouselControlProps, js.Object, js.Any]
  
  type CarouselControl = Component[CarouselControlProps, js.Object, js.Any]
  
  @js.native
  trait CarouselControlProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var direction: prev | next = js.native
    
    var directionText: js.UndefOr[String] = js.native
    
    def onClickHandler(): Unit = js.native
  }
  object CarouselControlProps {
    
    @scala.inline
    def apply(direction: prev | next, onClickHandler: () => Unit): CarouselControlProps = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], onClickHandler = js.Any.fromFunction0(onClickHandler))
      __obj.asInstanceOf[CarouselControlProps]
    }
    
    @scala.inline
    implicit class CarouselControlPropsMutableBuilder[Self <: CarouselControlProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setDirection(value: prev | next): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionText(value: String): Self = StObject.set(x, "directionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionTextUndefined: Self = StObject.set(x, "directionText", js.undefined)
      
      @scala.inline
      def setOnClickHandler(value: () => Unit): Self = StObject.set(x, "onClickHandler", js.Any.fromFunction0(value))
    }
  }
}
