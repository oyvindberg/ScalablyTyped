package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about a playlist, including title, description and
  * thumbnails.
  */
@js.native
trait SchemaPlaylistSnippet extends StObject {
  
  /**
    * The ID that YouTube uses to uniquely identify the channel that published
    * the playlist.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * The channel title of the channel that the video belongs to.
    */
  var channelTitle: js.UndefOr[String] = js.native
  
  /**
    * The language of the playlist&#39;s default title and description.
    */
  var defaultLanguage: js.UndefOr[String] = js.native
  
  /**
    * The playlist&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Localized title and description, read-only.
    */
  var localized: js.UndefOr[SchemaPlaylistLocalization] = js.native
  
  /**
    * The date and time that the playlist was created. The value is specified
    * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  
  /**
    * Keyword tags associated with the playlist.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A map of thumbnail images associated with the playlist. For each object
    * in the map, the key is the name of the thumbnail image, and the value is
    * an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.native
  
  /**
    * The playlist&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaPlaylistSnippet {
  
  @scala.inline
  def apply(): SchemaPlaylistSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistSnippet]
  }
  
  @scala.inline
  implicit class SchemaPlaylistSnippetMutableBuilder[Self <: SchemaPlaylistSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
    
    @scala.inline
    def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLocalized(value: SchemaPlaylistLocalization): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setThumbnails(value: SchemaThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
