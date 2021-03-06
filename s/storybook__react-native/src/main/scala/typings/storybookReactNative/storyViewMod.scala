package typings.storybookReactNative

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyViewMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/StoryView", JSImport.Default)
  @js.native
  class default () extends StoryView
  
  @js.native
  trait Props extends StObject {
    
    var onDevice: js.UndefOr[Boolean] = js.native
    
    var stories: js.Any = js.native
    
    var url: String = js.native
  }
  object Props {
    
    @scala.inline
    def apply(stories: js.Any, url: String): Props = {
      val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnDevice(value: Boolean): Self = StObject.set(x, "onDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeviceUndefined: Self = StObject.set(x, "onDevice", js.undefined)
      
      @scala.inline
      def setStories(value: js.Any): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoryView
    extends Component[Props, js.Object, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MStoryView(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MStoryView(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MStoryView(): Unit = js.native
    
    def forceReRender(): Unit = js.native
    
    def renderHelp(): Element = js.native
    
    def renderOnDeviceUIHelp(): Element = js.native
  }
}
