package typings.vegaLite

import typings.vegaLite.anon.Bottom
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.parameterMod.Parameter
import typings.vegaLite.specBaseMod.BaseSpec
import typings.vegaLite.srcDataMod.InlineDataset
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.content
import typings.vegaLite.vegaLiteStrings.height
import typings.vegaLite.vegaLiteStrings.padding
import typings.vegaLite.vegaLiteStrings.width
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toplevelMod {
  
  @JSImport("vega-lite/build/src/spec/toplevel", "extractTopLevelProperties")
  @js.native
  def extractTopLevelProperties(t: TopLevelProperties[ExprRef | SignalRef], includeParams: Boolean): TopLevelProperties[SignalRef] = js.native
  
  @JSImport("vega-lite/build/src/spec/toplevel", "getFitType")
  @js.native
  def getFitType(): FitType = js.native
  @JSImport("vega-lite/build/src/spec/toplevel", "getFitType")
  @js.native
  def getFitType_height(sizeType: height): FitType = js.native
  @JSImport("vega-lite/build/src/spec/toplevel", "getFitType")
  @js.native
  def getFitType_width(sizeType: width): FitType = js.native
  
  @JSImport("vega-lite/build/src/spec/toplevel", "isFitType")
  @js.native
  def isFitType(autoSizeType: AutosizeType): /* is vega-lite.vega-lite/build/src/spec/toplevel.FitType */ Boolean = js.native
  
  @js.native
  trait AutoSizeParams extends StObject {
    
    /**
      * Determines how size calculation should be performed, one of `"content"` or `"padding"`. The default setting (`"content"`) interprets the width and height settings as the data rectangle (plotting) dimensions, to which padding is then added. In contrast, the `"padding"` setting includes the padding within the view size calculations, such that the width and height settings indicate the **total** intended size of the view.
      *
      * __Default value__: `"content"`
      */
    var contains: js.UndefOr[content | padding] = js.native
    
    /**
      * A boolean flag indicating if autosize layout should be re-calculated on every view update.
      *
      * __Default value__: `false`
      */
    var resize: js.UndefOr[Boolean] = js.native
    
    /**
      * The sizing format type. One of `"pad"`, `"fit"`, `"fit-x"`, `"fit-y"`,  or `"none"`. See the [autosize type](https://vega.github.io/vega-lite/docs/size.html#autosize) documentation for descriptions of each.
      *
      * __Default value__: `"pad"`
      */
    var `type`: js.UndefOr[AutosizeType] = js.native
  }
  object AutoSizeParams {
    
    @scala.inline
    def apply(): AutoSizeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoSizeParams]
    }
    
    @scala.inline
    implicit class AutoSizeParamsMutableBuilder[Self <: AutoSizeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContains(value: content | padding): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setType(value: AutosizeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.pad
    - typings.vegaLite.vegaLiteStrings.none
    - typings.vegaLite.vegaLiteStrings.fit
    - typings.vegaLite.vegaLiteStrings.`fit-x`
    - typings.vegaLite.vegaLiteStrings.`fit-y`
  */
  trait AutosizeType extends StObject
  object AutosizeType {
    
    @scala.inline
    def fit: typings.vegaLite.vegaLiteStrings.fit = "fit".asInstanceOf[typings.vegaLite.vegaLiteStrings.fit]
    
    @scala.inline
    def `fit-x`: typings.vegaLite.vegaLiteStrings.`fit-x` = "fit-x".asInstanceOf[typings.vegaLite.vegaLiteStrings.`fit-x`]
    
    @scala.inline
    def `fit-y`: typings.vegaLite.vegaLiteStrings.`fit-y` = "fit-y".asInstanceOf[typings.vegaLite.vegaLiteStrings.`fit-y`]
    
    @scala.inline
    def none: typings.vegaLite.vegaLiteStrings.none = "none".asInstanceOf[typings.vegaLite.vegaLiteStrings.none]
    
    @scala.inline
    def pad: typings.vegaLite.vegaLiteStrings.pad = "pad".asInstanceOf[typings.vegaLite.vegaLiteStrings.pad]
  }
  
  type Datasets = Dict[InlineDataset]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.fit
    - typings.vegaLite.vegaLiteStrings.`fit-x`
    - typings.vegaLite.vegaLiteStrings.`fit-y`
  */
  trait FitType extends StObject
  object FitType {
    
    @scala.inline
    def fit: typings.vegaLite.vegaLiteStrings.fit = "fit".asInstanceOf[typings.vegaLite.vegaLiteStrings.fit]
    
    @scala.inline
    def `fit-x`: typings.vegaLite.vegaLiteStrings.`fit-x` = "fit-x".asInstanceOf[typings.vegaLite.vegaLiteStrings.`fit-x`]
    
    @scala.inline
    def `fit-y`: typings.vegaLite.vegaLiteStrings.`fit-y` = "fit-y".asInstanceOf[typings.vegaLite.vegaLiteStrings.`fit-y`]
  }
  
  type Padding = Double | Bottom
  
  type TopLevel[S /* <: BaseSpec */] = S with (TopLevelProperties[ExprRef | SignalRef]) with typings.vegaLite.anon.Datasets
  
  @js.native
  trait TopLevelProperties[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    /**
      * How the visualization size should be determined. If a string, should be one of `"pad"`, `"fit"` or `"none"`.
      * Object values can additionally specify parameters for content sizing and automatic resizing.
      *
      * __Default value__: `pad`
      */
    var autosize: js.UndefOr[AutosizeType | AutoSizeParams] = js.native
    
    /**
      * CSS color property to use as the background of the entire view.
      *
      * __Default value:__ `"white"`
      */
    var background: js.UndefOr[Color | ES] = js.native
    
    /**
      * The default visualization padding, in pixels, from the edge of the visualization canvas to the data rectangle. If a number, specifies padding for all sides.
      * If an object, the value should have the format `{"left": 5, "top": 5, "right": 5, "bottom": 5}` to specify padding for each side of the visualization.
      *
      * __Default value__: `5`
      */
    var padding: js.UndefOr[Padding | ES] = js.native
    
    /**
      * Dynamic variables that parameterize a visualization.
      */
    var params: js.UndefOr[js.Array[Parameter]] = js.native
  }
  object TopLevelProperties {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): TopLevelProperties[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TopLevelProperties[ES]]
    }
    
    @scala.inline
    implicit class TopLevelPropertiesMutableBuilder[Self <: TopLevelProperties[_], ES /* <: ExprRef | SignalRef */] (val x: Self with TopLevelProperties[ES]) extends AnyVal {
      
      @scala.inline
      def setAutosize(value: AutosizeType | AutoSizeParams): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
      
      @scala.inline
      def setBackground(value: Color | ES): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setPadding(value: Padding | ES): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setParams(value: js.Array[Parameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setParamsVarargs(value: Parameter*): Self = StObject.set(x, "params", js.Array(value :_*))
    }
  }
}
