package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResultSnippet extends StObject {
  
  /** The value that YouTube uses to uniquely identify the channel that published the resource that the search result identifies. */
  var channelId: js.UndefOr[String] = js.native
  
  /** The title of the channel that published the resource that the search result identifies. */
  var channelTitle: js.UndefOr[String] = js.native
  
  /** A description of the search result. */
  var description: js.UndefOr[String] = js.native
  
  /** It indicates if the resource (video or channel) has upcoming/active live broadcast content. Or it's "none" if there is not any upcoming/active live broadcasts. */
  var liveBroadcastContent: js.UndefOr[String] = js.native
  
  /** The creation date and time of the resource that the search result identifies. The value is specified in ISO 8601 format. */
  var publishedAt: js.UndefOr[String] = js.native
  
  /**
    * A map of thumbnail images associated with the search result. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other
    * information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.native
  
  /** The title of the search result. */
  var title: js.UndefOr[String] = js.native
}
object SearchResultSnippet {
  
  @scala.inline
  def apply(): SearchResultSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResultSnippet]
  }
  
  @scala.inline
  implicit class SearchResultSnippetMutableBuilder[Self <: SearchResultSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLiveBroadcastContent(value: String): Self = StObject.set(x, "liveBroadcastContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveBroadcastContentUndefined: Self = StObject.set(x, "liveBroadcastContent", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    @scala.inline
    def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
