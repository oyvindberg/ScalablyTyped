package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentSymbol
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentSymbolParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentSymbolRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentSymbolRequest {
  
  @JSImport("vscode-languageclient", "DocumentSymbolRequest.method")
  @js.native
  val method: textDocumentSlashdocumentSymbol = js.native
  
  /** @deprecated Use DocumentSymbolRequest.type */
  @JSImport("vscode-languageclient", "DocumentSymbolRequest.resultType")
  @js.native
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typings.vscodeLanguageserverTypes.mod.DocumentSymbol | typings.vscodeLanguageserverTypes.mod.SymbolInformation
    ]
  ] = js.native
  
  @JSImport("vscode-languageclient", "DocumentSymbolRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentSymbolParams, 
    (js.Array[
      typings.vscodeLanguageserverTypes.mod.DocumentSymbol | typings.vscodeLanguageserverTypes.mod.SymbolInformation
    ]) | Null, 
    js.Array[
      typings.vscodeLanguageserverTypes.mod.DocumentSymbol | typings.vscodeLanguageserverTypes.mod.SymbolInformation
    ], 
    Unit, 
    DocumentSymbolRegistrationOptions
  ] = js.native
}
