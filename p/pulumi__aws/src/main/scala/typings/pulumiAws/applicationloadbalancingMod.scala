package typings.pulumiAws

import typings.pulumiAws.applicationloadbalancingGetListenerMod.GetListenerArgs
import typings.pulumiAws.applicationloadbalancingGetListenerMod.GetListenerResult
import typings.pulumiAws.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerArgs
import typings.pulumiAws.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerResult
import typings.pulumiAws.applicationloadbalancingGetTargetGroupMod.GetTargetGroupArgs
import typings.pulumiAws.applicationloadbalancingGetTargetGroupMod.GetTargetGroupResult
import typings.pulumiAws.applicationloadbalancingListenerCertificateMod.ListenerCertificateArgs
import typings.pulumiAws.applicationloadbalancingListenerCertificateMod.ListenerCertificateState
import typings.pulumiAws.applicationloadbalancingListenerMod.ListenerArgs
import typings.pulumiAws.applicationloadbalancingListenerMod.ListenerState
import typings.pulumiAws.applicationloadbalancingListenerRuleMod.ListenerRuleArgs
import typings.pulumiAws.applicationloadbalancingListenerRuleMod.ListenerRuleState
import typings.pulumiAws.applicationloadbalancingLoadBalancerMod.LoadBalancerArgs
import typings.pulumiAws.applicationloadbalancingLoadBalancerMod.LoadBalancerState
import typings.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachmentArgs
import typings.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachmentState
import typings.pulumiAws.applicationloadbalancingTargetGroupMod.TargetGroupArgs
import typings.pulumiAws.applicationloadbalancingTargetGroupMod.TargetGroupState
import typings.pulumiAws.enumsApplicationloadbalancingMod.IpAddressType
import typings.pulumiAws.enumsApplicationloadbalancingMod.LoadBalancerType
import typings.pulumiAws.pulumiAwsStrings.application
import typings.pulumiAws.pulumiAwsStrings.dualstack
import typings.pulumiAws.pulumiAwsStrings.ipv4
import typings.pulumiAws.pulumiAwsStrings.network
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationloadbalancingMod {
  
  @JSImport("@pulumi/aws/applicationloadbalancing", "ApplicationLoadBalancer")
  @js.native
  val ApplicationLoadBalancer: LoadBalancerType = js.native
  
  @JSImport("@pulumi/aws/applicationloadbalancing", "Dualstack")
  @js.native
  val Dualstack: IpAddressType = js.native
  
  object IpAddressType {
    
    @JSImport("@pulumi/aws/applicationloadbalancing", "IpAddressType.Dualstack")
    @js.native
    val Dualstack: dualstack = js.native
    
    @JSImport("@pulumi/aws/applicationloadbalancing", "IpAddressType.Ipv4")
    @js.native
    val Ipv4: ipv4 = js.native
  }
  
  @JSImport("@pulumi/aws/applicationloadbalancing", "Ipv4")
  @js.native
  val Ipv4: IpAddressType = js.native
  
  @JSImport("@pulumi/aws/applicationloadbalancing", "Listener")
  @js.native
  class Listener protected ()
    extends typings.pulumiAws.applicationloadbalancingListenerMod.Listener {
    /**
      * Create a Listener resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.applicationloadbalancing.Listener has been deprecated in favor of aws.alb.Listener */
    def this(name: String, args: ListenerArgs) = this()
    def this(name: String, args: ListenerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Listener {
    
    /**
      * Get an existing Listener resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/applicationloadbalancing", "Listener.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.applicationloadbalancingListenerMod.Listener = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.applicationloadbalancingListenerMod.Listener = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerState): typings.pulumiAws.applicationloadbalancingListenerMod.Listener = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typings.pulumiAws.applicationloadbalancingListenerMod.Listener = js.native
    
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/applicationloadbalancing", "Listener.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/listener.Listener */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/applicationloadbalancing", "ListenerCertificate")
  @js.native
  class ListenerCertificate protected ()
    extends typings.pulumiAws.applicationloadbalancingListenerCertificateMod.ListenerCertificate {
    /**
      * Create a ListenerCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.applicationloadbalancing.ListenerCertificate has been deprecated in favor of aws.alb.ListenerCertificate */
    def this(name: String, args: ListenerCertificateArgs) = this()
    def this(name: String, args: ListenerCertificateArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ListenerCertificate {
    
    /**
      * Get an existing ListenerCertificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/applicationloadbalancing", "ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.applicationloadbalancingListenerCertificateMod.ListenerCertificate = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.applicationloadbalancingListenerCertificateMod.ListenerCertificate = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState): typings.pulumiAws.applicationloadbalancingListenerCertificateMod.ListenerCertificate = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): typings.pulumiAws.applicationloadbalancingListenerCertificateMod.ListenerCertificate = js.native
    
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/applicationloadbalancing", "ListenerCertificate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/listenerCertificate.ListenerCertificate */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/applicationloadbalancing", "ListenerRule")
  @js.native
  class ListenerRule protected ()
    extends typings.pulumiAws.applicationloadbalancingListenerRuleMod.ListenerRule {
    /**
      * Create a ListenerRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.applicationloadbalancing.ListenerRule has been deprecated in favor of aws.alb.ListenerRule */
    def this(name: String, args: ListenerRuleArgs) = this()
    def this(name: String, args: ListenerRuleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ListenerRule {
    
    /**
      * Get an existing ListenerRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/applicationloadbalancing", "ListenerRule.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.applicationloadbalancingListenerRuleMod.ListenerRule = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "ListenerRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.applicationloadbalancingListenerRuleMod.ListenerRule = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "ListenerRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState): typings.pulumiAws.applicationloadbalancingListenerRuleMod.ListenerRule = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "ListenerRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): typings.pulumiAws.applicationloadbalancingListenerRuleMod.ListenerRule = js.native
    
    /**
      * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/applicationloadbalancing", "ListenerRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/listenerRule.ListenerRule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/applicationloadbalancing", "LoadBalancer")
  @js.native
  class LoadBalancer protected ()
    extends typings.pulumiAws.applicationloadbalancingLoadBalancerMod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.applicationloadbalancing.LoadBalancer has been deprecated in favor of aws.alb.LoadBalancer */
    def this(name: String) = this()
    def this(name: String, args: LoadBalancerArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LoadBalancer {
    
    /**
      * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/applicationloadbalancing", "LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.applicationloadbalancingLoadBalancerMod.LoadBalancer = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.applicationloadbalancingLoadBalancerMod.LoadBalancer = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState): typings.pulumiAws.applicationloadbalancingLoadBalancerMod.LoadBalancer = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typings.pulumiAws.applicationloadbalancingLoadBalancerMod.LoadBalancer = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/applicationloadbalancing", "LoadBalancer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/loadBalancer.LoadBalancer */ Boolean = js.native
  }
  
  object LoadBalancerType {
    
    @JSImport("@pulumi/aws/applicationloadbalancing", "LoadBalancerType.Application")
    @js.native
    val Application: application = js.native
    
    @JSImport("@pulumi/aws/applicationloadbalancing", "LoadBalancerType.Network")
    @js.native
    val Network: network = js.native
  }
  
  @JSImport("@pulumi/aws/applicationloadbalancing", "NetworkLoadBalancer")
  @js.native
  val NetworkLoadBalancer: LoadBalancerType = js.native
  
  @JSImport("@pulumi/aws/applicationloadbalancing", "TargetGroup")
  @js.native
  class TargetGroup protected ()
    extends typings.pulumiAws.applicationloadbalancingTargetGroupMod.TargetGroup {
    /**
      * Create a TargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.applicationloadbalancing.TargetGroup has been deprecated in favor of aws.alb.TargetGroup */
    def this(name: String) = this()
    def this(name: String, args: TargetGroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TargetGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TargetGroup {
    
    /**
      * Get an existing TargetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/applicationloadbalancing", "TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.applicationloadbalancingTargetGroupMod.TargetGroup = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.applicationloadbalancingTargetGroupMod.TargetGroup = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupState): typings.pulumiAws.applicationloadbalancingTargetGroupMod.TargetGroup = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): typings.pulumiAws.applicationloadbalancingTargetGroupMod.TargetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/applicationloadbalancing", "TargetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/targetGroup.TargetGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/applicationloadbalancing", "TargetGroupAttachment")
  @js.native
  class TargetGroupAttachment protected ()
    extends typings.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment {
    /**
      * Create a TargetGroupAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.applicationloadbalancing.TargetGroupAttachment has been deprecated in favor of aws.alb.TargetGroupAttachment */
    def this(name: String, args: TargetGroupAttachmentArgs) = this()
    def this(name: String, args: TargetGroupAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TargetGroupAttachment {
    
    /**
      * Get an existing TargetGroupAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/applicationloadbalancing", "TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): typings.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    @JSImport("@pulumi/aws/applicationloadbalancing", "TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/applicationloadbalancing", "TargetGroupAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/targetGroupAttachment.TargetGroupAttachment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/applicationloadbalancing", "getListener")
  @js.native
  def getListener(): js.Promise[GetListenerResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing", "getListener")
  @js.native
  def getListener(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetListenerResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing", "getListener")
  @js.native
  def getListener(args: GetListenerArgs): js.Promise[GetListenerResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing", "getListener")
  @js.native
  def getListener(args: GetListenerArgs, opts: InvokeOptions): js.Promise[GetListenerResult] = js.native
  
  @JSImport("@pulumi/aws/applicationloadbalancing", "getLoadBalancer")
  @js.native
  def getLoadBalancer(): js.Promise[GetLoadBalancerResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing", "getLoadBalancer")
  @js.native
  def getLoadBalancer(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing", "getLoadBalancer")
  @js.native
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing", "getLoadBalancer")
  @js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = js.native
  
  @JSImport("@pulumi/aws/applicationloadbalancing", "getTargetGroup")
  @js.native
  def getTargetGroup(): js.Promise[GetTargetGroupResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing", "getTargetGroup")
  @js.native
  def getTargetGroup(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetTargetGroupResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing", "getTargetGroup")
  @js.native
  def getTargetGroup(args: GetTargetGroupArgs): js.Promise[GetTargetGroupResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing", "getTargetGroup")
  @js.native
  def getTargetGroup(args: GetTargetGroupArgs, opts: InvokeOptions): js.Promise[GetTargetGroupResult] = js.native
}
