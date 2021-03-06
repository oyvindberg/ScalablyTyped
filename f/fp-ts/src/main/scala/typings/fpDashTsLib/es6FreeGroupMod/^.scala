package typings
package fpDashTsLib.es6FreeGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/FreeGroup", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.FreeGroup = js.native
  val empty: FreeGroup[scala.Nothing] = js.native
  val freeGroup: fpDashTsLib.es6MonadMod.Monad1[URI] = js.native
  def fromArray[A](E: fpDashTsLib.es6EqMod.Eq[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6EitherMod.Either[A, A]], 
    FreeGroup[A]
  ] = js.native
  def getEq[A](S: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[FreeGroup[A]] = js.native
  def getGroup[A](E: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6GroupMod.Group[FreeGroup[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[FreeGroup[A]] = js.native
  def normalize[A](E: fpDashTsLib.es6EqMod.Eq[A]): js.Function1[
    /* g */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6EitherMod.Either[A, A]], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6EitherMod.Either[A, A]]
  ] = js.native
}

