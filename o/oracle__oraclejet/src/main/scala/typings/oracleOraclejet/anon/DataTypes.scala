package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypes extends StObject {
  
  var dataTypes: String | js.Array[String] = js.native
  
  def drag(param0: typings.std.Event): Unit = js.native
  
  def dragEnd(param0: typings.std.Event): Unit = js.native
  
  def dragStart(param0: typings.std.Event, param1: js.Object): Unit = js.native
}
object DataTypes {
  
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    drag: typings.std.Event => Unit,
    dragEnd: typings.std.Event => Unit,
    dragStart: (typings.std.Event, js.Object) => Unit
  ): DataTypes = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drag = js.Any.fromFunction1(drag), dragEnd = js.Any.fromFunction1(dragEnd), dragStart = js.Any.fromFunction2(dragStart))
    __obj.asInstanceOf[DataTypes]
  }
  
  @scala.inline
  implicit class DataTypesMutableBuilder[Self <: DataTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value :_*))
    
    @scala.inline
    def setDrag(value: typings.std.Event => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragEnd(value: typings.std.Event => Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragStart(value: (typings.std.Event, js.Object) => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
  }
}
