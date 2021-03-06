package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.rds.ParameterGroupParameter
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsParameterGroupMod {
  
  @JSImport("@pulumi/aws/rds/parameterGroup", "ParameterGroup")
  @js.native
  class ParameterGroup protected () extends CustomResource {
    /**
      * Create a ParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ParameterGroupArgs) = this()
    def this(name: String, args: ParameterGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the db parameter group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The description of the DB parameter group. Defaults to "Managed by Pulumi".
      */
    val description: Output_[String] = js.native
    
    /**
      * The family of the DB parameter group.
      */
    val family: Output_[String] = js.native
    
    /**
      * The name of the DB parameter.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[String] = js.native
    
    /**
      * A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-parameters.html) after initial creation of the group.
      */
    val parameters: Output_[js.UndefOr[js.Array[ParameterGroupParameter]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object ParameterGroup {
    
    /**
      * Get an existing ParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds/parameterGroup", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): ParameterGroup = js.native
    @JSImport("@pulumi/aws/rds/parameterGroup", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ParameterGroup = js.native
    @JSImport("@pulumi/aws/rds/parameterGroup", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): ParameterGroup = js.native
    @JSImport("@pulumi/aws/rds/parameterGroup", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): ParameterGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds/parameterGroup", "ParameterGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/parameterGroup.ParameterGroup */ Boolean = js.native
  }
  
  @js.native
  trait ParameterGroupArgs extends StObject {
    
    /**
      * The description of the DB parameter group. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The family of the DB parameter group.
      */
    val family: Input[String] = js.native
    
    /**
      * The name of the DB parameter.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-parameters.html) after initial creation of the group.
      */
    val parameters: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.rds.ParameterGroupParameter]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ParameterGroupArgs {
    
    @scala.inline
    def apply(family: Input[String]): ParameterGroupArgs = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterGroupArgs]
    }
    
    @scala.inline
    implicit class ParameterGroupArgsMutableBuilder[Self <: ParameterGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFamily(value: Input[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[js.Array[Input[typings.pulumiAws.inputMod.rds.ParameterGroupParameter]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: Input[typings.pulumiAws.inputMod.rds.ParameterGroupParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ParameterGroupState extends StObject {
    
    /**
      * The ARN of the db parameter group.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the DB parameter group. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The family of the DB parameter group.
      */
    val family: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the DB parameter.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-parameters.html) after initial creation of the group.
      */
    val parameters: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.rds.ParameterGroupParameter]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ParameterGroupState {
    
    @scala.inline
    def apply(): ParameterGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParameterGroupState]
    }
    
    @scala.inline
    implicit class ParameterGroupStateMutableBuilder[Self <: ParameterGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFamily(value: Input[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[js.Array[Input[typings.pulumiAws.inputMod.rds.ParameterGroupParameter]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: Input[typings.pulumiAws.inputMod.rds.ParameterGroupParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
