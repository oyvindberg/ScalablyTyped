package typings.pulumiAws.mod.apigateway

import typings.pulumiAws.apigatewayDomainNameMod.DomainNameArgs
import typings.pulumiAws.apigatewayDomainNameMod.DomainNameState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "apigateway.DomainName")
@js.native
class DomainName protected ()
  extends typings.pulumiAws.apigatewayMod.DomainName {
  /**
    * Create a DomainName resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DomainNameArgs) = this()
  def this(name: String, args: DomainNameArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object DomainName {
  
  /**
    * Get an existing DomainName resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "apigateway.DomainName.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiAws.apigatewayDomainNameMod.DomainName = js.native
  @JSImport("@pulumi/aws", "apigateway.DomainName.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.apigatewayDomainNameMod.DomainName = js.native
  @JSImport("@pulumi/aws", "apigateway.DomainName.get")
  @js.native
  def get(name: String, id: Input[ID], state: DomainNameState): typings.pulumiAws.apigatewayDomainNameMod.DomainName = js.native
  @JSImport("@pulumi/aws", "apigateway.DomainName.get")
  @js.native
  def get(name: String, id: Input[ID], state: DomainNameState, opts: CustomResourceOptions): typings.pulumiAws.apigatewayDomainNameMod.DomainName = js.native
  
  /**
    * Returns true if the given object is an instance of DomainName.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "apigateway.DomainName.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/domainName.DomainName */ Boolean = js.native
}
