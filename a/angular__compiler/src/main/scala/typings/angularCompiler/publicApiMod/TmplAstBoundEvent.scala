package typings.angularCompiler.publicApiMod

import typings.angularCompiler.astMod.ParsedEventType
import typings.angularCompiler.r3AstMod.BoundEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "TmplAstBoundEvent")
@js.native
class TmplAstBoundEvent protected ()
  extends typings.angularCompiler.srcCompilerMod.TmplAstBoundEvent {
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.angularCompiler.astMod.AST,
    target: String,
    phase: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.angularCompiler.astMod.AST,
    target: String,
    phase: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.angularCompiler.astMod.AST,
    target: Null,
    phase: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.angularCompiler.astMod.AST,
    target: Null,
    phase: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
/* static members */
object TmplAstBoundEvent {
  
  @JSImport("@angular/compiler/public_api", "TmplAstBoundEvent.fromParsedEvent")
  @js.native
  def fromParsedEvent(event: typings.angularCompiler.astMod.ParsedEvent): BoundEvent = js.native
}
