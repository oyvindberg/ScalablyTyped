package typings.ionic

import typings.ionic.configBaseMod.BaseConfigCommand
import typings.ionic.configBaseMod.ConfigContext
import typings.ionic.definitionsMod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMod {
  
  @JSImport("ionic/commands/config/get", "ConfigGetCommand")
  @js.native
  class ConfigGetCommand protected () extends BaseConfigCommand {
    def this(namespace: INamespace) = this()
    
    def printConfig(ctx: ConfigContext, v: js.Any): Unit = js.native
    
    def sanitizeEntry(key: String, value: js.Any): js.Any = js.native
  }
}
