package typings.nodal.mod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "ItemArray")
@js.native
class ItemArray[T] () extends Array[T] {
  
  var _meta: js.Any = js.native
  
  def setMeta(data: IArrayMetadata): IArrayMetadata = js.native
  
  def toObject(arrInterface: js.Array[String]): js.Object = js.native
}
/* static members */
object ItemArray {
  
  @JSImport("nodal", "ItemArray.from")
  @js.native
  def from(arr: js.Array[js.Object]): ItemArray[js.Object] = js.native
}
