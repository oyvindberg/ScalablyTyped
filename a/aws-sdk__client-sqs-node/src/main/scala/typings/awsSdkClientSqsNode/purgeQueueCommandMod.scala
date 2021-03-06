package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput
import typings.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object purgeQueueCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/PurgeQueueCommand", "PurgeQueueCommand")
  @js.native
  class PurgeQueueCommand protected () extends Command[
          InputTypesUnion, 
          PurgeQueueInput, 
          OutputTypesUnion, 
          PurgeQueueOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: PurgeQueueInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[PurgeQueueInput, PurgeQueueOutput] = js.native
  }
}
