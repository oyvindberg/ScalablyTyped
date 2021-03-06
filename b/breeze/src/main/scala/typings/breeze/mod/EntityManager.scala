package typings.breeze.mod

import typings.breeze.breeze.EntityManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "EntityManager")
@js.native
class EntityManager ()
  extends typings.breeze.breeze.EntityManager {
  def this(config: String) = this()
  def this(config: EntityManagerOptions) = this()
}
/* static members */
object EntityManager {
  
  @JSImport("breeze", "EntityManager.importEntities")
  @js.native
  def importEntities(exportedData: js.Object): typings.breeze.breeze.EntityManager = js.native
  @JSImport("breeze", "EntityManager.importEntities")
  @js.native
  def importEntities(exportedData: js.Object, config: typings.breeze.anon.MergeStrategy): typings.breeze.breeze.EntityManager = js.native
  @JSImport("breeze", "EntityManager.importEntities")
  @js.native
  def importEntities(exportedString: String): typings.breeze.breeze.EntityManager = js.native
  @JSImport("breeze", "EntityManager.importEntities")
  @js.native
  def importEntities(exportedString: String, config: typings.breeze.anon.MergeStrategy): typings.breeze.breeze.EntityManager = js.native
}
