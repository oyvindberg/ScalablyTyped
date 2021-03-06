package typings.baseui.datepickerMod

import typings.react.mod.Component
import typings.std.Date
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/datepicker", "Datepicker")
@js.native
class Datepicker protected ()
  extends Component[DatepickerProps, DatepickerState, js.Any] {
  def this(props: DatepickerProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: DatepickerProps, context: js.Any) = this()
  
  def close(): Unit = js.native
  
  def focusCalendar(): Unit = js.native
  
  def formatDate(date: js.Array[Date], formatString: String): String | js.Array[String] = js.native
  def formatDate(date: Date, formatString: String): String | js.Array[String] = js.native
  
  def formatDisplayValue(date: js.Array[Date]): String = js.native
  def formatDisplayValue(date: Date): String = js.native
  
  def handleEsc(): Unit = js.native
  
  def handleInputBlur(): Unit = js.native
  
  def handleKeyDown(event: KeyboardEvent): Unit = js.native
  
  def onChange(data: typings.baseui.anon.Date): Unit = js.native
  
  def open(): Unit = js.native
}
