package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutBucketInventoryConfigurationOutputMod {
  
  @js.native
  trait PutBucketInventoryConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion
  object PutBucketInventoryConfigurationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBucketInventoryConfigurationOutput]
    }
  }
}
