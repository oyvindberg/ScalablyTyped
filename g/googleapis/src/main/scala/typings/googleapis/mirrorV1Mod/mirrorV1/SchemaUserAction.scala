package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an action taken by the user that triggered a notification.
  */
@js.native
trait SchemaUserAction extends StObject {
  
  /**
    * An optional payload for the action.  For actions of type CUSTOM, this is
    * the ID of the custom menu item that was selected.
    */
  var payload: js.UndefOr[String] = js.native
  
  /**
    * The type of action. The value of this can be:   - SHARE - the user shared
    * an item.  - REPLY - the user replied to an item.  - REPLY_ALL - the user
    * replied to all recipients of an item.  - CUSTOM - the user selected a
    * custom menu item on the timeline item.  - DELETE - the user deleted the
    * item.  - PIN - the user pinned the item.  - UNPIN - the user unpinned the
    * item.  - LAUNCH - the user initiated a voice command.  In the future,
    * additional types may be added. UserActions with unrecognized types should
    * be ignored.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaUserAction {
  
  @scala.inline
  def apply(): SchemaUserAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAction]
  }
  
  @scala.inline
  implicit class SchemaUserActionMutableBuilder[Self <: SchemaUserAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
