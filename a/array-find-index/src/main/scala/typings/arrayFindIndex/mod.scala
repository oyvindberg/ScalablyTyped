package typings.arrayFindIndex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("array-find-index", JSImport.Namespace)
  @js.native
  def apply[T](
    arr: js.Array[T],
    predicate: js.Function3[/* element */ T, /* index */ Double, /* array */ js.Array[T], Boolean]
  ): Double = js.native
  @JSImport("array-find-index", JSImport.Namespace)
  @js.native
  def apply[T, U](
    arr: js.Array[T],
    predicate: js.ThisFunction3[/* this */ U, /* element */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
    ctx: U
  ): Double = js.native
}
