package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeExpandedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the expanded node object.
    */
  var node: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object NodeExpandedEventUIParam {
  
  @scala.inline
  def apply(): NodeExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeExpandedEventUIParam]
  }
  
  @scala.inline
  implicit class NodeExpandedEventUIParamMutableBuilder[Self <: NodeExpandedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: js.Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
