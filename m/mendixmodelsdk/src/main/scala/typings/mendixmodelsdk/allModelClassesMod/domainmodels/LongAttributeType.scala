package typings.mendixmodelsdk.allModelClassesMod.domainmodels

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.restMod.rest.ODataKeyPart
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.LongAttributeType")
@js.native
class LongAttributeType protected ()
  extends typings.mendixmodelsdk.domainmodelsMod.domainmodels.LongAttributeType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object LongAttributeType {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.LongAttributeType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new LongAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.LongAttributeType.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.domainmodelsMod.domainmodels.LongAttributeType = js.native
  
  /**
    * Creates and returns a new LongAttributeType instance in the SDK and on the server.
    * The new LongAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.8.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.LongAttributeType.createIn")
  @js.native
  def createIn(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute): typings.mendixmodelsdk.domainmodelsMod.domainmodels.LongAttributeType = js.native
  
  /**
    * Creates and returns a new LongAttributeType instance in the SDK and on the server.
    * The new LongAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.LongAttributeType.createInAttributeUnderType")
  @js.native
  def createInAttributeUnderType(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute): typings.mendixmodelsdk.domainmodelsMod.domainmodels.LongAttributeType = js.native
  
  /**
    * Creates and returns a new LongAttributeType instance in the SDK and on the server.
    * The new LongAttributeType will be automatically stored in the 'type' property
    * of the parent EntityKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.LongAttributeType.createInEntityKeyPartUnderType")
  @js.native
  def createInEntityKeyPartUnderType(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.EntityKeyPart): typings.mendixmodelsdk.domainmodelsMod.domainmodels.LongAttributeType = js.native
  
  /**
    * Creates and returns a new LongAttributeType instance in the SDK and on the server.
    * The new LongAttributeType will be automatically stored in the 'type' property
    * of the parent rest.ODataKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.LongAttributeType.createInODataKeyPartUnderType")
  @js.native
  def createInODataKeyPartUnderType(container: ODataKeyPart): typings.mendixmodelsdk.domainmodelsMod.domainmodels.LongAttributeType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.LongAttributeType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.LongAttributeType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
