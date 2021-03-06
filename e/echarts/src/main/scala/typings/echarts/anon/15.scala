package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `15` extends js.Object {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-map.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AreaColor] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-map.data.emphasis.label
    */
  var label: js.UndefOr[Rotate] = js.native
}
object `15` {
  
  @scala.inline
  def apply(): `15` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit class `15Ops`[Self <: `15`] (val x: Self) extends AnyVal {
    
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
    def setItemStyle(value: AreaColor): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: Rotate): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
