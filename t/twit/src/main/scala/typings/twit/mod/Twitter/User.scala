package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends StObject {
  
  var contributors_enabled: Boolean = js.native
  
  var created_at: String = js.native
  
  var default_profile: String = js.native
  
  var default_profile_image: String = js.native
  
  var description: String = js.native
  
  var entities: Entities = js.native
  
  var favourites_count: Double = js.native
  
  var follow_request_sent: js.UndefOr[Boolean] = js.native
  
  var followers_count: Double = js.native
  
  var following: js.UndefOr[Boolean] = js.native
  
  var friends_count: Double = js.native
  
  var geo_enabled: js.UndefOr[Boolean] = js.native
  
  var id: Double = js.native
  
  var id_str: String = js.native
  
  var is_translator: js.UndefOr[Boolean] = js.native
  
  var lang: String = js.native
  
  var listed_count: Double = js.native
  
  var location: String = js.native
  
  var name: String = js.native
  
  var notifications: js.UndefOr[Boolean] = js.native
  
  var profile_background_color: String = js.native
  
  var profile_background_image_url: String = js.native
  
  var profile_background_image_url_https: String = js.native
  
  var profile_background_tile: Boolean = js.native
  
  var profile_banner_url: String = js.native
  
  var profile_image_url: String = js.native
  
  var profile_image_url_https: String = js.native
  
  var profile_link_color: String = js.native
  
  var profile_sidebar_border_color: String = js.native
  
  var profile_sidebar_fill_color: String = js.native
  
  var profile_text_color: String = js.native
  
  var profile_use_background_image: Boolean = js.native
  
  var `protected`: Boolean = js.native
  
  var screen_name: String = js.native
  
  var show_all_inline_media: Boolean = js.native
  
  var status: js.UndefOr[Status] = js.native
  
  var statuses_count: Double = js.native
  
  var time_zone: js.UndefOr[String] = js.native
  
  var url: String = js.native
  
  var utc_offset: js.UndefOr[Double] = js.native
  
  var verified: Boolean = js.native
  
  var withheld_in_countries: String = js.native
  
  var withheld_scope: String = js.native
}
object User {
  
  @scala.inline
  def apply(
    contributors_enabled: Boolean,
    created_at: String,
    default_profile: String,
    default_profile_image: String,
    description: String,
    entities: Entities,
    favourites_count: Double,
    followers_count: Double,
    friends_count: Double,
    id: Double,
    id_str: String,
    lang: String,
    listed_count: Double,
    location: String,
    name: String,
    profile_background_color: String,
    profile_background_image_url: String,
    profile_background_image_url_https: String,
    profile_background_tile: Boolean,
    profile_banner_url: String,
    profile_image_url: String,
    profile_image_url_https: String,
    profile_link_color: String,
    profile_sidebar_border_color: String,
    profile_sidebar_fill_color: String,
    profile_text_color: String,
    profile_use_background_image: Boolean,
    `protected`: Boolean,
    screen_name: String,
    show_all_inline_media: Boolean,
    statuses_count: Double,
    url: String,
    verified: Boolean,
    withheld_in_countries: String,
    withheld_scope: String
  ): User = {
    val __obj = js.Dynamic.literal(contributors_enabled = contributors_enabled.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], default_profile = default_profile.asInstanceOf[js.Any], default_profile_image = default_profile_image.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], favourites_count = favourites_count.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], friends_count = friends_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], listed_count = listed_count.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile_background_color = profile_background_color.asInstanceOf[js.Any], profile_background_image_url = profile_background_image_url.asInstanceOf[js.Any], profile_background_image_url_https = profile_background_image_url_https.asInstanceOf[js.Any], profile_background_tile = profile_background_tile.asInstanceOf[js.Any], profile_banner_url = profile_banner_url.asInstanceOf[js.Any], profile_image_url = profile_image_url.asInstanceOf[js.Any], profile_image_url_https = profile_image_url_https.asInstanceOf[js.Any], profile_link_color = profile_link_color.asInstanceOf[js.Any], profile_sidebar_border_color = profile_sidebar_border_color.asInstanceOf[js.Any], profile_sidebar_fill_color = profile_sidebar_fill_color.asInstanceOf[js.Any], profile_text_color = profile_text_color.asInstanceOf[js.Any], profile_use_background_image = profile_use_background_image.asInstanceOf[js.Any], screen_name = screen_name.asInstanceOf[js.Any], show_all_inline_media = show_all_inline_media.asInstanceOf[js.Any], statuses_count = statuses_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], withheld_in_countries = withheld_in_countries.asInstanceOf[js.Any], withheld_scope = withheld_scope.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContributors_enabled(value: Boolean): Self = StObject.set(x, "contributors_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_profile(value: String): Self = StObject.set(x, "default_profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_profile_image(value: String): Self = StObject.set(x, "default_profile_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntities(value: Entities): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavourites_count(value: Double): Self = StObject.set(x, "favourites_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollow_request_sent(value: Boolean): Self = StObject.set(x, "follow_request_sent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollow_request_sentUndefined: Self = StObject.set(x, "follow_request_sent", js.undefined)
    
    @scala.inline
    def setFollowers_count(value: Double): Self = StObject.set(x, "followers_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowingUndefined: Self = StObject.set(x, "following", js.undefined)
    
    @scala.inline
    def setFriends_count(value: Double): Self = StObject.set(x, "friends_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeo_enabled(value: Boolean): Self = StObject.set(x, "geo_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeo_enabledUndefined: Self = StObject.set(x, "geo_enabled", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_str(value: String): Self = StObject.set(x, "id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_translator(value: Boolean): Self = StObject.set(x, "is_translator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_translatorUndefined: Self = StObject.set(x, "is_translator", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListed_count(value: Double): Self = StObject.set(x, "listed_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifications(value: Boolean): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    @scala.inline
    def setProfile_background_color(value: String): Self = StObject.set(x, "profile_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_background_image_url(value: String): Self = StObject.set(x, "profile_background_image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_background_image_url_https(value: String): Self = StObject.set(x, "profile_background_image_url_https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_background_tile(value: Boolean): Self = StObject.set(x, "profile_background_tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_banner_url(value: String): Self = StObject.set(x, "profile_banner_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_image_url(value: String): Self = StObject.set(x, "profile_image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_image_url_https(value: String): Self = StObject.set(x, "profile_image_url_https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_link_color(value: String): Self = StObject.set(x, "profile_link_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_sidebar_border_color(value: String): Self = StObject.set(x, "profile_sidebar_border_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_sidebar_fill_color(value: String): Self = StObject.set(x, "profile_sidebar_fill_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_text_color(value: String): Self = StObject.set(x, "profile_text_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_use_background_image(value: Boolean): Self = StObject.set(x, "profile_use_background_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_all_inline_media(value: Boolean): Self = StObject.set(x, "show_all_inline_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStatuses_count(value: Double): Self = StObject.set(x, "statuses_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtc_offset(value: Double): Self = StObject.set(x, "utc_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtc_offsetUndefined: Self = StObject.set(x, "utc_offset", js.undefined)
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithheld_in_countries(value: String): Self = StObject.set(x, "withheld_in_countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithheld_scope(value: String): Self = StObject.set(x, "withheld_scope", value.asInstanceOf[js.Any])
  }
}
