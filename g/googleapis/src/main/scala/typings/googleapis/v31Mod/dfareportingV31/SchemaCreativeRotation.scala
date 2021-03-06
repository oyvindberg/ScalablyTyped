package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Rotation.
  */
@js.native
trait SchemaCreativeRotation extends StObject {
  
  /**
    * Creative assignments in this creative rotation.
    */
  var creativeAssignments: js.UndefOr[js.Array[SchemaCreativeAssignment]] = js.native
  
  /**
    * Creative optimization configuration that is used by this ad. It should
    * refer to one of the existing optimization configurations in the ad&#39;s
    * campaign. If it is unset or set to 0, then the campaign&#39;s default
    * optimization configuration will be used for this ad.
    */
  var creativeOptimizationConfigurationId: js.UndefOr[String] = js.native
  
  /**
    * Type of creative rotation. Can be used to specify whether to use
    * sequential or random rotation.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Strategy for calculating weights. Used with
    * CREATIVE_ROTATION_TYPE_RANDOM.
    */
  var weightCalculationStrategy: js.UndefOr[String] = js.native
}
object SchemaCreativeRotation {
  
  @scala.inline
  def apply(): SchemaCreativeRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeRotation]
  }
  
  @scala.inline
  implicit class SchemaCreativeRotationMutableBuilder[Self <: SchemaCreativeRotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeAssignments(value: js.Array[SchemaCreativeAssignment]): Self = StObject.set(x, "creativeAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeAssignmentsUndefined: Self = StObject.set(x, "creativeAssignments", js.undefined)
    
    @scala.inline
    def setCreativeAssignmentsVarargs(value: SchemaCreativeAssignment*): Self = StObject.set(x, "creativeAssignments", js.Array(value :_*))
    
    @scala.inline
    def setCreativeOptimizationConfigurationId(value: String): Self = StObject.set(x, "creativeOptimizationConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeOptimizationConfigurationIdUndefined: Self = StObject.set(x, "creativeOptimizationConfigurationId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWeightCalculationStrategy(value: String): Self = StObject.set(x, "weightCalculationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightCalculationStrategyUndefined: Self = StObject.set(x, "weightCalculationStrategy", js.undefined)
  }
}
