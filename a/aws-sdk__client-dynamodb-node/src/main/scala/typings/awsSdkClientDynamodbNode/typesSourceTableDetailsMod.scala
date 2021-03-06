package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.UnmarshalledProvisionedThroughput
import typings.std.Date
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSourceTableDetailsMod {
  
  @js.native
  trait SourceTableDetails extends StObject {
    
    /**
      * <p>Number of items in the table. Please note this is an approximate value. </p>
      */
    var ItemCount: js.UndefOr[Double] = js.native
    
    /**
      * <p>Schema of the table. </p>
      */
    var KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement] = js.native
    
    /**
      * <p>Read IOPs and Write IOPS on the table when the backup was created.</p>
      */
    var ProvisionedThroughput: typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput = js.native
    
    /**
      * <p>ARN of the table for which backup was created. </p>
      */
    var TableArn: js.UndefOr[String] = js.native
    
    /**
      * <p>Time when the source table was created. </p>
      */
    var TableCreationDateTime: Date | String | Double = js.native
    
    /**
      * <p>Unique identifier for the table for which the backup was created. </p>
      */
    var TableId: String = js.native
    
    /**
      * <p>The name of the table for which the backup was created. </p>
      */
    var TableName: String = js.native
    
    /**
      * <p>Size of the table in bytes. Please note this is an approximate value.</p>
      */
    var TableSizeBytes: js.UndefOr[Double] = js.native
  }
  object SourceTableDetails {
    
    @scala.inline
    def apply(
      KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement],
      ProvisionedThroughput: ProvisionedThroughput,
      TableCreationDateTime: Date | String | Double,
      TableId: String,
      TableName: String
    ): SourceTableDetails = {
      val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceTableDetails]
    }
    
    @scala.inline
    implicit class SourceTableDetailsMutableBuilder[Self <: SourceTableDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      @scala.inline
      def setKeySchema(value: js.Array[KeySchemaElement] | Iterable[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableArn(value: String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
      
      @scala.inline
      def setTableCreationDateTime(value: Date | String | Double): Self = StObject.set(x, "TableCreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableId(value: String): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableSizeBytes(value: Double): Self = StObject.set(x, "TableSizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableSizeBytesUndefined: Self = StObject.set(x, "TableSizeBytes", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSourceTableDetails extends SourceTableDetails {
    
    /**
      * <p>Schema of the table. </p>
      */
    @JSName("KeySchema")
    var KeySchema_UnmarshalledSourceTableDetails: js.Array[UnmarshalledKeySchemaElement] = js.native
    
    /**
      * <p>Read IOPs and Write IOPS on the table when the backup was created.</p>
      */
    @JSName("ProvisionedThroughput")
    var ProvisionedThroughput_UnmarshalledSourceTableDetails: UnmarshalledProvisionedThroughput = js.native
    
    /**
      * <p>Time when the source table was created. </p>
      */
    @JSName("TableCreationDateTime")
    var TableCreationDateTime_UnmarshalledSourceTableDetails: Date = js.native
  }
  object UnmarshalledSourceTableDetails {
    
    @scala.inline
    def apply(
      KeySchema: js.Array[UnmarshalledKeySchemaElement],
      ProvisionedThroughput: UnmarshalledProvisionedThroughput,
      TableCreationDateTime: Date,
      TableId: String,
      TableName: String
    ): UnmarshalledSourceTableDetails = {
      val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledSourceTableDetails]
    }
    
    @scala.inline
    implicit class UnmarshalledSourceTableDetailsMutableBuilder[Self <: UnmarshalledSourceTableDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeySchema(value: js.Array[UnmarshalledKeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaVarargs(value: UnmarshalledKeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProvisionedThroughput(value: UnmarshalledProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableCreationDateTime(value: Date): Self = StObject.set(x, "TableCreationDateTime", value.asInstanceOf[js.Any])
    }
  }
}
