package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hangouts Chat events.
  */
@js.native
trait SchemaDeprecatedEvent extends StObject {
  
  /**
    * The form action data associated with an interactive card that was
    * clicked. Only populated for CARD_CLICKED events. See the [Interactive
    * Cards guide](/hangouts/chat/how-tos/cards-onclick) for more information.
    */
  var action: js.UndefOr[SchemaFormAction] = js.native
  
  /**
    * The URL the bot should redirect the user to after they have completed an
    * authorization or configuration flow outside of Hangouts Chat. See the
    * [Authorizing access to 3p services guide](/hangouts/chat/how-tos/auth-3p)
    * for more information.
    */
  var configCompleteRedirectUrl: js.UndefOr[String] = js.native
  
  /**
    * The timestamp indicating when the event was dispatched.
    */
  var eventTime: js.UndefOr[String] = js.native
  
  /**
    * The message that triggered the event, if applicable.
    */
  var message: js.UndefOr[SchemaMessage] = js.native
  
  /**
    * The room or DM in which the event occurred.
    */
  var space: js.UndefOr[SchemaSpace] = js.native
  
  /**
    * The bot-defined key for the thread related to the event. See the
    * thread_key field of the `spaces.message.create` request for more
    * information.
    */
  var threadKey: js.UndefOr[String] = js.native
  
  /**
    * A secret value that bots can use to verify if a request is from Google.
    * The token is randomly generated by Google, remains static, and can be
    * obtained from the Hangouts Chat API configuration page in the Cloud
    * Console. Developers can revoke/regenerate it if needed from the same
    * page.
    */
  var token: js.UndefOr[String] = js.native
  
  /**
    * The type of the event.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The user that triggered the event.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}
object SchemaDeprecatedEvent {
  
  @scala.inline
  def apply(): SchemaDeprecatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeprecatedEvent]
  }
  
  @scala.inline
  implicit class SchemaDeprecatedEventMutableBuilder[Self <: SchemaDeprecatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: SchemaFormAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setConfigCompleteRedirectUrl(value: String): Self = StObject.set(x, "configCompleteRedirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigCompleteRedirectUrlUndefined: Self = StObject.set(x, "configCompleteRedirectUrl", js.undefined)
    
    @scala.inline
    def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    @scala.inline
    def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setSpace(value: SchemaSpace): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    @scala.inline
    def setThreadKey(value: String): Self = StObject.set(x, "threadKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadKeyUndefined: Self = StObject.set(x, "threadKey", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
