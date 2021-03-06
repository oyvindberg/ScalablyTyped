package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlModel extends KmlAltitudeGeometry {
  
  /**
    * Returns the link of the collada model.
    */
  def getLink(): KmlLink = js.native
  
  /**
    * Specifies the exact coordinates of the Model's origin in latitude, longitude, and altitude.
    * Latitude and longitude measurements are standard lat-lon projection with WGS84 datum.
    * Altitude is distance above the earth's surface, in meters, and is interpreted according to altitudeMode.
    */
  def getLocation(): KmlLocation = js.native
  
  /**
    * Describes rotation of a 3D model's coordinate system to position the object in Google Earth.
    */
  def getOrientation(): KmlOrientation = js.native
  
  /**
    * Scales a model along the x, y, and z axes in the model's coordinate space
    */
  def getScale(): KmlScale = js.native
  
  /**
    * Sets the link of the collada model.
    */
  def setLink(link: KmlLink): Unit = js.native
  
  /**
    * Specifies the exact coordinates of the Model's origin in latitude, longitude, and altitude.
    * Latitude and longitude measurements are standard lat-lon projection with WGS84 datum.
    * Altitude is distance above the earth's surface, in meters, and is interpreted according to altitudeMode.
    */
  def setLocation(location: KmlLocation): Unit = js.native
  
  /**
    * Describes rotation of a 3D model's coordinate system to position the object in Google Earth.
    */
  def setOrientation(orientation: KmlOrientation): Unit = js.native
  
  /**
    * Scales a model along the x, y, and z axes in the model's coordinate space
    */
  def setScale(scale: KmlScale): Unit = js.native
}
object KmlModel {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getAltitudeMode: () => KmlAltitudeModeEnum,
    getId: () => String,
    getLink: () => KmlLink,
    getLocation: () => KmlLocation,
    getOrientation: () => KmlOrientation,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getScale: () => KmlScale,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setAltitudeMode: KmlAltitudeModeEnum => Unit,
    setLink: KmlLink => Unit,
    setLocation: KmlLocation => Unit,
    setOrientation: KmlOrientation => Unit,
    setScale: KmlScale => Unit
  ): KmlModel = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getAltitudeMode = js.Any.fromFunction0(getAltitudeMode), getId = js.Any.fromFunction0(getId), getLink = js.Any.fromFunction0(getLink), getLocation = js.Any.fromFunction0(getLocation), getOrientation = js.Any.fromFunction0(getOrientation), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getScale = js.Any.fromFunction0(getScale), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode), setLink = js.Any.fromFunction1(setLink), setLocation = js.Any.fromFunction1(setLocation), setOrientation = js.Any.fromFunction1(setOrientation), setScale = js.Any.fromFunction1(setScale))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlModel]
  }
  
  @scala.inline
  implicit class KmlModelMutableBuilder[Self <: KmlModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLink(value: () => KmlLink): Self = StObject.set(x, "getLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocation(value: () => KmlLocation): Self = StObject.set(x, "getLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOrientation(value: () => KmlOrientation): Self = StObject.set(x, "getOrientation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScale(value: () => KmlScale): Self = StObject.set(x, "getScale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLink(value: KmlLink => Unit): Self = StObject.set(x, "setLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLocation(value: KmlLocation => Unit): Self = StObject.set(x, "setLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOrientation(value: KmlOrientation => Unit): Self = StObject.set(x, "setOrientation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScale(value: KmlScale => Unit): Self = StObject.set(x, "setScale", js.Any.fromFunction1(value))
  }
}
