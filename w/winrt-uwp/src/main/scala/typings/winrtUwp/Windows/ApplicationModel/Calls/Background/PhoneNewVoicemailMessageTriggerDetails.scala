package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to provide the details about a new voice mail message on a phone line. */
@js.native
trait PhoneNewVoicemailMessageTriggerDetails extends StObject {
  
  /** Gets the ID of the phone line for which the new voice mail arrived. */
  var lineId: String = js.native
  
  /** Gets the optional voice mail changed message set by an operator when they send a voice mail changed SMS. */
  var operatorMessage: String = js.native
  
  /** Gets the new count of voice mail messages for the phone line. */
  var voicemailCount: Double = js.native
}
object PhoneNewVoicemailMessageTriggerDetails {
  
  @scala.inline
  def apply(lineId: String, operatorMessage: String, voicemailCount: Double): PhoneNewVoicemailMessageTriggerDetails = {
    val __obj = js.Dynamic.literal(lineId = lineId.asInstanceOf[js.Any], operatorMessage = operatorMessage.asInstanceOf[js.Any], voicemailCount = voicemailCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNewVoicemailMessageTriggerDetails]
  }
  
  @scala.inline
  implicit class PhoneNewVoicemailMessageTriggerDetailsMutableBuilder[Self <: PhoneNewVoicemailMessageTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineId(value: String): Self = StObject.set(x, "lineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorMessage(value: String): Self = StObject.set(x, "operatorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoicemailCount(value: Double): Self = StObject.set(x, "voicemailCount", value.asInstanceOf[js.Any])
  }
}
