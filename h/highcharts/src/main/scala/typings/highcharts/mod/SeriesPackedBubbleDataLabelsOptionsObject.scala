package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesPackedBubbleDataLabelsOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The alignment of the data label
    * compared to the point. If `right`, the right side of the label should be
    * touching the point. For points with an extent, like columns, the
    * alignments also dictates how to align it inside the box, as given with
    * the inside option. Can be one of `left`, `center` or `right`.
    */
  var align: js.UndefOr[AlignValue | Null] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow data labels to
    * overlap. To make the labels less sensitive for overlapping, the
    * dataLabels.padding can be set to 0.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the initial
    * animation when a series is displayed for the `dataLabels`. The animation
    * can also be set as a configuration object. Please note that this option
    * only applies to the initial animation. For other animations, see
    * chart.animation and the animation parameter under the API methods. The
    * following properties are supported:
    *
    * - `defer`: The animation delay time in milliseconds.
    */
  var animation: js.UndefOr[Boolean | PlotPackedbubbleDataLabelsAnimationOptions | PartialAnimationOptionsOb] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Presentation attributes for the
    * text path.
    */
  var attributes: js.UndefOr[SVGAttributes] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
    * for the data label.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
    * label. Defaults to `undefined`.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
    * the data label.
    */
  var borderRadius: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
    * the data label.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A class name for the data label.
    * Particularly in styled mode, this can be used to give each series' or
    * point's data label unique styling. In addition to this option, a default
    * color class name is added so that we can give the labels a contrast text
    * shadow.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
    * labels. Defaults to `undefined`. For certain series types, like column or
    * map, the data labels can be drawn inside the points. In this case the
    * data label will be drawn with maximum contrast by default. Additionally,
    * it will be given a `text-outline` style with the opposite color, to
    * further increase the contrast. This can be overridden by setting the
    * `text-outline` style to `none` in the `dataLabels.style` option.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide data labels that
    * are outside the plot area. By default, the data label is moved inside the
    * plot area according to the overflow option.
    */
  var crop: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
    * labels until the initial series animation has finished. Setting to
    * `false` renders the data label immediately. If set to `true` inherits the
    * defer time set in plotOptions.series.animation.
    */
  var defer: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the data
    * labels.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A declarative filter to control
    * of which data labels to display. The declarative filter is designed for
    * use when callback functions are not available, like when the chart
    * options require a pure JSON structure or for use with graphical editors.
    * For programmatic control, use the `formatter` instead, and return
    * `undefined` to disable a single data label.
    */
  var filter: js.UndefOr[DataLabelsFilterOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The format string specifying
    * what to show for _node_ in the networkgraph. In v7.0 defaults to `{key}`,
    * since v7.1 defaults to `undefined` and `formatter` is used instead.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
    * format the data label for a node. Note that if a `format` is defined, the
    * format takes precedence and the formatter is ignored.
    */
  var formatter: js.UndefOr[SeriesPackedBubbleDataLabelsFormatterCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) For points with an extent, like
    * columns or map areas, whether to align the data label inside the box or
    * to the actual value point. Defaults to `false` in most cases, `true` in
    * stacked columns.
    */
  var inside: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
    * of null. Works analogously to format. `nullFormat` can be applied only to
    * series which support displaying null points.
    */
  var nullFormat: js.UndefOr[Boolean | String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function
    * that defines formatting for points with the value of null. Works
    * analogously to formatter. `nullPointFormatter` can be applied only to
    * series which support displaying null points.
    */
  var nullFormatter: js.UndefOr[DataLabelsFormatterCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) How to handle data labels that
    * flow outside the plot area. The default is `"justify"`, which aligns them
    * inside the plot area. For columns and bars, this means it will be moved
    * inside the bar. To display data labels outside the plot area, set `crop`
    * to `false` and `overflow` to `"allow"`.
    */
  var overflow: js.UndefOr[DataLabelsOverflowValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When either the `borderWidth` or
    * the `backgroundColor` is set, this is the padding within the box.
    */
  var padding: js.UndefOr[Double] = js.native
  
  var parentNodeFormat: js.UndefOr[String] = js.native
  
  var parentNodeFormatter: js.UndefOr[SeriesPackedBubbleDataLabelsFormatterCallbackFunction] = js.native
  
  var parentNodeTextPath: js.UndefOr[SeriesPackedBubbleDataLabelsTextPathOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Aligns data labels relative to
    * points. If `center` alignment is not possible, it defaults to `right`.
    */
  var position: js.UndefOr[AlignValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Text rotation in degrees. Note
    * that due to a more complex structure, backgrounds, borders and padding
    * will be lost on a rotated data label.
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
    * best with `borderWidth` or `backgroundColor`. Since 2.3 the shadow can be
    * an object configuration containing `color`, `offsetX`, `offsetY`,
    * `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | ShadowOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
    * the border around the label. Symbols are predefined functions on the
    * Renderer object.
    */
  var shape: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Styles for the label. The
    * default `color` setting is `"contrast"`, which is a pseudo color that
    * Highcharts picks up and applies the maximum contrast to the underlying
    * point item, for example the bar in a bar chart.
    *
    * The `textOutline` is a pseudo property that applies an outline of the
    * given width with the given color, which by default is the maximum
    * contrast to the text. So a bright text color will result in a black text
    * outline for maximum readability on a mixed background. In some cases,
    * especially with grayscale text, the text outline doesn't work well, in
    * which cases it can be disabled by setting it to `"none"`. When `useHTML`
    * is true, the `textOutline` will not be picked up. In this, case, the same
    * effect can be acheived through the `text-shadow` CSS property.
    *
    * For some series types, where each point has an extent, like for example
    * tree maps, the data label may overflow the point. There are two
    * strategies for handling overflow. By default, the text will wrap to
    * multiple lines. The other strategy is to set `style.textOverflow` to
    * `ellipsis`, which will keep the text on one line plus it will break
    * inside long words.
    */
  var style: js.UndefOr[CSSObject | PlotPackedbubbleDataLabelsStyleOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for a _node_ label text
    * which should follow marker's shape.
    *
    * **Note:** Only SVG-based renderer supports this option.
    */
  var textPath: js.UndefOr[DataLabelsTextPathOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
    * the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of a data
    * label. Can be one of `top`, `middle` or `bottom`. The default value
    * depends on the data, for instance in a column chart, the label is above
    * positive values and below negative values.
    */
  var verticalAlign: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
    * label relative to the point in pixels.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
    * label relative to the point in pixels.
    */
  var y: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the data labels.
    * The default Z index puts it above the series. Use a Z index of 2 to
    * display it behind the series.
    */
  var z: js.UndefOr[Double] = js.native
}
object SeriesPackedBubbleDataLabelsOptionsObject {
  
  @scala.inline
  def apply(): SeriesPackedBubbleDataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesPackedBubbleDataLabelsOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesPackedBubbleDataLabelsOptionsObjectMutableBuilder[Self <: SeriesPackedBubbleDataLabelsOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignNull: Self = StObject.set(x, "align", null)
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAllowOverlap(value: Boolean): Self = StObject.set(x, "allowOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOverlapUndefined: Self = StObject.set(x, "allowOverlap", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | PlotPackedbubbleDataLabelsAnimationOptions | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAttributes(value: SVGAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCrop(value: Boolean): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    @scala.inline
    def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFilter(value: DataLabelsFilterOptionsObject): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormatter(value: SeriesPackedBubbleDataLabelsFormatterCallbackFunction): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setInside(value: Boolean): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideUndefined: Self = StObject.set(x, "inside", js.undefined)
    
    @scala.inline
    def setNullFormat(value: Boolean | String): Self = StObject.set(x, "nullFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullFormatUndefined: Self = StObject.set(x, "nullFormat", js.undefined)
    
    @scala.inline
    def setNullFormatter(value: DataLabelsFormatterCallbackFunction): Self = StObject.set(x, "nullFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullFormatterUndefined: Self = StObject.set(x, "nullFormatter", js.undefined)
    
    @scala.inline
    def setOverflow(value: DataLabelsOverflowValue): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setParentNodeFormat(value: String): Self = StObject.set(x, "parentNodeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeFormatUndefined: Self = StObject.set(x, "parentNodeFormat", js.undefined)
    
    @scala.inline
    def setParentNodeFormatter(value: SeriesPackedBubbleDataLabelsFormatterCallbackFunction): Self = StObject.set(x, "parentNodeFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeFormatterUndefined: Self = StObject.set(x, "parentNodeFormatter", js.undefined)
    
    @scala.inline
    def setParentNodeTextPath(value: SeriesPackedBubbleDataLabelsTextPathOptionsObject): Self = StObject.set(x, "parentNodeTextPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeTextPathUndefined: Self = StObject.set(x, "parentNodeTextPath", js.undefined)
    
    @scala.inline
    def setPosition(value: AlignValue): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean | ShadowOptionsObject): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject | PlotPackedbubbleDataLabelsStyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTextPath(value: DataLabelsTextPathOptionsObject): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPathUndefined: Self = StObject.set(x, "textPath", js.undefined)
    
    @scala.inline
    def setUseHTML(value: Boolean): Self = StObject.set(x, "useHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHTMLUndefined: Self = StObject.set(x, "useHTML", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
