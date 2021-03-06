package typings.pulumiKubernetes.rbacMod

import typings.pulumiKubernetes.v1beta1ClusterRoleBindingListMod.ClusterRoleBindingListArgs
import typings.pulumiKubernetes.v1beta1ClusterRoleBindingMod.ClusterRoleBindingArgs
import typings.pulumiKubernetes.v1beta1ClusterRoleListMod.ClusterRoleListArgs
import typings.pulumiKubernetes.v1beta1ClusterRoleMod.ClusterRoleArgs
import typings.pulumiKubernetes.v1beta1RoleBindingListMod.RoleBindingListArgs
import typings.pulumiKubernetes.v1beta1RoleBindingMod.RoleBindingArgs
import typings.pulumiKubernetes.v1beta1RoleListMod.RoleListArgs
import typings.pulumiKubernetes.v1beta1RoleMod.RoleArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1 {
  
  @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRole")
  @js.native
  class ClusterRole protected ()
    extends typings.pulumiKubernetes.rbacV1beta1Mod.ClusterRole {
    /**
      * Create a ClusterRole resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterRole {
    
    /**
      * Get an existing ClusterRole resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRole.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1ClusterRoleMod.ClusterRole = js.native
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRole.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1ClusterRoleMod.ClusterRole = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterRole.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRole.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/clusterRole.ClusterRole */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRoleBinding")
  @js.native
  class ClusterRoleBinding protected ()
    extends typings.pulumiKubernetes.rbacV1beta1Mod.ClusterRoleBinding {
    /**
      * Create a ClusterRoleBinding resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleBindingArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleBindingArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterRoleBinding {
    
    /**
      * Get an existing ClusterRoleBinding resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRoleBinding.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1ClusterRoleBindingMod.ClusterRoleBinding = js.native
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRoleBinding.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1ClusterRoleBindingMod.ClusterRoleBinding = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterRoleBinding.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRoleBinding.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/clusterRoleBinding.ClusterRoleBinding */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRoleBindingList")
  @js.native
  class ClusterRoleBindingList protected ()
    extends typings.pulumiKubernetes.rbacV1beta1Mod.ClusterRoleBindingList {
    /**
      * Create a ClusterRoleBindingList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleBindingListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleBindingListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterRoleBindingList {
    
    /**
      * Get an existing ClusterRoleBindingList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRoleBindingList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1ClusterRoleBindingListMod.ClusterRoleBindingList = js.native
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRoleBindingList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1ClusterRoleBindingListMod.ClusterRoleBindingList = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterRoleBindingList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRoleBindingList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/clusterRoleBindingList.ClusterRoleBindingList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRoleList")
  @js.native
  class ClusterRoleList protected ()
    extends typings.pulumiKubernetes.rbacV1beta1Mod.ClusterRoleList {
    /**
      * Create a ClusterRoleList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterRoleList {
    
    /**
      * Get an existing ClusterRoleList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRoleList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1ClusterRoleListMod.ClusterRoleList = js.native
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRoleList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1ClusterRoleListMod.ClusterRoleList = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterRoleList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.ClusterRoleList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/clusterRoleList.ClusterRoleList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/rbac", "v1beta1.Role")
  @js.native
  class Role protected ()
    extends typings.pulumiKubernetes.rbacV1beta1Mod.Role {
    /**
      * Create a Role resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Role {
    
    /**
      * Get an existing Role resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.Role.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1RoleMod.Role = js.native
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.Role.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1RoleMod.Role = js.native
    
    /**
      * Returns true if the given object is an instance of Role.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.Role.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/role.Role */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/rbac", "v1beta1.RoleBinding")
  @js.native
  class RoleBinding protected ()
    extends typings.pulumiKubernetes.rbacV1beta1Mod.RoleBinding {
    /**
      * Create a RoleBinding resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleBindingArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleBindingArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RoleBinding {
    
    /**
      * Get an existing RoleBinding resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.RoleBinding.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1RoleBindingMod.RoleBinding = js.native
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.RoleBinding.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1RoleBindingMod.RoleBinding = js.native
    
    /**
      * Returns true if the given object is an instance of RoleBinding.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.RoleBinding.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/roleBinding.RoleBinding */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/rbac", "v1beta1.RoleBindingList")
  @js.native
  class RoleBindingList protected ()
    extends typings.pulumiKubernetes.rbacV1beta1Mod.RoleBindingList {
    /**
      * Create a RoleBindingList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleBindingListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleBindingListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RoleBindingList {
    
    /**
      * Get an existing RoleBindingList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.RoleBindingList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1RoleBindingListMod.RoleBindingList = js.native
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.RoleBindingList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1RoleBindingListMod.RoleBindingList = js.native
    
    /**
      * Returns true if the given object is an instance of RoleBindingList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.RoleBindingList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/roleBindingList.RoleBindingList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/rbac", "v1beta1.RoleList")
  @js.native
  class RoleList protected ()
    extends typings.pulumiKubernetes.rbacV1beta1Mod.RoleList {
    /**
      * Create a RoleList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RoleList {
    
    /**
      * Get an existing RoleList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.RoleList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1RoleListMod.RoleList = js.native
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.RoleList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1RoleListMod.RoleList = js.native
    
    /**
      * Returns true if the given object is an instance of RoleList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/rbac", "v1beta1.RoleList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/roleList.RoleList */ Boolean = js.native
  }
}
