package typings.jestCore

import typings.jestCore.anon.Stdin
import typings.jestCore.jestCoreBooleans.`true`
import typings.jestWatcher.mod.BaseWatchPlugin
import typings.jestWatcher.typesMod.UsageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/plugins/Quit", JSImport.Namespace)
@js.native
object quitMod extends js.Object {
  
  @js.native
  trait QuitPlugin extends BaseWatchPlugin {
    
    @JSName("getUsageInfo")
    def getUsageInfo_MQuitPlugin(): UsageData = js.native
    
    @JSName("isInternal")
    var isInternal_QuitPlugin: `true` = js.native
    
    @JSName("run")
    def run_MQuitPlugin(): js.Promise[Unit] = js.native
  }
  
  @js.native
  class default protected () extends QuitPlugin {
    def this(options: Stdin) = this()
  }
}
