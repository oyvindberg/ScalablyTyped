package typings.jasmineDashExpect.distToBeIso8601Mod._Global_

import typings.jasmineDashExpect.distToBeIso8601Mod.ToBeIso8601
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeIso8601")
    var toBeIso8601_Original: ToBeIso8601 = js.native
    def toBeIso8601(): Boolean = js.native
    def toBeIso8601(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

