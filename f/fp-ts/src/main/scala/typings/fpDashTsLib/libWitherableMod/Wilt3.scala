package typings
package fpDashTsLib.libWitherableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wilt3[W /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  def apply(
    F: fpDashTsLib.libApplicativeMod.Applicative1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Kind3[W, _, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[W, _, _, _], fpDashTsLib.libHKTMod.Kind3[W, _, _, _]]
    ]
  ] = js.native
  def apply(
    F: fpDashTsLib.libApplicativeMod.Applicative2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Kind3[W, _, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[W, _, _, _], fpDashTsLib.libHKTMod.Kind3[W, _, _, _]]
    ]
  ] = js.native
  def apply(
    F: fpDashTsLib.libApplicativeMod.Applicative3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ]
  ): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Kind3[W, _, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        fpDashTsLib.libEitherMod.Either[_, _]
      ]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[W, _, _, _], fpDashTsLib.libHKTMod.Kind3[W, _, _, _]]
    ]
  ] = js.native
  def apply[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Kind3[W, _, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.HKT[
      F, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[W, _, _, _], fpDashTsLib.libHKTMod.Kind3[W, _, _, _]]
    ]
  ] = js.native
  def apply[FL](
    F: fpDashTsLib.libApplicativeMod.Applicative2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      FL
    ]
  ): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Kind3[W, _, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[W, _, _, _], fpDashTsLib.libHKTMod.Kind3[W, _, _, _]]
    ]
  ] = js.native
  def apply[FU, FL](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      FU, 
      FL
    ]
  ): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Kind3[W, _, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        FU, 
        FL, 
        fpDashTsLib.libEitherMod.Either[_, _]
      ]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      FU, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[W, _, _, _], fpDashTsLib.libHKTMod.Kind3[W, _, _, _]]
    ]
  ] = js.native
}

