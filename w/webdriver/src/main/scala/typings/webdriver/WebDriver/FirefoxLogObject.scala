package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirefoxLogObject extends js.Object {
  var level: FirefoxLogLevels = js.native
}

object FirefoxLogObject {
  @scala.inline
  def apply(level: FirefoxLogLevels): FirefoxLogObject = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirefoxLogObject]
  }
  @scala.inline
  implicit class FirefoxLogObjectOps[Self <: FirefoxLogObject] (val x: Self) extends AnyVal {
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
    def setLevel(value: FirefoxLogLevels): Self = this.set("level", value.asInstanceOf[js.Any])
  }
  
}

