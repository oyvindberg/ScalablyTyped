package typings
package fpDashTsLib.es6AlternativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative3C[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L]
  extends fpDashTsLib.es6ApplicativeMod.Applicative3C[F, U, L]
     with fpDashTsLib.es6PlusMod.Plus3C[F, U, L]

object Alternative3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    alt: (fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any], fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any],
    ap: (fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any],
    zero: () => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any]
  ): Alternative3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Alternative3C[F, U, L]]
  }
}

