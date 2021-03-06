package typings.ejWebAll.anon

import typings.ejWebAll.ej.PivotClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPivotClient extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: PivotClient = js.native
}
object TypeofPivotClient {
  
  @scala.inline
  def apply(Locale: js.Any, fn: PivotClient): TypeofPivotClient = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotClient]
  }
  
  @scala.inline
  implicit class TypeofPivotClientMutableBuilder[Self <: TypeofPivotClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: PivotClient): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
