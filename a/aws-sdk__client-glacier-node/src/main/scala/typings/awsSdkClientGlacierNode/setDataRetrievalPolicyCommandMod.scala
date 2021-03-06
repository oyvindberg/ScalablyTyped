package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput
import typings.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyOutputMod.SetDataRetrievalPolicyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setDataRetrievalPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/SetDataRetrievalPolicyCommand", "SetDataRetrievalPolicyCommand")
  @js.native
  class SetDataRetrievalPolicyCommand protected () extends Command[
          InputTypesUnion, 
          SetDataRetrievalPolicyInput, 
          OutputTypesUnion, 
          SetDataRetrievalPolicyOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: SetDataRetrievalPolicyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[SetDataRetrievalPolicyInput, SetDataRetrievalPolicyOutput] = js.native
  }
}
