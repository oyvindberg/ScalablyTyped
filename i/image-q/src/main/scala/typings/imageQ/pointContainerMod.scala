package typings.imageQ

import typings.imageQ.pointMod.Point
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointContainerMod {
  
  @JSImport("image-q/dist/utils/pointContainer", "PointContainer")
  @js.native
  class PointContainer () extends StObject {
    
    var _height: js.Any = js.native
    
    val _pointArray: js.Any = js.native
    
    var _width: js.Any = js.native
    
    def getHeight(): Double = js.native
    
    def getPointArray(): js.Array[Point] = js.native
    
    def getWidth(): Double = js.native
    
    def setHeight(height: Double): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
    
    def toUint32Array(): Uint32Array = js.native
    
    def toUint8Array(): Uint8Array = js.native
  }
  /* static members */
  object PointContainer {
    
    @JSImport("image-q/dist/utils/pointContainer", "PointContainer.fromArray")
    @js.native
    def fromArray(byteArray: js.Array[Double], width: Double, height: Double): PointContainer = js.native
    
    @JSImport("image-q/dist/utils/pointContainer", "PointContainer.fromCanvasPixelArray")
    @js.native
    def fromCanvasPixelArray(data: js.Any, width: Double, height: Double): PointContainer = js.native
    
    @JSImport("image-q/dist/utils/pointContainer", "PointContainer.fromHTMLCanvasElement")
    @js.native
    def fromHTMLCanvasElement(canvas: HTMLCanvasElement): PointContainer = js.native
    
    @JSImport("image-q/dist/utils/pointContainer", "PointContainer.fromHTMLImageElement")
    @js.native
    def fromHTMLImageElement(img: HTMLImageElement): PointContainer = js.native
    
    @JSImport("image-q/dist/utils/pointContainer", "PointContainer.fromImageData")
    @js.native
    def fromImageData(imageData: ImageData): PointContainer = js.native
    
    @JSImport("image-q/dist/utils/pointContainer", "PointContainer.fromNodeCanvas")
    @js.native
    def fromNodeCanvas(canvas: js.Any): PointContainer = js.native
    
    @JSImport("image-q/dist/utils/pointContainer", "PointContainer.fromUint32Array")
    @js.native
    def fromUint32Array(uint32array: Uint32Array, width: Double, height: Double): PointContainer = js.native
    
    @JSImport("image-q/dist/utils/pointContainer", "PointContainer.fromUint8Array")
    @js.native
    def fromUint8Array(uint8array: Uint8Array, width: Double, height: Double): PointContainer = js.native
  }
}
