package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutObjectAclOutputMod {
  
  @js.native
  trait PutObjectAclOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
  }
  object PutObjectAclOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutObjectAclOutput]
    }
    
    @scala.inline
    implicit class PutObjectAclOutputMutableBuilder[Self <: PutObjectAclOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    }
  }
}
