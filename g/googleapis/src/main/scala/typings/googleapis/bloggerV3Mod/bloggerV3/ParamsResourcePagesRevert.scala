package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePagesRevert extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the blog.
    */
  var blogId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the page.
    */
  var pageId: js.UndefOr[String] = js.native
}
object ParamsResourcePagesRevert {
  
  @scala.inline
  def apply(): ParamsResourcePagesRevert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagesRevert]
  }
  
  @scala.inline
  implicit class ParamsResourcePagesRevertMutableBuilder[Self <: ParamsResourcePagesRevert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIdUndefined: Self = StObject.set(x, "pageId", js.undefined)
  }
}
