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

@JSImport("mendixmodelsdk", "pages.ClientTemplateParameter")
@js.native
class ClientTemplateParameter protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.ClientTemplateParameter {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ClientTemplateParameter {
  
  @JSImport("mendixmodelsdk", "pages.ClientTemplateParameter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ClientTemplateParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ClientTemplateParameter.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.ClientTemplateParameter = js.native
  
  /**
    * Creates and returns a new ClientTemplateParameter instance in the SDK and on the server.
    * The new ClientTemplateParameter will be automatically stored in the 'parameters' property
    * of the parent ClientTemplate element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ClientTemplateParameter.createIn")
  @js.native
  def createIn(container: typings.mendixmodelsdk.pagesMod.pages.ClientTemplate): typings.mendixmodelsdk.pagesMod.pages.ClientTemplateParameter = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ClientTemplateParameter.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ClientTemplateParameter.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
