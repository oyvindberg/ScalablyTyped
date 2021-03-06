package typings.reactRelay

import typings.reactRelay.anon.FnCall
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.requestSubscriptionMod.GraphQLSubscriptionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSubscriptionMod {
  
  @JSImport("react-relay/lib/relay-experimental/useSubscription", "useSubscription")
  @js.native
  def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inference inside GraphQLSubscriptionConfig.s
  // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Unit = js.native
  @JSImport("react-relay/lib/relay-experimental/useSubscription", "useSubscription")
  @js.native
  def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inference inside GraphQLSubscriptionConfig.s
  // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload],
    requestSubscriptionFn: FnCall
  ): Unit = js.native
}
