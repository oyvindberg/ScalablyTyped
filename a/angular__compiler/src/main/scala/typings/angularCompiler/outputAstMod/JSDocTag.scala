package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompiler.anon.TagName
  - typings.angularCompiler.anon.Text
*/
trait JSDocTag extends StObject
object JSDocTag {
  
  @scala.inline
  def TagName(tagName: JSDocTagName | String): typings.angularCompiler.anon.TagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompiler.anon.TagName]
  }
  
  @scala.inline
  def Text(text: String): typings.angularCompiler.anon.Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompiler.anon.Text]
  }
}
