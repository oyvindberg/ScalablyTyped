package typings.pulumiAws.mod.ec2

import typings.pulumiAws.tagMod.TagArgs
import typings.pulumiAws.tagMod.TagState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.Tag")
@js.native
class Tag protected ()
  extends typings.pulumiAws.ec2Mod.Tag {
  /**
    * Create a Tag resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TagArgs) = this()
  def this(name: String, args: TagArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object Tag {
  
  /**
    * Get an existing Tag resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "ec2.Tag.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiAws.tagMod.Tag = js.native
  @JSImport("@pulumi/aws", "ec2.Tag.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.tagMod.Tag = js.native
  @JSImport("@pulumi/aws", "ec2.Tag.get")
  @js.native
  def get(name: String, id: Input[ID], state: TagState): typings.pulumiAws.tagMod.Tag = js.native
  @JSImport("@pulumi/aws", "ec2.Tag.get")
  @js.native
  def get(name: String, id: Input[ID], state: TagState, opts: CustomResourceOptions): typings.pulumiAws.tagMod.Tag = js.native
  
  /**
    * Returns true if the given object is an instance of Tag.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "ec2.Tag.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/tag.Tag */ Boolean = js.native
}
