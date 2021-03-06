package typings.itBatch

import typings.std.AsyncIterable
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Takes an (async) iterable that emits things and returns an async iterable that
    * emits those things in fixed-sized batches.
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    * @param {number|string} [size=1]
    * @returns {AsyncIterable<T[]>}
    */
  @JSImport("it-batch/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: AsyncIterable[T]): AsyncIterable[js.Array[T]] = js.native
  @JSImport("it-batch/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: AsyncIterable[T], size: String): AsyncIterable[js.Array[T]] = js.native
  @JSImport("it-batch/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: AsyncIterable[T], size: Double): AsyncIterable[js.Array[T]] = js.native
  @JSImport("it-batch/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: Iterable[T]): AsyncIterable[js.Array[T]] = js.native
  @JSImport("it-batch/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: Iterable[T], size: String): AsyncIterable[js.Array[T]] = js.native
  @JSImport("it-batch/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: Iterable[T], size: Double): AsyncIterable[js.Array[T]] = js.native
}
