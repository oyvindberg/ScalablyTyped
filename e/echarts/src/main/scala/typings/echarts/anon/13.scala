package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `13` extends js.Object {
  
  /**
    * Specify the left-top point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markArea.data.0
    */
  var `0`: js.UndefOr[ValueDim] = js.native
  
  /**
    * Specify the right-bottom point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markArea.data.1
    */
  var `1`: js.UndefOr[ValueDim] = js.native
}
object `13` {
  
  @scala.inline
  def apply(): `13` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13Ops`[Self <: `13`] (val x: Self) extends AnyVal {
    
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
    def set0(value: ValueDim): Self = this.set("0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete0: Self = this.set("0", js.undefined)
    
    @scala.inline
    def set1(value: ValueDim): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete1: Self = this.set("1", js.undefined)
  }
}
