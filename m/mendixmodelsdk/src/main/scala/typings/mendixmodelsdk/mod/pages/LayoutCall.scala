package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.17.0: added public
  */
@JSImport("mendixmodelsdk", "pages.LayoutCall")
@js.native
class LayoutCall protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.LayoutCall {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object LayoutCall {
  
  @JSImport("mendixmodelsdk", "pages.LayoutCall")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutCall.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutCall.createInLayoutUnderLayoutCall")
  @js.native
  def createInLayoutUnderLayoutCall(container: typings.mendixmodelsdk.pagesMod.pages.Layout): typings.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutCall.createInPageTemplateUnderLayoutCall")
  @js.native
  def createInPageTemplateUnderLayoutCall(container: typings.mendixmodelsdk.pagesMod.pages.PageTemplate): typings.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent Page element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutCall.createInPageUnderLayoutCall")
  @js.native
  def createInPageUnderLayoutCall(container: typings.mendixmodelsdk.pagesMod.pages.Page): typings.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutCall.createInWebLayoutContentUnderLayoutCall")
  @js.native
  def createInWebLayoutContentUnderLayoutCall(container: typings.mendixmodelsdk.pagesMod.pages.WebLayoutContent): typings.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutCall.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutCall.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
