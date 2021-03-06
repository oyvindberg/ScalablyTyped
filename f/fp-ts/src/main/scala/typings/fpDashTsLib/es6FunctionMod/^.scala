package typings
package fpDashTsLib.es6FunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/function", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val phantom: js.Any = js.native
  def absurd[A](`_`: scala.Nothing): A = js.native
  def and[A](p1: Predicate[A], p2: Predicate[A]): Predicate[A] = js.native
  @JSName("apply")
  def apply[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, B] = js.native
  def applyFlipped[A](a: A): js.Function1[/* f */ js.Function1[/* a */ A, _], _] = js.native
  def compose[A, B, C](bc: js.Function1[/* b */ B, C], ab: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, C] = js.native
  def compose[A, B, C, D](cd: js.Function1[/* c */ C, D], bc: js.Function1[/* b */ B, C], ab: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, D] = js.native
  def compose[A, B, C, D, E](
    de: js.Function1[/* d */ D, E],
    cd: js.Function1[/* c */ C, D],
    bc: js.Function1[/* b */ B, C],
    ab: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, E] = js.native
  def compose[A, B, C, D, E, F](
    ef: js.Function1[/* e */ E, F],
    de: js.Function1[/* d */ D, E],
    cd: js.Function1[/* c */ C, D],
    bc: js.Function1[/* b */ B, C],
    ab: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, F] = js.native
  def compose[A, B, C, D, E, F, G](
    fg: js.Function1[/* f */ F, G],
    ef: js.Function1[/* e */ E, F],
    de: js.Function1[/* d */ D, E],
    cd: js.Function1[/* c */ C, D],
    bc: js.Function1[/* b */ B, C],
    ab: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, G] = js.native
  def compose[A, B, C, D, E, F, G, H](
    gh: js.Function1[/* g */ G, H],
    fg: js.Function1[/* f */ F, G],
    ef: js.Function1[/* e */ E, F],
    de: js.Function1[/* d */ D, E],
    cd: js.Function1[/* c */ C, D],
    bc: js.Function1[/* b */ B, C],
    ab: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, H] = js.native
  def compose[A, B, C, D, E, F, G, H, I](
    hi: js.Function1[/* h */ H, I],
    gh: js.Function1[/* g */ G, H],
    fg: js.Function1[/* f */ F, G],
    ef: js.Function1[/* e */ E, F],
    de: js.Function1[/* d */ D, E],
    cd: js.Function1[/* c */ C, D],
    bc: js.Function1[/* b */ B, C],
    ab: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, I] = js.native
  def compose[A, B, C, D, E, F, G, H, I, J](
    ij: js.Function1[/* i */ I, J],
    hi: js.Function1[/* h */ H, I],
    gh: js.Function1[/* g */ G, H],
    fg: js.Function1[/* f */ F, G],
    ef: js.Function1[/* e */ E, F],
    de: js.Function1[/* d */ D, E],
    cd: js.Function1[/* c */ C, D],
    bc: js.Function1[/* b */ B, C],
    ab: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, J] = js.native
  def concat[A](x: fpDashTsLib.libArrayMod.Global.Array[A], y: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def constFalse(): scala.Boolean = js.native
  def constIdentity(): js.Function1[/* a */ js.Any, _] = js.native
  def constNull(): scala.Null = js.native
  def constTrue(): scala.Boolean = js.native
  def constUndefined(): js.UndefOr[scala.Nothing] = js.native
  def constVoid(): scala.Unit = js.native
  def constant[A](a: A): Lazy[A] = js.native
  def curried(f: js.Function, n: scala.Double, acc: fpDashTsLib.libArrayMod.Global.Array[_]): js.ThisFunction1[/* this */ js.Any, /* x */ js.Any, _] = js.native
  def curry[A, B, C](f: Function2[A, B, C]): Curried2[A, B, C] = js.native
  def curry[A, B, C, D](f: Function3[A, B, C, D]): Curried3[A, B, C, D] = js.native
  def curry[A, B, C, D, E](f: Function4[A, B, C, D, E]): Curried4[A, B, C, D, E] = js.native
  def curry[A, B, C, D, E, F](f: Function5[A, B, C, D, E, F]): Curried5[A, B, C, D, E, F] = js.native
  def curry[A, B, C, D, E, F, G](f: Function6[A, B, C, D, E, F, G]): Curried6[A, B, C, D, E, F, G] = js.native
  def curry[A, B, C, D, E, F, G, H](f: Function7[A, B, C, D, E, F, G, H]): Curried7[A, B, C, D, E, F, G, H] = js.native
  def curry[A, B, C, D, E, F, G, H, I](f: Function8[A, B, C, D, E, F, G, H, I]): Curried8[A, B, C, D, E, F, G, H, I] = js.native
  def curry[A, B, C, D, E, F, G, H, I, J](f: Function9[A, B, C, D, E, F, G, H, I, J]): Curried9[A, B, C, D, E, F, G, H, I, J] = js.native
  def decrement(n: scala.Double): scala.Double = js.native
  def flip[A, B, C](f: Curried2[A, B, C]): Curried2[B, A, C] = js.native
  def flow[A /* <: fpDashTsLib.libArrayMod.Global.Array[_] */, B](ab: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, B] = js.native
  def flow[A /* <: fpDashTsLib.libArrayMod.Global.Array[_] */, B, C](ab: js.Function1[/* a */ A, B], bc: js.Function1[/* b */ B, C]): js.Function1[/* a */ A, C] = js.native
  def flow[A /* <: fpDashTsLib.libArrayMod.Global.Array[_] */, B, C, D](ab: js.Function1[/* a */ A, B], bc: js.Function1[/* b */ B, C], cd: js.Function1[/* c */ C, D]): js.Function1[/* a */ A, D] = js.native
  def flow[A /* <: fpDashTsLib.libArrayMod.Global.Array[_] */, B, C, D, E](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E]
  ): js.Function1[/* a */ A, E] = js.native
  def flow[A /* <: fpDashTsLib.libArrayMod.Global.Array[_] */, B, C, D, E, F](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F]
  ): js.Function1[/* a */ A, F] = js.native
  def flow[A /* <: fpDashTsLib.libArrayMod.Global.Array[_] */, B, C, D, E, F, G](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G]
  ): js.Function1[/* a */ A, G] = js.native
  def flow[A /* <: fpDashTsLib.libArrayMod.Global.Array[_] */, B, C, D, E, F, G, H](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H]
  ): js.Function1[/* a */ A, H] = js.native
  def flow[A /* <: fpDashTsLib.libArrayMod.Global.Array[_] */, B, C, D, E, F, G, H, I](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I]
  ): js.Function1[/* a */ A, I] = js.native
  def flow[A /* <: fpDashTsLib.libArrayMod.Global.Array[_] */, B, C, D, E, F, G, H, I, J](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J]
  ): js.Function1[/* a */ A, J] = js.native
  def identity[A](a: A): A = js.native
  def increment(n: scala.Double): scala.Double = js.native
  def not[A](predicate: Predicate[A]): Predicate[A] = js.native
  def on[B, C](op: BinaryOperation[B, C]): js.Function1[/* f */ js.Function1[/* a */ js.Any, B], BinaryOperation[_, C]] = js.native
  def or[A](p1: Predicate[A], p2: Predicate[A]): Predicate[A] = js.native
  @JSName("or")
  def or_AB1AB2ARefinement[A, B1 /* <: A */, B2 /* <: A */](p1: Refinement[A, B1], p2: Refinement[A, B2]): Refinement[A, B1 | B2] = js.native
  def pipe[A, B, C](ab: js.Function1[/* a */ A, B], bc: js.Function1[/* b */ B, C]): js.Function1[/* a */ A, C] = js.native
  def pipe[A, B, C, D](ab: js.Function1[/* a */ A, B], bc: js.Function1[/* b */ B, C], cd: js.Function1[/* c */ C, D]): js.Function1[/* a */ A, D] = js.native
  def pipe[A, B, C, D, E](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E]
  ): js.Function1[/* a */ A, E] = js.native
  def pipe[A, B, C, D, E, F](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F]
  ): js.Function1[/* a */ A, F] = js.native
  def pipe[A, B, C, D, E, F, G](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G]
  ): js.Function1[/* a */ A, G] = js.native
  def pipe[A, B, C, D, E, F, G, H](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H]
  ): js.Function1[/* a */ A, H] = js.native
  def pipe[A, B, C, D, E, F, G, H, I](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I]
  ): js.Function1[/* a */ A, I] = js.native
  def pipe[A, B, C, D, E, F, G, H, I, J](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J]
  ): js.Function1[/* a */ A, J] = js.native
  def toString(x: js.Any): java.lang.String = js.native
  def tuple[T /* <: fpDashTsLib.libArrayMod.Global.Array[_] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param t because its type T is not an array type */ t: T
  ): T = js.native
  def tupleCurried[A](a: A): js.Function1[/* b */ js.Any, js.Tuple2[A, _]] = js.native
  def unsafeCoerce[A, B](a: A): B = js.native
}

