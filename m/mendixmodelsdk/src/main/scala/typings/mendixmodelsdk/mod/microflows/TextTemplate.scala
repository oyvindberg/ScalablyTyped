package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.pagesMod.pages.PageSettings
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.TextTemplate")
@js.native
class TextTemplate protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.TextTemplate {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object TextTemplate {
  
  @JSImport("mendixmodelsdk", "microflows.TextTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new TextTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.TextTemplate.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.TextTemplate = js.native
  
  /**
    * Creates and returns a new TextTemplate instance in the SDK and on the server.
    * The new TextTemplate will be automatically stored in the 'titleOverride' property
    * of the parent pages.PageSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.12.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.TextTemplate.createInPageSettingsUnderTitleOverride")
  @js.native
  def createInPageSettingsUnderTitleOverride(container: PageSettings): typings.mendixmodelsdk.microflowsMod.microflows.TextTemplate = js.native
  
  /**
    * Creates and returns a new TextTemplate instance in the SDK and on the server.
    * The new TextTemplate will be automatically stored in the 'template' property
    * of the parent ShowMessageAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.TextTemplate.createInShowMessageActionUnderTemplate")
  @js.native
  def createInShowMessageActionUnderTemplate(container: typings.mendixmodelsdk.microflowsMod.microflows.ShowMessageAction): typings.mendixmodelsdk.microflowsMod.microflows.TextTemplate = js.native
  
  /**
    * Creates and returns a new TextTemplate instance in the SDK and on the server.
    * The new TextTemplate will be automatically stored in the 'feedbackTemplate' property
    * of the parent ValidationFeedbackAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.TextTemplate.createInValidationFeedbackActionUnderFeedbackTemplate")
  @js.native
  def createInValidationFeedbackActionUnderFeedbackTemplate(container: typings.mendixmodelsdk.microflowsMod.microflows.ValidationFeedbackAction): typings.mendixmodelsdk.microflowsMod.microflows.TextTemplate = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.TextTemplate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.TextTemplate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
