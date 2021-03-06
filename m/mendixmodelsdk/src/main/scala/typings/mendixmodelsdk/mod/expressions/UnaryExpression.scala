package typings.mendixmodelsdk.mod.expressions

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.expressionsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.AppServiceCallParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.BasicCodeActionParameterValue
import typings.mendixmodelsdk.microflowsMod.microflows.BasicJavaActionParameterValue
import typings.mendixmodelsdk.microflowsMod.microflows.BinaryRequestHandling
import typings.mendixmodelsdk.microflowsMod.microflows.ChangeListAction
import typings.mendixmodelsdk.microflowsMod.microflows.ChangeVariableAction
import typings.mendixmodelsdk.microflowsMod.microflows.CreateVariableAction
import typings.mendixmodelsdk.microflowsMod.microflows.CustomRange
import typings.mendixmodelsdk.microflowsMod.microflows.DocumentTemplateParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.EndEvent
import typings.mendixmodelsdk.microflowsMod.microflows.ExpressionSplitCondition
import typings.mendixmodelsdk.microflowsMod.microflows.FormDataPart
import typings.mendixmodelsdk.microflowsMod.microflows.GenerateDocumentAction
import typings.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration
import typings.mendixmodelsdk.microflowsMod.microflows.HttpHeaderEntry
import typings.mendixmodelsdk.microflowsMod.microflows.InspectAttribute
import typings.mendixmodelsdk.microflowsMod.microflows.LogMessageAction
import typings.mendixmodelsdk.microflowsMod.microflows.MemberChange
import typings.mendixmodelsdk.microflowsMod.microflows.MicroflowCallParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.NanoflowCallParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.ProxyConfiguration
import typings.mendixmodelsdk.microflowsMod.microflows.RestCallAction
import typings.mendixmodelsdk.microflowsMod.microflows.RuleCallParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.TemplateArgument
import typings.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction
import typings.mendixmodelsdk.microflowsMod.microflows.WebServiceOperationParameterMapping
import typings.mendixmodelsdk.pagesMod.pages.ConditionalSettings
import typings.mendixmodelsdk.pagesMod.pages.WidgetValidation
import typings.mendixmodelsdk.restMod.rest.ConsumedODataService
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk", "expressions.UnaryExpression")
@js.native
class UnaryExpression protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.expressions.UnaryExpression {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object UnaryExpression {
  
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInAppServiceCallParameterMappingUnderArgumentModel")
  @js.native
  def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInBasicCodeActionParameterValueUnderArgumentModel")
  @js.native
  def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInBasicJavaActionParameterValueUnderArgumentModel")
  @js.native
  def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInBinaryExpressionUnderLeft")
  @js.native
  def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.expressionsMod.expressions.BinaryExpression): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInBinaryExpressionUnderRight")
  @js.native
  def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.expressionsMod.expressions.BinaryExpression): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInBinaryRequestHandlingUnderExpressionModel")
  @js.native
  def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInChangeListActionUnderValueModel")
  @js.native
  def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInChangeVariableActionUnderValueModel")
  @js.native
  def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInConditionalSettingsUnderExpressionModel")
  @js.native
  def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInConsumedODataServiceUnderTimeoutModel")
  @js.native
  def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInCreateVariableActionUnderInitialValueModel")
  @js.native
  def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInCustomRangeUnderLimitExpressionModel")
  @js.native
  def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInCustomRangeUnderOffsetExpressionModel")
  @js.native
  def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInDocumentTemplateParameterMappingUnderArgumentModel")
  @js.native
  def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInEndEventUnderReturnValueModel")
  @js.native
  def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInExpressionSplitConditionUnderExpressionModel")
  @js.native
  def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInFormDataPartUnderValueModel")
  @js.native
  def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInFunctionCallExpressionUnderArguments")
  @js.native
  def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInGenerateDocumentActionUnderMarginBottomInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInGenerateDocumentActionUnderMarginLeftInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInGenerateDocumentActionUnderMarginRightInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInGenerateDocumentActionUnderMarginTopInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInHttpConfigurationUnderCustomLocationModel")
  @js.native
  def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInHttpConfigurationUnderPassword")
  @js.native
  def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInHttpConfigurationUnderUsername")
  @js.native
  def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInHttpHeaderEntryUnderValueModel")
  @js.native
  def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInIfExpressionUnderCondition")
  @js.native
  def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.expressionsMod.expressions.IfExpression): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInIfExpressionUnderIfFalse")
  @js.native
  def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.expressionsMod.expressions.IfExpression): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInIfExpressionUnderIfTrue")
  @js.native
  def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.expressionsMod.expressions.IfExpression): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInInspectAttributeUnderExpressionModel")
  @js.native
  def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInLogMessageActionUnderNodeModel")
  @js.native
  def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInMemberChangeUnderValueModel")
  @js.native
  def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInMicroflowCallParameterMappingUnderArgumentModel")
  @js.native
  def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInNanoflowCallParameterMappingUnderArgumentModel")
  @js.native
  def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInParenthesisExpressionUnderExpression")
  @js.native
  def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.expressionsMod.expressions.ParenthesisExpression): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInProxyConfigurationUnderHostExpressionModel")
  @js.native
  def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInProxyConfigurationUnderPasswordExpressionModel")
  @js.native
  def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInProxyConfigurationUnderPortExpressionModel")
  @js.native
  def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInProxyConfigurationUnderUseConfigurationExpressionModel")
  @js.native
  def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInProxyConfigurationUnderUsernameExpressionModel")
  @js.native
  def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInRestCallActionUnderTimeOutModel")
  @js.native
  def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInRuleCallParameterMappingUnderArgumentModel")
  @js.native
  def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInTemplateArgumentUnderExpressionModel")
  @js.native
  def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInUnaryExpressionUnderExpression")
  @js.native
  def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInWebServiceCallActionUnderTimeOutModel")
  @js.native
  def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInWebServiceOperationParameterMappingUnderArgumentModel")
  @js.native
  def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /**
    * Creates and returns a new UnaryExpression instance in the SDK and on the server.
    * The new UnaryExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.createInWidgetValidationUnderExpressionModel")
  @js.native
  def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryExpression.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
