package typings.mendixmodelsdk.allModelClassesMod.microflows

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
  * See: {@link https://docs.mendix.com/refguide/sequence-flow relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.SequenceFlow")
@js.native
class SequenceFlow protected ()
  extends typings.mendixmodelsdk.microflowsMod.microflows.SequenceFlow {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object SequenceFlow {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.SequenceFlow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SequenceFlow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.SequenceFlow.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.SequenceFlow = js.native
  
  /**
    * Creates and returns a new SequenceFlow instance in the SDK and on the server.
    * The new SequenceFlow will be automatically stored in the 'flows' property
    * of the parent MicroflowBase element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.SequenceFlow.createIn")
  @js.native
  def createIn(container: typings.mendixmodelsdk.microflowsMod.microflows.MicroflowBase): typings.mendixmodelsdk.microflowsMod.microflows.SequenceFlow = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.SequenceFlow.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.SequenceFlow.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
