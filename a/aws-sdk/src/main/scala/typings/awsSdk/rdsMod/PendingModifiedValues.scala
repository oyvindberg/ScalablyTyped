package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingModifiedValues extends StObject {
  
  /**
    *  Contains the new AllocatedStorage size for the DB instance that will be applied or is currently being applied. 
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Specifies the pending number of days for which automated backups are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Specifies the identifier of the CA certificate for the DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.native
  
  /**
    *  Contains the new DBInstanceClass for the DB instance that will be applied or is currently being applied. 
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  
  /**
    *  Contains the new DBInstanceIdentifier for the DB instance that will be applied or is currently being applied. 
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The new DB subnet group for the DB instance. 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * Specifies the new Provisioned IOPS value for the DB instance that will be applied or is currently being applied.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The license model for the DB instance. Valid values: license-included | bring-your-own-license | general-public-license 
    */
  var LicenseModel: js.UndefOr[String] = js.native
  
  /**
    * Contains the pending or currently-in-progress change of the master credentials for the DB instance.
    */
  var MasterUserPassword: js.UndefOr[String] = js.native
  
  /**
    * Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  
  var PendingCloudwatchLogsExports: js.UndefOr[typings.awsSdk.rdsMod.PendingCloudwatchLogsExports] = js.native
  
  /**
    * Specifies the pending port for the DB instance.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.native
  
  /**
    * Specifies the storage type to be associated with the DB instance.
    */
  var StorageType: js.UndefOr[String] = js.native
}
object PendingModifiedValues {
  
  @scala.inline
  def apply(): PendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingModifiedValues]
  }
  
  @scala.inline
  implicit class PendingModifiedValuesMutableBuilder[Self <: PendingModifiedValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocatedStorage(value: IntegerOptional): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    @scala.inline
    def setBackupRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    @scala.inline
    def setCACertificateIdentifier(value: String): Self = StObject.set(x, "CACertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCACertificateIdentifierUndefined: Self = StObject.set(x, "CACertificateIdentifier", js.undefined)
    
    @scala.inline
    def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceIdentifierUndefined: Self = StObject.set(x, "DBInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupNameUndefined: Self = StObject.set(x, "DBSubnetGroupName", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setIops(value: IntegerOptional): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    @scala.inline
    def setMasterUserPassword(value: String): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    @scala.inline
    def setMultiAZ(value: BooleanOptional): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    @scala.inline
    def setPendingCloudwatchLogsExports(value: PendingCloudwatchLogsExports): Self = StObject.set(x, "PendingCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingCloudwatchLogsExportsUndefined: Self = StObject.set(x, "PendingCloudwatchLogsExports", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setProcessorFeatures(value: ProcessorFeatureList): Self = StObject.set(x, "ProcessorFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorFeaturesUndefined: Self = StObject.set(x, "ProcessorFeatures", js.undefined)
    
    @scala.inline
    def setProcessorFeaturesVarargs(value: ProcessorFeature*): Self = StObject.set(x, "ProcessorFeatures", js.Array(value :_*))
    
    @scala.inline
    def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
  }
}
