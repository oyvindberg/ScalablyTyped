package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutRefreshingEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the splitter instance.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object LayoutRefreshingEventUIParam {
  
  @scala.inline
  def apply(): LayoutRefreshingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutRefreshingEventUIParam]
  }
  
  @scala.inline
  implicit class LayoutRefreshingEventUIParamMutableBuilder[Self <: LayoutRefreshingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
