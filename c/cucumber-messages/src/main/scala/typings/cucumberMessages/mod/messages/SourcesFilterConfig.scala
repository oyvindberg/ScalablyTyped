package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ISourcesFilterConfig
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SourcesFilterConfig. */
@JSImport("cucumber-messages", "messages.SourcesFilterConfig")
@js.native
/**
  * Constructs a new SourcesFilterConfig.
  * @param [properties] Properties to set
  */
class SourcesFilterConfig ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesFilterConfig {
  def this(properties: ISourcesFilterConfig) = this()
}
object SourcesFilterConfig {
  
  /**
    * Creates a new SourcesFilterConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourcesFilterConfig instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesFilterConfig = js.native
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.create")
  @js.native
  def create(properties: ISourcesFilterConfig): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesFilterConfig = js.native
  
  /**
    * Decodes a SourcesFilterConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourcesFilterConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesFilterConfig = js.native
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesFilterConfig = js.native
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesFilterConfig = js.native
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesFilterConfig = js.native
  
  /**
    * Decodes a SourcesFilterConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourcesFilterConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesFilterConfig = js.native
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesFilterConfig = js.native
  
  /**
    * Encodes the specified SourcesFilterConfig message. Does not implicitly {@link io.cucumber.messages.SourcesFilterConfig.verify|verify} messages.
    * @param message SourcesFilterConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.encode")
  @js.native
  def encode(message: ISourcesFilterConfig): Writer = js.native
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.encode")
  @js.native
  def encode(message: ISourcesFilterConfig, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SourcesFilterConfig message, length delimited. Does not implicitly {@link io.cucumber.messages.SourcesFilterConfig.verify|verify} messages.
    * @param message SourcesFilterConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourcesFilterConfig): Writer = js.native
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourcesFilterConfig, writer: Writer): Writer = js.native
  
  /**
    * Creates a SourcesFilterConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourcesFilterConfig
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesFilterConfig = js.native
  
  /**
    * Creates a plain object from a SourcesFilterConfig message. Also converts values to other types if specified.
    * @param message SourcesFilterConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesFilterConfig): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesFilterConfig,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SourcesFilterConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesFilterConfig.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
