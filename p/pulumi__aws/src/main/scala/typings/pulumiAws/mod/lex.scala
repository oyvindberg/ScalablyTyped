package typings.pulumiAws.mod

import typings.pulumiAws.botAliasMod.BotAliasArgs
import typings.pulumiAws.botAliasMod.BotAliasState
import typings.pulumiAws.botMod.BotArgs
import typings.pulumiAws.botMod.BotState
import typings.pulumiAws.getBotAliasMod.GetBotAliasArgs
import typings.pulumiAws.getBotAliasMod.GetBotAliasResult
import typings.pulumiAws.getBotMod.GetBotArgs
import typings.pulumiAws.getBotMod.GetBotResult
import typings.pulumiAws.getIntentMod.GetIntentArgs
import typings.pulumiAws.getIntentMod.GetIntentResult
import typings.pulumiAws.getSlotTypeMod.GetSlotTypeArgs
import typings.pulumiAws.getSlotTypeMod.GetSlotTypeResult
import typings.pulumiAws.intentMod.IntentArgs
import typings.pulumiAws.intentMod.IntentState
import typings.pulumiAws.slotTypeMod.SlotTypeArgs
import typings.pulumiAws.slotTypeMod.SlotTypeState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lex {
  
  @JSImport("@pulumi/aws", "lex.Bot")
  @js.native
  class Bot protected ()
    extends typings.pulumiAws.lexMod.Bot {
    /**
      * Create a Bot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BotArgs) = this()
    def this(name: String, args: BotArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Bot {
    
    /**
      * Get an existing Bot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lex.Bot.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.botMod.Bot = js.native
    @JSImport("@pulumi/aws", "lex.Bot.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.botMod.Bot = js.native
    @JSImport("@pulumi/aws", "lex.Bot.get")
    @js.native
    def get(name: String, id: Input[ID], state: BotState): typings.pulumiAws.botMod.Bot = js.native
    @JSImport("@pulumi/aws", "lex.Bot.get")
    @js.native
    def get(name: String, id: Input[ID], state: BotState, opts: CustomResourceOptions): typings.pulumiAws.botMod.Bot = js.native
    
    /**
      * Returns true if the given object is an instance of Bot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lex.Bot.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/bot.Bot */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lex.BotAlias")
  @js.native
  class BotAlias protected ()
    extends typings.pulumiAws.lexMod.BotAlias {
    /**
      * Create a BotAlias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BotAliasArgs) = this()
    def this(name: String, args: BotAliasArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BotAlias {
    
    /**
      * Get an existing BotAlias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lex.BotAlias.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.botAliasMod.BotAlias = js.native
    @JSImport("@pulumi/aws", "lex.BotAlias.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.botAliasMod.BotAlias = js.native
    @JSImport("@pulumi/aws", "lex.BotAlias.get")
    @js.native
    def get(name: String, id: Input[ID], state: BotAliasState): typings.pulumiAws.botAliasMod.BotAlias = js.native
    @JSImport("@pulumi/aws", "lex.BotAlias.get")
    @js.native
    def get(name: String, id: Input[ID], state: BotAliasState, opts: CustomResourceOptions): typings.pulumiAws.botAliasMod.BotAlias = js.native
    
    /**
      * Returns true if the given object is an instance of BotAlias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lex.BotAlias.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/botAlias.BotAlias */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lex.Intent")
  @js.native
  class Intent protected ()
    extends typings.pulumiAws.lexMod.Intent {
    /**
      * Create a Intent resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IntentArgs) = this()
    def this(name: String, args: IntentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Intent {
    
    /**
      * Get an existing Intent resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lex.Intent.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.intentMod.Intent = js.native
    @JSImport("@pulumi/aws", "lex.Intent.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.intentMod.Intent = js.native
    @JSImport("@pulumi/aws", "lex.Intent.get")
    @js.native
    def get(name: String, id: Input[ID], state: IntentState): typings.pulumiAws.intentMod.Intent = js.native
    @JSImport("@pulumi/aws", "lex.Intent.get")
    @js.native
    def get(name: String, id: Input[ID], state: IntentState, opts: CustomResourceOptions): typings.pulumiAws.intentMod.Intent = js.native
    
    /**
      * Returns true if the given object is an instance of Intent.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lex.Intent.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/intent.Intent */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lex.SlotType")
  @js.native
  class SlotType protected ()
    extends typings.pulumiAws.lexMod.SlotType {
    /**
      * Create a SlotType resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SlotTypeArgs) = this()
    def this(name: String, args: SlotTypeArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SlotType {
    
    /**
      * Get an existing SlotType resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lex.SlotType.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.slotTypeMod.SlotType = js.native
    @JSImport("@pulumi/aws", "lex.SlotType.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.slotTypeMod.SlotType = js.native
    @JSImport("@pulumi/aws", "lex.SlotType.get")
    @js.native
    def get(name: String, id: Input[ID], state: SlotTypeState): typings.pulumiAws.slotTypeMod.SlotType = js.native
    @JSImport("@pulumi/aws", "lex.SlotType.get")
    @js.native
    def get(name: String, id: Input[ID], state: SlotTypeState, opts: CustomResourceOptions): typings.pulumiAws.slotTypeMod.SlotType = js.native
    
    /**
      * Returns true if the given object is an instance of SlotType.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lex.SlotType.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/slotType.SlotType */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lex.getBot")
  @js.native
  def getBot(args: GetBotArgs): js.Promise[GetBotResult] = js.native
  @JSImport("@pulumi/aws", "lex.getBot")
  @js.native
  def getBot(args: GetBotArgs, opts: InvokeOptions): js.Promise[GetBotResult] = js.native
  
  @JSImport("@pulumi/aws", "lex.getBotAlias")
  @js.native
  def getBotAlias(args: GetBotAliasArgs): js.Promise[GetBotAliasResult] = js.native
  @JSImport("@pulumi/aws", "lex.getBotAlias")
  @js.native
  def getBotAlias(args: GetBotAliasArgs, opts: InvokeOptions): js.Promise[GetBotAliasResult] = js.native
  
  @JSImport("@pulumi/aws", "lex.getIntent")
  @js.native
  def getIntent(args: GetIntentArgs): js.Promise[GetIntentResult] = js.native
  @JSImport("@pulumi/aws", "lex.getIntent")
  @js.native
  def getIntent(args: GetIntentArgs, opts: InvokeOptions): js.Promise[GetIntentResult] = js.native
  
  @JSImport("@pulumi/aws", "lex.getSlotType")
  @js.native
  def getSlotType(args: GetSlotTypeArgs): js.Promise[GetSlotTypeResult] = js.native
  @JSImport("@pulumi/aws", "lex.getSlotType")
  @js.native
  def getSlotType(args: GetSlotTypeArgs, opts: InvokeOptions): js.Promise[GetSlotTypeResult] = js.native
}
