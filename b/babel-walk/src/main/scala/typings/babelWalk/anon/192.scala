package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ConditionalExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `192`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ConditionalExpression, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[ConditionalExpression, TState]] = js.native
}
object `192` {
  
  @scala.inline
  def apply[TState](): `192`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`192`[TState]]
  }
  
  @scala.inline
  implicit class `192MutableBuilder`[Self <: `192`[_], TState] (val x: Self with `192`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ConditionalExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ConditionalExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
