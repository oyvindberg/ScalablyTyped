package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITransaction
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.Transaction")
@js.native
/**
  * Constructs a new Transaction.
  * @param [properties] Properties to set
  */
class Transaction ()
  extends typings.sawtoothSdk.protobufMod.Transaction {
  def this(properties: ITransaction) = this()
}
/* static members */
object Transaction {
  
  /**
    * Creates a new Transaction instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Transaction instance
    */
  @JSImport("sawtooth-sdk", "protobuf.Transaction.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.Transaction = js.native
  @JSImport("sawtooth-sdk", "protobuf.Transaction.create")
  @js.native
  def create(properties: ITransaction): typings.sawtoothSdk.protobufMod.Transaction = js.native
  
  /**
    * Decodes a Transaction message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Transaction
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.Transaction.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Transaction = js.native
  @JSImport("sawtooth-sdk", "protobuf.Transaction.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Transaction = js.native
  @JSImport("sawtooth-sdk", "protobuf.Transaction.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Transaction = js.native
  @JSImport("sawtooth-sdk", "protobuf.Transaction.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Transaction = js.native
  
  /**
    * Decodes a Transaction message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Transaction
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.Transaction.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Transaction = js.native
  @JSImport("sawtooth-sdk", "protobuf.Transaction.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Transaction = js.native
  
  /**
    * Encodes the specified Transaction message. Does not implicitly {@link Transaction.verify|verify} messages.
    * @param message Transaction message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.Transaction.encode")
  @js.native
  def encode(message: ITransaction): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.Transaction.encode")
  @js.native
  def encode(message: ITransaction, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Transaction message, length delimited. Does not implicitly {@link Transaction.verify|verify} messages.
    * @param message Transaction message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.Transaction.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITransaction): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.Transaction.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITransaction, writer: Writer): Writer = js.native
  
  /**
    * Creates a Transaction message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Transaction
    */
  @JSImport("sawtooth-sdk", "protobuf.Transaction.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Transaction = js.native
  
  /**
    * Creates a plain object from a Transaction message. Also converts values to other types if specified.
    * @param message Transaction
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.Transaction.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.Transaction): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.Transaction.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.Transaction, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Transaction message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.Transaction.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
