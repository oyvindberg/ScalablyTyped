package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput
import typings.awsSdkClientGlacierNode.typesListVaultsOutputMod.ListVaultsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listVaultsCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/ListVaultsCommand", "ListVaultsCommand")
  @js.native
  class ListVaultsCommand protected () extends Command[
          InputTypesUnion, 
          ListVaultsInput, 
          OutputTypesUnion, 
          ListVaultsOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: ListVaultsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[ListVaultsInput, ListVaultsOutput] = js.native
  }
}
