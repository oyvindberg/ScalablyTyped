package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhaseTarget extends StObject {
  
  /**
    * The type of the target.
    */
  var `type`: Double = js.native
}
object PhaseTarget {
  
  @scala.inline
  def apply(`type`: Double): PhaseTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhaseTarget]
  }
  
  @scala.inline
  implicit class PhaseTargetMutableBuilder[Self <: PhaseTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
