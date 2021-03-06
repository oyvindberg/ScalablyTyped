package typings.mdast.mod

import typings.mdast.mdastNumbers.`1`
import typings.mdast.mdastNumbers.`2`
import typings.mdast.mdastNumbers.`3`
import typings.mdast.mdastNumbers.`4`
import typings.mdast.mdastNumbers.`5`
import typings.mdast.mdastNumbers.`6`
import typings.mdast.mdastStrings.blockquote
import typings.mdast.mdastStrings.code
import typings.mdast.mdastStrings.heading
import typings.mdast.mdastStrings.html
import typings.mdast.mdastStrings.list
import typings.mdast.mdastStrings.paragraph
import typings.mdast.mdastStrings.table
import typings.mdast.mdastStrings.thematicBreak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mdast.mod.Paragraph
  - typings.mdast.mod.Heading
  - typings.mdast.mod.ThematicBreak
  - typings.mdast.mod.Blockquote
  - typings.mdast.mod.List
  - typings.mdast.mod.Table
  - typings.mdast.mod.HTML
  - typings.mdast.mod.Code
*/
trait BlockContent extends _TopLevelContent
object BlockContent {
  
  @scala.inline
  def Blockquote(children: js.Array[BlockContent], `type`: blockquote): typings.mdast.mod.Blockquote = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.Blockquote]
  }
  
  @scala.inline
  def Code(`type`: code, value: js.Any): typings.mdast.mod.Code = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.Code]
  }
  
  @scala.inline
  def HTML(`type`: html, value: js.Any): typings.mdast.mod.HTML = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.HTML]
  }
  
  @scala.inline
  def Heading(children: js.Array[PhrasingContent], depth: `1` | `2` | `3` | `4` | `5` | `6`, `type`: heading): typings.mdast.mod.Heading = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.Heading]
  }
  
  @scala.inline
  def List(children: js.Array[ListContent], `type`: list): typings.mdast.mod.List = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.List]
  }
  
  @scala.inline
  def Paragraph(children: js.Array[PhrasingContent], `type`: paragraph): typings.mdast.mod.Paragraph = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.Paragraph]
  }
  
  @scala.inline
  def Table(children: js.Array[TableContent], `type`: table): typings.mdast.mod.Table = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.Table]
  }
  
  @scala.inline
  def ThematicBreak(`type`: thematicBreak): typings.mdast.mod.ThematicBreak = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.ThematicBreak]
  }
}
