package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarBase.mod.AssetType
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.manageOffer
import typings.stellarSdk.horizonApiMod.Horizon.PriceR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.ManageOfferOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined offer_id, amount, buying_asset_type, buying_asset_code, buying_asset_issuer, price, price_r, selling_asset_type, selling_asset_code, selling_asset_issuer */ @js.native
trait ManageOfferOperationRecord
  extends BaseOperationRecord[
      manageOffer, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.manageOffer
    ]
     with OperationRecord {
  
  var amount: String = js.native
  
  var buying_asset_code: js.UndefOr[String] = js.native
  
  var buying_asset_issuer: js.UndefOr[String] = js.native
  
  var buying_asset_type: AssetType = js.native
  
  var offer_id: Double | String = js.native
  
  var price: String = js.native
  
  var price_r: PriceR = js.native
  
  var selling_asset_code: js.UndefOr[String] = js.native
  
  var selling_asset_issuer: js.UndefOr[String] = js.native
  
  var selling_asset_type: AssetType = js.native
}
