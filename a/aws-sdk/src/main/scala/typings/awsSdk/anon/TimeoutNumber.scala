package typings.awsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeoutNumber extends StObject {
  
  /**
    * a timeout value in milliseconds to wait before aborting the connection. Set to 0 for no timeout.
    */
  var timeout: Double = js.native
}
object TimeoutNumber {
  
  @scala.inline
  def apply(timeout: Double): TimeoutNumber = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutNumber]
  }
  
  @scala.inline
  implicit class TimeoutNumberMutableBuilder[Self <: TimeoutNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
