package typings.pulumiAws

import typings.pulumiAws.outputMod.wafregional.RegexMatchSetRegexMatchTuple
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regexMatchSetMod {
  
  @JSImport("@pulumi/aws/wafregional/regexMatchSet", "RegexMatchSet")
  @js.native
  class RegexMatchSet protected () extends CustomResource {
    /**
      * Create a RegexMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RegexMatchSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RegexMatchSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name or description of the Regex Match Set.
      */
    val name: Output_[String] = js.native
    
    /**
      * The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
      */
    val regexMatchTuples: Output_[js.UndefOr[js.Array[RegexMatchSetRegexMatchTuple]]] = js.native
  }
  /* static members */
  object RegexMatchSet {
    
    /**
      * Get an existing RegexMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional/regexMatchSet", "RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): RegexMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional/regexMatchSet", "RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RegexMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional/regexMatchSet", "RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexMatchSetState): RegexMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional/regexMatchSet", "RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexMatchSetState, opts: CustomResourceOptions): RegexMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of RegexMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional/regexMatchSet", "RegexMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/regexMatchSet.RegexMatchSet */ Boolean = js.native
  }
  
  @js.native
  trait RegexMatchSetArgs extends StObject {
    
    /**
      * The name or description of the Regex Match Set.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
      */
    val regexMatchTuples: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.wafregional.RegexMatchSetRegexMatchTuple]]
        ]
      ] = js.native
  }
  object RegexMatchSetArgs {
    
    @scala.inline
    def apply(): RegexMatchSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegexMatchSetArgs]
    }
    
    @scala.inline
    implicit class RegexMatchSetArgsMutableBuilder[Self <: RegexMatchSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRegexMatchTuples(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.wafregional.RegexMatchSetRegexMatchTuple]]
            ]
      ): Self = StObject.set(x, "regexMatchTuples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexMatchTuplesUndefined: Self = StObject.set(x, "regexMatchTuples", js.undefined)
      
      @scala.inline
      def setRegexMatchTuplesVarargs(value: Input[typings.pulumiAws.inputMod.wafregional.RegexMatchSetRegexMatchTuple]*): Self = StObject.set(x, "regexMatchTuples", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RegexMatchSetState extends StObject {
    
    /**
      * The name or description of the Regex Match Set.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
      */
    val regexMatchTuples: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.wafregional.RegexMatchSetRegexMatchTuple]]
        ]
      ] = js.native
  }
  object RegexMatchSetState {
    
    @scala.inline
    def apply(): RegexMatchSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegexMatchSetState]
    }
    
    @scala.inline
    implicit class RegexMatchSetStateMutableBuilder[Self <: RegexMatchSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRegexMatchTuples(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.wafregional.RegexMatchSetRegexMatchTuple]]
            ]
      ): Self = StObject.set(x, "regexMatchTuples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexMatchTuplesUndefined: Self = StObject.set(x, "regexMatchTuples", js.undefined)
      
      @scala.inline
      def setRegexMatchTuplesVarargs(value: Input[typings.pulumiAws.inputMod.wafregional.RegexMatchSetRegexMatchTuple]*): Self = StObject.set(x, "regexMatchTuples", js.Array(value :_*))
    }
  }
}
