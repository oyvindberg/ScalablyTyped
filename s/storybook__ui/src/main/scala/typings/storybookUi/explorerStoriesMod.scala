package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.Layout
import typings.storybookUi.explorerMod.ExplorerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object explorerStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Explorer.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Explorer.stories", "default.component")
    @js.native
    def component: FunctionComponent[ExplorerProps] = js.native
    @scala.inline
    def component_=(x: FunctionComponent[ExplorerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Explorer.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* storyFn */ js.Any, Element]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[js.Function1[/* storyFn */ js.Any, Element]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Explorer.stories", "default.parameters")
    @js.native
    def parameters: Layout = js.native
    @scala.inline
    def parameters_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Explorer.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Explorer.stories", "Simple")
  @js.native
  def Simple(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Explorer.stories", "WithRefs")
  @js.native
  def WithRefs(): Element = js.native
}
