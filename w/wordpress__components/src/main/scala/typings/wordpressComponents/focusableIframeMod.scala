package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.react.mod.RefObject
import typings.std.HTMLIFrameElement
import typings.wordpressComponents.focusableIframeMod.FocusableIframe.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusableIframeMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/focusable-iframe", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object FocusableIframe {
    
    @js.native
    trait Props extends HTMLProps[HTMLIFrameElement] {
      
      var iframeRef: js.UndefOr[RefObject[HTMLIFrameElement]] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIframeRef(value: RefObject[HTMLIFrameElement]): Self = StObject.set(x, "iframeRef", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIframeRefUndefined: Self = StObject.set(x, "iframeRef", js.undefined)
      }
    }
  }
}
