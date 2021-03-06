package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepositOpts extends StObject {
  
  /**
    * Deposit amount
    */
  var amount: String = js.native
  
  /**
    * If set to false, this deposit will not be immediately completed. Use the commit call to complete it. Default value: true
    */
  var commit: js.UndefOr[Boolean] = js.native
  
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String = js.native
  
  /**
    * The ID of the payment method that should be used for the buy. (todo get payment methods)
    */
  var payment_method: js.UndefOr[String] = js.native
}
object DepositOpts {
  
  @scala.inline
  def apply(amount: String, currency: String): DepositOpts = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepositOpts]
  }
  
  @scala.inline
  implicit class DepositOptsMutableBuilder[Self <: DepositOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
  }
}
