package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnMovedEvent extends ColumnEvent {
  
  var toIndex: Double = js.native
}
object ColumnMovedEvent {
  
  @scala.inline
  def apply(
    api: GridApi,
    column: Column,
    columnApi: ColumnApi,
    columns: js.Array[Column],
    source: ColumnEventType,
    toIndex: Double,
    `type`: String
  ): ColumnMovedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMovedEvent]
  }
  
  @scala.inline
  implicit class ColumnMovedEventMutableBuilder[Self <: ColumnMovedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
  }
}
