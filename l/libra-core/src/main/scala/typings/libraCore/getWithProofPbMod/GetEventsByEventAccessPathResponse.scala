package typings.libraCore.getWithProofPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.accountStateBlobPbMod.AccountStateWithProof
import typings.libraCore.eventsPbMod.EventWithProof
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathResponse")
@js.native
class GetEventsByEventAccessPathResponse () extends Message {
  
  def addEventsWithProof(): EventWithProof = js.native
  def addEventsWithProof(value: js.UndefOr[scala.Nothing], index: Double): EventWithProof = js.native
  def addEventsWithProof(value: EventWithProof): EventWithProof = js.native
  def addEventsWithProof(value: EventWithProof, index: Double): EventWithProof = js.native
  
  def clearEventsWithProofList(): Unit = js.native
  
  def clearProofOfLatestEvent(): Unit = js.native
  
  def getEventsWithProofList(): js.Array[EventWithProof] = js.native
  
  def getProofOfLatestEvent(): js.UndefOr[AccountStateWithProof] = js.native
  
  def hasProofOfLatestEvent(): Boolean = js.native
  
  def setEventsWithProofList(value: js.Array[EventWithProof]): Unit = js.native
  
  def setProofOfLatestEvent(): Unit = js.native
  def setProofOfLatestEvent(value: AccountStateWithProof): Unit = js.native
}
/* static members */
object GetEventsByEventAccessPathResponse {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathResponse.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): GetEventsByEventAccessPathResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathResponse.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: GetEventsByEventAccessPathResponse, reader: BinaryReader): GetEventsByEventAccessPathResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathResponse.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathResponse.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathResponse.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: GetEventsByEventAccessPathResponse, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathResponse.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: GetEventsByEventAccessPathResponse): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var eventsWithProofList: js.Array[typings.libraCore.eventsPbMod.EventWithProof.AsObject] = js.native
    
    var proofOfLatestEvent: js.UndefOr[typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(eventsWithProofList: js.Array[typings.libraCore.eventsPbMod.EventWithProof.AsObject]): AsObject = {
      val __obj = js.Dynamic.literal(eventsWithProofList = eventsWithProofList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventsWithProofList(value: js.Array[typings.libraCore.eventsPbMod.EventWithProof.AsObject]): Self = StObject.set(x, "eventsWithProofList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsWithProofListVarargs(value: typings.libraCore.eventsPbMod.EventWithProof.AsObject*): Self = StObject.set(x, "eventsWithProofList", js.Array(value :_*))
      
      @scala.inline
      def setProofOfLatestEvent(value: typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject): Self = StObject.set(x, "proofOfLatestEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProofOfLatestEventUndefined: Self = StObject.set(x, "proofOfLatestEvent", js.undefined)
    }
  }
}
