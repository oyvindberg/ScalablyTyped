package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IStepDefinitionPattern
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StepDefinitionPattern. */
@JSImport("cucumber-messages", "messages.StepDefinitionPattern")
@js.native
/**
  * Constructs a new StepDefinitionPattern.
  * @param [properties] Properties to set
  */
class StepDefinitionPattern ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinitionPattern {
  def this(properties: IStepDefinitionPattern) = this()
}
object StepDefinitionPattern {
  
  /**
    * Creates a new StepDefinitionPattern instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StepDefinitionPattern instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinitionPattern = js.native
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.create")
  @js.native
  def create(properties: IStepDefinitionPattern): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinitionPattern = js.native
  
  /**
    * Decodes a StepDefinitionPattern message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StepDefinitionPattern
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinitionPattern = js.native
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinitionPattern = js.native
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinitionPattern = js.native
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinitionPattern = js.native
  
  /**
    * Decodes a StepDefinitionPattern message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StepDefinitionPattern
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinitionPattern = js.native
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinitionPattern = js.native
  
  /**
    * Encodes the specified StepDefinitionPattern message. Does not implicitly {@link io.cucumber.messages.StepDefinitionPattern.verify|verify} messages.
    * @param message StepDefinitionPattern message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.encode")
  @js.native
  def encode(message: IStepDefinitionPattern): Writer = js.native
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.encode")
  @js.native
  def encode(message: IStepDefinitionPattern, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StepDefinitionPattern message, length delimited. Does not implicitly {@link io.cucumber.messages.StepDefinitionPattern.verify|verify} messages.
    * @param message StepDefinitionPattern message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStepDefinitionPattern): Writer = js.native
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStepDefinitionPattern, writer: Writer): Writer = js.native
  
  /**
    * Creates a StepDefinitionPattern message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StepDefinitionPattern
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinitionPattern = js.native
  
  /**
    * Creates a plain object from a StepDefinitionPattern message. Also converts values to other types if specified.
    * @param message StepDefinitionPattern
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinitionPattern): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinitionPattern,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StepDefinitionPattern message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinitionPattern.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
