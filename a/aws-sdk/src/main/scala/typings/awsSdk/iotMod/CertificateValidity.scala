package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateValidity extends StObject {
  
  /**
    * The certificate is not valid after this date.
    */
  var notAfter: js.UndefOr[DateType] = js.native
  
  /**
    * The certificate is not valid before this date.
    */
  var notBefore: js.UndefOr[DateType] = js.native
}
object CertificateValidity {
  
  @scala.inline
  def apply(): CertificateValidity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateValidity]
  }
  
  @scala.inline
  implicit class CertificateValidityMutableBuilder[Self <: CertificateValidity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotAfter(value: DateType): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: DateType): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
  }
}
