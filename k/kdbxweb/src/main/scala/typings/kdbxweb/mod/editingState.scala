package typings.kdbxweb.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait editingState extends StObject {
  
  var added: js.Array[Date] = js.native
  
  var deleted: js.Array[Date] = js.native
}
object editingState {
  
  @scala.inline
  def apply(added: js.Array[Date], deleted: js.Array[Date]): editingState = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[editingState]
  }
  
  @scala.inline
  implicit class editingStateMutableBuilder[Self <: editingState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdded(value: js.Array[Date]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedVarargs(value: Date*): Self = StObject.set(x, "added", js.Array(value :_*))
    
    @scala.inline
    def setDeleted(value: js.Array[Date]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedVarargs(value: Date*): Self = StObject.set(x, "deleted", js.Array(value :_*))
  }
}
