package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "eq")
@js.native
object eqNs extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Eq = js.native
  val eqBoolean: fpDashTsLib.libEqMod.Eq[scala.Boolean] = js.native
  val eqDate: fpDashTsLib.libEqMod.Eq[stdLib.Date] = js.native
  val eqNumber: fpDashTsLib.libEqMod.Eq[scala.Double] = js.native
  val eqString: fpDashTsLib.libEqMod.Eq[java.lang.String] = js.native
  @JSName("eq")
  val eq_FeqNs: fpDashTsLib.libContravariantMod.Contravariant1[fpDashTsLib.libEqMod.URI] = js.native
  def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ fpDashTsLib.libEqMod.Eq[A], fpDashTsLib.libEqMod.Eq[B]] = js.native
  def fromEquals[A](equals: js.Function2[/* x */ A, /* y */ A, scala.Boolean]): fpDashTsLib.libEqMod.Eq[A] = js.native
  def getStructEq[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    eqs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Eq.Eq<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getStructEq with O
  ): fpDashTsLib.libEqMod.Eq[O] = js.native
  def getTupleEq[T /* <: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEqMod.Eq[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param eqs because its type T is not an array type */ eqs: T
  ): fpDashTsLib.libEqMod.Eq[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Eq.Eq<infer A>? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleEq with T
  ] = js.native
  def strictEqual[A](a: A, b: A): scala.Boolean = js.native
}

