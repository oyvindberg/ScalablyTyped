package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutBucketWebsiteOutputMod {
  
  @js.native
  trait PutBucketWebsiteOutput
    extends MetadataBearer
       with _OutputTypesUnion
  object PutBucketWebsiteOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBucketWebsiteOutput]
    }
  }
}
