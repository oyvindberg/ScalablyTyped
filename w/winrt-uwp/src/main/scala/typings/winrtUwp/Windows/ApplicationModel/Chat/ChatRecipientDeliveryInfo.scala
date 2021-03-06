package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent the delivery info about a chat recipient. */
@js.native
trait ChatRecipientDeliveryInfo extends StObject {
  
  /** Gets or sets the time the message was sent to the recipient. */
  var deliveryTime: Date = js.native
  
  /** Gets a Boolean value indicating whether the error for the message that was sent to the recipient is permanent. */
  var isErrorPermanent: Boolean = js.native
  
  /** Gets or sets the time the recipient read the message. */
  var readTime: Date = js.native
  
  /** Gets the status of the message. */
  var status: ChatMessageStatus = js.native
  
  /** Gets or sets the transport address of the recipient. */
  var transportAddress: String = js.native
  
  /** Get the transport error code. */
  var transportErrorCode: Double = js.native
  
  /** Gets the category for the TransportErrorCode . */
  var transportErrorCodeCategory: ChatTransportErrorCodeCategory = js.native
  
  /** Gets the interpreted error code for the transport. */
  var transportInterpretedErrorCode: ChatTransportInterpretedErrorCode = js.native
}
object ChatRecipientDeliveryInfo {
  
  @scala.inline
  def apply(
    deliveryTime: Date,
    isErrorPermanent: Boolean,
    readTime: Date,
    status: ChatMessageStatus,
    transportAddress: String,
    transportErrorCode: Double,
    transportErrorCodeCategory: ChatTransportErrorCodeCategory,
    transportInterpretedErrorCode: ChatTransportInterpretedErrorCode
  ): ChatRecipientDeliveryInfo = {
    val __obj = js.Dynamic.literal(deliveryTime = deliveryTime.asInstanceOf[js.Any], isErrorPermanent = isErrorPermanent.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transportAddress = transportAddress.asInstanceOf[js.Any], transportErrorCode = transportErrorCode.asInstanceOf[js.Any], transportErrorCodeCategory = transportErrorCodeCategory.asInstanceOf[js.Any], transportInterpretedErrorCode = transportInterpretedErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRecipientDeliveryInfo]
  }
  
  @scala.inline
  implicit class ChatRecipientDeliveryInfoMutableBuilder[Self <: ChatRecipientDeliveryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryTime(value: Date): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsErrorPermanent(value: Boolean): Self = StObject.set(x, "isErrorPermanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTime(value: Date): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ChatMessageStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportAddress(value: String): Self = StObject.set(x, "transportAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportErrorCode(value: Double): Self = StObject.set(x, "transportErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportErrorCodeCategory(value: ChatTransportErrorCodeCategory): Self = StObject.set(x, "transportErrorCodeCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportInterpretedErrorCode(value: ChatTransportInterpretedErrorCode): Self = StObject.set(x, "transportInterpretedErrorCode", value.asInstanceOf[js.Any])
  }
}
