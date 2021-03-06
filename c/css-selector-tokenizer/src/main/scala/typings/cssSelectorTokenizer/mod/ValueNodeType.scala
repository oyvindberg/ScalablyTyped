package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`nested-item`
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.comment
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.invalid
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.item
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.string
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cssSelectorTokenizer.mod.ItemNode
  - typings.cssSelectorTokenizer.mod.NestedItemNode
  - typings.cssSelectorTokenizer.mod.StringNode
  - typings.cssSelectorTokenizer.mod.CommentNode
  - typings.cssSelectorTokenizer.mod.UrlNode
  - typings.cssSelectorTokenizer.mod.InvalidNode
*/
trait ValueNodeType extends AnyValueNode
object ValueNodeType {
  
  @scala.inline
  def CommentNode(content: String, `type`: comment): typings.cssSelectorTokenizer.mod.CommentNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.CommentNode]
  }
  
  @scala.inline
  def InvalidNode(`type`: invalid, value: String): typings.cssSelectorTokenizer.mod.InvalidNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.InvalidNode]
  }
  
  @scala.inline
  def ItemNode(name: String, `type`: item): typings.cssSelectorTokenizer.mod.ItemNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.ItemNode]
  }
  
  @scala.inline
  def NestedItemNode(name: String, nodes: js.Array[ValueNode], `type`: `nested-item`): typings.cssSelectorTokenizer.mod.NestedItemNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.NestedItemNode]
  }
  
  @scala.inline
  def StringNode(stringType: String, `type`: string, value: String): typings.cssSelectorTokenizer.mod.StringNode = {
    val __obj = js.Dynamic.literal(stringType = stringType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.StringNode]
  }
  
  @scala.inline
  def UrlNode(`type`: url, url: String): typings.cssSelectorTokenizer.mod.UrlNode = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.UrlNode]
  }
}
