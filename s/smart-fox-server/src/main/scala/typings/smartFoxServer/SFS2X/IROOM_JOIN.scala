package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IROOM_JOIN extends StObject {
  
  var room: SFSRoom = js.native
}
object IROOM_JOIN {
  
  @scala.inline
  def apply(room: SFSRoom): IROOM_JOIN = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_JOIN]
  }
  
  @scala.inline
  implicit class IROOM_JOINMutableBuilder[Self <: IROOM_JOIN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
