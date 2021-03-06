package typings.intlMessageformatParser.srcTypesMod

import typings.intlMessageformatParser.intlMessageformatParserNumbers.`0`
import typings.intlMessageformatParser.intlMessageformatParserNumbers.`1`
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.intlMessageformatParser.srcTypesMod.NumberSkeleton
  - typings.intlMessageformatParser.srcTypesMod.DateTimeSkeleton
*/
trait Skeleton extends StObject
object Skeleton {
  
  @scala.inline
  def DateTimeSkeleton(parsedOptions: DateTimeFormatOptions, pattern: String, `type`: `1`): typings.intlMessageformatParser.srcTypesMod.DateTimeSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.intlMessageformatParser.srcTypesMod.DateTimeSkeleton]
  }
  
  @scala.inline
  def NumberSkeleton(parsedOptions: NumberFormatOptions, tokens: js.Array[NumberSkeletonToken], `type`: `0`): typings.intlMessageformatParser.srcTypesMod.NumberSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.intlMessageformatParser.srcTypesMod.NumberSkeleton]
  }
}
