package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesRemoveAttributesInputMod.RemoveAttributesInput
import typings.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod.RemoveAttributesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object removeAttributesCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/RemoveAttributesCommand", "RemoveAttributesCommand")
  @js.native
  class RemoveAttributesCommand protected () extends Command[
          InputTypesUnion, 
          RemoveAttributesInput, 
          OutputTypesUnion, 
          RemoveAttributesOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: RemoveAttributesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[RemoveAttributesInput, RemoveAttributesOutput] = js.native
  }
}
