package typings.expressAsyncWrap

import typings.connect.mod.NextFunction
import typings.expressServeStaticCore.mod.ErrorRequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressServeStaticCore.mod.Response
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-async-wrap", JSImport.Default)
  @js.native
  def default(
    handler: js.Function3[
      /* req */ Request[ParamsDictionary, _, _, ParsedQs], 
      /* res */ Response[_, Double], 
      /* next */ NextFunction, 
      js.Promise[Unit]
    ]
  ): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  @JSImport("express-async-wrap", JSImport.Default)
  @js.native
  def default(
    handler: js.Function4[
      /* err */ js.Any, 
      /* req */ Request[ParamsDictionary, _, _, ParsedQs], 
      /* res */ Response[_, Double], 
      /* next */ NextFunction, 
      js.Promise[Unit]
    ]
  ): ErrorRequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
}
