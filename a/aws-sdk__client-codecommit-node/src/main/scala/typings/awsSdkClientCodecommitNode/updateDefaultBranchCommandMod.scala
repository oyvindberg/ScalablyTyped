package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput
import typings.awsSdkClientCodecommitNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateDefaultBranchCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/UpdateDefaultBranchCommand", "UpdateDefaultBranchCommand")
  @js.native
  class UpdateDefaultBranchCommand protected () extends Command[
          InputTypesUnion, 
          UpdateDefaultBranchInput, 
          OutputTypesUnion, 
          UpdateDefaultBranchOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: UpdateDefaultBranchInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateDefaultBranchInput, UpdateDefaultBranchOutput] = js.native
  }
}
