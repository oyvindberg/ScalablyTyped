package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.ColorPresentationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPresentationRequest {
  
  @JSImport("vscode-languageclient", "ColorPresentationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    ColorPresentationParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.ColorPresentation], 
    js.Array[typings.vscodeLanguageserverTypes.mod.ColorPresentation], 
    Unit, 
    typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions with typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
