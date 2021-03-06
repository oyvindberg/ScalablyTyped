package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.createMuiThemeMod.Theme
import typings.materialUiCore.materialUiCoreStrings.down
import typings.materialUiCore.materialUiCoreStrings.left
import typings.materialUiCore.materialUiCoreStrings.right
import typings.materialUiCore.materialUiCoreStrings.up
import typings.materialUiCore.transitionMod.TransitionProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideSlideMod extends Shortcut {
  
  @JSImport("@material-ui/core/Slide/Slide", JSImport.Default)
  @js.native
  val default: ComponentType[SlideProps] = js.native
  
  @js.native
  trait SlideProps extends TransitionProps {
    
    var direction: left | right | up | down = js.native
    
    var theme: js.UndefOr[Theme] = js.native
  }
  object SlideProps {
    
    @scala.inline
    def apply(direction: left | right | up | down): SlideProps = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideProps]
    }
    
    @scala.inline
    implicit class SlidePropsMutableBuilder[Self <: SlideProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: left | right | up | down): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type _To = ComponentType[SlideProps]
  
  /* This means you don't have to write `default`, but can instead just say `slideSlideMod.foo` */
  override def _to: ComponentType[SlideProps] = default
}
