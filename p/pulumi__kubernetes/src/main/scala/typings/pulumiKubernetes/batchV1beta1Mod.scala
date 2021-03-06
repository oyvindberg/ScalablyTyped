package typings.pulumiKubernetes

import typings.pulumiKubernetes.cronJobListMod.CronJobListArgs
import typings.pulumiKubernetes.cronJobMod.CronJobArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchV1beta1Mod {
  
  @JSImport("@pulumi/kubernetes/batch/v1beta1", "CronJob")
  @js.native
  class CronJob protected ()
    extends typings.pulumiKubernetes.cronJobMod.CronJob {
    /**
      * Create a CronJob resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CronJobArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CronJobArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CronJob {
    
    /**
      * Get an existing CronJob resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/batch/v1beta1", "CronJob.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.cronJobMod.CronJob = js.native
    @JSImport("@pulumi/kubernetes/batch/v1beta1", "CronJob.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.cronJobMod.CronJob = js.native
    
    /**
      * Returns true if the given object is an instance of CronJob.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/batch/v1beta1", "CronJob.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1beta1/cronJob.CronJob */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/batch/v1beta1", "CronJobList")
  @js.native
  class CronJobList protected ()
    extends typings.pulumiKubernetes.cronJobListMod.CronJobList {
    /**
      * Create a CronJobList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CronJobListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CronJobListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CronJobList {
    
    /**
      * Get an existing CronJobList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/batch/v1beta1", "CronJobList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.cronJobListMod.CronJobList = js.native
    @JSImport("@pulumi/kubernetes/batch/v1beta1", "CronJobList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.cronJobListMod.CronJobList = js.native
    
    /**
      * Returns true if the given object is an instance of CronJobList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/batch/v1beta1", "CronJobList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1beta1/cronJobList.CronJobList */ Boolean = js.native
  }
}
