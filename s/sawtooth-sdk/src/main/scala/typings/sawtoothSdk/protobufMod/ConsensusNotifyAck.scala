package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck")
@js.native
/**
  * Constructs a new ConsensusNotifyAck.
  * @param [properties] Properties to set
  */
class ConsensusNotifyAck () extends IConsensusNotifyAck {
  def this(properties: IConsensusNotifyAck) = this()
  
  /**
    * Converts this ConsensusNotifyAck to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusNotifyAck {
  
  /**
    * Creates a new ConsensusNotifyAck instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyAck instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.create")
  @js.native
  def create(): ConsensusNotifyAck = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.create")
  @js.native
  def create(properties: IConsensusNotifyAck): ConsensusNotifyAck = js.native
  
  /**
    * Decodes a ConsensusNotifyAck message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyAck
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.decode")
  @js.native
  def decode(reader: Reader): ConsensusNotifyAck = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusNotifyAck = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusNotifyAck = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusNotifyAck = js.native
  
  /**
    * Decodes a ConsensusNotifyAck message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyAck
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusNotifyAck = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusNotifyAck = js.native
  
  /**
    * Encodes the specified ConsensusNotifyAck message. Does not implicitly {@link ConsensusNotifyAck.verify|verify} messages.
    * @param message ConsensusNotifyAck message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.encode")
  @js.native
  def encode(message: IConsensusNotifyAck): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.encode")
  @js.native
  def encode(message: IConsensusNotifyAck, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusNotifyAck message, length delimited. Does not implicitly {@link ConsensusNotifyAck.verify|verify} messages.
    * @param message ConsensusNotifyAck message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusNotifyAck): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusNotifyAck, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusNotifyAck message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyAck
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusNotifyAck = js.native
  
  /**
    * Creates a plain object from a ConsensusNotifyAck message. Also converts values to other types if specified.
    * @param message ConsensusNotifyAck
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.toObject")
  @js.native
  def toObject(message: ConsensusNotifyAck): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.toObject")
  @js.native
  def toObject(message: ConsensusNotifyAck, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusNotifyAck message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyAck.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
