package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-10`
import typings.stellarBase.stellarBaseNumbers.`-11`
import typings.stellarBase.stellarBaseNumbers.`-12`
import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`-2`
import typings.stellarBase.stellarBaseNumbers.`-3`
import typings.stellarBase.stellarBaseNumbers.`-4`
import typings.stellarBase.stellarBaseNumbers.`-5`
import typings.stellarBase.stellarBaseNumbers.`-6`
import typings.stellarBase.stellarBaseNumbers.`-7`
import typings.stellarBase.stellarBaseNumbers.`-8`
import typings.stellarBase.stellarBaseNumbers.`-9`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.manageBuyOfferBuyNoIssuer
import typings.stellarBase.stellarBaseStrings.manageBuyOfferBuyNoTrust
import typings.stellarBase.stellarBaseStrings.manageBuyOfferBuyNotAuthorized
import typings.stellarBase.stellarBaseStrings.manageBuyOfferCrossSelf
import typings.stellarBase.stellarBaseStrings.manageBuyOfferLineFull
import typings.stellarBase.stellarBaseStrings.manageBuyOfferLowReserve
import typings.stellarBase.stellarBaseStrings.manageBuyOfferMalformed
import typings.stellarBase.stellarBaseStrings.manageBuyOfferNotFound
import typings.stellarBase.stellarBaseStrings.manageBuyOfferSellNoIssuer
import typings.stellarBase.stellarBaseStrings.manageBuyOfferSellNoTrust
import typings.stellarBase.stellarBaseStrings.manageBuyOfferSellNotAuthorized
import typings.stellarBase.stellarBaseStrings.manageBuyOfferSuccess
import typings.stellarBase.stellarBaseStrings.manageBuyOfferUnderfunded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManageBuyOfferResultCode extends StObject {
  
  val name: manageBuyOfferSuccess | manageBuyOfferMalformed | manageBuyOfferSellNoTrust | manageBuyOfferBuyNoTrust | manageBuyOfferSellNotAuthorized | manageBuyOfferBuyNotAuthorized | manageBuyOfferLineFull | manageBuyOfferUnderfunded | manageBuyOfferCrossSelf | manageBuyOfferSellNoIssuer | manageBuyOfferBuyNoIssuer | manageBuyOfferNotFound | manageBuyOfferLowReserve = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` = js.native
}
object ManageBuyOfferResultCode {
  
  @scala.inline
  def apply(
    name: manageBuyOfferSuccess | manageBuyOfferMalformed | manageBuyOfferSellNoTrust | manageBuyOfferBuyNoTrust | manageBuyOfferSellNotAuthorized | manageBuyOfferBuyNotAuthorized | manageBuyOfferLineFull | manageBuyOfferUnderfunded | manageBuyOfferCrossSelf | manageBuyOfferSellNoIssuer | manageBuyOfferBuyNoIssuer | manageBuyOfferNotFound | manageBuyOfferLowReserve,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`
  ): ManageBuyOfferResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageBuyOfferResultCode]
  }
  
  @scala.inline
  implicit class ManageBuyOfferResultCodeMutableBuilder[Self <: ManageBuyOfferResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: manageBuyOfferSuccess | manageBuyOfferMalformed | manageBuyOfferSellNoTrust | manageBuyOfferBuyNoTrust | manageBuyOfferSellNotAuthorized | manageBuyOfferBuyNotAuthorized | manageBuyOfferLineFull | manageBuyOfferUnderfunded | manageBuyOfferCrossSelf | manageBuyOfferSellNoIssuer | manageBuyOfferBuyNoIssuer | manageBuyOfferNotFound | manageBuyOfferLowReserve
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
