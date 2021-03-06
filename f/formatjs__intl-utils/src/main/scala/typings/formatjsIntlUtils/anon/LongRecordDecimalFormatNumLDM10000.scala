package typings.formatjsIntlUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongRecordDecimalFormatNumLDM10000 extends js.Object {
  var long: RecordDecimalFormatNumLDM10000 = js.native
  var short: RecordDecimalFormatNumLDM10000 = js.native
}

object LongRecordDecimalFormatNumLDM10000 {
  @scala.inline
  def apply(long: RecordDecimalFormatNumLDM10000, short: RecordDecimalFormatNumLDM10000): LongRecordDecimalFormatNumLDM10000 = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongRecordDecimalFormatNumLDM10000]
  }
  @scala.inline
  implicit class LongRecordDecimalFormatNumLDM10000Ops[Self <: LongRecordDecimalFormatNumLDM10000] (val x: Self) extends AnyVal {
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
    def setLong(value: RecordDecimalFormatNumLDM10000): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort(value: RecordDecimalFormatNumLDM10000): Self = this.set("short", value.asInstanceOf[js.Any])
  }
  
}

