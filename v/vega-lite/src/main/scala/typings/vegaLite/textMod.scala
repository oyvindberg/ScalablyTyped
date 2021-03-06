package typings.vegaLite

import typings.vegaLite.anon.PartialRecordVgEncodeChan
import typings.vegaLite.channeldefMod.StringFieldDef
import typings.vegaLite.channeldefMod.StringFieldDefWithCondition
import typings.vegaLite.channeldefMod.StringValueDefWithCondition
import typings.vegaLite.channeldefMod.TextDef
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcTypeMod.StandardType
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.datum
import typings.vegaLite.vegaLiteStrings.datumDotdatum
import typings.vegaLite.vegaLiteStrings.description
import typings.vegaLite.vegaLiteStrings.href
import typings.vegaLite.vegaLiteStrings.text
import typings.vegaLite.vegaLiteStrings.url
import typings.vegaLite.vegaSchemaMod.VgValueRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "text")
  @js.native
  def text(model: UnitModel): PartialRecordVgEncodeChan = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef(channelDef: js.UndefOr[TextDef[String]], config: Config[ExprRef | SignalRef]): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef(channelDef: js.Array[StringFieldDef[String]], config: Config[ExprRef | SignalRef]): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef(channelDef: Null, config: Config[ExprRef | SignalRef]): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef(channelDef: StringFieldDefWithCondition[String], config: Config[ExprRef | SignalRef]): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef(channelDef: StringValueDefWithCondition[String, StandardType], config: Config[ExprRef | SignalRef]): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datum(channelDef: js.UndefOr[TextDef[String]], config: Config[ExprRef | SignalRef], expr: datum): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datum(channelDef: js.Array[StringFieldDef[String]], config: Config[ExprRef | SignalRef], expr: datum): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datum(channelDef: Null, config: Config[ExprRef | SignalRef], expr: datum): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datum(channelDef: StringFieldDefWithCondition[String], config: Config[ExprRef | SignalRef], expr: datum): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datum(
    channelDef: StringValueDefWithCondition[String, StandardType],
    config: Config[ExprRef | SignalRef],
    expr: datum
  ): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datumdatum(channelDef: js.UndefOr[TextDef[String]], config: Config[ExprRef | SignalRef], expr: datumDotdatum): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datumdatum(
    channelDef: js.Array[StringFieldDef[String]],
    config: Config[ExprRef | SignalRef],
    expr: datumDotdatum
  ): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datumdatum(channelDef: Null, config: Config[ExprRef | SignalRef], expr: datumDotdatum): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datumdatum(
    channelDef: StringFieldDefWithCondition[String],
    config: Config[ExprRef | SignalRef],
    expr: datumDotdatum
  ): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datumdatum(
    channelDef: StringValueDefWithCondition[String, StandardType],
    config: Config[ExprRef | SignalRef],
    expr: datumDotdatum
  ): VgValueRef = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "text")
  @js.native
  def text_description(model: UnitModel, channel: description): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "text")
  @js.native
  def text_href(model: UnitModel, channel: href): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "text")
  @js.native
  def text_text(model: UnitModel, channel: text): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "text")
  @js.native
  def text_url(model: UnitModel, channel: url): PartialRecordVgEncodeChan = js.native
}
