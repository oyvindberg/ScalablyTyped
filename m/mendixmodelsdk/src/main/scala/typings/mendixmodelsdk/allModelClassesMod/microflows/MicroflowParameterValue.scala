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
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowParameterValue")
@js.native
class MicroflowParameterValue protected ()
  extends typings.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object MicroflowParameterValue {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowParameterValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowParameterValue.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterValue = js.native
  
  /**
    * Creates and returns a new MicroflowParameterValue instance in the SDK and on the server.
    * The new MicroflowParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowParameterValue.createInJavaActionParameterMappingUnderParameterValue")
  @js.native
  def createInJavaActionParameterMappingUnderParameterValue(container: typings.mendixmodelsdk.microflowsMod.microflows.JavaActionParameterMapping): typings.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterValue = js.native
  
  /**
    * Creates and returns a new MicroflowParameterValue instance in the SDK and on the server.
    * The new MicroflowParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaScriptActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowParameterValue.createInJavaScriptActionParameterMappingUnderParameterValue")
  @js.native
  def createInJavaScriptActionParameterMappingUnderParameterValue(container: typings.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionParameterMapping): typings.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterValue = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowParameterValue.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowParameterValue.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
