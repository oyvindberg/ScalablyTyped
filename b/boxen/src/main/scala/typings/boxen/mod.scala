package typings.boxen

import typings.boxen.boxenStrings.black
import typings.boxen.boxenStrings.blackBright
import typings.boxen.boxenStrings.blue
import typings.boxen.boxenStrings.blueBright
import typings.boxen.boxenStrings.bold
import typings.boxen.boxenStrings.center
import typings.boxen.boxenStrings.classic
import typings.boxen.boxenStrings.cyan
import typings.boxen.boxenStrings.cyanBright
import typings.boxen.boxenStrings.double
import typings.boxen.boxenStrings.doubleSingle
import typings.boxen.boxenStrings.gray
import typings.boxen.boxenStrings.green
import typings.boxen.boxenStrings.greenBright
import typings.boxen.boxenStrings.grey
import typings.boxen.boxenStrings.left
import typings.boxen.boxenStrings.magenta
import typings.boxen.boxenStrings.magentaBright
import typings.boxen.boxenStrings.red
import typings.boxen.boxenStrings.redBright
import typings.boxen.boxenStrings.right
import typings.boxen.boxenStrings.round
import typings.boxen.boxenStrings.single
import typings.boxen.boxenStrings.singleDouble
import typings.boxen.boxenStrings.white
import typings.boxen.boxenStrings.whiteBright
import typings.boxen.boxenStrings.yellow
import typings.boxen.boxenStrings.yellowBright
import typings.cliBoxes.mod.BoxStyle
import typings.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Creates a box in the terminal.
  	@param text - The text inside the box.
  	@returns The box.
  	@example
  	```
  	import boxen = require('boxen');
  	console.log(boxen('unicorn', {padding: 1}));
  	// ┌─────────────┐
  	// │             │
  	// │   unicorn   │
  	// │             │
  	// └─────────────┘
  	console.log(boxen('unicorn', {padding: 1, margin: 1, borderStyle: 'double'}));
  	//
  	// ╔═════════════╗
  	// ║             ║
  	// ║   unicorn   ║
  	// ║             ║
  	// ╚═════════════╝
  	//
  	```
  	*/
  @JSImport("boxen", JSImport.Namespace)
  @js.native
  def apply(text: String): String = js.native
  @JSImport("boxen", JSImport.Namespace)
  @js.native
  def apply(text: String, options: Options): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.boxen.boxenStrings.single
    - typings.boxen.boxenStrings.double
    - typings.boxen.boxenStrings.round
    - typings.boxen.boxenStrings.bold
    - typings.boxen.boxenStrings.singleDouble
    - typings.boxen.boxenStrings.doubleSingle
    - typings.boxen.boxenStrings.classic
  */
  trait BorderStyle extends StObject
  object BorderStyle {
    
    /**
    	Border styles from [`cli-boxes`](https://github.com/sindresorhus/cli-boxes).
    	*/
    @JSImport("boxen", "BorderStyle")
    @js.native
    val ^ : /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BorderStyle */ js.Any = js.native
    
    @scala.inline
    def Bold: bold = "bold".asInstanceOf[bold]
    
    @scala.inline
    def Classic: classic = "classic".asInstanceOf[classic]
    
    @scala.inline
    def Double: double = "double".asInstanceOf[double]
    
    @scala.inline
    def DoubleSingle: doubleSingle = "doubleSingle".asInstanceOf[doubleSingle]
    
    @scala.inline
    def Round: round = "round".asInstanceOf[round]
    
    @scala.inline
    def Single: single = "single".asInstanceOf[single]
    
    @scala.inline
    def SingleDouble: singleDouble = "singleDouble".asInstanceOf[singleDouble]
  }
  
  /**
  	Characters used for custom border.
  	@example
  	```
  	// affffb
  	// e    e
  	// dffffc
  	const border: CustomBorderStyle = {
  		topLeft: 'a',
  		topRight: 'b',
  		bottomRight: 'c',
  		bottomLeft: 'd',
  		vertical: 'e',
  		horizontal: 'f'
  	};
  	```
  	*/
  type CustomBorderStyle = BoxStyle
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Align the text in the box based on the widest line.
    		@default 'left'
    		*/
    val align: js.UndefOr[left | right | center] = js.native
    
    /**
    		Color of the background.
    		*/
    val backgroundColor: js.UndefOr[
        LiteralUnion[
          black | red | green | yellow | blue | magenta | cyan | white | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
          String
        ]
      ] = js.native
    
    /**
    		Color of the box border.
    		*/
    val borderColor: js.UndefOr[
        LiteralUnion[
          black | red | green | yellow | blue | magenta | cyan | white | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
          String
        ]
      ] = js.native
    
    /**
    		Style of the box border.
    		@default BorderStyle.Single
    		*/
    val borderStyle: js.UndefOr[BorderStyle | CustomBorderStyle] = js.native
    
    /**
    		Reduce opacity of the border.
    		@default false
    		*/
    val dimBorder: js.UndefOr[Boolean] = js.native
    
    /**
    		Float the box on the available terminal screen space.
    		@default 'left'
    		*/
    val float: js.UndefOr[left | right | center] = js.native
    
    /**
    		Space around the box.
    		@default 0
    		*/
    val margin: js.UndefOr[Double | Spacing] = js.native
    
    /**
    		Space between the text and box border.
    		@default 0
    		*/
    val padding: js.UndefOr[Double | Spacing] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: left | right | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setBackgroundColor(
        value: LiteralUnion[
              black | red | green | yellow | blue | magenta | cyan | white | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
              String
            ]
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorderColor(
        value: LiteralUnion[
              black | red | green | yellow | blue | magenta | cyan | white | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
              String
            ]
      ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderStyle(value: BorderStyle | CustomBorderStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      @scala.inline
      def setDimBorder(value: Boolean): Self = StObject.set(x, "dimBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimBorderUndefined: Self = StObject.set(x, "dimBorder", js.undefined)
      
      @scala.inline
      def setFloat(value: left | right | center): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setMargin(value: Double | Spacing): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | Spacing): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  /**
  	Spacing used for `padding` and `margin`.
  	*/
  @js.native
  trait Spacing extends StObject {
    
    val bottom: Double = js.native
    
    val left: Double = js.native
    
    val right: Double = js.native
    
    val top: Double = js.native
  }
  object Spacing {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Spacing = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spacing]
    }
    
    @scala.inline
    implicit class SpacingMutableBuilder[Self <: Spacing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
