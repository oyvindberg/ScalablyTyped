package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAchievementsReveal extends StandardParameters {
  
  /**
    * The ID of the achievement used by this method.
    */
  var achievementId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
}
object ParamsResourceAchievementsReveal {
  
  @scala.inline
  def apply(): ParamsResourceAchievementsReveal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAchievementsReveal]
  }
  
  @scala.inline
  implicit class ParamsResourceAchievementsRevealMutableBuilder[Self <: ParamsResourceAchievementsReveal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAchievementId(value: String): Self = StObject.set(x, "achievementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAchievementIdUndefined: Self = StObject.set(x, "achievementId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
  }
}
