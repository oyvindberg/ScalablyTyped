package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRightsizingRecommendationResponse extends StObject {
  
  /**
    *  Enables you to customize recommendations across two attributes. You can choose to view recommendations for instances within the same instance families or across different instance families. You can also choose to view your estimated savings associated with recommendations with consideration of existing Savings Plans or RI benefits, or neither. 
    */
  var Configuration: js.UndefOr[RightsizingRecommendationConfiguration] = js.native
  
  /**
    * Information regarding this specific recommendation set.
    */
  var Metadata: js.UndefOr[RightsizingRecommendationMetadata] = js.native
  
  /**
    * The token to retrieve the next set of results.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  
  /**
    * Recommendations to rightsize resources.
    */
  var RightsizingRecommendations: js.UndefOr[RightsizingRecommendationList] = js.native
  
  /**
    * Summary of this recommendation set.
    */
  var Summary: js.UndefOr[RightsizingRecommendationSummary] = js.native
}
object GetRightsizingRecommendationResponse {
  
  @scala.inline
  def apply(): GetRightsizingRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRightsizingRecommendationResponse]
  }
  
  @scala.inline
  implicit class GetRightsizingRecommendationResponseMutableBuilder[Self <: GetRightsizingRecommendationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: RightsizingRecommendationConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    @scala.inline
    def setMetadata(value: RightsizingRecommendationMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setRightsizingRecommendations(value: RightsizingRecommendationList): Self = StObject.set(x, "RightsizingRecommendations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightsizingRecommendationsUndefined: Self = StObject.set(x, "RightsizingRecommendations", js.undefined)
    
    @scala.inline
    def setRightsizingRecommendationsVarargs(value: RightsizingRecommendation*): Self = StObject.set(x, "RightsizingRecommendations", js.Array(value :_*))
    
    @scala.inline
    def setSummary(value: RightsizingRecommendationSummary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "Summary", js.undefined)
  }
}
