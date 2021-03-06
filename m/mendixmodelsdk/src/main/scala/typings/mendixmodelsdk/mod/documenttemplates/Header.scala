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

/**
  * See: {@link https://docs.mendix.com/refguide/header-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "documenttemplates.Header")
@js.native
class Header protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.documenttemplates.Header {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object Header {
  
  @JSImport("mendixmodelsdk", "documenttemplates.Header")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Header instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Header.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Header = js.native
  
  /**
    * Creates and returns a new Header instance in the SDK and on the server.
    * The new Header will be automatically stored in the 'header' property
    * of the parent DocumentTemplate element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Header.createIn")
  @js.native
  def createIn(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplate): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Header = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Header.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Header.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
