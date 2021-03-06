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
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictSendLineFull
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictSendMalformed
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictSendNoDestination
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictSendNoIssuer
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictSendNoTrust
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictSendNotAuthorized
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictSendOfferCrossSelf
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictSendSrcNoTrust
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictSendSrcNotAuthorized
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictSendSuccess
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictSendTooFewOffers
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictSendUnderDestmin
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictSendUnderfunded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathPaymentStrictSendResultCode extends StObject {
  
  val name: pathPaymentStrictSendSuccess | pathPaymentStrictSendMalformed | pathPaymentStrictSendUnderfunded | pathPaymentStrictSendSrcNoTrust | pathPaymentStrictSendSrcNotAuthorized | pathPaymentStrictSendNoDestination | pathPaymentStrictSendNoTrust | pathPaymentStrictSendNotAuthorized | pathPaymentStrictSendLineFull | pathPaymentStrictSendNoIssuer | pathPaymentStrictSendTooFewOffers | pathPaymentStrictSendOfferCrossSelf | pathPaymentStrictSendUnderDestmin = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` = js.native
}
object PathPaymentStrictSendResultCode {
  
  @scala.inline
  def apply(
    name: pathPaymentStrictSendSuccess | pathPaymentStrictSendMalformed | pathPaymentStrictSendUnderfunded | pathPaymentStrictSendSrcNoTrust | pathPaymentStrictSendSrcNotAuthorized | pathPaymentStrictSendNoDestination | pathPaymentStrictSendNoTrust | pathPaymentStrictSendNotAuthorized | pathPaymentStrictSendLineFull | pathPaymentStrictSendNoIssuer | pathPaymentStrictSendTooFewOffers | pathPaymentStrictSendOfferCrossSelf | pathPaymentStrictSendUnderDestmin,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`
  ): PathPaymentStrictSendResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictSendResultCode]
  }
  
  @scala.inline
  implicit class PathPaymentStrictSendResultCodeMutableBuilder[Self <: PathPaymentStrictSendResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: pathPaymentStrictSendSuccess | pathPaymentStrictSendMalformed | pathPaymentStrictSendUnderfunded | pathPaymentStrictSendSrcNoTrust | pathPaymentStrictSendSrcNotAuthorized | pathPaymentStrictSendNoDestination | pathPaymentStrictSendNoTrust | pathPaymentStrictSendNotAuthorized | pathPaymentStrictSendLineFull | pathPaymentStrictSendNoIssuer | pathPaymentStrictSendTooFewOffers | pathPaymentStrictSendOfferCrossSelf | pathPaymentStrictSendUnderDestmin
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
