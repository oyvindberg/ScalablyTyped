package typings.mendixmodelsdk.allModelClassesMod.javaactions

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.BooleanType")
@js.native
class BooleanType protected ()
  extends typings.mendixmodelsdk.javaactionsMod.javaactions.BooleanType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object BooleanType {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.BooleanType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new BooleanType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.BooleanType.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.javaactionsMod.javaactions.BooleanType = js.native
  
  /**
    * Creates and returns a new BooleanType instance in the SDK and on the server.
    * The new BooleanType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.20.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.BooleanType.createInBasicParameterTypeUnderType")
  @js.native
  def createInBasicParameterTypeUnderType(container: typings.mendixmodelsdk.javaactionsMod.javaactions.BasicParameterType): typings.mendixmodelsdk.javaactionsMod.javaactions.BooleanType = js.native
  
  /**
    * Creates and returns a new BooleanType instance in the SDK and on the server.
    * The new BooleanType will be automatically stored in the 'javaType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 6.6.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.BooleanType.createInJavaActionParameterUnderJavaType")
  @js.native
  def createInJavaActionParameterUnderJavaType(container: typings.mendixmodelsdk.javaactionsMod.javaactions.JavaActionParameter): typings.mendixmodelsdk.javaactionsMod.javaactions.BooleanType = js.native
  
  /**
    * Creates and returns a new BooleanType instance in the SDK and on the server.
    * The new BooleanType will be automatically stored in the 'javaReturnType' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.BooleanType.createInJavaActionUnderJavaReturnType")
  @js.native
  def createInJavaActionUnderJavaReturnType(container: typings.mendixmodelsdk.javaactionsMod.javaactions.JavaAction): typings.mendixmodelsdk.javaactionsMod.javaactions.BooleanType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.BooleanType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.BooleanType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
