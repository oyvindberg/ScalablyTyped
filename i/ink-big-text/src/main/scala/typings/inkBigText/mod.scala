package typings.inkBigText

import org.scalablytyped.runtime.Shortcut
import typings.inkBigText.inkBigTextStrings.`3d`
import typings.inkBigText.inkBigTextStrings.black
import typings.inkBigText.inkBigTextStrings.block
import typings.inkBigText.inkBigTextStrings.blue
import typings.inkBigText.inkBigTextStrings.center
import typings.inkBigText.inkBigTextStrings.chrome
import typings.inkBigText.inkBigTextStrings.cyan
import typings.inkBigText.inkBigTextStrings.green
import typings.inkBigText.inkBigTextStrings.grid
import typings.inkBigText.inkBigTextStrings.huge
import typings.inkBigText.inkBigTextStrings.left
import typings.inkBigText.inkBigTextStrings.magenta
import typings.inkBigText.inkBigTextStrings.pallet
import typings.inkBigText.inkBigTextStrings.red
import typings.inkBigText.inkBigTextStrings.right
import typings.inkBigText.inkBigTextStrings.shade
import typings.inkBigText.inkBigTextStrings.simple
import typings.inkBigText.inkBigTextStrings.simple3d
import typings.inkBigText.inkBigTextStrings.simpleBlock
import typings.inkBigText.inkBigTextStrings.slick
import typings.inkBigText.inkBigTextStrings.tiny
import typings.inkBigText.inkBigTextStrings.transparent
import typings.inkBigText.inkBigTextStrings.white
import typings.inkBigText.inkBigTextStrings.yellow
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ink-big-text", JSImport.Namespace)
  @js.native
  val ^ : FC[BigTextProps] = js.native
  
  // note: BigTextProps.colors are based on cfonts (https://github.com/dominikwilkowski/cfonts). I will have commented out
  // some of the accepted inputs. Becuase it also allows for hex colors, I decided to not narrow it down
  // from a string type. A regex would be VERY useful here, but is unfortunately unsupported
  // (see this issue: https://github.com/Microsoft/TypeScript/issues/6579). I will happily update this type if
  // this feature ever gets added! That way the colors[] will be typed as any of the accepted colors OR a valid hex color.
  // However until then, the type will be string.
  // The official cfont docs state the following would be accepted (in addition to any valid hex):
  // type DefinedColors =
  //     | 'system'
  //     | 'black'
  //     | 'red'
  //     | 'green'
  //     | 'yellow'
  //     | 'blue'
  //     | 'magenta'
  //     | 'cyan'
  //     | 'white'
  //     | 'gray'
  //     | 'redBright'
  //     | 'greenBright'
  //     | 'yellowBright'
  //     | 'blueBright'
  //     | 'magentaBright'
  //     | 'cyanBright'
  //     | 'whiteBright';
  @js.native
  trait BigTextProps extends StObject {
    
    var align: js.UndefOr[left | center | right] = js.native
    
    var backgroundColor: js.UndefOr[transparent | black | red | green | yellow | blue | magenta | cyan | white] = js.native
    
    var colors: js.UndefOr[js.Array[String]] = js.native
    
    var font: js.UndefOr[
        block | slick | tiny | grid | pallet | shade | simple | simpleBlock | `3d` | simple3d | chrome | huge
      ] = js.native
    
    var letterSpacing: js.UndefOr[Double] = js.native
    
    var lineHeight: js.UndefOr[Double] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var space: js.UndefOr[Boolean] = js.native
    
    var text: String = js.native
  }
  object BigTextProps {
    
    @scala.inline
    def apply(text: String): BigTextProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[BigTextProps]
    }
    
    @scala.inline
    implicit class BigTextPropsMutableBuilder[Self <: BigTextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: transparent | black | red | green | yellow | blue | magenta | cyan | white): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setFont(
        value: block | slick | tiny | grid | pallet | shade | simple | simpleBlock | `3d` | simple3d | chrome | huge
      ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setSpace(value: Boolean): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[BigTextProps]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FC[BigTextProps] = ^
}
