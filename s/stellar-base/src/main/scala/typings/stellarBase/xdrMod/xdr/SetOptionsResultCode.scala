package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`-2`
import typings.stellarBase.stellarBaseNumbers.`-3`
import typings.stellarBase.stellarBaseNumbers.`-4`
import typings.stellarBase.stellarBaseNumbers.`-5`
import typings.stellarBase.stellarBaseNumbers.`-6`
import typings.stellarBase.stellarBaseNumbers.`-7`
import typings.stellarBase.stellarBaseNumbers.`-8`
import typings.stellarBase.stellarBaseNumbers.`-9`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.setOptionsBadFlags
import typings.stellarBase.stellarBaseStrings.setOptionsBadSigner
import typings.stellarBase.stellarBaseStrings.setOptionsCantChange
import typings.stellarBase.stellarBaseStrings.setOptionsInvalidHomeDomain
import typings.stellarBase.stellarBaseStrings.setOptionsInvalidInflation
import typings.stellarBase.stellarBaseStrings.setOptionsLowReserve
import typings.stellarBase.stellarBaseStrings.setOptionsSuccess
import typings.stellarBase.stellarBaseStrings.setOptionsThresholdOutOfRange
import typings.stellarBase.stellarBaseStrings.setOptionsTooManySigners
import typings.stellarBase.stellarBaseStrings.setOptionsUnknownFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOptionsResultCode extends StObject {
  
  val name: setOptionsSuccess | setOptionsLowReserve | setOptionsTooManySigners | setOptionsBadFlags | setOptionsInvalidInflation | setOptionsCantChange | setOptionsUnknownFlag | setOptionsThresholdOutOfRange | setOptionsBadSigner | setOptionsInvalidHomeDomain = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` = js.native
}
object SetOptionsResultCode {
  
  @scala.inline
  def apply(
    name: setOptionsSuccess | setOptionsLowReserve | setOptionsTooManySigners | setOptionsBadFlags | setOptionsInvalidInflation | setOptionsCantChange | setOptionsUnknownFlag | setOptionsThresholdOutOfRange | setOptionsBadSigner | setOptionsInvalidHomeDomain,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9`
  ): SetOptionsResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptionsResultCode]
  }
  
  @scala.inline
  implicit class SetOptionsResultCodeMutableBuilder[Self <: SetOptionsResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: setOptionsSuccess | setOptionsLowReserve | setOptionsTooManySigners | setOptionsBadFlags | setOptionsInvalidInflation | setOptionsCantChange | setOptionsUnknownFlag | setOptionsThresholdOutOfRange | setOptionsBadSigner | setOptionsInvalidHomeDomain
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
