package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[TRecord /* <: js.Object */, TResult](config: String): Knex[TRecord, TResult] = js.native
  def apply[TRecord /* <: js.Object */, TResult](config: Config[_]): Knex[TRecord, TResult] = js.native
}

