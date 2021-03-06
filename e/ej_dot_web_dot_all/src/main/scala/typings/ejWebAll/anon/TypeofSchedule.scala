package typings.ejWebAll.anon

import typings.ejWebAll.ej.Schedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSchedule extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Schedule = js.native
}
object TypeofSchedule {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Schedule): TypeofSchedule = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSchedule]
  }
  
  @scala.inline
  implicit class TypeofScheduleMutableBuilder[Self <: TypeofSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Schedule): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
