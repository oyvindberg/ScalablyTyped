package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`-2`
import typings.stellarBase.stellarBaseNumbers.`-3`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.beginSponsoringFutureReservesAlreadySponsored
import typings.stellarBase.stellarBaseStrings.beginSponsoringFutureReservesMalformed
import typings.stellarBase.stellarBaseStrings.beginSponsoringFutureReservesRecursive
import typings.stellarBase.stellarBaseStrings.beginSponsoringFutureReservesSuccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginSponsoringFutureReservesResultCode extends StObject {
  
  val name: beginSponsoringFutureReservesSuccess | beginSponsoringFutureReservesMalformed | beginSponsoringFutureReservesAlreadySponsored | beginSponsoringFutureReservesRecursive = js.native
  
  val value: `0` | `-1` | `-2` | `-3` = js.native
}
object BeginSponsoringFutureReservesResultCode {
  
  @scala.inline
  def apply(
    name: beginSponsoringFutureReservesSuccess | beginSponsoringFutureReservesMalformed | beginSponsoringFutureReservesAlreadySponsored | beginSponsoringFutureReservesRecursive,
    value: `0` | `-1` | `-2` | `-3`
  ): BeginSponsoringFutureReservesResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginSponsoringFutureReservesResultCode]
  }
  
  @scala.inline
  implicit class BeginSponsoringFutureReservesResultCodeMutableBuilder[Self <: BeginSponsoringFutureReservesResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: beginSponsoringFutureReservesSuccess | beginSponsoringFutureReservesMalformed | beginSponsoringFutureReservesAlreadySponsored | beginSponsoringFutureReservesRecursive
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
