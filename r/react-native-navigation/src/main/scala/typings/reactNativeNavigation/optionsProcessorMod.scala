package typings.reactNativeNavigation

import typings.reactNativeNavigation.assetResolverMod.AssetService
import typings.reactNativeNavigation.colorServiceMod.ColorService
import typings.reactNativeNavigation.commandNameMod.CommandName
import typings.reactNativeNavigation.deprecationsMod.Deprecations
import typings.reactNativeNavigation.optionProcessorsStoreMod.OptionProcessorsStore
import typings.reactNativeNavigation.optionsMod.Options
import typings.reactNativeNavigation.storeMod.Store
import typings.reactNativeNavigation.uniqueIdProviderMod.UniqueIdProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsProcessorMod {
  
  @JSImport("react-native-navigation/lib/dist/commands/OptionsProcessor", "OptionsProcessor")
  @js.native
  class OptionsProcessor protected () extends StObject {
    def this(
      store: Store,
      uniqueIdProvider: UniqueIdProvider,
      optionProcessorsRegistry: OptionProcessorsStore,
      colorService: ColorService,
      assetService: AssetService,
      deprecations: Deprecations
    ) = this()
    
    var assetService: js.Any = js.native
    
    var colorService: js.Any = js.native
    
    var deprecations: js.Any = js.native
    
    var optionProcessorsRegistry: js.Any = js.native
    
    var processButtonsPassProps: js.Any = js.native
    
    var processColor: js.Any = js.native
    
    var processComponent: js.Any = js.native
    
    def processDefaultOptions(options: Options, commandName: CommandName): Unit = js.native
    
    var processImage: js.Any = js.native
    
    var processInterpolation: js.Any = js.native
    
    var processObject: js.Any = js.native
    
    def processOptions(options: Options, commandName: CommandName): Unit = js.native
    
    var processSearchBar: js.Any = js.native
    
    var processWithRegisteredProcessor: js.Any = js.native
    
    var resolveObjectPath: js.Any = js.native
    
    var store: js.Any = js.native
    
    var uniqueIdProvider: js.Any = js.native
  }
}
