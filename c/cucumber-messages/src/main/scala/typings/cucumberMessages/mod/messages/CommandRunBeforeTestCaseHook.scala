package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ICommandRunBeforeTestCaseHook
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandRunBeforeTestCaseHook. */
@JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook")
@js.native
/**
  * Constructs a new CommandRunBeforeTestCaseHook.
  * @param [properties] Properties to set
  */
class CommandRunBeforeTestCaseHook ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook {
  def this(properties: ICommandRunBeforeTestCaseHook) = this()
}
object CommandRunBeforeTestCaseHook {
  
  /**
    * Creates a new CommandRunBeforeTestCaseHook instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunBeforeTestCaseHook instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.create")
  @js.native
  def create(properties: ICommandRunBeforeTestCaseHook): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  
  /**
    * Decodes a CommandRunBeforeTestCaseHook message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunBeforeTestCaseHook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  
  /**
    * Decodes a CommandRunBeforeTestCaseHook message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunBeforeTestCaseHook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  
  /**
    * Encodes the specified CommandRunBeforeTestCaseHook message. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestCaseHook.verify|verify} messages.
    * @param message CommandRunBeforeTestCaseHook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.encode")
  @js.native
  def encode(message: ICommandRunBeforeTestCaseHook): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.encode")
  @js.native
  def encode(message: ICommandRunBeforeTestCaseHook, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandRunBeforeTestCaseHook message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestCaseHook.verify|verify} messages.
    * @param message CommandRunBeforeTestCaseHook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandRunBeforeTestCaseHook): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandRunBeforeTestCaseHook, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandRunBeforeTestCaseHook message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunBeforeTestCaseHook
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  
  /**
    * Creates a plain object from a CommandRunBeforeTestCaseHook message. Also converts values to other types if specified.
    * @param message CommandRunBeforeTestCaseHook
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook
  ): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandRunBeforeTestCaseHook message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
