package typings.swaggerHapi

import typings.std.Error
import typings.swaggerNodeRunner.mod.Config
import typings.swaggerNodeRunner.mod.HapiMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-hapi", "create")
  @js.native
  def create(
    config: Config,
    cb: js.Function2[/* err */ js.UndefOr[Error], /* middleware */ HapiMiddleware, Unit]
  ): Unit = js.native
}
