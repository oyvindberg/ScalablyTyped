package typings.reactTextareaAutosize

import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import typings.std.UIEvent
import typings.useComposedRef.mod.UserRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-textarea-autosize/dist/declarations/src/hooks", "useComposedRef")
  @js.native
  def useComposedRef[T /* <: HTMLElement */](libRef: MutableRefObject[T | Null], userRef: UserRef[T]): js.Function1[/* instance */ T | Null, Unit] = js.native
  
  @JSImport("react-textarea-autosize/dist/declarations/src/hooks", "useWindowResizeListener")
  @js.native
  def useWindowResizeListener(listener: js.Function1[/* event */ UIEvent, _]): Unit = js.native
}
