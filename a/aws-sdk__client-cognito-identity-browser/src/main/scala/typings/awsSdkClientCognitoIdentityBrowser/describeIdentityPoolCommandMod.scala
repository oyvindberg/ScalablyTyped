package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolOutputMod.DescribeIdentityPoolOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeIdentityPoolCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/DescribeIdentityPoolCommand", "DescribeIdentityPoolCommand")
  @js.native
  class DescribeIdentityPoolCommand protected () extends Command[
          InputTypesUnion, 
          DescribeIdentityPoolInput, 
          OutputTypesUnion, 
          DescribeIdentityPoolOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: DescribeIdentityPoolInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DescribeIdentityPoolInput, DescribeIdentityPoolOutput] = js.native
  }
}
