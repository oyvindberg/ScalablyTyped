package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libFunctorMod.Functor2C[F, L] {
  def mult[A, B](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], fb: fpDashTsLib.libHKTMod.Kind2[F, L, B]): fpDashTsLib.libHKTMod.Kind2[F, L, js.Tuple2[A, B]]
  def unit(): fpDashTsLib.libHKTMod.Kind2[F, L, scala.Unit]
}

object Monoidal2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    map: (fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, L, js.Any],
    mult: (fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, L, js.Tuple2[js.Any, js.Any]],
    unit: () => fpDashTsLib.libHKTMod.Kind2[F, L, scala.Unit]
  ): Monoidal2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mult = js.Any.fromFunction2(mult), unit = js.Any.fromFunction0(unit))
  
    __obj.asInstanceOf[Monoidal2C[F, L]]
  }
}

