package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.WindowOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Window")
@js.native
class Window protected ()
  extends typings.kendoUi.kendo.ui.Window {
  def this(element: Element) = this()
  def this(element: Element, options: WindowOptions) = this()
}
object Window {
  
  @JSGlobal("kendo.ui.Window")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Window.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Window = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Window.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Window = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Window): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
