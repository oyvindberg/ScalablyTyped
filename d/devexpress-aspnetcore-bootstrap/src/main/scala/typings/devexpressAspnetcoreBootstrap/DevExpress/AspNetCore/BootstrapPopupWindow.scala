package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapPopupWindow extends StObject {
  
  def getFooterImageUrl(): String = js.native
  
  def getFooterNavigateUrl(): String = js.native
  
  def getFooterText(): String = js.native
  
  def getHeaderImageUrl(): String = js.native
  
  def getHeaderNavigateUrl(): String = js.native
  
  def getHeaderText(): String = js.native
  
  val index: Double = js.native
  
  val instance: js.Any = js.native
  
  val name: String = js.native
  
  val popupControl: BootstrapPopupControl | Null = js.native
  
  def setFooterImageUrl(value: String): Unit = js.native
  
  def setFooterNavigateUrl(value: String): Unit = js.native
  
  def setFooterText(value: String): Unit = js.native
  
  def setHeaderImageUrl(value: String): Unit = js.native
  
  def setHeaderNavigateUrl(value: String): Unit = js.native
  
  def setHeaderText(value: String): Unit = js.native
}
object BootstrapPopupWindow {
  
  @scala.inline
  def apply(
    getFooterImageUrl: () => String,
    getFooterNavigateUrl: () => String,
    getFooterText: () => String,
    getHeaderImageUrl: () => String,
    getHeaderNavigateUrl: () => String,
    getHeaderText: () => String,
    index: Double,
    instance: js.Any,
    name: String,
    setFooterImageUrl: String => Unit,
    setFooterNavigateUrl: String => Unit,
    setFooterText: String => Unit,
    setHeaderImageUrl: String => Unit,
    setHeaderNavigateUrl: String => Unit,
    setHeaderText: String => Unit
  ): BootstrapPopupWindow = {
    val __obj = js.Dynamic.literal(getFooterImageUrl = js.Any.fromFunction0(getFooterImageUrl), getFooterNavigateUrl = js.Any.fromFunction0(getFooterNavigateUrl), getFooterText = js.Any.fromFunction0(getFooterText), getHeaderImageUrl = js.Any.fromFunction0(getHeaderImageUrl), getHeaderNavigateUrl = js.Any.fromFunction0(getHeaderNavigateUrl), getHeaderText = js.Any.fromFunction0(getHeaderText), index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setFooterImageUrl = js.Any.fromFunction1(setFooterImageUrl), setFooterNavigateUrl = js.Any.fromFunction1(setFooterNavigateUrl), setFooterText = js.Any.fromFunction1(setFooterText), setHeaderImageUrl = js.Any.fromFunction1(setHeaderImageUrl), setHeaderNavigateUrl = js.Any.fromFunction1(setHeaderNavigateUrl), setHeaderText = js.Any.fromFunction1(setHeaderText))
    __obj.asInstanceOf[BootstrapPopupWindow]
  }
  
  @scala.inline
  implicit class BootstrapPopupWindowMutableBuilder[Self <: BootstrapPopupWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFooterImageUrl(value: () => String): Self = StObject.set(x, "getFooterImageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFooterNavigateUrl(value: () => String): Self = StObject.set(x, "getFooterNavigateUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFooterText(value: () => String): Self = StObject.set(x, "getFooterText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeaderImageUrl(value: () => String): Self = StObject.set(x, "getHeaderImageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeaderNavigateUrl(value: () => String): Self = StObject.set(x, "getHeaderNavigateUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeaderText(value: () => String): Self = StObject.set(x, "getHeaderText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupControl(value: BootstrapPopupControl): Self = StObject.set(x, "popupControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupControlNull: Self = StObject.set(x, "popupControl", null)
    
    @scala.inline
    def setSetFooterImageUrl(value: String => Unit): Self = StObject.set(x, "setFooterImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFooterNavigateUrl(value: String => Unit): Self = StObject.set(x, "setFooterNavigateUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFooterText(value: String => Unit): Self = StObject.set(x, "setFooterText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeaderImageUrl(value: String => Unit): Self = StObject.set(x, "setHeaderImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeaderNavigateUrl(value: String => Unit): Self = StObject.set(x, "setHeaderNavigateUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeaderText(value: String => Unit): Self = StObject.set(x, "setHeaderText", js.Any.fromFunction1(value))
  }
}
