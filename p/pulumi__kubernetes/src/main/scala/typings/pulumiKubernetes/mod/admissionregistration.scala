package typings.pulumiKubernetes.mod

import typings.pulumiKubernetes.v1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationListArgs
import typings.pulumiKubernetes.v1MutatingWebhookConfigurationMod.MutatingWebhookConfigurationArgs
import typings.pulumiKubernetes.v1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationListArgs
import typings.pulumiKubernetes.v1ValidatingWebhookConfigurationMod.ValidatingWebhookConfigurationArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object admissionregistration {
  
  object v1 {
    
    @JSImport("@pulumi/kubernetes", "admissionregistration.v1.MutatingWebhookConfiguration")
    @js.native
    class MutatingWebhookConfiguration protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1.MutatingWebhookConfiguration {
      /**
        * Create a MutatingWebhookConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: MutatingWebhookConfigurationArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: MutatingWebhookConfigurationArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object MutatingWebhookConfiguration {
      
      /**
        * Get an existing MutatingWebhookConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1.MutatingWebhookConfiguration.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1.MutatingWebhookConfiguration.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
      
      /**
        * Returns true if the given object is an instance of MutatingWebhookConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1.MutatingWebhookConfiguration.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/mutatingWebhookConfiguration.MutatingWebhookConfiguration */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "admissionregistration.v1.MutatingWebhookConfigurationList")
    @js.native
    class MutatingWebhookConfigurationList protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1.MutatingWebhookConfigurationList {
      /**
        * Create a MutatingWebhookConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: MutatingWebhookConfigurationListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: MutatingWebhookConfigurationListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object MutatingWebhookConfigurationList {
      
      /**
        * Get an existing MutatingWebhookConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1.MutatingWebhookConfigurationList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1.MutatingWebhookConfigurationList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
      
      /**
        * Returns true if the given object is an instance of MutatingWebhookConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1.MutatingWebhookConfigurationList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/mutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "admissionregistration.v1.ValidatingWebhookConfiguration")
    @js.native
    class ValidatingWebhookConfiguration protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1.ValidatingWebhookConfiguration {
      /**
        * Create a ValidatingWebhookConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: ValidatingWebhookConfigurationArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: ValidatingWebhookConfigurationArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object ValidatingWebhookConfiguration {
      
      /**
        * Get an existing ValidatingWebhookConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1.ValidatingWebhookConfiguration.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1.ValidatingWebhookConfiguration.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
      
      /**
        * Returns true if the given object is an instance of ValidatingWebhookConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1.ValidatingWebhookConfiguration.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/validatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "admissionregistration.v1.ValidatingWebhookConfigurationList")
    @js.native
    class ValidatingWebhookConfigurationList protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1.ValidatingWebhookConfigurationList {
      /**
        * Create a ValidatingWebhookConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: ValidatingWebhookConfigurationListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: ValidatingWebhookConfigurationListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object ValidatingWebhookConfigurationList {
      
      /**
        * Get an existing ValidatingWebhookConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1.ValidatingWebhookConfigurationList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1.ValidatingWebhookConfigurationList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
      
      /**
        * Returns true if the given object is an instance of ValidatingWebhookConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1.ValidatingWebhookConfigurationList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/validatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean = js.native
    }
  }
  
  object v1beta1 {
    
    @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.MutatingWebhookConfiguration")
    @js.native
    class MutatingWebhookConfiguration protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1beta1.MutatingWebhookConfiguration {
      /**
        * Create a MutatingWebhookConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfigurationArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfigurationArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object MutatingWebhookConfiguration {
      
      /**
        * Get an existing MutatingWebhookConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.MutatingWebhookConfiguration.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.MutatingWebhookConfiguration.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
      
      /**
        * Returns true if the given object is an instance of MutatingWebhookConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.MutatingWebhookConfiguration.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/mutatingWebhookConfiguration.MutatingWebhookConfiguration */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.MutatingWebhookConfigurationList")
    @js.native
    class MutatingWebhookConfigurationList protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1beta1.MutatingWebhookConfigurationList {
      /**
        * Create a MutatingWebhookConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationListArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object MutatingWebhookConfigurationList {
      
      /**
        * Get an existing MutatingWebhookConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.MutatingWebhookConfigurationList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.MutatingWebhookConfigurationList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
      
      /**
        * Returns true if the given object is an instance of MutatingWebhookConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.MutatingWebhookConfigurationList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/mutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.ValidatingWebhookConfiguration")
    @js.native
    class ValidatingWebhookConfiguration protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1beta1.ValidatingWebhookConfiguration {
      /**
        * Create a ValidatingWebhookConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfigurationArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfigurationArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object ValidatingWebhookConfiguration {
      
      /**
        * Get an existing ValidatingWebhookConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.ValidatingWebhookConfiguration.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.ValidatingWebhookConfiguration.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
      
      /**
        * Returns true if the given object is an instance of ValidatingWebhookConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.ValidatingWebhookConfiguration.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.ValidatingWebhookConfigurationList")
    @js.native
    class ValidatingWebhookConfigurationList protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1beta1.ValidatingWebhookConfigurationList {
      /**
        * Create a ValidatingWebhookConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationListArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object ValidatingWebhookConfigurationList {
      
      /**
        * Get an existing ValidatingWebhookConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.ValidatingWebhookConfigurationList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.ValidatingWebhookConfigurationList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
      
      /**
        * Returns true if the given object is an instance of ValidatingWebhookConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "admissionregistration.v1beta1.ValidatingWebhookConfigurationList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean = js.native
    }
  }
}
