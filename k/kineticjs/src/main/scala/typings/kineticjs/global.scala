package typings.kineticjs

import typings.kineticjs.Kinetic.CircleConfig
import typings.kineticjs.Kinetic.IAnimation
import typings.kineticjs.Kinetic.ICircle
import typings.kineticjs.Kinetic.ICollection
import typings.kineticjs.Kinetic.IContainer
import typings.kineticjs.Kinetic.IEllipse
import typings.kineticjs.Kinetic.IImage
import typings.kineticjs.Kinetic.ILayer
import typings.kineticjs.Kinetic.ILine
import typings.kineticjs.Kinetic.INode
import typings.kineticjs.Kinetic.IPath
import typings.kineticjs.Kinetic.IRect
import typings.kineticjs.Kinetic.IRegularPolygon
import typings.kineticjs.Kinetic.IShape
import typings.kineticjs.Kinetic.ISprite
import typings.kineticjs.Kinetic.IStage
import typings.kineticjs.Kinetic.IStar
import typings.kineticjs.Kinetic.IText
import typings.kineticjs.Kinetic.ITextPath
import typings.kineticjs.Kinetic.ImageConfig
import typings.kineticjs.Kinetic.LayerConfig
import typings.kineticjs.Kinetic.LineConfig
import typings.kineticjs.Kinetic.ObjectOptionsConfig
import typings.kineticjs.Kinetic.PathConfig
import typings.kineticjs.Kinetic.RectConfig
import typings.kineticjs.Kinetic.RegularPolygonConfig
import typings.kineticjs.Kinetic.SpriteConfig
import typings.kineticjs.Kinetic.StageConfig
import typings.kineticjs.Kinetic.StarConfig
import typings.kineticjs.Kinetic.TextConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Kinetic {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Animation")
    @js.native
    class Animation protected () extends IAnimation {
      def this(args: js.Any*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Circle")
    @js.native
    class Circle protected () extends ICircle {
      def this(config: CircleConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Collection")
    @js.native
    class Collection () extends ICollection
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Container")
    @js.native
    class Container protected () extends IContainer {
      def this(config: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Ellipse")
    @js.native
    class Ellipse protected () extends IEllipse {
      def this(config: CircleConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Group")
    @js.native
    class Group () extends IContainer {
      def this(config: ObjectOptionsConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Image")
    @js.native
    class Image () extends IImage {
      def this(config: ImageConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Layer")
    @js.native
    class Layer () extends ILayer {
      def this(config: LayerConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Line")
    @js.native
    class Line protected () extends ILine {
      def this(config: LineConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Node")
    @js.native
    class Node protected () extends INode {
      def this(config: ObjectOptionsConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Path")
    @js.native
    class Path protected () extends IPath {
      def this(config: PathConfig) = this()
    }
    object Path {
      
      @JSGlobal("Kinetic.Path.parsePathData")
      @js.native
      def parsePathData(data: String): js.Any = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Rect")
    @js.native
    class Rect protected () extends IRect {
      def this(config: RectConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.RegularPolygon")
    @js.native
    class RegularPolygon protected () extends IRegularPolygon {
      def this(config: RegularPolygonConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Shape")
    @js.native
    class Shape protected () extends IShape {
      def this(config: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Sprite")
    @js.native
    class Sprite protected () extends ISprite {
      def this(config: SpriteConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Stage")
    @js.native
    class Stage protected () extends IStage {
      def this(config: StageConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Star")
    @js.native
    class Star protected () extends IStar {
      def this(config: StarConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Text")
    @js.native
    class Text protected () extends IText {
      def this(config: TextConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.TextPath")
    @js.native
    class TextPath protected () extends ITextPath {
      def this(config: js.Any) = this()
    }
  }
}
