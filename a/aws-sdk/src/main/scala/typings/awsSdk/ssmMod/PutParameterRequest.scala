package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutParameterRequest extends StObject {
  
  /**
    * A regular expression used to validate the parameter value. For example, for String types with values restricted to numbers, you can specify the following: AllowedPattern=^\d+$ 
    */
  var AllowedPattern: js.UndefOr[typings.awsSdk.ssmMod.AllowedPattern] = js.native
  
  /**
    * The data type for a String parameter. Supported data types include plain text and Amazon Machine Image IDs.  The following data type values are supported.     text     aws:ec2:image    When you create a String parameter and specify aws:ec2:image, Systems Manager validates the parameter value is in the required format, such as ami-12345abcdeEXAMPLE, and that the specified AMI is available in your AWS account. For more information, see Native parameter support for Amazon Machine Image IDs in the AWS Systems Manager User Guide.
    */
  var DataType: js.UndefOr[ParameterDataType] = js.native
  
  /**
    * Information about the parameter that you want to add to the system. Optional but recommended.  Do not enter personally identifiable information in this field. 
    */
  var Description: js.UndefOr[ParameterDescription] = js.native
  
  /**
    * The KMS Key ID that you want to use to encrypt a parameter. Either the default AWS Key Management Service (AWS KMS) key automatically assigned to your AWS account or a custom key. Required for parameters that use the SecureString data type. If you don't specify a key ID, the system uses the default key associated with your AWS account.   To use your default AWS KMS key, choose the SecureString data type, and do not specify the Key ID when you create the parameter. The system automatically populates Key ID with your default KMS key.   To use a custom KMS key, choose the SecureString data type with the Key ID parameter.  
    */
  var KeyId: js.UndefOr[ParameterKeyId] = js.native
  
  /**
    * The fully qualified name of the parameter that you want to add to the system. The fully qualified name includes the complete hierarchy of the parameter path and name. For parameters in a hierarchy, you must include a leading forward slash character (/) when you create or reference a parameter. For example: /Dev/DBServer/MySQL/db-string13  Naming Constraints:   Parameter names are case sensitive.   A parameter name must be unique within an AWS Region   A parameter name can't be prefixed with "aws" or "ssm" (case-insensitive).   Parameter names can include only the following symbols and letters: a-zA-Z0-9_.-/    A parameter name can't include spaces.   Parameter hierarchies are limited to a maximum depth of fifteen levels.   For additional information about valid values for parameter names, see About requirements and constraints for parameter names in the AWS Systems Manager User Guide.  The maximum length constraint listed below includes capacity for additional system attributes that are not part of the name. The maximum length for a parameter name, including the full length of the parameter ARN, is 1011 characters. For example, the length of the following parameter name is 65 characters, not 20 characters:  arn:aws:ssm:us-east-2:111122223333:parameter/ExampleParameterName  
    */
  var Name: PSParameterName = js.native
  
  /**
    * Overwrite an existing parameter. If not specified, will default to "false".
    */
  var Overwrite: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more policies to apply to a parameter. This action takes a JSON array. Parameter Store supports the following policy types: Expiration: This policy deletes the parameter after it expires. When you create the policy, you specify the expiration date. You can update the expiration date and time by updating the policy. Updating the parameter does not affect the expiration date and time. When the expiration time is reached, Parameter Store deletes the parameter. ExpirationNotification: This policy triggers an event in Amazon CloudWatch Events that notifies you about the expiration. By using this policy, you can receive notification before or after the expiration time is reached, in units of days or hours. NoChangeNotification: This policy triggers a CloudWatch event if a parameter has not been modified for a specified period of time. This policy type is useful when, for example, a secret needs to be changed within a period of time, but it has not been changed. All existing policies are preserved until you send new policies or an empty policy. For more information about parameter policies, see Assigning parameter policies. 
    */
  var Policies: js.UndefOr[ParameterPolicies] = js.native
  
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag a Systems Manager parameter to identify the type of resource to which it applies, the environment, or the type of configuration data referenced by the parameter. In this case, you could specify the following key name/value pairs:    Key=Resource,Value=S3bucket     Key=OS,Value=Windows     Key=ParameterType,Value=LicenseKey     To add tags to an existing Systems Manager parameter, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The parameter tier to assign to a parameter. Parameter Store offers a standard tier and an advanced tier for parameters. Standard parameters have a content size limit of 4 KB and can't be configured to use parameter policies. You can create a maximum of 10,000 standard parameters for each Region in an AWS account. Standard parameters are offered at no additional cost.  Advanced parameters have a content size limit of 8 KB and can be configured to use parameter policies. You can create a maximum of 100,000 advanced parameters for each Region in an AWS account. Advanced parameters incur a charge. For more information, see Standard and advanced parameter tiers in the AWS Systems Manager User Guide. You can change a standard parameter to an advanced parameter any time. But you can't revert an advanced parameter to a standard parameter. Reverting an advanced parameter to a standard parameter would result in data loss because the system would truncate the size of the parameter from 8 KB to 4 KB. Reverting would also remove any policies attached to the parameter. Lastly, advanced parameters use a different form of encryption than standard parameters.  If you no longer need an advanced parameter, or if you no longer want to incur charges for an advanced parameter, you must delete it and recreate it as a new standard parameter.   Using the Default Tier Configuration  In PutParameter requests, you can specify the tier to create the parameter in. Whenever you specify a tier in the request, Parameter Store creates or updates the parameter according to that request. However, if you do not specify a tier in a request, Parameter Store assigns the tier based on the current Parameter Store default tier configuration. The default tier when you begin using Parameter Store is the standard-parameter tier. If you use the advanced-parameter tier, you can specify one of the following as the default:    Advanced: With this option, Parameter Store evaluates all requests as advanced parameters.     Intelligent-Tiering: With this option, Parameter Store evaluates each request to determine if the parameter is standard or advanced.  If the request doesn't include any options that require an advanced parameter, the parameter is created in the standard-parameter tier. If one or more options requiring an advanced parameter are included in the request, Parameter Store create a parameter in the advanced-parameter tier. This approach helps control your parameter-related costs by always creating standard parameters unless an advanced parameter is necessary.    Options that require an advanced parameter include the following:   The content size of the parameter is more than 4 KB.   The parameter uses a parameter policy.   More than 10,000 parameters already exist in your AWS account in the current Region.   For more information about configuring the default tier option, see Specifying a default parameter tier in the AWS Systems Manager User Guide.
    */
  var Tier: js.UndefOr[ParameterTier] = js.native
  
  /**
    * The type of parameter that you want to add to the system.   SecureString is not currently supported for AWS CloudFormation templates.  Items in a StringList must be separated by a comma (,). You can't use other punctuation or special character to escape items in the list. If you have a parameter value that requires a comma, then use the String data type.  Specifying a parameter type is not required when updating a parameter. You must specify a parameter type when creating a parameter. 
    */
  var Type: js.UndefOr[ParameterType] = js.native
  
  /**
    * The parameter value that you want to add to the system. Standard parameters have a value limit of 4 KB. Advanced parameters have a value limit of 8 KB.  Parameters can't be referenced or nested in the values of other parameters. You can't include {{}} or {{ssm:parameter-name}} in a parameter value. 
    */
  var Value: PSParameterValue = js.native
}
object PutParameterRequest {
  
  @scala.inline
  def apply(Name: PSParameterName, Value: PSParameterValue): PutParameterRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutParameterRequest]
  }
  
  @scala.inline
  implicit class PutParameterRequestMutableBuilder[Self <: PutParameterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedPattern(value: AllowedPattern): Self = StObject.set(x, "AllowedPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedPatternUndefined: Self = StObject.set(x, "AllowedPattern", js.undefined)
    
    @scala.inline
    def setDataType(value: ParameterDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "DataType", js.undefined)
    
    @scala.inline
    def setDescription(value: ParameterDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setKeyId(value: ParameterKeyId): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    @scala.inline
    def setName(value: PSParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "Overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "Overwrite", js.undefined)
    
    @scala.inline
    def setPolicies(value: ParameterPolicies): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTier(value: ParameterTier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
    
    @scala.inline
    def setType(value: ParameterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValue(value: PSParameterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
