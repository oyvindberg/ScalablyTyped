package typings.server

import typings.server.commonMod.Context
import typings.server.commonMod.Middlewares
import typings.server.optionsMod.Options
import typings.server.replyMod.Reply
import typings.server.routerMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("server", JSImport.Namespace)
  @js.native
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param middlewares because its type Middlewares is not an array type */ middlewares: Middlewares
  ): js.Promise[Context] = js.native
  @JSImport("server", JSImport.Namespace)
  @js.native
  def apply(
    options: Options,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param middlewares because its type Middlewares is not an array type */ middlewares: Middlewares
  ): js.Promise[Context] = js.native
  
  @JSImport("server", "reply")
  @js.native
  val reply: Reply = js.native
  
  @JSImport("server", "router")
  @js.native
  val router: Router = js.native
}
