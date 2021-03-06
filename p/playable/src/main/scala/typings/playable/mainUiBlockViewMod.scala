package typings.playable

import typings.playable.mainUiBlockTypesMod.IMainUIBlockViewConfig
import typings.playable.mainUiBlockTypesMod.IMainUIBlockViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainUiBlockViewMod {
  
  @JSImport("playable/dist/src/modules/ui/main-ui-block/main-ui-block.view", JSImport.Default)
  @js.native
  class default protected () extends MainUIBlockView {
    def this(config: IMainUIBlockViewConfig) = this()
  }
  
  @js.native
  trait MainUIBlockView
    extends typings.playable.viewMod.default[IMainUIBlockViewStyles] {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
  }
}
