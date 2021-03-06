package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ISourcesConfig
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SourcesConfig. */
@JSImport("cucumber-messages", "messages.SourcesConfig")
@js.native
/**
  * Constructs a new SourcesConfig.
  * @param [properties] Properties to set
  */
class SourcesConfig ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesConfig {
  def this(properties: ISourcesConfig) = this()
}
object SourcesConfig {
  
  /**
    * Creates a new SourcesConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourcesConfig instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesConfig.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesConfig = js.native
  @JSImport("cucumber-messages", "messages.SourcesConfig.create")
  @js.native
  def create(properties: ISourcesConfig): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesConfig = js.native
  
  /**
    * Decodes a SourcesConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourcesConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesConfig.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesConfig = js.native
  @JSImport("cucumber-messages", "messages.SourcesConfig.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesConfig = js.native
  @JSImport("cucumber-messages", "messages.SourcesConfig.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesConfig = js.native
  @JSImport("cucumber-messages", "messages.SourcesConfig.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesConfig = js.native
  
  /**
    * Decodes a SourcesConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourcesConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesConfig = js.native
  @JSImport("cucumber-messages", "messages.SourcesConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesConfig = js.native
  
  /**
    * Encodes the specified SourcesConfig message. Does not implicitly {@link io.cucumber.messages.SourcesConfig.verify|verify} messages.
    * @param message SourcesConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesConfig.encode")
  @js.native
  def encode(message: ISourcesConfig): Writer = js.native
  @JSImport("cucumber-messages", "messages.SourcesConfig.encode")
  @js.native
  def encode(message: ISourcesConfig, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SourcesConfig message, length delimited. Does not implicitly {@link io.cucumber.messages.SourcesConfig.verify|verify} messages.
    * @param message SourcesConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourcesConfig): Writer = js.native
  @JSImport("cucumber-messages", "messages.SourcesConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourcesConfig, writer: Writer): Writer = js.native
  
  /**
    * Creates a SourcesConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourcesConfig
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesConfig.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesConfig = js.native
  
  /**
    * Creates a plain object from a SourcesConfig message. Also converts values to other types if specified.
    * @param message SourcesConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesConfig.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesConfig): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.SourcesConfig.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesConfig,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SourcesConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesConfig.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
