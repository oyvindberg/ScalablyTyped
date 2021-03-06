package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITestStepStarted
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestStepStarted. */
@JSImport("cucumber-messages", "messages.TestStepStarted")
@js.native
/**
  * Constructs a new TestStepStarted.
  * @param [properties] Properties to set
  */
class TestStepStarted ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted {
  def this(properties: ITestStepStarted) = this()
}
object TestStepStarted {
  
  /**
    * Creates a new TestStepStarted instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestStepStarted instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  @JSImport("cucumber-messages", "messages.TestStepStarted.create")
  @js.native
  def create(properties: ITestStepStarted): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  
  /**
    * Decodes a TestStepStarted message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestStepStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  @JSImport("cucumber-messages", "messages.TestStepStarted.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  @JSImport("cucumber-messages", "messages.TestStepStarted.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  @JSImport("cucumber-messages", "messages.TestStepStarted.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  
  /**
    * Decodes a TestStepStarted message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestStepStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  @JSImport("cucumber-messages", "messages.TestStepStarted.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  
  /**
    * Encodes the specified TestStepStarted message. Does not implicitly {@link io.cucumber.messages.TestStepStarted.verify|verify} messages.
    * @param message TestStepStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.encode")
  @js.native
  def encode(message: ITestStepStarted): Writer = js.native
  @JSImport("cucumber-messages", "messages.TestStepStarted.encode")
  @js.native
  def encode(message: ITestStepStarted, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestStepStarted message, length delimited. Does not implicitly {@link io.cucumber.messages.TestStepStarted.verify|verify} messages.
    * @param message TestStepStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestStepStarted): Writer = js.native
  @JSImport("cucumber-messages", "messages.TestStepStarted.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestStepStarted, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestStepStarted message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestStepStarted
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  
  /**
    * Creates a plain object from a TestStepStarted message. Also converts values to other types if specified.
    * @param message TestStepStarted
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.TestStepStarted.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestStepStarted message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
