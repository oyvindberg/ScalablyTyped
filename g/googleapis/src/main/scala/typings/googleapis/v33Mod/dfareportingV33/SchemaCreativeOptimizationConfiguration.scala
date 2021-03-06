package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative optimization settings.
  */
@js.native
trait SchemaCreativeOptimizationConfiguration extends StObject {
  
  /**
    * ID of this creative optimization config. This field is auto-generated
    * when the campaign is inserted or updated. It can be null for existing
    * campaigns.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Name of this creative optimization config. This is a required field and
    * must be less than 129 characters long.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * List of optimization activities associated with this configuration.
    */
  var optimizationActivitys: js.UndefOr[js.Array[SchemaOptimizationActivity]] = js.native
  
  /**
    * Optimization model for this configuration.
    */
  var optimizationModel: js.UndefOr[String] = js.native
}
object SchemaCreativeOptimizationConfiguration {
  
  @scala.inline
  def apply(): SchemaCreativeOptimizationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeOptimizationConfiguration]
  }
  
  @scala.inline
  implicit class SchemaCreativeOptimizationConfigurationMutableBuilder[Self <: SchemaCreativeOptimizationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptimizationActivitys(value: js.Array[SchemaOptimizationActivity]): Self = StObject.set(x, "optimizationActivitys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizationActivitysUndefined: Self = StObject.set(x, "optimizationActivitys", js.undefined)
    
    @scala.inline
    def setOptimizationActivitysVarargs(value: SchemaOptimizationActivity*): Self = StObject.set(x, "optimizationActivitys", js.Array(value :_*))
    
    @scala.inline
    def setOptimizationModel(value: String): Self = StObject.set(x, "optimizationModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizationModelUndefined: Self = StObject.set(x, "optimizationModel", js.undefined)
  }
}
