package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowObjectCollection")
@js.native
class MicroflowObjectCollection protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsLoopedActivity: LoopedActivity = js.native
  
  def containerAsMicroflowBase: MicroflowBase = js.native
  
  def objects: IList[MicroflowObject] = js.native
}
object MicroflowObjectCollection {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowObjectCollection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowObjectCollection.create")
  @js.native
  def create(model: IModel): MicroflowObjectCollection = js.native
  
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * The new MicroflowObjectCollection will be automatically stored in the 'objectCollection' property
    * of the parent LoopedActivity element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowObjectCollection.createInLoopedActivityUnderObjectCollection")
  @js.native
  def createInLoopedActivityUnderObjectCollection(container: LoopedActivity): MicroflowObjectCollection = js.native
  
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * The new MicroflowObjectCollection will be automatically stored in the 'objectCollection' property
    * of the parent MicroflowBase element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowObjectCollection.createInMicroflowBaseUnderObjectCollection")
  @js.native
  def createInMicroflowBaseUnderObjectCollection(container: MicroflowBase): MicroflowObjectCollection = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowObjectCollection.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowObjectCollection.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
