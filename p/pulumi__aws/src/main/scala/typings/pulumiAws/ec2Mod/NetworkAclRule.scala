package typings.pulumiAws.ec2Mod

import typings.pulumiAws.networkAclRuleMod.NetworkAclRuleArgs
import typings.pulumiAws.networkAclRuleMod.NetworkAclRuleState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "NetworkAclRule")
@js.native
class NetworkAclRule protected ()
  extends typings.pulumiAws.networkAclRuleMod.NetworkAclRule {
  /**
    * Create a NetworkAclRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NetworkAclRuleArgs) = this()
  def this(name: String, args: NetworkAclRuleArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object NetworkAclRule {
  
  /**
    * Get an existing NetworkAclRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/ec2", "NetworkAclRule.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiAws.networkAclRuleMod.NetworkAclRule = js.native
  @JSImport("@pulumi/aws/ec2", "NetworkAclRule.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.networkAclRuleMod.NetworkAclRule = js.native
  @JSImport("@pulumi/aws/ec2", "NetworkAclRule.get")
  @js.native
  def get(name: String, id: Input[ID], state: NetworkAclRuleState): typings.pulumiAws.networkAclRuleMod.NetworkAclRule = js.native
  @JSImport("@pulumi/aws/ec2", "NetworkAclRule.get")
  @js.native
  def get(name: String, id: Input[ID], state: NetworkAclRuleState, opts: CustomResourceOptions): typings.pulumiAws.networkAclRuleMod.NetworkAclRule = js.native
  
  /**
    * Returns true if the given object is an instance of NetworkAclRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/ec2", "NetworkAclRule.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkAclRule.NetworkAclRule */ Boolean = js.native
}
