package typings.reactNativeNavigation

import typings.react.mod.FunctionComponent
import typings.reactNativeNavigation.navigationComponentPropsMod.NavigationComponentProps
import typings.reactNativeNavigation.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationFunctionComponentMod {
  
  @js.native
  trait NavigationFunctionComponent[Props] extends FunctionComponent[Props with NavigationComponentProps] {
    
    var options: js.UndefOr[
        (js.Function1[/* props */ Props with NavigationComponentProps, Options]) | Options
      ] = js.native
  }
}
