package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.BLOCK_FOLDED
import typings.yaml.utilMod.Type.BLOCK_LITERAL
import typings.yaml.utilMod.Type.PLAIN
import typings.yaml.utilMod.Type.QUOTE_DOUBLE
import typings.yaml.utilMod.Type.QUOTE_SINGLE
import typings.yaml.yamlStrings.CLIP
import typings.yaml.yamlStrings.KEEP
import typings.yaml.yamlStrings.STRIP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.yaml.parseCstMod.CST.BlockValue
  - typings.yaml.parseCstMod.CST.PlainValue
  - typings.yaml.parseCstMod.CST.QuoteValue
*/
trait Scalar extends ContentNode
object Scalar {
  
  @scala.inline
  def BlockValue(
    chomping: CLIP | KEEP | STRIP,
    hasComment: Boolean,
    hasProps: Boolean,
    header: Range,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: BLOCK_FOLDED | BLOCK_LITERAL,
    valueRangeContainsNewline: Boolean
  ): typings.yaml.parseCstMod.CST.BlockValue = {
    val __obj = js.Dynamic.literal(chomping = chomping.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yaml.parseCstMod.CST.BlockValue]
  }
  
  @scala.inline
  def PlainValue(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: PLAIN,
    valueRangeContainsNewline: Boolean
  ): typings.yaml.parseCstMod.CST.PlainValue = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yaml.parseCstMod.CST.PlainValue]
  }
  
  @scala.inline
  def QuoteValue(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: QUOTE_DOUBLE | QUOTE_SINGLE,
    valueRangeContainsNewline: Boolean
  ): typings.yaml.parseCstMod.CST.QuoteValue = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yaml.parseCstMod.CST.QuoteValue]
  }
}
