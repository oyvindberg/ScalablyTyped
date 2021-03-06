package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnBeforeEditCellEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  
  var cell: Double = js.native
  
  var column: Column[T] = js.native
  
  var item: T = js.native
  
  var row: Double = js.native
}
object OnBeforeEditCellEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](cell: Double, column: Column[T], grid: Grid[T], item: T, row: Double): OnBeforeEditCellEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeEditCellEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnBeforeEditCellEventArgsMutableBuilder[Self <: OnBeforeEditCellEventArgs[_], T /* <: SlickData */] (val x: Self with OnBeforeEditCellEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setCell(value: Double): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
