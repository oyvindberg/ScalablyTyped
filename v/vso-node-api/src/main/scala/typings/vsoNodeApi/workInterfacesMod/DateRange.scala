package typings.vsoNodeApi.workInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRange extends StObject {
  
  /**
    * End of the date range.
    */
  var end: Date = js.native
  
  /**
    * Start of the date range.
    */
  var start: Date = js.native
}
object DateRange {
  
  @scala.inline
  def apply(end: Date, start: Date): DateRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRange]
  }
  
  @scala.inline
  implicit class DateRangeMutableBuilder[Self <: DateRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
