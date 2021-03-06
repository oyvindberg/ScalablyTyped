package typings.syncRequest

import typings.httpBasic.httpVerbMod.HttpVerb
import typings.node.urlMod.URL_
import typings.syncRequest.optionsMod.Options
import typings.thenRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("sync-request/lib/browser", JSImport.Default)
  @js.native
  def default(method: HttpVerb, url: String): Response = js.native
  @JSImport("sync-request/lib/browser", JSImport.Default)
  @js.native
  def default(method: HttpVerb, url: String, options: Options): Response = js.native
  @JSImport("sync-request/lib/browser", JSImport.Default)
  @js.native
  def default(method: HttpVerb, url: URL_): Response = js.native
  @JSImport("sync-request/lib/browser", JSImport.Default)
  @js.native
  def default(method: HttpVerb, url: URL_, options: Options): Response = js.native
  
  @JSImport("sync-request/lib/browser", "FormData")
  @js.native
  val FormData: js.Any = js.native
}
