package typings.mendixmodelsdk.mod.documenttemplates

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "documenttemplates.TemplateGridContents")
@js.native
class TemplateGridContents protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.documenttemplates.TemplateGridContents {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object TemplateGridContents {
  
  @JSImport("mendixmodelsdk", "documenttemplates.TemplateGridContents")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.TemplateGridContents.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents = js.native
  
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * The new TemplateGridContents will be automatically stored in the 'evenRowsContents' property
    * of the parent TemplateGrid element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.TemplateGridContents.createInTemplateGridUnderEvenRowsContents")
  @js.native
  def createInTemplateGridUnderEvenRowsContents(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGrid): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents = js.native
  
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * The new TemplateGridContents will be automatically stored in the 'oddRowsContents' property
    * of the parent TemplateGrid element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.TemplateGridContents.createInTemplateGridUnderOddRowsContents")
  @js.native
  def createInTemplateGridUnderOddRowsContents(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGrid): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.TemplateGridContents.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.TemplateGridContents.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
