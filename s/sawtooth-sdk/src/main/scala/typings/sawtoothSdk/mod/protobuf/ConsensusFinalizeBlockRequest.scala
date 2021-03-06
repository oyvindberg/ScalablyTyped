package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusFinalizeBlockRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest")
@js.native
/**
  * Constructs a new ConsensusFinalizeBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusFinalizeBlockRequest ()
  extends typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest {
  def this(properties: IConsensusFinalizeBlockRequest) = this()
}
/* static members */
object ConsensusFinalizeBlockRequest {
  
  /**
    * Creates a new ConsensusFinalizeBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusFinalizeBlockRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.create")
  @js.native
  def create(properties: IConsensusFinalizeBlockRequest): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  
  /**
    * Decodes a ConsensusFinalizeBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusFinalizeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  
  /**
    * Decodes a ConsensusFinalizeBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusFinalizeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  
  /**
    * Encodes the specified ConsensusFinalizeBlockRequest message. Does not implicitly {@link ConsensusFinalizeBlockRequest.verify|verify} messages.
    * @param message ConsensusFinalizeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.encode")
  @js.native
  def encode(message: IConsensusFinalizeBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.encode")
  @js.native
  def encode(message: IConsensusFinalizeBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusFinalizeBlockRequest message, length delimited. Does not implicitly {@link ConsensusFinalizeBlockRequest.verify|verify} messages.
    * @param message ConsensusFinalizeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusFinalizeBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusFinalizeBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusFinalizeBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusFinalizeBlockRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusFinalizeBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusFinalizeBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.toObject")
  @js.native
  def toObject(
    message: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusFinalizeBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
