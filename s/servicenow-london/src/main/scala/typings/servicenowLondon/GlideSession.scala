package typings.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideSession extends StObject {
  
  def getClientData(paramName: String): String = js.native
  
  def getClientIP(): String = js.native
  
  def getCurrentApplicationId(): String = js.native
  
  def getLanguage(): String = js.native
  
  def getSessionToken(): String = js.native
  
  def getTimeZoneName(): String = js.native
  
  def getUrlOnStack(): String = js.native
  
  def isImpersonating(): Boolean = js.native
  
  def isInteractive(): Boolean = js.native
  
  def isLoggedIn(): Boolean = js.native
  
  def putClientData(paramName: String, paramValue: String): Unit = js.native
}
object GlideSession {
  
  @scala.inline
  def apply(
    getClientData: String => String,
    getClientIP: () => String,
    getCurrentApplicationId: () => String,
    getLanguage: () => String,
    getSessionToken: () => String,
    getTimeZoneName: () => String,
    getUrlOnStack: () => String,
    isImpersonating: () => Boolean,
    isInteractive: () => Boolean,
    isLoggedIn: () => Boolean,
    putClientData: (String, String) => Unit
  ): GlideSession = {
    val __obj = js.Dynamic.literal(getClientData = js.Any.fromFunction1(getClientData), getClientIP = js.Any.fromFunction0(getClientIP), getCurrentApplicationId = js.Any.fromFunction0(getCurrentApplicationId), getLanguage = js.Any.fromFunction0(getLanguage), getSessionToken = js.Any.fromFunction0(getSessionToken), getTimeZoneName = js.Any.fromFunction0(getTimeZoneName), getUrlOnStack = js.Any.fromFunction0(getUrlOnStack), isImpersonating = js.Any.fromFunction0(isImpersonating), isInteractive = js.Any.fromFunction0(isInteractive), isLoggedIn = js.Any.fromFunction0(isLoggedIn), putClientData = js.Any.fromFunction2(putClientData))
    __obj.asInstanceOf[GlideSession]
  }
  
  @scala.inline
  implicit class GlideSessionMutableBuilder[Self <: GlideSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetClientData(value: String => String): Self = StObject.set(x, "getClientData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetClientIP(value: () => String): Self = StObject.set(x, "getClientIP", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentApplicationId(value: () => String): Self = StObject.set(x, "getCurrentApplicationId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLanguage(value: () => String): Self = StObject.set(x, "getLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSessionToken(value: () => String): Self = StObject.set(x, "getSessionToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeZoneName(value: () => String): Self = StObject.set(x, "getTimeZoneName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUrlOnStack(value: () => String): Self = StObject.set(x, "getUrlOnStack", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsImpersonating(value: () => Boolean): Self = StObject.set(x, "isImpersonating", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInteractive(value: () => Boolean): Self = StObject.set(x, "isInteractive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLoggedIn(value: () => Boolean): Self = StObject.set(x, "isLoggedIn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPutClientData(value: (String, String) => Unit): Self = StObject.set(x, "putClientData", js.Any.fromFunction2(value))
  }
}
