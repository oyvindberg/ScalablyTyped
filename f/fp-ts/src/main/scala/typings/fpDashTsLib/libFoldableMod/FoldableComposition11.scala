package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableComposition11[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def reduce[A, B](
    fga: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, A]],
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
}

object FoldableComposition11 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](
    reduce: (fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): FoldableComposition11[F, G] = {
    val __obj = js.Dynamic.literal(reduce = js.Any.fromFunction3(reduce))
  
    __obj.asInstanceOf[FoldableComposition11[F, G]]
  }
}

