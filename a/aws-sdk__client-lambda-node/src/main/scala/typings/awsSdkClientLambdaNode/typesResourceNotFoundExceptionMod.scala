package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.addPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.awsSdkClientLambdaNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.awsSdkClientLambdaNode.createEventSourceMappingExceptionsUnionMod.CreateEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.createFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.deleteEventSourceMappingExceptionsUnionMod.DeleteEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.deleteFunctionConcurrencyExceptionsUnionMod.DeleteFunctionConcurrencyExceptionsUnion
import typings.awsSdkClientLambdaNode.deleteFunctionExceptionsUnionMod.DeleteFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.getAliasExceptionsUnionMod.GetAliasExceptionsUnion
import typings.awsSdkClientLambdaNode.getEventSourceMappingExceptionsUnionMod.GetEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.getFunctionConfigurationExceptionsUnionMod.GetFunctionConfigurationExceptionsUnion
import typings.awsSdkClientLambdaNode.getFunctionExceptionsUnionMod.GetFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.getPolicyExceptionsUnionMod.GetPolicyExceptionsUnion
import typings.awsSdkClientLambdaNode.invokeAsyncExceptionsUnionMod.InvokeAsyncExceptionsUnion
import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkClientLambdaNode.listAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typings.awsSdkClientLambdaNode.listEventSourceMappingsExceptionsUnionMod.ListEventSourceMappingsExceptionsUnion
import typings.awsSdkClientLambdaNode.listTagsExceptionsUnionMod.ListTagsExceptionsUnion
import typings.awsSdkClientLambdaNode.listVersionsByFunctionExceptionsUnionMod.ListVersionsByFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.publishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typings.awsSdkClientLambdaNode.putFunctionConcurrencyExceptionsUnionMod.PutFunctionConcurrencyExceptionsUnion
import typings.awsSdkClientLambdaNode.removePermissionExceptionsUnionMod.RemovePermissionExceptionsUnion
import typings.awsSdkClientLambdaNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientLambdaNode.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkClientLambdaNode.updateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typings.awsSdkClientLambdaNode.updateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.updateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import typings.awsSdkClientLambdaNode.updateFunctionConfigurationExceptionsUnionMod.UpdateFunctionConfigurationExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesResourceNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ResourceNotFoundExceptionDetails> * / any */ @js.native
  trait ResourceNotFoundException
    extends AddPermissionExceptionsUnion
       with CreateAliasExceptionsUnion
       with CreateEventSourceMappingExceptionsUnion
       with CreateFunctionExceptionsUnion
       with DeleteEventSourceMappingExceptionsUnion
       with DeleteFunctionConcurrencyExceptionsUnion
       with DeleteFunctionExceptionsUnion
       with GetAliasExceptionsUnion
       with GetEventSourceMappingExceptionsUnion
       with GetFunctionConfigurationExceptionsUnion
       with GetFunctionExceptionsUnion
       with GetPolicyExceptionsUnion
       with InvokeAsyncExceptionsUnion
       with InvokeExceptionsUnion
       with ListAliasesExceptionsUnion
       with ListEventSourceMappingsExceptionsUnion
       with ListTagsExceptionsUnion
       with ListVersionsByFunctionExceptionsUnion
       with PublishVersionExceptionsUnion
       with PutFunctionConcurrencyExceptionsUnion
       with RemovePermissionExceptionsUnion
       with TagResourceExceptionsUnion
       with UntagResourceExceptionsUnion
       with UpdateAliasExceptionsUnion
       with UpdateEventSourceMappingExceptionsUnion
       with UpdateFunctionCodeExceptionsUnion
       with UpdateFunctionConfigurationExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceNotFoundException = js.native
  }
  object ResourceNotFoundException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceNotFoundException): ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceNotFoundException]
    }
    
    @scala.inline
    implicit class ResourceNotFoundExceptionMutableBuilder[Self <: ResourceNotFoundException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceNotFoundException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceNotFoundExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.native
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.native
  }
  object ResourceNotFoundExceptionDetails {
    
    @scala.inline
    def apply(): ResourceNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceNotFoundExceptionDetails]
    }
    
    @scala.inline
    implicit class ResourceNotFoundExceptionDetailsMutableBuilder[Self <: ResourceNotFoundExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
