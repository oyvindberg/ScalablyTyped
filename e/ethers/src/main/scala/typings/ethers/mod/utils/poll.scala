package typings.ethers.mod.utils

import typings.ethersprojectWeb.mod.PollOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "utils.poll")
@js.native
object poll extends js.Object {
  
  def apply[T](func: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
  def apply[T](func: js.Function0[js.Promise[T]], options: PollOptions): js.Promise[T] = js.native
}
