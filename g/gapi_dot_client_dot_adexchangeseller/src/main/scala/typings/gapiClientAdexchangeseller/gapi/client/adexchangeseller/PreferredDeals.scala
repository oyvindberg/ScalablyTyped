package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreferredDeals extends js.Object {
  /** The preferred deals returned in this list response. */
  var items: js.UndefOr[js.Array[PreferredDeal]] = js.native
  /** Kind of list this is, in this case adexchangeseller#preferredDeals. */
  var kind: js.UndefOr[String] = js.native
}

object PreferredDeals {
  @scala.inline
  def apply(): PreferredDeals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreferredDeals]
  }
  @scala.inline
  implicit class PreferredDealsOps[Self <: PreferredDeals] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: PreferredDeal*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[PreferredDeal]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

