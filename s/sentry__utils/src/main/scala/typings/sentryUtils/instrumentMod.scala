package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instrumentMod {
  
  @JSImport("@sentry/utils/dist/instrument", "addInstrumentationHandler")
  @js.native
  def addInstrumentationHandler(handler: InstrumentHandler): Unit = js.native
  
  @js.native
  trait InstrumentHandler extends StObject {
    
    def callback(data: js.Any): Unit = js.native
    @JSName("callback")
    var callback_Original: InstrumentHandlerCallback = js.native
    
    var `type`: InstrumentHandlerType = js.native
  }
  
  type InstrumentHandlerCallback = js.Function1[/* data */ js.Any, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryUtils.sentryUtilsStrings.console
    - typings.sentryUtils.sentryUtilsStrings.dom
    - typings.sentryUtils.sentryUtilsStrings.fetch
    - typings.sentryUtils.sentryUtilsStrings.history
    - typings.sentryUtils.sentryUtilsStrings.sentry
    - typings.sentryUtils.sentryUtilsStrings.xhr
    - typings.sentryUtils.sentryUtilsStrings.error
    - typings.sentryUtils.sentryUtilsStrings.unhandledrejection
  */
  trait InstrumentHandlerType extends StObject
  object InstrumentHandlerType {
    
    @scala.inline
    def console: typings.sentryUtils.sentryUtilsStrings.console = "console".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.console]
    
    @scala.inline
    def dom: typings.sentryUtils.sentryUtilsStrings.dom = "dom".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.dom]
    
    @scala.inline
    def error: typings.sentryUtils.sentryUtilsStrings.error = "error".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.error]
    
    @scala.inline
    def fetch: typings.sentryUtils.sentryUtilsStrings.fetch = "fetch".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.fetch]
    
    @scala.inline
    def history: typings.sentryUtils.sentryUtilsStrings.history = "history".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.history]
    
    @scala.inline
    def sentry: typings.sentryUtils.sentryUtilsStrings.sentry = "sentry".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.sentry]
    
    @scala.inline
    def unhandledrejection: typings.sentryUtils.sentryUtilsStrings.unhandledrejection = "unhandledrejection".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.unhandledrejection]
    
    @scala.inline
    def xhr: typings.sentryUtils.sentryUtilsStrings.xhr = "xhr".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.xhr]
  }
}
