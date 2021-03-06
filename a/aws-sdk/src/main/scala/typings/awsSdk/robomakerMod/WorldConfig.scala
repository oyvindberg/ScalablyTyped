package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorldConfig extends StObject {
  
  /**
    * The world generated by Simulation WorldForge.
    */
  var world: js.UndefOr[Arn] = js.native
}
object WorldConfig {
  
  @scala.inline
  def apply(): WorldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldConfig]
  }
  
  @scala.inline
  implicit class WorldConfigMutableBuilder[Self <: WorldConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorld(value: Arn): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldUndefined: Self = StObject.set(x, "world", js.undefined)
  }
}
