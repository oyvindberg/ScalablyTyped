package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for a proximity sensor to determine whether or not an object is detected. */
@JSGlobal("Windows.Devices.Sensors.ProximitySensor")
@js.native
abstract class ProximitySensor ()
  extends typings.winrtUwp.Windows.Devices.Sensors.ProximitySensor
object ProximitySensor {
  
  /**
    * Obtains the proximity sensor from its identifier.
    * @param sensorId The sensor identifier.
    * @return Returns the ProximitySensor object from its identifier.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.ProximitySensor.fromId")
  @js.native
  def fromId(sensorId: String): typings.winrtUwp.Windows.Devices.Sensors.ProximitySensor = js.native
  
  /**
    * Gets the device selector.
    * @return Returns the device selector. If no device selector is available, this method returns null.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.ProximitySensor.getDeviceSelector")
  @js.native
  def getDeviceSelector(): String = js.native
  
  /**
    * Gets readings from the trigger details in background task.
    * @param triggerDetails The trigger details received from the background task.
    * @return The collection of proximity data retrieved from the trigger details.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.ProximitySensor.getReadingsFromTriggerDetails")
  @js.native
  def getReadingsFromTriggerDetails(triggerDetails: typings.winrtUwp.Windows.Devices.Sensors.SensorDataThresholdTriggerDetails): IVectorView[typings.winrtUwp.Windows.Devices.Sensors.ProximitySensorReading] = js.native
}
