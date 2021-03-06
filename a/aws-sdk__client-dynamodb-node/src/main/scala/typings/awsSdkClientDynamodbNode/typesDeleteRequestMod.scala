package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.AttributeValue
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteRequestMod {
  
  @js.native
  trait DeleteRequest extends StObject {
    
    /**
      * <p>A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.</p>
      */
    var Key: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]]) = js.native
  }
  object DeleteRequest {
    
    @scala.inline
    def apply(Key: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): DeleteRequest = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteRequest]
    }
    
    @scala.inline
    implicit class DeleteRequestMutableBuilder[Self <: DeleteRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledDeleteRequest extends DeleteRequest {
    
    /**
      * <p>A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.</p>
      */
    @JSName("Key")
    var Key_UnmarshalledDeleteRequest: StringDictionary[UnmarshalledAttributeValue] = js.native
  }
  object UnmarshalledDeleteRequest {
    
    @scala.inline
    def apply(Key: StringDictionary[UnmarshalledAttributeValue]): UnmarshalledDeleteRequest = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledDeleteRequest]
    }
    
    @scala.inline
    implicit class UnmarshalledDeleteRequestMutableBuilder[Self <: UnmarshalledDeleteRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: StringDictionary[UnmarshalledAttributeValue]): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    }
  }
}
