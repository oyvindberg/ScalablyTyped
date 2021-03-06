package typings.itLast

import typings.std.AsyncIterable
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns the last item of an (async) iterable, unless empty, in which case
    * return `void`.
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    * @returns {Promise<T|void>}
    */
  @JSImport("it-last/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: AsyncIterable[T]): js.Promise[Unit | T] = js.native
  @JSImport("it-last/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: Iterable[T]): js.Promise[Unit | T] = js.native
}
