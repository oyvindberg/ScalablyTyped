package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheDetails extends StObject {
  
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  
  /** Etag */
  var eTag: String = js.native
  
  /**
    * Expiration time of the cache entry.
    *
    * _(Format not documente but assumingly ISO 8601 -
    * `YYYY-MM-DDThh:mm:ss.sTZD`)_
    */
  var expires: js.UndefOr[String] = js.native
  
  /** The number of times the cache entry has been opened. */
  var hitCount: Double = js.native
  
  /**
    * The last time the cache entry was opened.
    *
    * _(Format not documente but assumingly ISO 8601 -
    * `YYYY-MM-DDThh:mm:ss.sTZD`)_
    */
  var lastAccess: String = js.native
}
object CacheDetails {
  
  @scala.inline
  def apply(eTag: String, hitCount: Double, lastAccess: String): CacheDetails = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], hitCount = hitCount.asInstanceOf[js.Any], lastAccess = lastAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheDetails]
  }
  
  @scala.inline
  implicit class CacheDetailsMutableBuilder[Self <: CacheDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setHitCount(value: Double): Self = StObject.set(x, "hitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccess(value: String): Self = StObject.set(x, "lastAccess", value.asInstanceOf[js.Any])
  }
}
