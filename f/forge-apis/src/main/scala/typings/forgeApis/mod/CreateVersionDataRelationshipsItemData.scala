package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVersionDataRelationshipsItemData extends StObject {
  
  var id: String = js.native
  
  var `type`: String = js.native
}
object CreateVersionDataRelationshipsItemData {
  
  @scala.inline
  def apply(id: String, `type`: String): CreateVersionDataRelationshipsItemData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVersionDataRelationshipsItemData]
  }
  
  @scala.inline
  implicit class CreateVersionDataRelationshipsItemDataMutableBuilder[Self <: CreateVersionDataRelationshipsItemData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
