package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableProfunctor2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends PipeableFunctor2[F] {
  def promap[A, B, C, D](f: js.Function1[/* a */ A, B], g: js.Function1[/* c */ C, D]): js.Function1[
    /* fbc */ fpDashTsLib.libHKTMod.Kind2[F, B, C], 
    fpDashTsLib.libHKTMod.Kind2[F, A, D]
  ]
}

object PipeableProfunctor2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, _, js.Any]
    ],
    promap: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Function1[
      /* fbc */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
    ]
  ): PipeableProfunctor2[F] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), promap = js.Any.fromFunction2(promap))
  
    __obj.asInstanceOf[PipeableProfunctor2[F]]
  }
}

