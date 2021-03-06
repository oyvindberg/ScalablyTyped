package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import typings.cadesplugin.cadespluginNumbers.`3`
import typings.cadesplugin.cadespluginNumbers.`4`
import typings.cadesplugin.cadespluginNumbers.`5`
import typings.cadesplugin.cadespluginNumbers.`6`
import typings.cadesplugin.cadespluginNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPICOM_CERT_INFO_TYPE extends CertIntoTypePlugin {
  
  val CAPICOM_CERT_INFO_ISSUER_DNS_NAME: `7` = js.native
  
  val CAPICOM_CERT_INFO_ISSUER_EMAIL_NAME: `3` = js.native
  
  val CAPICOM_CERT_INFO_ISSUER_UPN: `5` = js.native
  
  val CAPICOM_CERT_INFO_SUBJECT_DNS_NAME: `6` = js.native
  
  val CAPICOM_CERT_INFO_SUBJECT_EMAIL_NAME: `2` = js.native
  
  val CAPICOM_CERT_INFO_SUBJECT_UPN: `4` = js.native
}
object CAPICOM_CERT_INFO_TYPE {
  
  @scala.inline
  def apply(
    CAPICOM_CERT_INFO_ISSUER_DNS_NAME: `7`,
    CAPICOM_CERT_INFO_ISSUER_EMAIL_NAME: `3`,
    CAPICOM_CERT_INFO_ISSUER_SIMPLE_NAME: `1`,
    CAPICOM_CERT_INFO_ISSUER_UPN: `5`,
    CAPICOM_CERT_INFO_SUBJECT_DNS_NAME: `6`,
    CAPICOM_CERT_INFO_SUBJECT_EMAIL_NAME: `2`,
    CAPICOM_CERT_INFO_SUBJECT_SIMPLE_NAME: `0`,
    CAPICOM_CERT_INFO_SUBJECT_UPN: `4`
  ): CAPICOM_CERT_INFO_TYPE = {
    val __obj = js.Dynamic.literal(CAPICOM_CERT_INFO_ISSUER_DNS_NAME = CAPICOM_CERT_INFO_ISSUER_DNS_NAME.asInstanceOf[js.Any], CAPICOM_CERT_INFO_ISSUER_EMAIL_NAME = CAPICOM_CERT_INFO_ISSUER_EMAIL_NAME.asInstanceOf[js.Any], CAPICOM_CERT_INFO_ISSUER_SIMPLE_NAME = CAPICOM_CERT_INFO_ISSUER_SIMPLE_NAME.asInstanceOf[js.Any], CAPICOM_CERT_INFO_ISSUER_UPN = CAPICOM_CERT_INFO_ISSUER_UPN.asInstanceOf[js.Any], CAPICOM_CERT_INFO_SUBJECT_DNS_NAME = CAPICOM_CERT_INFO_SUBJECT_DNS_NAME.asInstanceOf[js.Any], CAPICOM_CERT_INFO_SUBJECT_EMAIL_NAME = CAPICOM_CERT_INFO_SUBJECT_EMAIL_NAME.asInstanceOf[js.Any], CAPICOM_CERT_INFO_SUBJECT_SIMPLE_NAME = CAPICOM_CERT_INFO_SUBJECT_SIMPLE_NAME.asInstanceOf[js.Any], CAPICOM_CERT_INFO_SUBJECT_UPN = CAPICOM_CERT_INFO_SUBJECT_UPN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPICOM_CERT_INFO_TYPE]
  }
  
  @scala.inline
  implicit class CAPICOM_CERT_INFO_TYPEMutableBuilder[Self <: CAPICOM_CERT_INFO_TYPE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_CERT_INFO_ISSUER_DNS_NAME(value: `7`): Self = StObject.set(x, "CAPICOM_CERT_INFO_ISSUER_DNS_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERT_INFO_ISSUER_EMAIL_NAME(value: `3`): Self = StObject.set(x, "CAPICOM_CERT_INFO_ISSUER_EMAIL_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERT_INFO_ISSUER_UPN(value: `5`): Self = StObject.set(x, "CAPICOM_CERT_INFO_ISSUER_UPN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERT_INFO_SUBJECT_DNS_NAME(value: `6`): Self = StObject.set(x, "CAPICOM_CERT_INFO_SUBJECT_DNS_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERT_INFO_SUBJECT_EMAIL_NAME(value: `2`): Self = StObject.set(x, "CAPICOM_CERT_INFO_SUBJECT_EMAIL_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERT_INFO_SUBJECT_UPN(value: `4`): Self = StObject.set(x, "CAPICOM_CERT_INFO_SUBJECT_UPN", value.asInstanceOf[js.Any])
  }
}
