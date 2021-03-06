package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyline extends Overlay {
  
  def addEventListener(event: String, handler: Callback): Unit = js.native
  
  def disableEditing(): Unit = js.native
  
  def disableMassClear(): Unit = js.native
  
  def enableEditing(): Unit = js.native
  
  def enableMassClear(): Unit = js.native
  
  def getBounds(): Bounds = js.native
  
  def getFillColor(): String = js.native
  
  def getFillOpacity(): Double = js.native
  
  def getMap(): Map = js.native
  
  def getPath(): js.Array[Point] = js.native
  
  def getStrokeColor(): String = js.native
  
  def getStrokeOpacity(): Double = js.native
  
  def getStrokeStyle(): String = js.native
  
  def getStrokeWeight(): Double = js.native
  
  def onclick(event: Target): Unit = js.native
  
  def ondblclick(event: typings.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  def onlineupdate(event: Target): Unit = js.native
  
  def onmousedown(event: typings.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  def onmouseout(event: typings.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  def onmouseover(event: typings.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  def onmouseup(event: typings.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  def onremove(event: Target): Unit = js.native
  
  def removeEventListener(event: String, handler: Callback): Unit = js.native
  
  def setFillColor(color: String): Unit = js.native
  
  def setFillOpacity(opacity: Double): Unit = js.native
  
  def setPath(path: js.Array[Point]): Unit = js.native
  
  def setPointAt(index: Double, point: Point): Unit = js.native
  
  def setPositionAt(index: Double, point: Point): Unit = js.native
  
  def setStrokeColor(color: String): Unit = js.native
  
  def setStrokeOpacity(opacity: Double): Unit = js.native
  
  def setStrokeStyle(style: String): Unit = js.native
  
  def setStrokeWeight(weight: Double): Unit = js.native
}
object Polyline {
  
  @scala.inline
  def apply(
    addEventListener: (String, Callback) => Unit,
    disableEditing: () => Unit,
    disableMassClear: () => Unit,
    enableEditing: () => Unit,
    enableMassClear: () => Unit,
    getBounds: () => Bounds,
    getFillColor: () => String,
    getFillOpacity: () => Double,
    getMap: () => Map,
    getPath: () => js.Array[Point],
    getStrokeColor: () => String,
    getStrokeOpacity: () => Double,
    getStrokeStyle: () => String,
    getStrokeWeight: () => Double,
    onclick: Target => Unit,
    ondblclick: typings.baidumapWebSdk.anon.Pixel => Unit,
    onlineupdate: Target => Unit,
    onmousedown: typings.baidumapWebSdk.anon.Pixel => Unit,
    onmouseout: typings.baidumapWebSdk.anon.Pixel => Unit,
    onmouseover: typings.baidumapWebSdk.anon.Pixel => Unit,
    onmouseup: typings.baidumapWebSdk.anon.Pixel => Unit,
    onremove: Target => Unit,
    removeEventListener: (String, Callback) => Unit,
    setFillColor: String => Unit,
    setFillOpacity: Double => Unit,
    setPath: js.Array[Point] => Unit,
    setPointAt: (Double, Point) => Unit,
    setPositionAt: (Double, Point) => Unit,
    setStrokeColor: String => Unit,
    setStrokeOpacity: Double => Unit,
    setStrokeStyle: String => Unit,
    setStrokeWeight: Double => Unit
  ): Polyline = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), disableEditing = js.Any.fromFunction0(disableEditing), disableMassClear = js.Any.fromFunction0(disableMassClear), enableEditing = js.Any.fromFunction0(enableEditing), enableMassClear = js.Any.fromFunction0(enableMassClear), getBounds = js.Any.fromFunction0(getBounds), getFillColor = js.Any.fromFunction0(getFillColor), getFillOpacity = js.Any.fromFunction0(getFillOpacity), getMap = js.Any.fromFunction0(getMap), getPath = js.Any.fromFunction0(getPath), getStrokeColor = js.Any.fromFunction0(getStrokeColor), getStrokeOpacity = js.Any.fromFunction0(getStrokeOpacity), getStrokeStyle = js.Any.fromFunction0(getStrokeStyle), getStrokeWeight = js.Any.fromFunction0(getStrokeWeight), onclick = js.Any.fromFunction1(onclick), ondblclick = js.Any.fromFunction1(ondblclick), onlineupdate = js.Any.fromFunction1(onlineupdate), onmousedown = js.Any.fromFunction1(onmousedown), onmouseout = js.Any.fromFunction1(onmouseout), onmouseover = js.Any.fromFunction1(onmouseover), onmouseup = js.Any.fromFunction1(onmouseup), onremove = js.Any.fromFunction1(onremove), removeEventListener = js.Any.fromFunction2(removeEventListener), setFillColor = js.Any.fromFunction1(setFillColor), setFillOpacity = js.Any.fromFunction1(setFillOpacity), setPath = js.Any.fromFunction1(setPath), setPointAt = js.Any.fromFunction2(setPointAt), setPositionAt = js.Any.fromFunction2(setPositionAt), setStrokeColor = js.Any.fromFunction1(setStrokeColor), setStrokeOpacity = js.Any.fromFunction1(setStrokeOpacity), setStrokeStyle = js.Any.fromFunction1(setStrokeStyle), setStrokeWeight = js.Any.fromFunction1(setStrokeWeight))
    __obj.asInstanceOf[Polyline]
  }
  
  @scala.inline
  implicit class PolylineMutableBuilder[Self <: Polyline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEventListener(value: (String, Callback) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDisableEditing(value: () => Unit): Self = StObject.set(x, "disableEditing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableMassClear(value: () => Unit): Self = StObject.set(x, "disableMassClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableEditing(value: () => Unit): Self = StObject.set(x, "enableEditing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableMassClear(value: () => Unit): Self = StObject.set(x, "enableMassClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBounds(value: () => Bounds): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFillColor(value: () => String): Self = StObject.set(x, "getFillColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFillOpacity(value: () => Double): Self = StObject.set(x, "getFillOpacity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMap(value: () => Map): Self = StObject.set(x, "getMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPath(value: () => js.Array[Point]): Self = StObject.set(x, "getPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStrokeColor(value: () => String): Self = StObject.set(x, "getStrokeColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStrokeOpacity(value: () => Double): Self = StObject.set(x, "getStrokeOpacity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStrokeStyle(value: () => String): Self = StObject.set(x, "getStrokeStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStrokeWeight(value: () => Double): Self = StObject.set(x, "getStrokeWeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnclick(value: Target => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOndblclick(value: typings.baidumapWebSdk.anon.Pixel => Unit): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnlineupdate(value: Target => Unit): Self = StObject.set(x, "onlineupdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmousedown(value: typings.baidumapWebSdk.anon.Pixel => Unit): Self = StObject.set(x, "onmousedown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseout(value: typings.baidumapWebSdk.anon.Pixel => Unit): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseover(value: typings.baidumapWebSdk.anon.Pixel => Unit): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseup(value: typings.baidumapWebSdk.anon.Pixel => Unit): Self = StObject.set(x, "onmouseup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnremove(value: Target => Unit): Self = StObject.set(x, "onremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveEventListener(value: (String, Callback) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetFillColor(value: String => Unit): Self = StObject.set(x, "setFillColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFillOpacity(value: Double => Unit): Self = StObject.set(x, "setFillOpacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPath(value: js.Array[Point] => Unit): Self = StObject.set(x, "setPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPointAt(value: (Double, Point) => Unit): Self = StObject.set(x, "setPointAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPositionAt(value: (Double, Point) => Unit): Self = StObject.set(x, "setPositionAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetStrokeColor(value: String => Unit): Self = StObject.set(x, "setStrokeColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStrokeOpacity(value: Double => Unit): Self = StObject.set(x, "setStrokeOpacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStrokeStyle(value: String => Unit): Self = StObject.set(x, "setStrokeStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStrokeWeight(value: Double => Unit): Self = StObject.set(x, "setStrokeWeight", js.Any.fromFunction1(value))
  }
}
