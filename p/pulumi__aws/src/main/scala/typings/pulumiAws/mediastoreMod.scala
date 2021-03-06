package typings.pulumiAws

import typings.pulumiAws.containerPolicyMod.ContainerPolicyArgs
import typings.pulumiAws.containerPolicyMod.ContainerPolicyState
import typings.pulumiAws.mediastoreContainerMod.ContainerArgs
import typings.pulumiAws.mediastoreContainerMod.ContainerState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediastoreMod {
  
  @JSImport("@pulumi/aws/mediastore", "Container")
  @js.native
  class Container protected ()
    extends typings.pulumiAws.mediastoreContainerMod.Container {
    /**
      * Create a Container resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ContainerArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ContainerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Container {
    
    /**
      * Get an existing Container resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/mediastore", "Container.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.mediastoreContainerMod.Container = js.native
    @JSImport("@pulumi/aws/mediastore", "Container.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.mediastoreContainerMod.Container = js.native
    @JSImport("@pulumi/aws/mediastore", "Container.get")
    @js.native
    def get(name: String, id: Input[ID], state: ContainerState): typings.pulumiAws.mediastoreContainerMod.Container = js.native
    @JSImport("@pulumi/aws/mediastore", "Container.get")
    @js.native
    def get(name: String, id: Input[ID], state: ContainerState, opts: CustomResourceOptions): typings.pulumiAws.mediastoreContainerMod.Container = js.native
    
    /**
      * Returns true if the given object is an instance of Container.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/mediastore", "Container.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediastore/container.Container */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/mediastore", "ContainerPolicy")
  @js.native
  class ContainerPolicy protected ()
    extends typings.pulumiAws.containerPolicyMod.ContainerPolicy {
    /**
      * Create a ContainerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ContainerPolicyArgs) = this()
    def this(name: String, args: ContainerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ContainerPolicy {
    
    /**
      * Get an existing ContainerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/mediastore", "ContainerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.containerPolicyMod.ContainerPolicy = js.native
    @JSImport("@pulumi/aws/mediastore", "ContainerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.containerPolicyMod.ContainerPolicy = js.native
    @JSImport("@pulumi/aws/mediastore", "ContainerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ContainerPolicyState): typings.pulumiAws.containerPolicyMod.ContainerPolicy = js.native
    @JSImport("@pulumi/aws/mediastore", "ContainerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ContainerPolicyState, opts: CustomResourceOptions): typings.pulumiAws.containerPolicyMod.ContainerPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of ContainerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/mediastore", "ContainerPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediastore/containerPolicy.ContainerPolicy */ Boolean = js.native
  }
}
