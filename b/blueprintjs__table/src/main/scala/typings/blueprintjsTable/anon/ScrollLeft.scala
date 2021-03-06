package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollLeft extends StObject {
  
  var scrollLeft: Double = js.native
  
  var scrollTop: Double = js.native
}
object ScrollLeft {
  
  @scala.inline
  def apply(scrollLeft: Double, scrollTop: Double): ScrollLeft = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollLeft]
  }
  
  @scala.inline
  implicit class ScrollLeftMutableBuilder[Self <: ScrollLeft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
