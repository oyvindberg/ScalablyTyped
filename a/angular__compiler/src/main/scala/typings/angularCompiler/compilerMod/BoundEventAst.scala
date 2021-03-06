package typings.angularCompiler.compilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "BoundEventAst")
@js.native
class BoundEventAst protected ()
  extends typings.angularCompiler.publicApiMod.BoundEventAst {
  def this(
    name: String,
    target: String,
    phase: String,
    handler: typings.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: String,
    phase: Null,
    handler: typings.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: Null,
    phase: String,
    handler: typings.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: Null,
    phase: Null,
    handler: typings.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
/* static members */
object BoundEventAst {
  
  @JSImport("@angular/compiler/compiler", "BoundEventAst.calcFullName")
  @js.native
  def calcFullName(name: String): String = js.native
  @JSImport("@angular/compiler/compiler", "BoundEventAst.calcFullName")
  @js.native
  def calcFullName(name: String, target: String): String = js.native
  @JSImport("@angular/compiler/compiler", "BoundEventAst.calcFullName")
  @js.native
  def calcFullName(name: String, target: String, phase: String): String = js.native
  @JSImport("@angular/compiler/compiler", "BoundEventAst.calcFullName")
  @js.native
  def calcFullName(name: String, target: Null, phase: String): String = js.native
  
  @JSImport("@angular/compiler/compiler", "BoundEventAst.fromParsedEvent")
  @js.native
  def fromParsedEvent(event: typings.angularCompiler.astMod.ParsedEvent): typings.angularCompiler.templateAstMod.BoundEventAst = js.native
}
