package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkStyle extends StObject {
  
  val sheet: CSSStyleSheet | Null = js.native
}
object LinkStyle {
  
  @scala.inline
  def apply(): LinkStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkStyle]
  }
  
  @scala.inline
  implicit class LinkStyleMutableBuilder[Self <: LinkStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSheet(value: CSSStyleSheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetNull: Self = StObject.set(x, "sheet", null)
  }
}
