package typings.vegaLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object srcMarkMod {
  
  @scala.inline
  def ARC: typings.vegaLite.vegaLiteStrings.arc = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("ARC").asInstanceOf[typings.vegaLite.vegaLiteStrings.arc]
  
  @scala.inline
  def AREA: typings.vegaLite.vegaLiteStrings.area = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("AREA").asInstanceOf[typings.vegaLite.vegaLiteStrings.area]
  
  type AnyMark = typings.vegaLite.compositemarkMod.CompositeMark | typings.vegaLite.compositemarkMod.CompositeMarkDef | typings.vegaLite.srcMarkMod.Mark | (typings.vegaLite.srcMarkMod.MarkDef[
    typings.vegaLite.srcMarkMod.Mark, 
    typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.srcMarkMod.MarkConfig[typings.vegaTypings.signalMod.SignalRef]
    - typings.vegaLite.srcMarkMod.AreaConfig[ES]
    - typings.vegaLite.srcMarkMod.BarConfig[ES]
    - typings.vegaLite.srcMarkMod.RectConfig[ES]
    - typings.vegaLite.srcMarkMod.LineConfig[ES]
    - typings.vegaLite.srcMarkMod.TickConfig[ES]
  */
  type AnyMarkConfig[ES /* <: typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef */] = typings.vegaLite.srcMarkMod._AnyMarkConfig[ES] | typings.vegaLite.srcMarkMod.MarkConfig[typings.vegaTypings.signalMod.SignalRef] | typings.vegaLite.srcMarkMod.BarConfig[ES]
  
  @scala.inline
  def BAR: typings.vegaLite.vegaLiteStrings.bar = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("BAR").asInstanceOf[typings.vegaLite.vegaLiteStrings.bar]
  
  type BarConfig[ES /* <: typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef */] = typings.vegaLite.srcMarkMod.RectConfig[ES] with typings.vegaLite.srcMarkMod.BarCornerRadiusMixins[ES]
  
  @scala.inline
  def CIRCLE: typings.vegaLite.vegaLiteStrings.circle = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("CIRCLE").asInstanceOf[typings.vegaLite.vegaLiteStrings.circle]
  
  @scala.inline
  def FILL_CONFIG: js.Tuple2[
    typings.vegaLite.vegaLiteStrings.fill, 
    typings.vegaLite.vegaLiteStrings.fillOpacity
  ] = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("FILL_CONFIG").asInstanceOf[js.Tuple2[
    typings.vegaLite.vegaLiteStrings.fill, 
    typings.vegaLite.vegaLiteStrings.fillOpacity
  ]]
  
  @scala.inline
  def FILL_STROKE_CONFIG: js.Array[
    typings.vegaLite.vegaLiteStrings.fill | typings.vegaLite.vegaLiteStrings.stroke | typings.vegaLite.vegaLiteStrings.fillOpacity | typings.vegaLite.vegaLiteStrings.strokeOpacity | typings.vegaLite.vegaLiteStrings.strokeWidth | typings.vegaLite.vegaLiteStrings.strokeDash | typings.vegaLite.vegaLiteStrings.strokeDashOffset | typings.vegaLite.vegaLiteStrings.strokeMiterLimit | typings.vegaLite.vegaLiteStrings.strokeJoin
  ] = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("FILL_STROKE_CONFIG").asInstanceOf[js.Array[
    typings.vegaLite.vegaLiteStrings.fill | typings.vegaLite.vegaLiteStrings.stroke | typings.vegaLite.vegaLiteStrings.fillOpacity | typings.vegaLite.vegaLiteStrings.strokeOpacity | typings.vegaLite.vegaLiteStrings.strokeWidth | typings.vegaLite.vegaLiteStrings.strokeDash | typings.vegaLite.vegaLiteStrings.strokeDashOffset | typings.vegaLite.vegaLiteStrings.strokeMiterLimit | typings.vegaLite.vegaLiteStrings.strokeJoin
  ]]
  
  @scala.inline
  def GEOSHAPE: typings.vegaLite.vegaLiteStrings.geoshape = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("GEOSHAPE").asInstanceOf[typings.vegaLite.vegaLiteStrings.geoshape]
  
  type Hide = typings.vegaLite.vegaLiteStrings.hide
  
  @scala.inline
  def IMAGE: typings.vegaLite.vegaLiteStrings.image = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("IMAGE").asInstanceOf[typings.vegaLite.vegaLiteStrings.image]
  
  @scala.inline
  def LINE: typings.vegaLite.vegaLiteStrings.line = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("LINE").asInstanceOf[typings.vegaLite.vegaLiteStrings.line]
  
  @scala.inline
  def MARK_CONFIGS: js.Array[
    typings.vegaLite.vegaLiteStrings.square | typings.vegaLite.vegaLiteStrings.area | typings.vegaLite.vegaLiteStrings.mark | typings.vegaLite.vegaLiteStrings.circle | typings.vegaLite.vegaLiteStrings.image | typings.vegaLite.vegaLiteStrings.line | typings.vegaLite.vegaLiteStrings.rect | typings.vegaLite.vegaLiteStrings.text | typings.vegaLite.vegaLiteStrings.point | typings.vegaLite.vegaLiteStrings.arc | typings.vegaLite.vegaLiteStrings.rule | typings.vegaLite.vegaLiteStrings.trail | typings.vegaLite.vegaLiteStrings.geoshape | typings.vegaLite.vegaLiteStrings.bar | typings.vegaLite.vegaLiteStrings.tick
  ] = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("MARK_CONFIGS").asInstanceOf[js.Array[
    typings.vegaLite.vegaLiteStrings.square | typings.vegaLite.vegaLiteStrings.area | typings.vegaLite.vegaLiteStrings.mark | typings.vegaLite.vegaLiteStrings.circle | typings.vegaLite.vegaLiteStrings.image | typings.vegaLite.vegaLiteStrings.line | typings.vegaLite.vegaLiteStrings.rect | typings.vegaLite.vegaLiteStrings.text | typings.vegaLite.vegaLiteStrings.point | typings.vegaLite.vegaLiteStrings.arc | typings.vegaLite.vegaLiteStrings.rule | typings.vegaLite.vegaLiteStrings.trail | typings.vegaLite.vegaLiteStrings.geoshape | typings.vegaLite.vegaLiteStrings.bar | typings.vegaLite.vegaLiteStrings.tick
  ]]
  
  @scala.inline
  def POINT: typings.vegaLite.vegaLiteStrings.point = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("POINT").asInstanceOf[typings.vegaLite.vegaLiteStrings.point]
  
  @scala.inline
  def PRIMITIVE_MARKS: js.Array[
    typings.vegaLite.vegaLiteStrings.square | typings.vegaLite.vegaLiteStrings.area | typings.vegaLite.vegaLiteStrings.circle | typings.vegaLite.vegaLiteStrings.image | typings.vegaLite.vegaLiteStrings.line | typings.vegaLite.vegaLiteStrings.rect | typings.vegaLite.vegaLiteStrings.text | typings.vegaLite.vegaLiteStrings.point | typings.vegaLite.vegaLiteStrings.arc | typings.vegaLite.vegaLiteStrings.rule | typings.vegaLite.vegaLiteStrings.trail | typings.vegaLite.vegaLiteStrings.geoshape | typings.vegaLite.vegaLiteStrings.bar | typings.vegaLite.vegaLiteStrings.tick
  ] = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("PRIMITIVE_MARKS").asInstanceOf[js.Array[
    typings.vegaLite.vegaLiteStrings.square | typings.vegaLite.vegaLiteStrings.area | typings.vegaLite.vegaLiteStrings.circle | typings.vegaLite.vegaLiteStrings.image | typings.vegaLite.vegaLiteStrings.line | typings.vegaLite.vegaLiteStrings.rect | typings.vegaLite.vegaLiteStrings.text | typings.vegaLite.vegaLiteStrings.point | typings.vegaLite.vegaLiteStrings.arc | typings.vegaLite.vegaLiteStrings.rule | typings.vegaLite.vegaLiteStrings.trail | typings.vegaLite.vegaLiteStrings.geoshape | typings.vegaLite.vegaLiteStrings.bar | typings.vegaLite.vegaLiteStrings.tick
  ]]
  
  @scala.inline
  def RECT: typings.vegaLite.vegaLiteStrings.rect = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("RECT").asInstanceOf[typings.vegaLite.vegaLiteStrings.rect]
  
  @scala.inline
  def RULE: typings.vegaLite.vegaLiteStrings.rule = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("RULE").asInstanceOf[typings.vegaLite.vegaLiteStrings.rule]
  
  @scala.inline
  def SQUARE: typings.vegaLite.vegaLiteStrings.square = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("SQUARE").asInstanceOf[typings.vegaLite.vegaLiteStrings.square]
  
  @scala.inline
  def STROKE_CONFIG: js.Tuple7[
    typings.vegaLite.vegaLiteStrings.stroke, 
    typings.vegaLite.vegaLiteStrings.strokeWidth, 
    typings.vegaLite.vegaLiteStrings.strokeDash, 
    typings.vegaLite.vegaLiteStrings.strokeDashOffset, 
    typings.vegaLite.vegaLiteStrings.strokeOpacity, 
    typings.vegaLite.vegaLiteStrings.strokeJoin, 
    typings.vegaLite.vegaLiteStrings.strokeMiterLimit
  ] = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("STROKE_CONFIG").asInstanceOf[js.Tuple7[
    typings.vegaLite.vegaLiteStrings.stroke, 
    typings.vegaLite.vegaLiteStrings.strokeWidth, 
    typings.vegaLite.vegaLiteStrings.strokeDash, 
    typings.vegaLite.vegaLiteStrings.strokeDashOffset, 
    typings.vegaLite.vegaLiteStrings.strokeOpacity, 
    typings.vegaLite.vegaLiteStrings.strokeJoin, 
    typings.vegaLite.vegaLiteStrings.strokeMiterLimit
  ]]
  
  @scala.inline
  def TEXT: typings.vegaLite.vegaLiteStrings.text = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("TEXT").asInstanceOf[typings.vegaLite.vegaLiteStrings.text]
  
  @scala.inline
  def TICK: typings.vegaLite.vegaLiteStrings.tick = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("TICK").asInstanceOf[typings.vegaLite.vegaLiteStrings.tick]
  
  @scala.inline
  def TRAIL: typings.vegaLite.vegaLiteStrings.trail = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("TRAIL").asInstanceOf[typings.vegaLite.vegaLiteStrings.trail]
  
  @scala.inline
  def VL_ONLY_MARK_CONFIG_PROPERTIES: js.Array[
    typings.vegaLite.vegaLiteStrings.invalid | typings.vegaLite.vegaLiteStrings.color | typings.vegaLite.vegaLiteStrings.theta2 | typings.vegaLite.vegaLiteStrings.radius2 | typings.vegaLite.vegaLiteStrings.order | typings.vegaLite.vegaLiteStrings.filled | typings.vegaLite.vegaLiteStrings.timeUnitBandPosition | typings.vegaLite.vegaLiteStrings.timeUnitBand
  ] = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("VL_ONLY_MARK_CONFIG_PROPERTIES").asInstanceOf[js.Array[
    typings.vegaLite.vegaLiteStrings.invalid | typings.vegaLite.vegaLiteStrings.color | typings.vegaLite.vegaLiteStrings.theta2 | typings.vegaLite.vegaLiteStrings.radius2 | typings.vegaLite.vegaLiteStrings.order | typings.vegaLite.vegaLiteStrings.filled | typings.vegaLite.vegaLiteStrings.timeUnitBandPosition | typings.vegaLite.vegaLiteStrings.timeUnitBand
  ]]
  
  @scala.inline
  def defaultBarConfig: typings.vegaLite.srcMarkMod.RectConfig[typings.vegaTypings.signalMod.SignalRef] = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultBarConfig").asInstanceOf[typings.vegaLite.srcMarkMod.RectConfig[typings.vegaTypings.signalMod.SignalRef]]
  
  @scala.inline
  def defaultMarkConfig: typings.vegaLite.srcMarkMod.MarkConfig[typings.vegaTypings.signalMod.SignalRef] = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultMarkConfig").asInstanceOf[typings.vegaLite.srcMarkMod.MarkConfig[typings.vegaTypings.signalMod.SignalRef]]
  
  @scala.inline
  def defaultRectConfig: typings.vegaLite.srcMarkMod.RectConfig[typings.vegaTypings.signalMod.SignalRef] = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultRectConfig").asInstanceOf[typings.vegaLite.srcMarkMod.RectConfig[typings.vegaTypings.signalMod.SignalRef]]
  
  @scala.inline
  def defaultTickConfig: typings.vegaLite.srcMarkMod.TickConfig[typings.vegaTypings.signalMod.SignalRef] = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultTickConfig").asInstanceOf[typings.vegaLite.srcMarkMod.TickConfig[typings.vegaTypings.signalMod.SignalRef]]
  
  @scala.inline
  def getMarkType(m: java.lang.String): js.Any = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("getMarkType")(m.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getMarkType(m: typings.vegaLite.srcMarkMod.GenericMarkDef[_]): js.Any = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("getMarkType")(m.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def isMark(m: java.lang.String): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isMark")(m.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean]
  
  @scala.inline
  def isMarkDef(mark: java.lang.String): /* is vega-lite.vega-lite/build/src/mark.GenericMarkDef<any> */ scala.Boolean = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isMarkDef")(mark.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.GenericMarkDef<any> */ scala.Boolean]
  @scala.inline
  def isMarkDef(mark: typings.vegaLite.srcMarkMod.GenericMarkDef[_]): /* is vega-lite.vega-lite/build/src/mark.GenericMarkDef<any> */ scala.Boolean = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isMarkDef")(mark.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.GenericMarkDef<any> */ scala.Boolean]
  
  @scala.inline
  def isPathMark(m: typings.vegaLite.compositemarkMod.CompositeMark): scala.Boolean = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPathMark")(m.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isPathMark(m: typings.vegaLite.srcMarkMod.Mark): scala.Boolean = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPathMark")(m.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isPrimitiveMark(mark: typings.vegaLite.srcMarkMod.AnyMark): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitiveMark")(mark.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean]
  
  @scala.inline
  def isRectBasedMark(m: typings.vegaLite.compositemarkMod.CompositeMark): scala.Boolean = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isRectBasedMark")(m.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isRectBasedMark(m: typings.vegaLite.srcMarkMod.Mark): scala.Boolean = typings.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isRectBasedMark")(m.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
