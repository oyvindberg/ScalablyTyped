package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/download-file relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.DownloadFileAction")
@js.native
class DownloadFileAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def fileDocumentVariableName: String = js.native
  def fileDocumentVariableName_=(newValue: String): Unit = js.native
  
  def showFileInBrowser: Boolean = js.native
  def showFileInBrowser_=(newValue: Boolean): Unit = js.native
}
object DownloadFileAction {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.DownloadFileAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DownloadFileAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.DownloadFileAction.create")
  @js.native
  def create(model: IModel): DownloadFileAction = js.native
  
  /**
    * Creates and returns a new DownloadFileAction instance in the SDK and on the server.
    * The new DownloadFileAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.DownloadFileAction.createIn")
  @js.native
  def createIn(container: ActionActivity): DownloadFileAction = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.DownloadFileAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.DownloadFileAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
