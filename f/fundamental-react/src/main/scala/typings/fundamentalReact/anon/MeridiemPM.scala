package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeridiemPM extends StObject {
  
  var meridiemAM: String = js.native
  
  var meridiemPM: String = js.native
}
object MeridiemPM {
  
  @scala.inline
  def apply(meridiemAM: String, meridiemPM: String): MeridiemPM = {
    val __obj = js.Dynamic.literal(meridiemAM = meridiemAM.asInstanceOf[js.Any], meridiemPM = meridiemPM.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeridiemPM]
  }
  
  @scala.inline
  implicit class MeridiemPMMutableBuilder[Self <: MeridiemPM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeridiemAM(value: String): Self = StObject.set(x, "meridiemAM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeridiemPM(value: String): Self = StObject.set(x, "meridiemPM", value.asInstanceOf[js.Any])
  }
}
