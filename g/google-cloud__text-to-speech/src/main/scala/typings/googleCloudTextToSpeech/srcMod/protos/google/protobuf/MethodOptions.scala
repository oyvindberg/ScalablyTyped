package typings.googleCloudTextToSpeech.srcMod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.protobuf.IMethodOptions
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MethodOptions. */
@JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions")
@js.native
/**
  * Constructs a new MethodOptions.
  * @param [properties] Properties to set
  */
class MethodOptions ()
  extends typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions {
  def this(properties: IMethodOptions) = this()
}
object MethodOptions {
  
  /** IdempotencyLevel enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.IdempotencyLevel")
  @js.native
  object IdempotencyLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions.IdempotencyLevel with Double
      ] = js.native
    
    /* 0 */ val IDEMPOTENCY_UNKNOWN: typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN with Double = js.native
    
    /* 2 */ val IDEMPOTENT: typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions.IdempotencyLevel.IDEMPOTENT with Double = js.native
    
    /* 1 */ val NO_SIDE_EFFECTS: typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions.IdempotencyLevel.NO_SIDE_EFFECTS with Double = js.native
  }
  
  /**
    * Creates a new MethodOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MethodOptions instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.create")
  @js.native
  def create(): typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.create")
  @js.native
  def create(properties: IMethodOptions): typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions = js.native
  
  /**
    * Decodes a MethodOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MethodOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions = js.native
  
  /**
    * Decodes a MethodOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MethodOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions = js.native
  
  /**
    * Encodes the specified MethodOptions message. Does not implicitly {@link google.protobuf.MethodOptions.verify|verify} messages.
    * @param message MethodOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.encode")
  @js.native
  def encode(message: IMethodOptions): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.encode")
  @js.native
  def encode(message: IMethodOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified MethodOptions message, length delimited. Does not implicitly {@link google.protobuf.MethodOptions.verify|verify} messages.
    * @param message MethodOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMethodOptions): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMethodOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates a MethodOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MethodOptions
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions = js.native
  
  /**
    * Creates a plain object from a MethodOptions message. Also converts values to other types if specified.
    * @param message MethodOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.toObject")
  @js.native
  def toObject(message: typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a MethodOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.MethodOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
