package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListSessionEntityTypesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest")
@js.native
/**
  * Constructs a new ListSessionEntityTypesRequest.
  * @param [properties] Properties to set
  */
class ListSessionEntityTypesRequest () extends IListSessionEntityTypesRequest {
  def this(properties: IListSessionEntityTypesRequest) = this()
  
  /** ListSessionEntityTypesRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListSessionEntityTypesRequest: Double = js.native
  
  /** ListSessionEntityTypesRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListSessionEntityTypesRequest: String = js.native
  
  /** ListSessionEntityTypesRequest parent. */
  @JSName("parent")
  var parent_ListSessionEntityTypesRequest: String = js.native
  
  /**
    * Converts this ListSessionEntityTypesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListSessionEntityTypesRequest {
  
  /**
    * Creates a new ListSessionEntityTypesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSessionEntityTypesRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.create")
  @js.native
  def create(): ListSessionEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.create")
  @js.native
  def create(properties: IListSessionEntityTypesRequest): ListSessionEntityTypesRequest = js.native
  
  /**
    * Decodes a ListSessionEntityTypesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSessionEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.decode")
  @js.native
  def decode(reader: Reader): ListSessionEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListSessionEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ListSessionEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ListSessionEntityTypesRequest = js.native
  
  /**
    * Decodes a ListSessionEntityTypesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSessionEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListSessionEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ListSessionEntityTypesRequest = js.native
  
  /**
    * Encodes the specified ListSessionEntityTypesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.verify|verify} messages.
    * @param message ListSessionEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.encode")
  @js.native
  def encode(message: IListSessionEntityTypesRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.encode")
  @js.native
  def encode(message: IListSessionEntityTypesRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListSessionEntityTypesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.verify|verify} messages.
    * @param message ListSessionEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListSessionEntityTypesRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListSessionEntityTypesRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListSessionEntityTypesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSessionEntityTypesRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListSessionEntityTypesRequest = js.native
  
  /**
    * Creates a plain object from a ListSessionEntityTypesRequest message. Also converts values to other types if specified.
    * @param message ListSessionEntityTypesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.toObject")
  @js.native
  def toObject(message: ListSessionEntityTypesRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.toObject")
  @js.native
  def toObject(message: ListSessionEntityTypesRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListSessionEntityTypesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
