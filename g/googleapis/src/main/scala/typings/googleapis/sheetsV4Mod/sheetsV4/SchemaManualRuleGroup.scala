package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A group name and a list of items from the source data that should be placed
  * in the group with this name.
  */
@js.native
trait SchemaManualRuleGroup extends StObject {
  
  /**
    * The group name, which must be a string. Each group in a given ManualRule
    * must have a unique group name.
    */
  var groupName: js.UndefOr[SchemaExtendedValue] = js.native
  
  /**
    * The items in the source data that should be placed into this group. Each
    * item may be a string, number, or boolean. Items may appear in at most one
    * group within a given ManualRule. Items that do not appear in any group
    * will appear on their own.
    */
  var items: js.UndefOr[js.Array[SchemaExtendedValue]] = js.native
}
object SchemaManualRuleGroup {
  
  @scala.inline
  def apply(): SchemaManualRuleGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManualRuleGroup]
  }
  
  @scala.inline
  implicit class SchemaManualRuleGroupMutableBuilder[Self <: SchemaManualRuleGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: SchemaExtendedValue): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaExtendedValue]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaExtendedValue*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
