package typings.jpm.anon

import typings.jpm.contextMenuMod.Context
import typings.jpm.contextMenuMod.ItemMenuSeparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentScript extends StObject {
  
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  
  var context: js.UndefOr[js.Array[Context]] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var items: js.Array[ItemMenuSeparator] = js.native
  
  var label: String = js.native
  
  def onMessage(): Unit = js.native
  def onMessage(message: js.Any): Unit = js.native
}
