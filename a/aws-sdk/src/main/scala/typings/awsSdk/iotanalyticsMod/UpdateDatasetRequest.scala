package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDatasetRequest extends StObject {
  
  /**
    * A list of DatasetAction objects.
    */
  var actions: DatasetActions = js.native
  
  /**
    * When dataset contents are created, they are delivered to destinations specified here.
    */
  var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.native
  
  /**
    * The name of the data set to update.
    */
  var datasetName: DatasetName = js.native
  
  /**
    * A list of data rules that send notifications to Amazon CloudWatch, when data arrives late. To specify lateDataRules, the dataset must use a DeltaTimer filter.
    */
  var lateDataRules: js.UndefOr[LateDataRules] = js.native
  
  /**
    * How long, in days, dataset contents are kept for the dataset.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
  
  /**
    * A list of DatasetTrigger objects. The list can be empty or can contain up to five DatasetTrigger objects.
    */
  var triggers: js.UndefOr[DatasetTriggers] = js.native
  
  /**
    * Optional. How many versions of dataset contents are kept. If not specified or set to null, only the latest version plus the latest succeeded version (if they are different) are kept for the time period specified by the retentionPeriod parameter. For more information, see Keeping Multiple Versions of AWS IoT Analytics Data Sets in the AWS IoT Analytics User Guide.
    */
  var versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.native
}
object UpdateDatasetRequest {
  
  @scala.inline
  def apply(actions: DatasetActions, datasetName: DatasetName): UpdateDatasetRequest = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetRequest]
  }
  
  @scala.inline
  implicit class UpdateDatasetRequestMutableBuilder[Self <: UpdateDatasetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: DatasetActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: DatasetAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setContentDeliveryRules(value: DatasetContentDeliveryRules): Self = StObject.set(x, "contentDeliveryRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDeliveryRulesUndefined: Self = StObject.set(x, "contentDeliveryRules", js.undefined)
    
    @scala.inline
    def setContentDeliveryRulesVarargs(value: DatasetContentDeliveryRule*): Self = StObject.set(x, "contentDeliveryRules", js.Array(value :_*))
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLateDataRules(value: LateDataRules): Self = StObject.set(x, "lateDataRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLateDataRulesUndefined: Self = StObject.set(x, "lateDataRules", js.undefined)
    
    @scala.inline
    def setLateDataRulesVarargs(value: LateDataRule*): Self = StObject.set(x, "lateDataRules", js.Array(value :_*))
    
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    @scala.inline
    def setTriggers(value: DatasetTriggers): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    @scala.inline
    def setTriggersVarargs(value: DatasetTrigger*): Self = StObject.set(x, "triggers", js.Array(value :_*))
    
    @scala.inline
    def setVersioningConfiguration(value: VersioningConfiguration): Self = StObject.set(x, "versioningConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersioningConfigurationUndefined: Self = StObject.set(x, "versioningConfiguration", js.undefined)
  }
}
