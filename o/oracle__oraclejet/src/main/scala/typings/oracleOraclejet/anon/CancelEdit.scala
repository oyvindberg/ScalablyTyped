package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelEdit[K, D]
  extends /* key */ StringDictionary[js.Any] {
  
  var cancelEdit: Boolean = js.native
  
  var cellContext: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D] = js.native
}
object CancelEdit {
  
  @scala.inline
  def apply[K, D](
    cancelEdit: Boolean,
    cellContext: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]
  ): CancelEdit[K, D] = {
    val __obj = js.Dynamic.literal(cancelEdit = cancelEdit.asInstanceOf[js.Any], cellContext = cellContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelEdit[K, D]]
  }
  
  @scala.inline
  implicit class CancelEditMutableBuilder[Self <: CancelEdit[_, _], K, D] (val x: Self with (CancelEdit[K, D])) extends AnyVal {
    
    @scala.inline
    def setCancelEdit(value: Boolean): Self = StObject.set(x, "cancelEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellContext(value: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]): Self = StObject.set(x, "cellContext", value.asInstanceOf[js.Any])
  }
}
