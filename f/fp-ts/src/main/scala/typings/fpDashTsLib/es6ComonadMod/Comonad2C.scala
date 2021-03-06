package typings
package fpDashTsLib.es6ComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L]
  extends fpDashTsLib.es6ExtendMod.Extend2C[F, L] {
  def extract[A](ca: fpDashTsLib.es6HKTMod.Kind2[F, L, A]): A
}

object Comonad2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    extend: (fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any],
    extract: fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any] => js.Any,
    map: (fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
  ): Comonad2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Comonad2C[F, L]]
  }
}

