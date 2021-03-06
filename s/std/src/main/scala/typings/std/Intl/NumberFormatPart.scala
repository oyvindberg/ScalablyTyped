package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberFormatPart extends StObject {
  
  var `type`: NumberFormatPartTypes = js.native
  
  var value: String = js.native
}
object NumberFormatPart {
  
  @scala.inline
  def apply(`type`: NumberFormatPartTypes, value: String): NumberFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatPart]
  }
  
  @scala.inline
  implicit class NumberFormatPartMutableBuilder[Self <: NumberFormatPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NumberFormatPartTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
