package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingSpecification extends StObject {
  
  /**
    * A list of MetricDefinition objects, which are used for parsing metrics generated by the algorithm.
    */
  var MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.native
  
  /**
    * A list of the HyperParameterSpecification objects, that define the supported hyperparameters. This is required if the algorithm supports automatic model tuning.&gt;
    */
  var SupportedHyperParameters: js.UndefOr[HyperParameterSpecifications] = js.native
  
  /**
    * A list of the instance types that this algorithm can use for training.
    */
  var SupportedTrainingInstanceTypes: TrainingInstanceTypes = js.native
  
  /**
    * A list of the metrics that the algorithm emits that can be used as the objective metric in a hyperparameter tuning job.
    */
  var SupportedTuningJobObjectiveMetrics: js.UndefOr[HyperParameterTuningJobObjectives] = js.native
  
  /**
    * Indicates whether the algorithm supports distributed training. If set to false, buyers can't request more than one instance during training.
    */
  var SupportsDistributedTraining: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of ChannelSpecification objects, which specify the input sources to be used by the algorithm.
    */
  var TrainingChannels: ChannelSpecifications = js.native
  
  /**
    * The Amazon ECR registry path of the Docker image that contains the training algorithm.
    */
  var TrainingImage: ContainerImage = js.native
  
  /**
    * An MD5 hash of the training algorithm that identifies the Docker image used for training.
    */
  var TrainingImageDigest: js.UndefOr[ImageDigest] = js.native
}
object TrainingSpecification {
  
  @scala.inline
  def apply(
    SupportedTrainingInstanceTypes: TrainingInstanceTypes,
    TrainingChannels: ChannelSpecifications,
    TrainingImage: ContainerImage
  ): TrainingSpecification = {
    val __obj = js.Dynamic.literal(SupportedTrainingInstanceTypes = SupportedTrainingInstanceTypes.asInstanceOf[js.Any], TrainingChannels = TrainingChannels.asInstanceOf[js.Any], TrainingImage = TrainingImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingSpecification]
  }
  
  @scala.inline
  implicit class TrainingSpecificationMutableBuilder[Self <: TrainingSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricDefinitions(value: MetricDefinitionList): Self = StObject.set(x, "MetricDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDefinitionsUndefined: Self = StObject.set(x, "MetricDefinitions", js.undefined)
    
    @scala.inline
    def setMetricDefinitionsVarargs(value: MetricDefinition*): Self = StObject.set(x, "MetricDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setSupportedHyperParameters(value: HyperParameterSpecifications): Self = StObject.set(x, "SupportedHyperParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedHyperParametersUndefined: Self = StObject.set(x, "SupportedHyperParameters", js.undefined)
    
    @scala.inline
    def setSupportedHyperParametersVarargs(value: HyperParameterSpecification*): Self = StObject.set(x, "SupportedHyperParameters", js.Array(value :_*))
    
    @scala.inline
    def setSupportedTrainingInstanceTypes(value: TrainingInstanceTypes): Self = StObject.set(x, "SupportedTrainingInstanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedTrainingInstanceTypesVarargs(value: TrainingInstanceType*): Self = StObject.set(x, "SupportedTrainingInstanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedTuningJobObjectiveMetrics(value: HyperParameterTuningJobObjectives): Self = StObject.set(x, "SupportedTuningJobObjectiveMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedTuningJobObjectiveMetricsUndefined: Self = StObject.set(x, "SupportedTuningJobObjectiveMetrics", js.undefined)
    
    @scala.inline
    def setSupportedTuningJobObjectiveMetricsVarargs(value: HyperParameterTuningJobObjective*): Self = StObject.set(x, "SupportedTuningJobObjectiveMetrics", js.Array(value :_*))
    
    @scala.inline
    def setSupportsDistributedTraining(value: Boolean): Self = StObject.set(x, "SupportsDistributedTraining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsDistributedTrainingUndefined: Self = StObject.set(x, "SupportsDistributedTraining", js.undefined)
    
    @scala.inline
    def setTrainingChannels(value: ChannelSpecifications): Self = StObject.set(x, "TrainingChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingChannelsVarargs(value: ChannelSpecification*): Self = StObject.set(x, "TrainingChannels", js.Array(value :_*))
    
    @scala.inline
    def setTrainingImage(value: ContainerImage): Self = StObject.set(x, "TrainingImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingImageDigest(value: ImageDigest): Self = StObject.set(x, "TrainingImageDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingImageDigestUndefined: Self = StObject.set(x, "TrainingImageDigest", js.undefined)
  }
}
