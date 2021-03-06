package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.CodeActionParams
import typings.vscodeLanguageserverProtocol.protocolMod.CodeActionRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcodeAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionRequest {
  
  @JSImport("vscode-languageserver-protocol", "CodeActionRequest.method")
  @js.native
  val method: textDocumentSlashcodeAction = js.native
  
  /** @deprecated Use CodeActionRequest.type */
  @JSImport("vscode-languageserver-protocol", "CodeActionRequest.resultType")
  @js.native
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typings.vscodeLanguageserverTypes.mod.Command | typings.vscodeLanguageserverTypes.mod.CodeAction
    ]
  ] = js.native
  
  @JSImport("vscode-languageserver-protocol", "CodeActionRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CodeActionParams, 
    (js.Array[
      typings.vscodeLanguageserverTypes.mod.Command | typings.vscodeLanguageserverTypes.mod.CodeAction
    ]) | Null, 
    js.Array[
      typings.vscodeLanguageserverTypes.mod.Command | typings.vscodeLanguageserverTypes.mod.CodeAction
    ], 
    Unit, 
    CodeActionRegistrationOptions
  ] = js.native
}
