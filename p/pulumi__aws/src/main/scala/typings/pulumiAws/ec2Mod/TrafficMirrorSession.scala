package typings.pulumiAws.ec2Mod

import typings.pulumiAws.trafficMirrorSessionMod.TrafficMirrorSessionArgs
import typings.pulumiAws.trafficMirrorSessionMod.TrafficMirrorSessionState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "TrafficMirrorSession")
@js.native
class TrafficMirrorSession protected ()
  extends typings.pulumiAws.trafficMirrorSessionMod.TrafficMirrorSession {
  /**
    * Create a TrafficMirrorSession resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TrafficMirrorSessionArgs) = this()
  def this(name: String, args: TrafficMirrorSessionArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object TrafficMirrorSession {
  
  /**
    * Get an existing TrafficMirrorSession resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/ec2", "TrafficMirrorSession.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiAws.trafficMirrorSessionMod.TrafficMirrorSession = js.native
  @JSImport("@pulumi/aws/ec2", "TrafficMirrorSession.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.trafficMirrorSessionMod.TrafficMirrorSession = js.native
  @JSImport("@pulumi/aws/ec2", "TrafficMirrorSession.get")
  @js.native
  def get(name: String, id: Input[ID], state: TrafficMirrorSessionState): typings.pulumiAws.trafficMirrorSessionMod.TrafficMirrorSession = js.native
  @JSImport("@pulumi/aws/ec2", "TrafficMirrorSession.get")
  @js.native
  def get(name: String, id: Input[ID], state: TrafficMirrorSessionState, opts: CustomResourceOptions): typings.pulumiAws.trafficMirrorSessionMod.TrafficMirrorSession = js.native
  
  /**
    * Returns true if the given object is an instance of TrafficMirrorSession.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/ec2", "TrafficMirrorSession.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/trafficMirrorSession.TrafficMirrorSession */ Boolean = js.native
}
