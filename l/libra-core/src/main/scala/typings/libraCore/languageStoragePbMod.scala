package typings.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languageStoragePbMod {
  
  @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId")
  @js.native
  class ModuleId () extends Message {
    
    def getAddress(): Uint8Array | String = js.native
    
    def getAddress_asB64(): String = js.native
    
    def getAddress_asU8(): Uint8Array = js.native
    
    def getName(): String = js.native
    
    def setAddress(value: String): Unit = js.native
    def setAddress(value: Uint8Array): Unit = js.native
    
    def setName(value: String): Unit = js.native
  }
  /* static members */
  object ModuleId {
    
    @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): ModuleId = js.native
    
    @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: ModuleId, reader: BinaryReader): ModuleId = js.native
    
    @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: ModuleId, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: ModuleId): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var address: Uint8Array | String = js.native
      
      var name: String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(address: Uint8Array | String, name: String): AsObject = {
        val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddress(value: Uint8Array | String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
}
