package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetRuleSelectorResponse extends StObject {
  
  /**
    * The resulting selector list after modification.
    */
  var selectorList: SelectorList = js.native
}
object SetRuleSelectorResponse {
  
  @scala.inline
  def apply(selectorList: SelectorList): SetRuleSelectorResponse = {
    val __obj = js.Dynamic.literal(selectorList = selectorList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRuleSelectorResponse]
  }
  
  @scala.inline
  implicit class SetRuleSelectorResponseMutableBuilder[Self <: SetRuleSelectorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectorList(value: SelectorList): Self = StObject.set(x, "selectorList", value.asInstanceOf[js.Any])
  }
}
