package typings.rotJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type DisplayData = js.Tuple5[Double, Double, String | js.Array[String] | Null, String, String]
  
  @js.native
  trait DisplayOptions extends StObject {
    
    var bg: String = js.native
    
    var border: Double = js.native
    
    var fg: String = js.native
    
    var fontFamily: String = js.native
    
    var fontSize: Double = js.native
    
    var fontStyle: String = js.native
    
    var forceSquareRatio: Boolean = js.native
    
    var height: Double = js.native
    
    var layout: LayoutType = js.native
    
    var spacing: Double = js.native
    
    var tileColorize: Boolean = js.native
    
    var tileHeight: Double = js.native
    
    var tileMap: StringDictionary[js.Tuple2[Double, Double]] = js.native
    
    var tileSet: Null | HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap = js.native
    
    var tileWidth: Double = js.native
    
    var transpose: Boolean = js.native
    
    var width: Double = js.native
  }
  object DisplayOptions {
    
    @scala.inline
    def apply(
      bg: String,
      border: Double,
      fg: String,
      fontFamily: String,
      fontSize: Double,
      fontStyle: String,
      forceSquareRatio: Boolean,
      height: Double,
      layout: LayoutType,
      spacing: Double,
      tileColorize: Boolean,
      tileHeight: Double,
      tileMap: StringDictionary[js.Tuple2[Double, Double]],
      tileWidth: Double,
      transpose: Boolean,
      width: Double
    ): DisplayOptions = {
      val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], fg = fg.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], forceSquareRatio = forceSquareRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], tileColorize = tileColorize.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileMap = tileMap.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], transpose = transpose.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayOptions]
    }
    
    @scala.inline
    implicit class DisplayOptionsMutableBuilder[Self <: DisplayOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorder(value: Double): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceSquareRatio(value: Boolean): Self = StObject.set(x, "forceSquareRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: LayoutType): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileColorize(value: Boolean): Self = StObject.set(x, "tileColorize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileMap(value: StringDictionary[js.Tuple2[Double, Double]]): Self = StObject.set(x, "tileMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileSet(value: HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap): Self = StObject.set(x, "tileSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileSetNull: Self = StObject.set(x, "tileSet", null)
      
      @scala.inline
      def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranspose(value: Boolean): Self = StObject.set(x, "transpose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rotJs.rotJsStrings.hex
    - typings.rotJs.rotJsStrings.rect
    - typings.rotJs.rotJsStrings.tile
    - typings.rotJs.rotJsStrings.`tile-gl`
    - typings.rotJs.rotJsStrings.term
  */
  trait LayoutType extends StObject
  object LayoutType {
    
    @scala.inline
    def hex: typings.rotJs.rotJsStrings.hex = "hex".asInstanceOf[typings.rotJs.rotJsStrings.hex]
    
    @scala.inline
    def rect: typings.rotJs.rotJsStrings.rect = "rect".asInstanceOf[typings.rotJs.rotJsStrings.rect]
    
    @scala.inline
    def term: typings.rotJs.rotJsStrings.term = "term".asInstanceOf[typings.rotJs.rotJsStrings.term]
    
    @scala.inline
    def tile: typings.rotJs.rotJsStrings.tile = "tile".asInstanceOf[typings.rotJs.rotJsStrings.tile]
    
    @scala.inline
    def `tile-gl`: typings.rotJs.rotJsStrings.`tile-gl` = "tile-gl".asInstanceOf[typings.rotJs.rotJsStrings.`tile-gl`]
  }
}
