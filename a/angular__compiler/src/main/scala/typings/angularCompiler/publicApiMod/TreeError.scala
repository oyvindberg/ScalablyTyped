package typings.angularCompiler.publicApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "TreeError")
@js.native
class TreeError protected ()
  extends typings.angularCompiler.srcCompilerMod.TreeError {
  def this(elementName: String, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
  def this(elementName: Null, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
}
/* static members */
object TreeError {
  
  @JSImport("@angular/compiler/public_api", "TreeError.create")
  @js.native
  def create(elementName: String, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String): typings.angularCompiler.mlParserParserMod.TreeError = js.native
  @JSImport("@angular/compiler/public_api", "TreeError.create")
  @js.native
  def create(elementName: Null, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String): typings.angularCompiler.mlParserParserMod.TreeError = js.native
}
