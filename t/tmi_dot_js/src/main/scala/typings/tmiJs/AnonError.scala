package typings.tmiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.UndefOr[js.Function1[/* message */ String, _]] = js.undefined
  var info: js.UndefOr[js.Function1[/* message */ String, _]] = js.undefined
  var warn: js.UndefOr[js.Function1[/* message */ String, _]] = js.undefined
}

object AnonError {
  @scala.inline
  def apply(
    error: /* message */ String => _ = null,
    info: /* message */ String => _ = null,
    warn: /* message */ String => _ = null
  ): AnonError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction1(info))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction1(warn))
    __obj.asInstanceOf[AnonError]
  }
}

