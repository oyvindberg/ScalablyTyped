package typings.mendixmodelsdk.allModelClassesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/layout relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.Layout")
@js.native
class Layout protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.Layout {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
object Layout {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.Layout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Layout unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.Layout.createIn")
  @js.native
  def createIn(container: IFolderBase): typings.mendixmodelsdk.pagesMod.pages.Layout = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.Layout.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.Layout.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
