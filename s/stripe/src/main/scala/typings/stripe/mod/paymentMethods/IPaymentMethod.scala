package typings.stripe.mod.paymentMethods

import typings.stripe.anon.Checks
import typings.stripe.mod.IMetadata
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.card_present
import typings.stripe.stripeStrings.payment_method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.stripe.mod.paymentMethods.ICardPaymentMethod
  - typings.stripe.mod.paymentMethods.ICardPresentPaymentMethod
*/
trait IPaymentMethod extends StObject
object IPaymentMethod {
  
  @scala.inline
  def ICardPaymentMethod(
    card: Checks,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card
  ): typings.stripe.mod.paymentMethods.ICardPaymentMethod = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.ICardPaymentMethod]
  }
  
  @scala.inline
  def ICardPresentPaymentMethod(
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card_present
  ): typings.stripe.mod.paymentMethods.ICardPresentPaymentMethod = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.ICardPresentPaymentMethod]
  }
}
