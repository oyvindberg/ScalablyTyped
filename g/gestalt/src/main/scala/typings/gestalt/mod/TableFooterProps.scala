package typings.gestalt.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableFooterProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.native
}
object TableFooterProps {
  
  @scala.inline
  def apply(): TableFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableFooterProps]
  }
  
  @scala.inline
  implicit class TableFooterPropsMutableBuilder[Self <: TableFooterProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
