package typings.googleapis.gmailV1Mod.gmailV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUsersSettingsSendasSmimeinfoList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The email address that appears in the "From:" header for mail sent using
    * this alias.
    */
  var sendAsEmail: js.UndefOr[String] = js.native
  
  /**
    * The user's email address. The special value me can be used to indicate
    * the authenticated user.
    */
  var userId: js.UndefOr[String] = js.native
}
object ParamsResourceUsersSettingsSendasSmimeinfoList {
  
  @scala.inline
  def apply(): ParamsResourceUsersSettingsSendasSmimeinfoList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSettingsSendasSmimeinfoList]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersSettingsSendasSmimeinfoListMutableBuilder[Self <: ParamsResourceUsersSettingsSendasSmimeinfoList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setSendAsEmail(value: String): Self = StObject.set(x, "sendAsEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAsEmailUndefined: Self = StObject.set(x, "sendAsEmail", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
