package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesObjectAlreadyInActiveTierErrorMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ObjectAlreadyInActiveTierErrorDetails> * / any */ @js.native
  trait ObjectAlreadyInActiveTierError extends StObject {
    
    var name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectAlreadyInActiveTierError = js.native
  }
  object ObjectAlreadyInActiveTierError {
    
    @scala.inline
    def apply(name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectAlreadyInActiveTierError): ObjectAlreadyInActiveTierError = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectAlreadyInActiveTierError]
    }
    
    @scala.inline
    implicit class ObjectAlreadyInActiveTierErrorMutableBuilder[Self <: ObjectAlreadyInActiveTierError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectAlreadyInActiveTierError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ObjectAlreadyInActiveTierErrorDetails extends StObject
}
