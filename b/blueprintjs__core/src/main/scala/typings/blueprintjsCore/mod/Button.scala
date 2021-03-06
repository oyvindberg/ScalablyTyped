package typings.blueprintjsCore.mod

import typings.blueprintjsCore.abstractButtonMod.IButtonProps
import typings.react.mod.ButtonHTMLAttributes
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Button")
@js.native
class Button protected ()
  extends typings.blueprintjsCore.componentsMod.Button {
  def this(props: IButtonProps with ButtonHTMLAttributes[HTMLButtonElement]) = this()
  def this(props: IButtonProps with ButtonHTMLAttributes[HTMLButtonElement], context: js.Any) = this()
}
/* static members */
object Button {
  
  @JSImport("@blueprintjs/core", "Button")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Button.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
