package typings.pulumiAws.mod

import typings.pulumiAws.getOrderableClusterMod.GetOrderableClusterArgs
import typings.pulumiAws.getOrderableClusterMod.GetOrderableClusterResult
import typings.pulumiAws.redshiftClusterMod.ClusterArgs
import typings.pulumiAws.redshiftClusterMod.ClusterState
import typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscriptionArgs
import typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscriptionState
import typings.pulumiAws.redshiftGetClusterMod.GetClusterArgs
import typings.pulumiAws.redshiftGetClusterMod.GetClusterResult
import typings.pulumiAws.redshiftGetServiceAccountMod.GetServiceAccountArgs
import typings.pulumiAws.redshiftGetServiceAccountMod.GetServiceAccountResult
import typings.pulumiAws.redshiftParameterGroupMod.ParameterGroupArgs
import typings.pulumiAws.redshiftParameterGroupMod.ParameterGroupState
import typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroupArgs
import typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroupState
import typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroupArgs
import typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroupState
import typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrantArgs
import typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrantState
import typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociationArgs
import typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociationState
import typings.pulumiAws.snapshotScheduleMod.SnapshotScheduleArgs
import typings.pulumiAws.snapshotScheduleMod.SnapshotScheduleState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redshift {
  
  @JSImport("@pulumi/aws", "redshift.Cluster")
  @js.native
  class Cluster protected ()
    extends typings.pulumiAws.redshiftMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Cluster {
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "redshift.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.redshiftClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "redshift.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.redshiftClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "redshift.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): typings.pulumiAws.redshiftClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "redshift.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.pulumiAws.redshiftClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/cluster.Cluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.EventSubscription")
  @js.native
  class EventSubscription protected ()
    extends typings.pulumiAws.redshiftMod.EventSubscription {
    /**
      * Create a EventSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventSubscriptionArgs) = this()
    def this(name: String, args: EventSubscriptionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventSubscription {
    
    /**
      * Get an existing EventSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "redshift.EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws", "redshift.EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws", "redshift.EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState): typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws", "redshift.EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.EventSubscription.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/eventSubscription.EventSubscription */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.ParameterGroup")
  @js.native
  class ParameterGroup protected ()
    extends typings.pulumiAws.redshiftMod.ParameterGroup {
    /**
      * Create a ParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ParameterGroupArgs) = this()
    def this(name: String, args: ParameterGroupArgs, opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws", "redshift.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws", "redshift.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws", "redshift.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): typings.pulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws", "redshift.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typings.pulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.ParameterGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/parameterGroup.ParameterGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.SecurityGroup")
  @js.native
  class SecurityGroup protected ()
    extends typings.pulumiAws.redshiftMod.SecurityGroup {
    /**
      * Create a SecurityGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecurityGroupArgs) = this()
    def this(name: String, args: SecurityGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SecurityGroup {
    
    /**
      * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "redshift.SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    @JSImport("@pulumi/aws", "redshift.SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    @JSImport("@pulumi/aws", "redshift.SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState): typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    @JSImport("@pulumi/aws", "redshift.SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.SecurityGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/securityGroup.SecurityGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.SnapshotCopyGrant")
  @js.native
  class SnapshotCopyGrant protected ()
    extends typings.pulumiAws.redshiftMod.SnapshotCopyGrant {
    /**
      * Create a SnapshotCopyGrant resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotCopyGrantArgs) = this()
    def this(name: String, args: SnapshotCopyGrantArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SnapshotCopyGrant {
    
    /**
      * Get an existing SnapshotCopyGrant resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "redshift.SnapshotCopyGrant.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotCopyGrant.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotCopyGrant.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyGrantState): typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotCopyGrant.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyGrantState, opts: CustomResourceOptions): typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = js.native
    
    /**
      * Returns true if the given object is an instance of SnapshotCopyGrant.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.SnapshotCopyGrant.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotCopyGrant.SnapshotCopyGrant */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.SnapshotSchedule")
  @js.native
  class SnapshotSchedule protected ()
    extends typings.pulumiAws.redshiftMod.SnapshotSchedule {
    /**
      * Create a SnapshotSchedule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotScheduleArgs) = this()
    def this(name: String, args: SnapshotScheduleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SnapshotSchedule {
    
    /**
      * Get an existing SnapshotSchedule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "redshift.SnapshotSchedule.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.snapshotScheduleMod.SnapshotSchedule = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotSchedule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.snapshotScheduleMod.SnapshotSchedule = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotSchedule.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleState): typings.pulumiAws.snapshotScheduleMod.SnapshotSchedule = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotSchedule.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleState, opts: CustomResourceOptions): typings.pulumiAws.snapshotScheduleMod.SnapshotSchedule = js.native
    
    /**
      * Returns true if the given object is an instance of SnapshotSchedule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.SnapshotSchedule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotSchedule.SnapshotSchedule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.SnapshotScheduleAssociation")
  @js.native
  class SnapshotScheduleAssociation protected ()
    extends typings.pulumiAws.redshiftMod.SnapshotScheduleAssociation {
    /**
      * Create a SnapshotScheduleAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotScheduleAssociationArgs) = this()
    def this(name: String, args: SnapshotScheduleAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SnapshotScheduleAssociation {
    
    /**
      * Get an existing SnapshotScheduleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "redshift.SnapshotScheduleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotScheduleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotScheduleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState): typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotScheduleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState, opts: CustomResourceOptions): typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of SnapshotScheduleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.SnapshotScheduleAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotScheduleAssociation.SnapshotScheduleAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.SubnetGroup")
  @js.native
  class SubnetGroup protected ()
    extends typings.pulumiAws.redshiftMod.SubnetGroup {
    /**
      * Create a SubnetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SubnetGroupArgs) = this()
    def this(name: String, args: SubnetGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SubnetGroup {
    
    /**
      * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "redshift.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "redshift.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "redshift.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "redshift.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.SubnetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws", "redshift.getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  @JSImport("@pulumi/aws", "redshift.getOrderableCluster")
  @js.native
  def getOrderableCluster(): js.Promise[GetOrderableClusterResult] = js.native
  @JSImport("@pulumi/aws", "redshift.getOrderableCluster")
  @js.native
  def getOrderableCluster(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetOrderableClusterResult] = js.native
  @JSImport("@pulumi/aws", "redshift.getOrderableCluster")
  @js.native
  def getOrderableCluster(args: GetOrderableClusterArgs): js.Promise[GetOrderableClusterResult] = js.native
  @JSImport("@pulumi/aws", "redshift.getOrderableCluster")
  @js.native
  def getOrderableCluster(args: GetOrderableClusterArgs, opts: InvokeOptions): js.Promise[GetOrderableClusterResult] = js.native
  
  @JSImport("@pulumi/aws", "redshift.getServiceAccount")
  @js.native
  def getServiceAccount(): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws", "redshift.getServiceAccount")
  @js.native
  def getServiceAccount(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws", "redshift.getServiceAccount")
  @js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws", "redshift.getServiceAccount")
  @js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = js.native
}
