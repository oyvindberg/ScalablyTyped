package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramEditableRotateStroke extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DiagramEditableRotateStroke {
  
  @scala.inline
  def apply(): DiagramEditableRotateStroke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableRotateStroke]
  }
  
  @scala.inline
  implicit class DiagramEditableRotateStrokeMutableBuilder[Self <: DiagramEditableRotateStroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
