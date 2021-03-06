package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.createBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.deleteBranchExceptionsUnionMod.DeleteBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.getBranchExceptionsUnionMod.GetBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.updateDefaultBranchExceptionsUnionMod.UpdateDefaultBranchExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidBranchNameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidBranchNameExceptionDetails> * / any */ @js.native
  trait InvalidBranchNameException
    extends CreateBranchExceptionsUnion
       with DeleteBranchExceptionsUnion
       with DeleteFileExceptionsUnion
       with GetBranchExceptionsUnion
       with PutFileExceptionsUnion
       with UpdateDefaultBranchExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBranchNameException = js.native
  }
  object InvalidBranchNameException {
    
    @scala.inline
    def apply(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBranchNameException
    ): InvalidBranchNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidBranchNameException]
    }
    
    @scala.inline
    implicit class InvalidBranchNameExceptionMutableBuilder[Self <: InvalidBranchNameException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBranchNameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidBranchNameExceptionDetails extends StObject
}
