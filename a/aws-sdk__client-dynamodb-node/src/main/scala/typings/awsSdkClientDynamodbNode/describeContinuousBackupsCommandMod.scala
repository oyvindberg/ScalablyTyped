package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput
import typings.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsOutputMod.DescribeContinuousBackupsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeContinuousBackupsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeContinuousBackupsCommand", "DescribeContinuousBackupsCommand")
  @js.native
  class DescribeContinuousBackupsCommand protected () extends Command[
          InputTypesUnion, 
          DescribeContinuousBackupsInput, 
          OutputTypesUnion, 
          DescribeContinuousBackupsOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeContinuousBackupsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
  }
}
