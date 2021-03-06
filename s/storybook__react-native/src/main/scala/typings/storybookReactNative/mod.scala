package typings.storybookReactNative

import typings.node.NodeModule
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookClientApi.typesMod.GetStorybookKind
import typings.storybookClientApi.typesMod.PublishedStoreItem
import typings.storybookReactNative.anon.Instantiable
import typings.storybookReactNative.anon.PartialParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/react-native/dist", "addDecorator")
  @js.native
  val addDecorator: js.Function1[/* decorator */ DecoratorFunction[js.Any], Unit] = js.native
  
  @JSImport("@storybook/react-native/dist", "addParameters")
  @js.native
  val addParameters: js.Function1[/* parameters */ Parameters, Unit] = js.native
  
  @JSImport("@storybook/react-native/dist", "clearDecorators")
  @js.native
  val clearDecorators: js.Function0[Unit] = js.native
  
  @JSImport("@storybook/react-native/dist", "configure")
  @js.native
  def configure(loadStories: js.Function0[Unit], module: js.Any): Unit = js.native
  
  @JSImport("@storybook/react-native/dist", "getStorybook")
  @js.native
  val getStorybook: js.Function0[js.Array[GetStorybookKind]] = js.native
  
  @JSImport("@storybook/react-native/dist", "getStorybookUI")
  @js.native
  def getStorybookUI(): Instantiable = js.native
  @JSImport("@storybook/react-native/dist", "getStorybookUI")
  @js.native
  def getStorybookUI(params: PartialParams): Instantiable = js.native
  
  @JSImport("@storybook/react-native/dist", "raw")
  @js.native
  val raw: js.Function0[js.Array[PublishedStoreItem]] = js.native
  
  @JSImport("@storybook/react-native/dist", "setAddon")
  @js.native
  val setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  
  @JSImport("@storybook/react-native/dist", "storiesOf")
  @js.native
  def storiesOf(kind: String, module: NodeModule): StoryApi[_] = js.native
}
