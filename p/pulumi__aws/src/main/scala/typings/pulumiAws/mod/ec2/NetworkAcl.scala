package typings.pulumiAws.mod.ec2

import typings.pulumiAws.networkAclMod.NetworkAclArgs
import typings.pulumiAws.networkAclMod.NetworkAclState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.NetworkAcl")
@js.native
class NetworkAcl protected ()
  extends typings.pulumiAws.ec2Mod.NetworkAcl {
  /**
    * Create a NetworkAcl resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NetworkAclArgs) = this()
  def this(name: String, args: NetworkAclArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object NetworkAcl {
  
  /**
    * Get an existing NetworkAcl resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "ec2.NetworkAcl.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiAws.networkAclMod.NetworkAcl = js.native
  @JSImport("@pulumi/aws", "ec2.NetworkAcl.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.networkAclMod.NetworkAcl = js.native
  @JSImport("@pulumi/aws", "ec2.NetworkAcl.get")
  @js.native
  def get(name: String, id: Input[ID], state: NetworkAclState): typings.pulumiAws.networkAclMod.NetworkAcl = js.native
  @JSImport("@pulumi/aws", "ec2.NetworkAcl.get")
  @js.native
  def get(name: String, id: Input[ID], state: NetworkAclState, opts: CustomResourceOptions): typings.pulumiAws.networkAclMod.NetworkAcl = js.native
  
  /**
    * Returns true if the given object is an instance of NetworkAcl.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "ec2.NetworkAcl.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkAcl.NetworkAcl */ Boolean = js.native
}
