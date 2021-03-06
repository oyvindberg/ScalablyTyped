package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.SourceUnitSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.GetScriptLexicalStructureWalker")
@js.native
class GetScriptLexicalStructureWalker protected ()
  extends typings.typescriptServices.TypeScript.Services.GetScriptLexicalStructureWalker {
  def this(fileName: String) = this()
}
object GetScriptLexicalStructureWalker {
  
  /* static member */
  @JSImport("typescript-services", "Services.GetScriptLexicalStructureWalker.getListsOfAllScriptLexicalStructure")
  @js.native
  def getListsOfAllScriptLexicalStructure(
    items: js.Array[typings.typescriptServices.TypeScript.Services.NavigateToItem],
    fileName: String,
    unit: SourceUnitSyntax
  ): Unit = js.native
}
