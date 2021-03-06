package typings.useIsomorphicLayoutEffect

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
    * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
    * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
    *
    * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
    *
    * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
    * `componentDidMount` and `componentDidUpdate`.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#uselayouteffect
    */
  /* was `typeof useLayoutEffect` */
  @JSImport("use-isomorphic-layout-effect/dist/declarations/src", JSImport.Default)
  @js.native
  def default(effect: EffectCallback): Unit = js.native
  /* was `typeof useLayoutEffect` */
  @JSImport("use-isomorphic-layout-effect/dist/declarations/src", JSImport.Default)
  @js.native
  def default(effect: EffectCallback, deps: DependencyList): Unit = js.native
}
