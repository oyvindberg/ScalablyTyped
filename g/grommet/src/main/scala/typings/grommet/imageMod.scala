package typings.grommet

import typings.grommet.grommetStrings.contain
import typings.grommet.grommetStrings.cover
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.strong
import typings.grommet.grommetStrings.weak
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.FillType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.ImgHTMLAttributes
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("grommet/components/Image", "Image")
  @js.native
  val Image: FC[
    ImageProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
  ] = js.native
  
  @js.native
  trait ImageProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var fallback: js.UndefOr[String] = js.native
    
    var fill: js.UndefOr[FillType] = js.native
    
    var fit: js.UndefOr[cover | contain] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    var opacity: js.UndefOr[weak | medium | strong | String | Boolean] = js.native
  }
  object ImageProps {
    
    @scala.inline
    def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
    
    @scala.inline
    implicit class ImagePropsMutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setFill(value: FillType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFit(value: cover | contain): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOpacity(value: weak | medium | strong | String | Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
}
