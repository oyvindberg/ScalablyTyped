package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.AttributeWidget
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.GridSortItem
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.expressionsMod.expressions.VariableRefExpression
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.SortItem
import typings.mendixmodelsdk.pagesMod.pages.ClientTemplateParameter
import typings.mendixmodelsdk.pagesMod.pages.GridColumn
import typings.mendixmodelsdk.pagesMod.pages.ListViewSearch
import typings.mendixmodelsdk.pagesMod.pages.MemberWidget
import typings.mendixmodelsdk.pagesMod.pages.RangeSearchField
import typings.mendixmodelsdk.pagesMod.pages.SingleSearchField
import typings.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk", "domainmodels.AttributeRef")
@js.native
class AttributeRef protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.domainmodels.AttributeRef {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object AttributeRef {
  
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInAttributeWidgetUnderAttributeRef")
  @js.native
  def createInAttributeWidgetUnderAttributeRef(container: AttributeWidget): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInClientTemplateParameterUnderAttributeRef")
  @js.native
  def createInClientTemplateParameterUnderAttributeRef(container: ClientTemplateParameter): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInDataGridColumnUnderAttributeRef")
  @js.native
  def createInDataGridColumnUnderAttributeRef(container: DataGridColumn): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInDocumentTemplatesGridSortItemUnderAttributeRef")
  @js.native
  def createInDocumentTemplatesGridSortItemUnderAttributeRef(container: GridSortItem): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInGridColumnUnderAttributeRef")
  @js.native
  def createInGridColumnUnderAttributeRef(container: GridColumn): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'searchRefs' property
    * of the parent pages.ListViewSearch element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInListViewSearchUnderSearchRefs")
  @js.native
  def createInListViewSearchUnderSearchRefs(container: ListViewSearch): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.MemberWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInMemberWidgetUnderAttributeRef")
  @js.native
  def createInMemberWidgetUnderAttributeRef(container: MemberWidget): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInPagesGridSortItemUnderAttributeRef")
  @js.native
  def createInPagesGridSortItemUnderAttributeRef(container: typings.mendixmodelsdk.pagesMod.pages.GridSortItem): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'lowerBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInRangeSearchFieldUnderLowerBoundRef")
  @js.native
  def createInRangeSearchFieldUnderLowerBoundRef(container: RangeSearchField): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'upperBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInRangeSearchFieldUnderUpperBoundRef")
  @js.native
  def createInRangeSearchFieldUnderUpperBoundRef(container: RangeSearchField): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.SingleSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInSingleSearchFieldUnderAttributeRef")
  @js.native
  def createInSingleSearchFieldUnderAttributeRef(container: SingleSearchField): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent microflows.SortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInSortItemUnderAttributeRef")
  @js.native
  def createInSortItemUnderAttributeRef(container: SortItem): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.StaticOrDynamicString element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInStaticOrDynamicStringUnderAttributeRef")
  @js.native
  def createInStaticOrDynamicStringUnderAttributeRef(container: StaticOrDynamicString): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'member' property
    * of the parent expressions.VariableRefExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInVariableRefExpressionUnderMember")
  @js.native
  def createInVariableRefExpressionUnderMember(container: VariableRefExpression): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInWidgetValueUnderAttributeRef")
  @js.native
  def createInWidgetValueUnderAttributeRef(container: WidgetValue): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
