package typings.nodePgMigrate.anon

import typings.nodePgMigrate.typesTypesMod.RenameTypeAttributeFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameTypeAttributeFn extends StObject {
  
  def reverse(
    typeName: typings.nodePgMigrate.generalTypesMod.Name,
    attributeName: String,
    newAttributeName: String
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameTypeAttributeFn = js.native
}
