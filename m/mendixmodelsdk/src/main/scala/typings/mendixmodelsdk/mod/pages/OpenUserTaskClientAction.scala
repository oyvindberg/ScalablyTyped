package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.menusMod.menus.MenuItem
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
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
  * In version 8.15.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction")
@js.native
class OpenUserTaskClientAction protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.OpenUserTaskClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object OpenUserTaskClientAction {
  
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInActionButtonUnderAction")
  @js.native
  def createInActionButtonUnderAction(container: typings.mendixmodelsdk.pagesMod.pages.ActionButton): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInActionItemUnderAction")
  @js.native
  def createInActionItemUnderAction(container: typings.mendixmodelsdk.pagesMod.pages.ActionItem): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInAssociationWidgetUnderOnChangeAction")
  @js.native
  def createInAssociationWidgetUnderOnChangeAction(container: typings.mendixmodelsdk.pagesMod.pages.AssociationWidget): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInAttributeWidgetUnderOnChangeAction")
  @js.native
  def createInAttributeWidgetUnderOnChangeAction(container: typings.mendixmodelsdk.pagesMod.pages.AttributeWidget): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInAttributeWidgetUnderOnEnterAction")
  @js.native
  def createInAttributeWidgetUnderOnEnterAction(container: typings.mendixmodelsdk.pagesMod.pages.AttributeWidget): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInAttributeWidgetUnderOnLeaveAction")
  @js.native
  def createInAttributeWidgetUnderOnLeaveAction(container: typings.mendixmodelsdk.pagesMod.pages.AttributeWidget): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInDivContainerUnderOnClickAction")
  @js.native
  def createInDivContainerUnderOnClickAction(container: typings.mendixmodelsdk.pagesMod.pages.DivContainer): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInDynamicImageViewerUnderClickAction")
  @js.native
  def createInDynamicImageViewerUnderClickAction(container: typings.mendixmodelsdk.pagesMod.pages.DynamicImageViewer): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInGridActionButtonUnderAction")
  @js.native
  def createInGridActionButtonUnderAction(container: typings.mendixmodelsdk.pagesMod.pages.GridActionButton): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInListViewUnderClickAction")
  @js.native
  def createInListViewUnderClickAction(container: typings.mendixmodelsdk.pagesMod.pages.ListView): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInListViewUnderPullDownAction")
  @js.native
  def createInListViewUnderPullDownAction(container: typings.mendixmodelsdk.pagesMod.pages.ListView): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInMenuItemUnderAction")
  @js.native
  def createInMenuItemUnderAction(container: MenuItem): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInReferenceSetSelectorUnderOnChangeAction")
  @js.native
  def createInReferenceSetSelectorUnderOnChangeAction(container: typings.mendixmodelsdk.pagesMod.pages.ReferenceSetSelector): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInStaticImageViewerUnderClickAction")
  @js.native
  def createInStaticImageViewerUnderClickAction(container: typings.mendixmodelsdk.pagesMod.pages.StaticImageViewer): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInTextBoxUnderOnEnterKeyPressAction")
  @js.native
  def createInTextBoxUnderOnEnterKeyPressAction(container: typings.mendixmodelsdk.pagesMod.pages.TextBox): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.createInWidgetValueUnderAction")
  @js.native
  def createInWidgetValueUnderAction(container: WidgetValue): typings.mendixmodelsdk.pagesMod.pages.OpenUserTaskClientAction = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenUserTaskClientAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
