package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCreateRepositoryInputMod.CreateRepositoryInput
import typings.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod.CreateRepositoryOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createRepositoryCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/CreateRepositoryCommand", "CreateRepositoryCommand")
  @js.native
  class CreateRepositoryCommand protected () extends Command[
          InputTypesUnion, 
          CreateRepositoryInput, 
          OutputTypesUnion, 
          CreateRepositoryOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: CreateRepositoryInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateRepositoryInput, CreateRepositoryOutput] = js.native
  }
}
