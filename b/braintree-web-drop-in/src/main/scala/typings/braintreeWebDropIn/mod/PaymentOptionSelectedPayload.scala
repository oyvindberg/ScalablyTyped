package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.braintreeWebDropInStrings.card
import typings.braintreeWebDropIn.braintreeWebDropInStrings.paypal
import typings.braintreeWebDropIn.braintreeWebDropInStrings.paypalCredit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentOptionSelectedPayload extends StObject {
  
  var paymentOption: card | paypal | paypalCredit = js.native
}
object PaymentOptionSelectedPayload {
  
  @scala.inline
  def apply(paymentOption: card | paypal | paypalCredit): PaymentOptionSelectedPayload = {
    val __obj = js.Dynamic.literal(paymentOption = paymentOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentOptionSelectedPayload]
  }
  
  @scala.inline
  implicit class PaymentOptionSelectedPayloadMutableBuilder[Self <: PaymentOptionSelectedPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaymentOption(value: card | paypal | paypalCredit): Self = StObject.set(x, "paymentOption", value.asInstanceOf[js.Any])
  }
}
