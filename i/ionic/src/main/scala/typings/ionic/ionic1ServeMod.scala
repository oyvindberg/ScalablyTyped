package typings.ionic

import typings.ionic.definitionsMod.Ionic1ServeOptions
import typings.ionic.ionic1Mod.Ionic1Project
import typings.ionic.libServeMod.ServeRunner
import typings.ionic.libServeMod.ServeRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionic1ServeMod {
  
  @JSImport("ionic/lib/project/ionic1/serve", "Ionic1ServeRunner")
  @js.native
  class Ionic1ServeRunner protected () extends ServeRunner[Ionic1ServeOptions] {
    def this(e: Ionic1ServeRunnerDeps) = this()
    
    @JSName("e")
    val e_Ionic1ServeRunner: Ionic1ServeRunnerDeps = js.native
  }
  
  @js.native
  trait Ionic1ServeRunnerDeps extends ServeRunnerDeps {
    
    @JSName("project")
    val project_Ionic1ServeRunnerDeps: Ionic1Project = js.native
  }
}
