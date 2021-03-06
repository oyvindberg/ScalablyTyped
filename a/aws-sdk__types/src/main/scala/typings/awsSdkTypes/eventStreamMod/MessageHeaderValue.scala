package typings.awsSdkTypes.eventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.binary
import typings.awsSdkTypes.awsSdkTypesStrings.boolean
import typings.awsSdkTypes.awsSdkTypesStrings.byte
import typings.awsSdkTypes.awsSdkTypesStrings.integer
import typings.awsSdkTypes.awsSdkTypesStrings.long
import typings.awsSdkTypes.awsSdkTypesStrings.short
import typings.awsSdkTypes.awsSdkTypesStrings.string
import typings.awsSdkTypes.awsSdkTypesStrings.timestamp
import typings.awsSdkTypes.awsSdkTypesStrings.uuid
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkTypes.eventStreamMod.BooleanHeaderValue
  - typings.awsSdkTypes.eventStreamMod.ByteHeaderValue
  - typings.awsSdkTypes.eventStreamMod.ShortHeaderValue
  - typings.awsSdkTypes.eventStreamMod.IntegerHeaderValue
  - typings.awsSdkTypes.eventStreamMod.LongHeaderValue
  - typings.awsSdkTypes.eventStreamMod.BinaryHeaderValue
  - typings.awsSdkTypes.eventStreamMod.StringHeaderValue
  - typings.awsSdkTypes.eventStreamMod.TimestampHeaderValue
  - typings.awsSdkTypes.eventStreamMod.UuidHeaderValue
*/
trait MessageHeaderValue extends StObject
object MessageHeaderValue {
  
  @scala.inline
  def BinaryHeaderValue(`type`: binary, value: Uint8Array): typings.awsSdkTypes.eventStreamMod.BinaryHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.BinaryHeaderValue]
  }
  
  @scala.inline
  def BooleanHeaderValue(`type`: boolean, value: Boolean): typings.awsSdkTypes.eventStreamMod.BooleanHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.BooleanHeaderValue]
  }
  
  @scala.inline
  def ByteHeaderValue(`type`: byte, value: Double): typings.awsSdkTypes.eventStreamMod.ByteHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.ByteHeaderValue]
  }
  
  @scala.inline
  def IntegerHeaderValue(`type`: integer, value: Double): typings.awsSdkTypes.eventStreamMod.IntegerHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.IntegerHeaderValue]
  }
  
  @scala.inline
  def LongHeaderValue(`type`: long, value: Int64): typings.awsSdkTypes.eventStreamMod.LongHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.LongHeaderValue]
  }
  
  @scala.inline
  def ShortHeaderValue(`type`: short, value: Double): typings.awsSdkTypes.eventStreamMod.ShortHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.ShortHeaderValue]
  }
  
  @scala.inline
  def StringHeaderValue(`type`: string, value: String): typings.awsSdkTypes.eventStreamMod.StringHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.StringHeaderValue]
  }
  
  @scala.inline
  def TimestampHeaderValue(`type`: timestamp, value: Date): typings.awsSdkTypes.eventStreamMod.TimestampHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.TimestampHeaderValue]
  }
  
  @scala.inline
  def UuidHeaderValue(`type`: uuid, value: String): typings.awsSdkTypes.eventStreamMod.UuidHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.UuidHeaderValue]
  }
}
