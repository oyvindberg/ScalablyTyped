package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesAttributeDefinitionMod.AttributeDefinition
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typings.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbBrowser.typesKeysAndAttributesMod.KeysAndAttributes
import typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoverySpecificationMod.PointInTimeRecoverySpecification
import typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.awsSdkClientDynamodbBrowser.typesReplicaMod.Replica
import typings.awsSdkClientDynamodbBrowser.typesReplicaUpdateMod.ReplicaUpdate
import typings.awsSdkClientDynamodbBrowser.typesTagMod.Tag
import typings.awsSdkClientDynamodbBrowser.typesTimeToLiveSpecificationMod.TimeToLiveSpecification
import typings.awsSdkClientDynamodbBrowser.typesWriteRequestMod.WriteRequest
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbBrowser.typesBatchGetItemInputMod.BatchGetItemInput
    - typings.awsSdkClientDynamodbBrowser.typesBatchWriteItemInputMod.BatchWriteItemInput
    - typings.awsSdkClientDynamodbBrowser.typesCreateBackupInputMod.CreateBackupInput
    - typings.awsSdkClientDynamodbBrowser.typesCreateGlobalTableInputMod.CreateGlobalTableInput
    - typings.awsSdkClientDynamodbBrowser.typesCreateTableInputMod.CreateTableInput
    - typings.awsSdkClientDynamodbBrowser.typesDeleteBackupInputMod.DeleteBackupInput
    - typings.awsSdkClientDynamodbBrowser.typesDeleteItemInputMod.DeleteItemInput
    - typings.awsSdkClientDynamodbBrowser.typesDeleteTableInputMod.DeleteTableInput
    - typings.awsSdkClientDynamodbBrowser.typesDescribeBackupInputMod.DescribeBackupInput
    - typings.awsSdkClientDynamodbBrowser.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput
    - typings.awsSdkClientDynamodbBrowser.typesDescribeEndpointsInputMod.DescribeEndpointsInput
    - typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput
    - typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput
    - typings.awsSdkClientDynamodbBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput
    - typings.awsSdkClientDynamodbBrowser.typesDescribeTableInputMod.DescribeTableInput
    - typings.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput
    - typings.awsSdkClientDynamodbBrowser.typesGetItemInputMod.GetItemInput
    - typings.awsSdkClientDynamodbBrowser.typesListBackupsInputMod.ListBackupsInput
    - typings.awsSdkClientDynamodbBrowser.typesListGlobalTablesInputMod.ListGlobalTablesInput
    - typings.awsSdkClientDynamodbBrowser.typesListTablesInputMod.ListTablesInput
    - typings.awsSdkClientDynamodbBrowser.typesListTagsOfResourceInputMod.ListTagsOfResourceInput
    - typings.awsSdkClientDynamodbBrowser.typesPutItemInputMod.PutItemInput
    - typings.awsSdkClientDynamodbBrowser.typesQueryInputMod.QueryInput
    - typings.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput
    - typings.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput
    - typings.awsSdkClientDynamodbBrowser.typesScanInputMod.ScanInput
    - typings.awsSdkClientDynamodbBrowser.typesTagResourceInputMod.TagResourceInput
    - typings.awsSdkClientDynamodbBrowser.typesUntagResourceInputMod.UntagResourceInput
    - typings.awsSdkClientDynamodbBrowser.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput
    - typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput
    - typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput
    - typings.awsSdkClientDynamodbBrowser.typesUpdateItemInputMod.UpdateItemInput
    - typings.awsSdkClientDynamodbBrowser.typesUpdateTableInputMod.UpdateTableInput
    - typings.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def BatchGetItemInput(
      RequestItems: StringDictionary[KeysAndAttributes] | (Iterable[js.Tuple2[String, KeysAndAttributes]])
    ): typings.awsSdkClientDynamodbBrowser.typesBatchGetItemInputMod.BatchGetItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesBatchGetItemInputMod.BatchGetItemInput]
    }
    
    @scala.inline
    def BatchWriteItemInput(
      RequestItems: (StringDictionary[js.Array[WriteRequest] | Iterable[WriteRequest]]) | (Iterable[js.Tuple2[String, js.Array[WriteRequest] | Iterable[WriteRequest]]])
    ): typings.awsSdkClientDynamodbBrowser.typesBatchWriteItemInputMod.BatchWriteItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesBatchWriteItemInputMod.BatchWriteItemInput]
    }
    
    @scala.inline
    def CreateBackupInput(BackupName: String, TableName: String): typings.awsSdkClientDynamodbBrowser.typesCreateBackupInputMod.CreateBackupInput = {
      val __obj = js.Dynamic.literal(BackupName = BackupName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesCreateBackupInputMod.CreateBackupInput]
    }
    
    @scala.inline
    def CreateGlobalTableInput(GlobalTableName: String, ReplicationGroup: js.Array[Replica] | Iterable[Replica]): typings.awsSdkClientDynamodbBrowser.typesCreateGlobalTableInputMod.CreateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicationGroup = ReplicationGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesCreateGlobalTableInputMod.CreateGlobalTableInput]
    }
    
    @scala.inline
    def CreateTableInput(
      AttributeDefinitions: js.Array[AttributeDefinition] | Iterable[AttributeDefinition],
      KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement],
      ProvisionedThroughput: ProvisionedThroughput,
      TableName: String
    ): typings.awsSdkClientDynamodbBrowser.typesCreateTableInputMod.CreateTableInput = {
      val __obj = js.Dynamic.literal(AttributeDefinitions = AttributeDefinitions.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesCreateTableInputMod.CreateTableInput]
    }
    
    @scala.inline
    def DeleteBackupInput(BackupArn: String): typings.awsSdkClientDynamodbBrowser.typesDeleteBackupInputMod.DeleteBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesDeleteBackupInputMod.DeleteBackupInput]
    }
    
    @scala.inline
    def DeleteItemInput(
      Key: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typings.awsSdkClientDynamodbBrowser.typesDeleteItemInputMod.DeleteItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesDeleteItemInputMod.DeleteItemInput]
    }
    
    @scala.inline
    def DeleteTableInput(TableName: String): typings.awsSdkClientDynamodbBrowser.typesDeleteTableInputMod.DeleteTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesDeleteTableInputMod.DeleteTableInput]
    }
    
    @scala.inline
    def DescribeBackupInput(BackupArn: String): typings.awsSdkClientDynamodbBrowser.typesDescribeBackupInputMod.DescribeBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesDescribeBackupInputMod.DescribeBackupInput]
    }
    
    @scala.inline
    def DescribeContinuousBackupsInput(TableName: String): typings.awsSdkClientDynamodbBrowser.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput]
    }
    
    @scala.inline
    def DescribeEndpointsInput(): typings.awsSdkClientDynamodbBrowser.typesDescribeEndpointsInputMod.DescribeEndpointsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesDescribeEndpointsInputMod.DescribeEndpointsInput]
    }
    
    @scala.inline
    def DescribeGlobalTableInput(GlobalTableName: String): typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput]
    }
    
    @scala.inline
    def DescribeGlobalTableSettingsInput(GlobalTableName: String): typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput]
    }
    
    @scala.inline
    def DescribeLimitsInput(): typings.awsSdkClientDynamodbBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput]
    }
    
    @scala.inline
    def DescribeTableInput(TableName: String): typings.awsSdkClientDynamodbBrowser.typesDescribeTableInputMod.DescribeTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesDescribeTableInputMod.DescribeTableInput]
    }
    
    @scala.inline
    def DescribeTimeToLiveInput(TableName: String): typings.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput]
    }
    
    @scala.inline
    def GetItemInput(
      Key: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typings.awsSdkClientDynamodbBrowser.typesGetItemInputMod.GetItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesGetItemInputMod.GetItemInput]
    }
    
    @scala.inline
    def ListBackupsInput(): typings.awsSdkClientDynamodbBrowser.typesListBackupsInputMod.ListBackupsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesListBackupsInputMod.ListBackupsInput]
    }
    
    @scala.inline
    def ListGlobalTablesInput(): typings.awsSdkClientDynamodbBrowser.typesListGlobalTablesInputMod.ListGlobalTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesListGlobalTablesInputMod.ListGlobalTablesInput]
    }
    
    @scala.inline
    def ListTablesInput(): typings.awsSdkClientDynamodbBrowser.typesListTablesInputMod.ListTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesListTablesInputMod.ListTablesInput]
    }
    
    @scala.inline
    def ListTagsOfResourceInput(ResourceArn: String): typings.awsSdkClientDynamodbBrowser.typesListTagsOfResourceInputMod.ListTagsOfResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesListTagsOfResourceInputMod.ListTagsOfResourceInput]
    }
    
    @scala.inline
    def PutItemInput(
      Item: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typings.awsSdkClientDynamodbBrowser.typesPutItemInputMod.PutItemInput = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesPutItemInputMod.PutItemInput]
    }
    
    @scala.inline
    def QueryInput(TableName: String): typings.awsSdkClientDynamodbBrowser.typesQueryInputMod.QueryInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesQueryInputMod.QueryInput]
    }
    
    @scala.inline
    def RestoreTableFromBackupInput(BackupArn: String, TargetTableName: String): typings.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput]
    }
    
    @scala.inline
    def RestoreTableToPointInTimeInput(SourceTableName: String, TargetTableName: String): typings.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput = {
      val __obj = js.Dynamic.literal(SourceTableName = SourceTableName.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput]
    }
    
    @scala.inline
    def ScanInput(TableName: String): typings.awsSdkClientDynamodbBrowser.typesScanInputMod.ScanInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesScanInputMod.ScanInput]
    }
    
    @scala.inline
    def TagResourceInput(ResourceArn: String, Tags: js.Array[Tag] | Iterable[Tag]): typings.awsSdkClientDynamodbBrowser.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesTagResourceInputMod.TagResourceInput]
    }
    
    @scala.inline
    def UntagResourceInput(ResourceArn: String, TagKeys: js.Array[String] | Iterable[String]): typings.awsSdkClientDynamodbBrowser.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    @scala.inline
    def UpdateContinuousBackupsInput(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: String): typings.awsSdkClientDynamodbBrowser.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput]
    }
    
    @scala.inline
    def UpdateGlobalTableInput(GlobalTableName: String, ReplicaUpdates: js.Array[ReplicaUpdate] | Iterable[ReplicaUpdate]): typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicaUpdates = ReplicaUpdates.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput]
    }
    
    @scala.inline
    def UpdateGlobalTableSettingsInput(GlobalTableName: String): typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput]
    }
    
    @scala.inline
    def UpdateItemInput(
      Key: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typings.awsSdkClientDynamodbBrowser.typesUpdateItemInputMod.UpdateItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesUpdateItemInputMod.UpdateItemInput]
    }
    
    @scala.inline
    def UpdateTableInput(TableName: String): typings.awsSdkClientDynamodbBrowser.typesUpdateTableInputMod.UpdateTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesUpdateTableInputMod.UpdateTableInput]
    }
    
    @scala.inline
    def UpdateTimeToLiveInput(TableName: String, TimeToLiveSpecification: TimeToLiveSpecification): typings.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any], TimeToLiveSpecification = TimeToLiveSpecification.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput]
    }
  }
}
