package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorParams
import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentColorRequest {
  
  @JSImport("vscode-languageserver-protocol", "DocumentColorRequest.method")
  @js.native
  val method: textDocumentSlashdocumentColor = js.native
  
  /** @deprecated Use DocumentColorRequest.type */
  @JSImport("vscode-languageserver-protocol", "DocumentColorRequest.resultType")
  @js.native
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[js.Array[typings.vscodeLanguageserverTypes.mod.ColorInformation]] = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentColorRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentColorParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.ColorInformation], 
    js.Array[typings.vscodeLanguageserverTypes.mod.ColorInformation], 
    Unit, 
    DocumentColorRegistrationOptions
  ] = js.native
}
