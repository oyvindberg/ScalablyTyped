package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesCreateTableInputMod.CreateTableInput
import typings.awsSdkClientDynamodbBrowser.typesCreateTableOutputMod.CreateTableOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createTableCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/CreateTableCommand", "CreateTableCommand")
  @js.native
  class CreateTableCommand protected () extends Command[
          InputTypesUnion, 
          CreateTableInput, 
          OutputTypesUnion, 
          CreateTableOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: CreateTableInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateTableInput, CreateTableOutput] = js.native
  }
}
