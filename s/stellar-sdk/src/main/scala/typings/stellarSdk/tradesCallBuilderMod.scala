package typings.stellarSdk

import typings.stellarBase.mod.Asset
import typings.stellarSdk.callBuilderMod.CallBuilder
import typings.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typings.stellarSdk.serverApiMod.ServerApi.TradeRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tradesCallBuilderMod {
  
  @JSImport("stellar-sdk/lib/trades_call_builder", "TradesCallBuilder")
  @js.native
  class TradesCallBuilder protected () extends CallBuilder[CollectionPage[TradeRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URI */ js.Any) = this()
    
    def forAccount(accountId: String): this.type = js.native
    
    def forAssetPair(base: Asset, counter: Asset): this.type = js.native
    
    def forOffer(offerId: String): this.type = js.native
  }
}
