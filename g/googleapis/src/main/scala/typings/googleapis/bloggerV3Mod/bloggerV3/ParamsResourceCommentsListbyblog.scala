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
trait ParamsResourceCommentsListbyblog extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * ID of the blog to fetch comments from.
    */
  var blogId: js.UndefOr[String] = js.native
  
  /**
    * Latest date of comment to fetch, a date-time with RFC 3339 formatting.
    */
  var endDate: js.UndefOr[String] = js.native
  
  /**
    * Whether the body content of the comments is included.
    */
  var fetchBodies: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum number of comments to include in the result.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Continuation token if request is paged.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Earliest date of comment to fetch, a date-time with RFC 3339 formatting.
    */
  var startDate: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var status: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourceCommentsListbyblog {
  
  @scala.inline
  def apply(): ParamsResourceCommentsListbyblog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentsListbyblog]
  }
  
  @scala.inline
  implicit class ParamsResourceCommentsListbyblogMutableBuilder[Self <: ParamsResourceCommentsListbyblog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setFetchBodies(value: Boolean): Self = StObject.set(x, "fetchBodies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchBodiesUndefined: Self = StObject.set(x, "fetchBodies", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setStatus(value: js.Array[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: String*): Self = StObject.set(x, "status", js.Array(value :_*))
  }
}
