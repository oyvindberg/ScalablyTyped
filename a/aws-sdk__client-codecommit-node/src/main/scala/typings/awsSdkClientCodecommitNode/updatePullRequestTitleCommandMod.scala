package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleInputMod.UpdatePullRequestTitleInput
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleOutputMod.UpdatePullRequestTitleOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updatePullRequestTitleCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/UpdatePullRequestTitleCommand", "UpdatePullRequestTitleCommand")
  @js.native
  class UpdatePullRequestTitleCommand protected () extends Command[
          InputTypesUnion, 
          UpdatePullRequestTitleInput, 
          OutputTypesUnion, 
          UpdatePullRequestTitleOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: UpdatePullRequestTitleInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdatePullRequestTitleInput, UpdatePullRequestTitleOutput] = js.native
  }
}
