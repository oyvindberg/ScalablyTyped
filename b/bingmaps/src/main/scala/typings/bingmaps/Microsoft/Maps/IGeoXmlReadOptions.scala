package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoXmlReadOptions extends StObject {
  
  /** Specifies if KML ScreenOverlays should be read or ignored. Default: true */
  var allowKmlScreenOverlays: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies wether the individual waypoint data of a GPX Route or Track should be captured.
    * If set to true, the shape will have a metadata.waypoints property that is an array of
    * pushpins that contains the details of each waypoint along the track. Default: false
    */
  var captureGpxPathWaypoints: js.UndefOr[Boolean] = js.native
  
  /** The default styles to apply to shapes that don't have a defined style in the XML. */
  var defaultStyles: js.UndefOr[IStylesOptions] = js.native
  
  /**
    * A callback function that is triggered when an error occurs when reading an XML document.
    */
  var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  
  /** Specifies if shapes visible tags should be used to set the visible property of it's equivalent Bing Maps shape. Default: true */
  var ignoreVisibility: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximium depth of network links in a KML file. Default: 3
    * Example: when set to 3; file1 links to file2 which links to file3 but won't open links in file3.
    */
  var maxNetworkLinkDepth: js.UndefOr[Double] = js.native
  
  /**
    * The maximium number of network links that a single KML file can have. Default: 10.
    */
  var maxNetworkLinks: js.UndefOr[Double] = js.native
  
  /** Indicates if the pushpin title should be displayed on the map if a valid title or name value exits in the shapes metadata. Default: true */
  var setPushpinTitles: js.UndefOr[Boolean] = js.native
}
object IGeoXmlReadOptions {
  
  @scala.inline
  def apply(): IGeoXmlReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlReadOptions]
  }
  
  @scala.inline
  implicit class IGeoXmlReadOptionsMutableBuilder[Self <: IGeoXmlReadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowKmlScreenOverlays(value: Boolean): Self = StObject.set(x, "allowKmlScreenOverlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowKmlScreenOverlaysUndefined: Self = StObject.set(x, "allowKmlScreenOverlays", js.undefined)
    
    @scala.inline
    def setCaptureGpxPathWaypoints(value: Boolean): Self = StObject.set(x, "captureGpxPathWaypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureGpxPathWaypointsUndefined: Self = StObject.set(x, "captureGpxPathWaypoints", js.undefined)
    
    @scala.inline
    def setDefaultStyles(value: IStylesOptions): Self = StObject.set(x, "defaultStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultStylesUndefined: Self = StObject.set(x, "defaultStyles", js.undefined)
    
    @scala.inline
    def setError(value: /* msg */ String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setIgnoreVisibility(value: Boolean): Self = StObject.set(x, "ignoreVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreVisibilityUndefined: Self = StObject.set(x, "ignoreVisibility", js.undefined)
    
    @scala.inline
    def setMaxNetworkLinkDepth(value: Double): Self = StObject.set(x, "maxNetworkLinkDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNetworkLinkDepthUndefined: Self = StObject.set(x, "maxNetworkLinkDepth", js.undefined)
    
    @scala.inline
    def setMaxNetworkLinks(value: Double): Self = StObject.set(x, "maxNetworkLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNetworkLinksUndefined: Self = StObject.set(x, "maxNetworkLinks", js.undefined)
    
    @scala.inline
    def setSetPushpinTitles(value: Boolean): Self = StObject.set(x, "setPushpinTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPushpinTitlesUndefined: Self = StObject.set(x, "setPushpinTitles", js.undefined)
  }
}
