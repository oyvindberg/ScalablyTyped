package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.PaginationOptions> */
@js.native
trait ListTopicsOptions extends StObject {
  
  var skip: js.UndefOr[Double] = js.native
  
  var top: js.UndefOr[Double] = js.native
}
object ListTopicsOptions {
  
  @scala.inline
  def apply(): ListTopicsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicsOptions]
  }
  
  @scala.inline
  implicit class ListTopicsOptionsMutableBuilder[Self <: ListTopicsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
