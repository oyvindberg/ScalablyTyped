package typings.ejWebAll.anon

import typings.ejWebAll.ej.PivotSchemaDesigner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPivotSchemaDesigner extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: PivotSchemaDesigner = js.native
}
object TypeofPivotSchemaDesigner {
  
  @scala.inline
  def apply(Locale: js.Any, fn: PivotSchemaDesigner): TypeofPivotSchemaDesigner = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotSchemaDesigner]
  }
  
  @scala.inline
  implicit class TypeofPivotSchemaDesignerMutableBuilder[Self <: TypeofPivotSchemaDesigner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: PivotSchemaDesigner): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
