package typings.jestUtil

import typings.node.NodeJS.Global
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setGlobalMod {
  
  @JSImport("jest-util/build/setGlobal", JSImport.Default)
  @js.native
  def default(globalToMutate: Global, key: String, value: js.Any): Unit = js.native
  @JSImport("jest-util/build/setGlobal", JSImport.Default)
  @js.native
  def default(globalToMutate: Window, key: String, value: js.Any): Unit = js.native
}
