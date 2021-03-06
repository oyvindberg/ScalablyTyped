package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.devtoolsProtocolStrings.landscapePrimary
import typings.devtoolsProtocol.devtoolsProtocolStrings.landscapeSecondary
import typings.devtoolsProtocol.devtoolsProtocolStrings.portraitPrimary
import typings.devtoolsProtocol.devtoolsProtocolStrings.portraitSecondary
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenOrientation extends StObject {
  
  /**
    * Orientation angle.
    */
  var angle: integer = js.native
  
  /**
    * Orientation type. (ScreenOrientationType enum)
    */
  var `type`: portraitPrimary | portraitSecondary | landscapePrimary | landscapeSecondary = js.native
}
object ScreenOrientation {
  
  @scala.inline
  def apply(
    angle: integer,
    `type`: portraitPrimary | portraitSecondary | landscapePrimary | landscapeSecondary
  ): ScreenOrientation = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenOrientation]
  }
  
  @scala.inline
  implicit class ScreenOrientationMutableBuilder[Self <: ScreenOrientation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: integer): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: portraitPrimary | portraitSecondary | landscapePrimary | landscapeSecondary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
