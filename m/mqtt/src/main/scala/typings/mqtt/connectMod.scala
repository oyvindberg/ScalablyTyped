package typings.mqtt

import typings.mqtt.clientMod.IStream
import typings.mqtt.clientOptionsMod.IClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectMod {
  
  @JSImport("mqtt/types/lib/connect", "MqttClient")
  @js.native
  class MqttClient protected ()
    extends typings.mqtt.clientMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typings.mqtt.clientMod.MqttClient, IStream],
      options: IClientOptions
    ) = this()
  }
  
  /**
    * connect - connect to an MQTT broker.
    *
    * @param {String} [brokerUrl] - url of the broker, optional
    * @param {Object} opts - see MqttClient#constructor
    */
  @JSImport("mqtt/types/lib/connect", "connect")
  @js.native
  def connect(): typings.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt/types/lib/connect", "connect")
  @js.native
  def connect(brokerUrl: js.UndefOr[scala.Nothing], opts: IClientOptions): typings.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt/types/lib/connect", "connect")
  @js.native
  def connect(brokerUrl: String): typings.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt/types/lib/connect", "connect")
  @js.native
  def connect(brokerUrl: String, opts: IClientOptions): typings.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt/types/lib/connect", "connect")
  @js.native
  def connect(brokerUrl: js.Any): typings.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt/types/lib/connect", "connect")
  @js.native
  def connect(brokerUrl: js.Any, opts: IClientOptions): typings.mqtt.clientMod.MqttClient = js.native
}
