package typings.urqlCore.anon

import typings.std.Error
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchOptionsUrl extends js.Object {
  var fetchOptions: RequestInit = js.native
  var url: String = js.native
  var value: Error = js.native
}

object FetchOptionsUrl {
  @scala.inline
  def apply(fetchOptions: RequestInit, url: String, value: Error): FetchOptionsUrl = {
    val __obj = js.Dynamic.literal(fetchOptions = fetchOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptionsUrl]
  }
  @scala.inline
  implicit class FetchOptionsUrlOps[Self <: FetchOptionsUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFetchOptions(value: RequestInit): Self = this.set("fetchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Error): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

