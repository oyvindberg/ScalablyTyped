package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSIntrinsicKeyword
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `360`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSIntrinsicKeyword, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[TSIntrinsicKeyword, TState]] = js.native
}
object `360` {
  
  @scala.inline
  def apply[TState](): `360`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`360`[TState]]
  }
  
  @scala.inline
  implicit class `360MutableBuilder`[Self <: `360`[_], TState] (val x: Self with `360`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSIntrinsicKeyword], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSIntrinsicKeyword], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
