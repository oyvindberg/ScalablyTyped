package typings.echarts.echarts.EChartOption.SeriesCustom

import typings.echarts.anon.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Text block.
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text
  */
@js.native
trait RenderItemReturnText extends js.Object {
  
  /**
    * id is used to specifying element when willing to update
    * it. id can be ignored if you do not need it.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.id
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether the element is totally ignored (neither render
    * nor listen events).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.ignore
    */
  var ignore: js.UndefOr[Boolean] = js.native
  
  /**
    * User defined data, can be visited in event listeners.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.return_text)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.info
    */
  var info: js.UndefOr[js.Any] = js.native
  
  /**
    * Whether the element is visible.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.invisible
    */
  var invisible: js.UndefOr[Boolean] = js.native
  
  /**
    * See
    * [diffChildrenByName](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.diffChildrenByName)
    * 。
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.name
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.origin
    */
  var origin: js.UndefOr[Double] = js.native
  
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.position
    */
  var position: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.rotation
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @default
    * [1, 1]
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.scale
    */
  var scale: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Whether response to mouse events / touch events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style
    */
  var style: js.UndefOr[Font] = js.native
  
  /**
    * Empahsis style of the graphic element, whose structure
    * is the same as
    * [style](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.style)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.styleEmphasis
    */
  var styleEmphasis: js.UndefOr[js.Object] = js.native
  
  /**
    * Must be specified when define a graphic element at the
    * first time.
    *
    * Optional values:
    *
    * [image](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image)
    * ,
    * [text](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text)
    * ,
    * [circle](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_circle)
    * ,
    * [sector](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_sector)
    * ,
    * [ring](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_ring)
    * ,
    * [polygon](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon)
    * ,
    * [polyline](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline)
    * ,
    * [rect](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect)
    * ,
    * [line](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line)
    * ,
    * [bezierCurve](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve)
    * ,
    * [arc](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc)
    * ,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * ,
    *
    *
    * @default
    * "text"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.type
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Define the overlap relationship between graphic elements.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.z2
    */
  var z2: js.UndefOr[Double] = js.native
}
object RenderItemReturnText {
  
  @scala.inline
  def apply(): RenderItemReturnText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderItemReturnText]
  }
  
  @scala.inline
  implicit class RenderItemReturnTextOps[Self <: RenderItemReturnText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIgnore(value: Boolean): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setInfo(value: js.Any): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setInvisible(value: Boolean): Self = this.set("invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvisible: Self = this.set("invisible", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrigin(value: Double): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPositionVarargs(value: js.Any*): Self = this.set("position", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: js.Array[_]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setScaleVarargs(value: js.Any*): Self = this.set("scale", js.Array(value :_*))
    
    @scala.inline
    def setScale(value: js.Array[_]): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setStyle(value: Font): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleEmphasis(value: js.Object): Self = this.set("styleEmphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleEmphasis: Self = this.set("styleEmphasis", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setZ2(value: Double): Self = this.set("z2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ2: Self = this.set("z2", js.undefined)
  }
}
