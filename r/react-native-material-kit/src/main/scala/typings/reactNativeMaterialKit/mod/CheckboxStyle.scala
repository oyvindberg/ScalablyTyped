package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxStyle extends StObject {
  
  var borderOffColor: js.UndefOr[String] = js.native
  
  var borderOnColor: js.UndefOr[String] = js.native
  
  var fillColor: js.UndefOr[String] = js.native
  
  var inset: js.UndefOr[Double] = js.native
  
  var rippleColor: js.UndefOr[String] = js.native
}
object CheckboxStyle {
  
  @scala.inline
  def apply(): CheckboxStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxStyle]
  }
  
  @scala.inline
  implicit class CheckboxStyleMutableBuilder[Self <: CheckboxStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderOffColor(value: String): Self = StObject.set(x, "borderOffColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderOffColorUndefined: Self = StObject.set(x, "borderOffColor", js.undefined)
    
    @scala.inline
    def setBorderOnColor(value: String): Self = StObject.set(x, "borderOnColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderOnColorUndefined: Self = StObject.set(x, "borderOnColor", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setInset(value: Double): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
  }
}
