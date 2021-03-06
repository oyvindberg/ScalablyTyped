package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides arguments for the PlayReady-ND RegistrationCompleted event. */
@js.native
trait INDRegistrationCompletedEventArgs extends StObject {
  
  /** Gets custom data from a registration response. */
  var responseCustomData: INDCustomData = js.native
  
  /** Gets or sets whether to accept or reject a transmitter's certificate. */
  var transmitterCertificateAccepted: Boolean = js.native
  
  /** Gets transmitter properties from the transmitter's certificate to verify the transmitter. */
  var transmitterProperties: INDTransmitterProperties = js.native
}
object INDRegistrationCompletedEventArgs {
  
  @scala.inline
  def apply(
    responseCustomData: INDCustomData,
    transmitterCertificateAccepted: Boolean,
    transmitterProperties: INDTransmitterProperties
  ): INDRegistrationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(responseCustomData = responseCustomData.asInstanceOf[js.Any], transmitterCertificateAccepted = transmitterCertificateAccepted.asInstanceOf[js.Any], transmitterProperties = transmitterProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDRegistrationCompletedEventArgs]
  }
  
  @scala.inline
  implicit class INDRegistrationCompletedEventArgsMutableBuilder[Self <: INDRegistrationCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponseCustomData(value: INDCustomData): Self = StObject.set(x, "responseCustomData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmitterCertificateAccepted(value: Boolean): Self = StObject.set(x, "transmitterCertificateAccepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmitterProperties(value: INDTransmitterProperties): Self = StObject.set(x, "transmitterProperties", value.asInstanceOf[js.Any])
  }
}
