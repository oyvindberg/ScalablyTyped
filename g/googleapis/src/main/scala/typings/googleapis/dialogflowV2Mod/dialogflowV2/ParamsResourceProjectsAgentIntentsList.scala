package typings.googleapis.dialogflowV2Mod.dialogflowV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsAgentIntentsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional. The resource view to apply to the returned intent.
    */
  var intentView: js.UndefOr[String] = js.native
  
  /**
    * Optional. The language to list training phrases, parameters and rich
    * messages for. If not specified, the agent's default language is used.
    * [Many
    * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they
    * can be used.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Optional. The maximum number of items to return in a single page. By
    * default 100 and at most 1000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional. The next_page_token value returned from a previous list
    * request.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Required. The agent to list all intents from. Format: `projects/<Project
    * ID>/agent`.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsAgentIntentsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsAgentIntentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentIntentsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsAgentIntentsListMutableBuilder[Self <: ParamsResourceProjectsAgentIntentsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIntentView(value: String): Self = StObject.set(x, "intentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentViewUndefined: Self = StObject.set(x, "intentView", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
