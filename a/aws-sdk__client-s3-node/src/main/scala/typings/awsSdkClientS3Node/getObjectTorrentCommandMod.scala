package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetObjectTorrentInputMod.GetObjectTorrentInput
import typings.awsSdkClientS3Node.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getObjectTorrentCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/GetObjectTorrentCommand", "GetObjectTorrentCommand")
  @js.native
  class GetObjectTorrentCommand protected () extends Command[
          InputTypesUnion, 
          GetObjectTorrentInput, 
          OutputTypesUnion, 
          GetObjectTorrentOutput[Readable], 
          S3ResolvedConfiguration
        ] {
    def this(input: GetObjectTorrentInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectTorrentInput, GetObjectTorrentOutput[Readable]] = js.native
  }
}
