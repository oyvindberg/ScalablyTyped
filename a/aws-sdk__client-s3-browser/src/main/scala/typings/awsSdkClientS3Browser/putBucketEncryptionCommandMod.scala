package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput
import typings.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putBucketEncryptionCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/PutBucketEncryptionCommand", "PutBucketEncryptionCommand")
  @js.native
  class PutBucketEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketEncryptionInput, 
          OutputTypesUnion, 
          PutBucketEncryptionOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketEncryptionInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketEncryptionInput, PutBucketEncryptionOutput] = js.native
  }
}
