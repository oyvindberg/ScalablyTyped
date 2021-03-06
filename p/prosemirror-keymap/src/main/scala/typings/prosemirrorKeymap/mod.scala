package typings.prosemirrorKeymap

import typings.prosemirrorCommands.mod.Keymap
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorView.mod.EditorView
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-keymap", "keydownHandler")
  @js.native
  def keydownHandler[S /* <: Schema[_, _] */](bindings: Keymap[S]): js.Function2[/* view */ EditorView[_], /* event */ KeyboardEvent, Boolean] = js.native
  
  @JSImport("prosemirror-keymap", "keymap")
  @js.native
  def keymap[S /* <: Schema[_, _] */](bindings: Keymap[S]): Plugin[_, _] = js.native
}
