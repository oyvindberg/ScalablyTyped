package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ButtonOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Button")
@js.native
class Button protected ()
  extends typings.kendoUi.kendo.ui.Button {
  def this(element: Element) = this()
  def this(element: Element, options: ButtonOptions) = this()
}
object Button {
  
  @JSGlobal("kendo.ui.Button")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Button.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Button = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Button.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Button = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Button): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
