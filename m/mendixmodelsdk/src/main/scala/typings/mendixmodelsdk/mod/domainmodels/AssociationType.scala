package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "domainmodels.AssociationType")
@js.native
class AssociationType protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.domainmodels.AssociationType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object AssociationType {
  
  @JSImport("mendixmodelsdk", "domainmodels.AssociationType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AssociationType.Reference")
  @js.native
  def Reference: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AssociationType.ReferenceSet")
  @js.native
  def ReferenceSet: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationType = js.native
  @scala.inline
  def ReferenceSet_=(x: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSet")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Reference_=(x: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reference")(x.asInstanceOf[js.Any])
}
