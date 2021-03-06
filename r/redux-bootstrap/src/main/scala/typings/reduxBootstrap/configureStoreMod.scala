package typings.reduxBootstrap

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import typings.redux.mod.StoreEnhancer
import typings.reduxBootstrap.interfacesMod.interfaces.DevToolsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configureStoreMod {
  
  @JSImport("redux-bootstrap/dts/store/configure_store", JSImport.Default)
  @js.native
  def default(
    middlewares: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]],
    enhancers: js.Array[StoreEnhancer[_, js.Object]],
    rootReducer: Reducer[_, AnyAction],
    initialState: js.Any,
    devToolsOptions: DevToolsOptions
  ): Store[_, AnyAction] = js.native
}
