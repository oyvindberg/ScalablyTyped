package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput
import typings.awsSdkClientKmsNode.typesEnableKeyOutputMod.EnableKeyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enableKeyCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/EnableKeyCommand", "EnableKeyCommand")
  @js.native
  class EnableKeyCommand protected () extends Command[
          InputTypesUnion, 
          EnableKeyInput, 
          OutputTypesUnion, 
          EnableKeyOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: EnableKeyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyInput, EnableKeyOutput] = js.native
  }
}
