package typings.intlMessageformatParser.typesMod

import typings.intlMessageformatParser.intlMessageformatParserNumbers.`0`
import typings.intlMessageformatParser.intlMessageformatParserNumbers.`1`
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.intlMessageformatParser.typesMod.NumberSkeleton
  - typings.intlMessageformatParser.typesMod.DateTimeSkeleton
*/
trait Skeleton extends StObject
object Skeleton {
  
  @scala.inline
  def DateTimeSkeleton(parsedOptions: DateTimeFormatOptions, pattern: String, `type`: `1`): typings.intlMessageformatParser.typesMod.DateTimeSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.intlMessageformatParser.typesMod.DateTimeSkeleton]
  }
  
  @scala.inline
  def NumberSkeleton(parsedOptions: NumberFormatOptions, tokens: js.Array[NumberSkeletonToken], `type`: `0`): typings.intlMessageformatParser.typesMod.NumberSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.intlMessageformatParser.typesMod.NumberSkeleton]
  }
}
