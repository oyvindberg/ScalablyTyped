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

object accessPathPbMod {
  
  @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath")
  @js.native
  class AccessPath () extends Message {
    
    def getAddress(): Uint8Array | String = js.native
    
    def getAddress_asB64(): String = js.native
    
    def getAddress_asU8(): Uint8Array = js.native
    
    def getPath(): Uint8Array | String = js.native
    
    def getPath_asB64(): String = js.native
    
    def getPath_asU8(): Uint8Array = js.native
    
    def setAddress(value: String): Unit = js.native
    def setAddress(value: Uint8Array): Unit = js.native
    
    def setPath(value: String): Unit = js.native
    def setPath(value: Uint8Array): Unit = js.native
  }
  /* static members */
  object AccessPath {
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): AccessPath = js.native
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: AccessPath, reader: BinaryReader): AccessPath = js.native
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: AccessPath, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: AccessPath): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var address: Uint8Array | String = js.native
      
      var path: Uint8Array | String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(address: Uint8Array | String, path: Uint8Array | String): AsObject = {
        val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddress(value: Uint8Array | String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPath(value: Uint8Array | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      }
    }
  }
}
