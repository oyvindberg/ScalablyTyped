package typings.mendixmodelsdk.mod.microflows

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
  * See: {@link https://docs.mendix.com/refguide/aggregate-list relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "microflows.AggregateListAction")
@js.native
class AggregateListAction protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.AggregateListAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object AggregateListAction {
  
  @JSImport("mendixmodelsdk", "microflows.AggregateListAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AggregateListAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.AggregateListAction.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.AggregateListAction = js.native
  
  /**
    * Creates and returns a new AggregateListAction instance in the SDK and on the server.
    * The new AggregateListAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.AggregateListAction.createIn")
  @js.native
  def createIn(container: typings.mendixmodelsdk.microflowsMod.microflows.ActionActivity): typings.mendixmodelsdk.microflowsMod.microflows.AggregateListAction = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.AggregateListAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.AggregateListAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
