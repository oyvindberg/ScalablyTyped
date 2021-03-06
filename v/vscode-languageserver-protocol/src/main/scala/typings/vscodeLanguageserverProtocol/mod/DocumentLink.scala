package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentLink {
  
  /**
    * Creates a new DocumentLink literal.
    */
  @JSImport("vscode-languageserver-protocol", "DocumentLink.create")
  @js.native
  def create(range: typings.vscodeLanguageserverTypes.mod.Range): typings.vscodeLanguageserverTypes.mod.DocumentLink = js.native
  @JSImport("vscode-languageserver-protocol", "DocumentLink.create")
  @js.native
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    target: js.UndefOr[scala.Nothing],
    data: js.Any
  ): typings.vscodeLanguageserverTypes.mod.DocumentLink = js.native
  @JSImport("vscode-languageserver-protocol", "DocumentLink.create")
  @js.native
  def create(range: typings.vscodeLanguageserverTypes.mod.Range, target: String): typings.vscodeLanguageserverTypes.mod.DocumentLink = js.native
  @JSImport("vscode-languageserver-protocol", "DocumentLink.create")
  @js.native
  def create(range: typings.vscodeLanguageserverTypes.mod.Range, target: String, data: js.Any): typings.vscodeLanguageserverTypes.mod.DocumentLink = js.native
  
  /**
    * Checks whether the given literal conforms to the [DocumentLink](#DocumentLink) interface.
    */
  @JSImport("vscode-languageserver-protocol", "DocumentLink.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentLink */ Boolean = js.native
}
