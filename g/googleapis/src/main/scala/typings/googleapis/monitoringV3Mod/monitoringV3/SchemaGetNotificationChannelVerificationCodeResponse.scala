package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The GetNotificationChannelVerificationCode request.
  */
@js.native
trait SchemaGetNotificationChannelVerificationCodeResponse extends StObject {
  
  /**
    * The verification code, which may be used to verify other channels that
    * have an equivalent identity (i.e. other channels of the same type with
    * the same fingerprint such as other email channels with the same email
    * address or other sms channels with the same number).
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * The expiration time associated with the code that was returned. If an
    * expiration was provided in the request, this is the minimum of the
    * requested expiration in the request and the max permitted expiration.
    */
  var expireTime: js.UndefOr[String] = js.native
}
object SchemaGetNotificationChannelVerificationCodeResponse {
  
  @scala.inline
  def apply(): SchemaGetNotificationChannelVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetNotificationChannelVerificationCodeResponse]
  }
  
  @scala.inline
  implicit class SchemaGetNotificationChannelVerificationCodeResponseMutableBuilder[Self <: SchemaGetNotificationChannelVerificationCodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
  }
}
