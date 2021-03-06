package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MerchantIndividualRequest extends StObject {
  
  var address: MerchantAddressDetails = js.native
  
  var dateOfBirth: String = js.native
  
  var email: String = js.native
  
  var firstName: String = js.native
  
  var lastName: String = js.native
  
  var phone: js.UndefOr[String] = js.native
  
  var ssn: js.UndefOr[String] = js.native
  
  var ssnLast4: js.UndefOr[String] = js.native
}
object MerchantIndividualRequest {
  
  @scala.inline
  def apply(
    address: MerchantAddressDetails,
    dateOfBirth: String,
    email: String,
    firstName: String,
    lastName: String
  ): MerchantIndividualRequest = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], dateOfBirth = dateOfBirth.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantIndividualRequest]
  }
  
  @scala.inline
  implicit class MerchantIndividualRequestMutableBuilder[Self <: MerchantIndividualRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: MerchantAddressDetails): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateOfBirth(value: String): Self = StObject.set(x, "dateOfBirth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setSsn(value: String): Self = StObject.set(x, "ssn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsnLast4(value: String): Self = StObject.set(x, "ssnLast4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsnLast4Undefined: Self = StObject.set(x, "ssnLast4", js.undefined)
    
    @scala.inline
    def setSsnUndefined: Self = StObject.set(x, "ssn", js.undefined)
  }
}
