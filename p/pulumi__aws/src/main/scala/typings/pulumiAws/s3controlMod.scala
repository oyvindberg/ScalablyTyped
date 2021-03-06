package typings.pulumiAws

import typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfigurationArgs
import typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfigurationState
import typings.pulumiAws.bucketMod.BucketArgs
import typings.pulumiAws.bucketMod.BucketState
import typings.pulumiAws.bucketPolicyMod.BucketPolicyArgs
import typings.pulumiAws.bucketPolicyMod.BucketPolicyState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3controlMod {
  
  @JSImport("@pulumi/aws/s3control", "Bucket")
  @js.native
  class Bucket protected ()
    extends typings.pulumiAws.bucketMod.Bucket {
    /**
      * Create a Bucket resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketArgs) = this()
    def this(name: String, args: BucketArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Bucket {
    
    /**
      * Get an existing Bucket resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3control", "Bucket.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.bucketMod.Bucket = js.native
    @JSImport("@pulumi/aws/s3control", "Bucket.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.bucketMod.Bucket = js.native
    @JSImport("@pulumi/aws/s3control", "Bucket.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketState): typings.pulumiAws.bucketMod.Bucket = js.native
    @JSImport("@pulumi/aws/s3control", "Bucket.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketState, opts: CustomResourceOptions): typings.pulumiAws.bucketMod.Bucket = js.native
    
    /**
      * Returns true if the given object is an instance of Bucket.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3control", "Bucket.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucket.Bucket */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/s3control", "BucketLifecycleConfiguration")
  @js.native
  class BucketLifecycleConfiguration protected ()
    extends typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration {
    /**
      * Create a BucketLifecycleConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketLifecycleConfigurationArgs) = this()
    def this(name: String, args: BucketLifecycleConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BucketLifecycleConfiguration {
    
    /**
      * Get an existing BucketLifecycleConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3control", "BucketLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/s3control", "BucketLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/s3control", "BucketLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketLifecycleConfigurationState): typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/s3control", "BucketLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketLifecycleConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of BucketLifecycleConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3control", "BucketLifecycleConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucketLifecycleConfiguration.BucketLifecycleConfiguration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/s3control", "BucketPolicy")
  @js.native
  class BucketPolicy protected ()
    extends typings.pulumiAws.bucketPolicyMod.BucketPolicy {
    /**
      * Create a BucketPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketPolicyArgs) = this()
    def this(name: String, args: BucketPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BucketPolicy {
    
    /**
      * Get an existing BucketPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3control", "BucketPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.bucketPolicyMod.BucketPolicy = js.native
    @JSImport("@pulumi/aws/s3control", "BucketPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.bucketPolicyMod.BucketPolicy = js.native
    @JSImport("@pulumi/aws/s3control", "BucketPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketPolicyState): typings.pulumiAws.bucketPolicyMod.BucketPolicy = js.native
    @JSImport("@pulumi/aws/s3control", "BucketPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketPolicyState, opts: CustomResourceOptions): typings.pulumiAws.bucketPolicyMod.BucketPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of BucketPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3control", "BucketPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucketPolicy.BucketPolicy */ Boolean = js.native
  }
}
