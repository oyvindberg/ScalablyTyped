package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPv4Range extends IpRange {
  
  // Lower address.
  var lowerAddress: js.UndefOr[String] = js.native
  
  // Upper address.
  var upperAddress: js.UndefOr[String] = js.native
}
object IPv4Range {
  
  @scala.inline
  def apply(): IPv4Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPv4Range]
  }
  
  @scala.inline
  implicit class IPv4RangeMutableBuilder[Self <: IPv4Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLowerAddress(value: String): Self = StObject.set(x, "lowerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerAddressUndefined: Self = StObject.set(x, "lowerAddress", js.undefined)
    
    @scala.inline
    def setUpperAddress(value: String): Self = StObject.set(x, "upperAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperAddressUndefined: Self = StObject.set(x, "upperAddress", js.undefined)
  }
}
