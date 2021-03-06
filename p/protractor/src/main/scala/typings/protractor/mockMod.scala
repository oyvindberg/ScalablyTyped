package typings.protractor

import typings.protractor.configMod.Config
import typings.protractor.driverProviderMod.DriverProvider
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockMod {
  
  @JSImport("protractor/built/driverProviders/mock", "Mock")
  @js.native
  class Mock () extends DriverProvider {
    def this(config: Config) = this()
    
    /**
      * An execute function that returns a promise with a test value.
      */
    def execute(): Promise[_] = js.native
  }
  
  @JSImport("protractor/built/driverProviders/mock", "MockExecutor")
  @js.native
  class MockExecutor () extends StObject {
    
    def execute(command: js.Any): js.Any = js.native
  }
}
