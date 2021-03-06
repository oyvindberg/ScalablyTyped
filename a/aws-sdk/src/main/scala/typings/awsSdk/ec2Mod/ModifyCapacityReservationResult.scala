package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyCapacityReservationResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.native
}
object ModifyCapacityReservationResult {
  
  @scala.inline
  def apply(): ModifyCapacityReservationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCapacityReservationResult]
  }
  
  @scala.inline
  implicit class ModifyCapacityReservationResultMutableBuilder[Self <: ModifyCapacityReservationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
