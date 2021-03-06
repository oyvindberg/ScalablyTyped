package typings.winrt.global.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Diagnostics {
  
  @JSGlobal("Windows.Foundation.Diagnostics.ErrorOptions")
  @js.native
  object ErrorOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions with Double] = js.native
    
    /* 2 */ val forceExceptions: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.forceExceptions with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.none with Double = js.native
    
    /* 1 */ val suppressExceptions: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.suppressExceptions with Double = js.native
    
    /* 4 */ val suppressSetErrorInfo: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.suppressSetErrorInfo with Double = js.native
    
    /* 3 */ val useSetErrorInfo: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.useSetErrorInfo with Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Diagnostics.RuntimeBrokerErrorSettings")
  @js.native
  class RuntimeBrokerErrorSettings ()
    extends typings.winrt.Windows.Foundation.Diagnostics.RuntimeBrokerErrorSettings
}
