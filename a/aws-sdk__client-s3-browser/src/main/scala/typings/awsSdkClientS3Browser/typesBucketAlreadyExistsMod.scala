package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.createBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBucketAlreadyExistsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BucketAlreadyExistsDetails> * / any */ @js.native
  trait BucketAlreadyExists extends CreateBucketExceptionsUnion {
    
    var name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyExists = js.native
  }
  object BucketAlreadyExists {
    
    @scala.inline
    def apply(name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyExists): BucketAlreadyExists = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketAlreadyExists]
    }
    
    @scala.inline
    implicit class BucketAlreadyExistsMutableBuilder[Self <: BucketAlreadyExists] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyExists): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BucketAlreadyExistsDetails extends StObject
}
