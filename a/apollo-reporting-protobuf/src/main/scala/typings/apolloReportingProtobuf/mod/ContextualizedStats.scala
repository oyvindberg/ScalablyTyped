package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.protobufMod.IContextualizedStats
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "ContextualizedStats")
@js.native
/**
  * Constructs a new ContextualizedStats.
  * @param [properties] Properties to set
  */
class ContextualizedStats ()
  extends typings.apolloReportingProtobuf.protobufMod.ContextualizedStats {
  def this(properties: IContextualizedStats) = this()
}
/* static members */
object ContextualizedStats {
  
  /**
    * Creates a new ContextualizedStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ContextualizedStats instance
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.create")
  @js.native
  def create(): typings.apolloReportingProtobuf.protobufMod.ContextualizedStats = js.native
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.create")
  @js.native
  def create(properties: IContextualizedStats): typings.apolloReportingProtobuf.protobufMod.ContextualizedStats = js.native
  
  /**
    * Decodes a ContextualizedStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ContextualizedStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.decode")
  @js.native
  def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.ContextualizedStats = js.native
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.ContextualizedStats = js.native
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.decode")
  @js.native
  def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.ContextualizedStats = js.native
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.ContextualizedStats = js.native
  
  /**
    * Decodes a ContextualizedStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ContextualizedStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.ContextualizedStats = js.native
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.ContextualizedStats = js.native
  
  /**
    * Encodes the specified ContextualizedStats message. Does not implicitly {@link ContextualizedStats.verify|verify} messages.
    * @param message ContextualizedStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.encode")
  @js.native
  def encode(message: IContextualizedStats): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.encode")
  @js.native
  def encode(message: IContextualizedStats, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ContextualizedStats message, length delimited. Does not implicitly {@link ContextualizedStats.verify|verify} messages.
    * @param message ContextualizedStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.encodeDelimited")
  @js.native
  def encodeDelimited(message: IContextualizedStats): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.encodeDelimited")
  @js.native
  def encodeDelimited(message: IContextualizedStats, writer: Writer): Writer = js.native
  
  /**
    * Creates a ContextualizedStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ContextualizedStats
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.ContextualizedStats = js.native
  
  /**
    * Creates a plain object from a ContextualizedStats message. Also converts values to other types if specified.
    * @param message ContextualizedStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.toObject")
  @js.native
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.ContextualizedStats): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.toObject")
  @js.native
  def toObject(
    message: typings.apolloReportingProtobuf.protobufMod.ContextualizedStats,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ContextualizedStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
