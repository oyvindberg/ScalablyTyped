package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesUpdateTableInputMod.UpdateTableInput
import typings.awsSdkClientDynamodbNode.typesUpdateTableOutputMod.UpdateTableOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateTableCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateTableCommand", "UpdateTableCommand")
  @js.native
  class UpdateTableCommand protected () extends Command[
          InputTypesUnion, 
          UpdateTableInput, 
          OutputTypesUnion, 
          UpdateTableOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: UpdateTableInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateTableInput, UpdateTableOutput] = js.native
  }
}
