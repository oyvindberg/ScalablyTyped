package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  
  var path: String = js.native
  
  var previousValue: js.Any = js.native
  
  var value: js.Any = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(path: String, previousValue: js.Any, value: js.Any): Dictkey = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousValue(value: js.Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
