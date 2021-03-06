package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeLens {
  
  /**
    * Creates a new CodeLens literal.
    */
  @JSImport("vscode-languageclient/lib/client", "CodeLens.create")
  @js.native
  def create(range: typings.vscodeLanguageserverTypes.mod.Range): typings.vscodeLanguageserverTypes.mod.CodeLens = js.native
  @JSImport("vscode-languageclient/lib/client", "CodeLens.create")
  @js.native
  def create(range: typings.vscodeLanguageserverTypes.mod.Range, data: js.Any): typings.vscodeLanguageserverTypes.mod.CodeLens = js.native
  
  /**
    * Checks whether the given literal conforms to the [CodeLens](#CodeLens) interface.
    */
  @JSImport("vscode-languageclient/lib/client", "CodeLens.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeLens */ Boolean = js.native
}
