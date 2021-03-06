package typings.lowlight

import typings.lowlight.lowlight.HighlightAutoOptions
import typings.lowlight.lowlight.HighlightAutoResult
import typings.lowlight.lowlight.HighlightOptions
import typings.lowlight.lowlight.HighlightResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lowlight", "highlight")
  @js.native
  def highlight(language: String, value: String): HighlightResult = js.native
  @JSImport("lowlight", "highlight")
  @js.native
  def highlight(language: String, value: String, options: HighlightOptions): HighlightResult = js.native
  
  @JSImport("lowlight", "highlightAuto")
  @js.native
  def highlightAuto(value: String): HighlightAutoResult = js.native
  @JSImport("lowlight", "highlightAuto")
  @js.native
  def highlightAuto(value: String, options: HighlightAutoOptions): HighlightAutoResult = js.native
  
  @JSImport("lowlight", "registerLanguage")
  @js.native
  def registerLanguage(name: String, syntax: js.Function): Unit = js.native
}
