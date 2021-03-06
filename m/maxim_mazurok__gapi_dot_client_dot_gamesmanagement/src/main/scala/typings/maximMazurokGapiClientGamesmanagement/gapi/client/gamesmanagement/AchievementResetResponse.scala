package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementResetResponse extends StObject {
  
  /**
    * The current state of the achievement. This is the same as the initial state of the achievement. Possible values are: - "`HIDDEN`"- Achievement is hidden. - "`REVEALED`" -
    * Achievement is revealed. - "`UNLOCKED`" - Achievement is unlocked.
    */
  var currentState: js.UndefOr[String] = js.native
  
  /** The ID of an achievement for which player state has been updated. */
  var definitionId: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#achievementResetResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** Flag to indicate if the requested update actually occurred. */
  var updateOccurred: js.UndefOr[Boolean] = js.native
}
object AchievementResetResponse {
  
  @scala.inline
  def apply(): AchievementResetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementResetResponse]
  }
  
  @scala.inline
  implicit class AchievementResetResponseMutableBuilder[Self <: AchievementResetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentState(value: String): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStateUndefined: Self = StObject.set(x, "currentState", js.undefined)
    
    @scala.inline
    def setDefinitionId(value: String): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionIdUndefined: Self = StObject.set(x, "definitionId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUpdateOccurred(value: Boolean): Self = StObject.set(x, "updateOccurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateOccurredUndefined: Self = StObject.set(x, "updateOccurred", js.undefined)
  }
}
