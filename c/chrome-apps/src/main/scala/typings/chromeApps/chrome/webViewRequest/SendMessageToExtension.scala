package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Triggers the webviewWebRequest.*OnMessageEvent* event which are used in webviews.
  */
@js.native
trait SendMessageToExtension extends OnRequestActions {
  
  val instanceType: String = js.native
  
  val typeGuard: typings.chromeApps.chromeAppsStrings.SendMessageToExtension = js.native
}
object SendMessageToExtension {
  
  @scala.inline
  def apply(instanceType: String, typeGuard: typings.chromeApps.chromeAppsStrings.SendMessageToExtension): SendMessageToExtension = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageToExtension]
  }
  
  @scala.inline
  implicit class SendMessageToExtensionMutableBuilder[Self <: SendMessageToExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.SendMessageToExtension): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
