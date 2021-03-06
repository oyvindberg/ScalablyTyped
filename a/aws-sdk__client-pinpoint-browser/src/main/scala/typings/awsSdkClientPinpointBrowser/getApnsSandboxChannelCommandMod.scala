package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelInputMod.GetApnsSandboxChannelInput
import typings.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelOutputMod.GetApnsSandboxChannelOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getApnsSandboxChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApnsSandboxChannelCommand", "GetApnsSandboxChannelCommand")
  @js.native
  class GetApnsSandboxChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetApnsSandboxChannelInput, 
          OutputTypesUnion, 
          GetApnsSandboxChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetApnsSandboxChannelInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApnsSandboxChannelInput, GetApnsSandboxChannelOutput] = js.native
  }
}
