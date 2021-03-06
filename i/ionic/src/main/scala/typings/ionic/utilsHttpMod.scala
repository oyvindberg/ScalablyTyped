package typings.ionic

import typings.ionic.anon.Progress
import typings.ionic.anon.`0`
import typings.ionic.definitionsMod.CreateRequestOptions
import typings.ionic.definitionsMod.HttpMethod
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsHttpMod {
  
  @JSImport("ionic/lib/utils/http", "PROXY_ENVIRONMENT_VARIABLES")
  @js.native
  val PROXY_ENVIRONMENT_VARIABLES: js.Array[String] = js.native
  
  @JSImport("ionic/lib/utils/http", "createRequest")
  @js.native
  def createRequest(method: HttpMethod, url: String, hasProxySsl: CreateRequestOptions): js.Promise[`0`] = js.native
  
  @JSImport("ionic/lib/utils/http", "download")
  @js.native
  def download(req: SuperAgentRequest, ws: WritableStream, hasProgress: Progress): js.Promise[Unit] = js.native
  
  type SuperAgentRequest = typings.superagent.mod.SuperAgentRequest
}
