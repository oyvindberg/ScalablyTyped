package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeError extends Error {
  
  @JSName("name")
  var name_RangeError: typings.vimeoPlayer.vimeoPlayerStrings.RangeError = js.native
}
object RangeError {
  
  @scala.inline
  def apply(message: String, method: String, name: typings.vimeoPlayer.vimeoPlayerStrings.RangeError): RangeError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeError]
  }
  
  @scala.inline
  implicit class RangeErrorMutableBuilder[Self <: RangeError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typings.vimeoPlayer.vimeoPlayerStrings.RangeError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
