package typings.angularCompiler.publicApiMod

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.i18nAstMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "NodeWithI18n")
@js.native
abstract class NodeWithI18n protected ()
  extends typings.angularCompiler.srcCompilerMod.NodeWithI18n {
  def this(sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, i18n: Message) = this()
  def this(sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, i18n: Node) = this()
}
