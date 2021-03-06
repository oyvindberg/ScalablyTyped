package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplainEntry extends ResponseEntry {
  
  var fcldbid: String = js.native
  
  var fname: String = js.native
  
  var message: String = js.native
  
  var tcldbid: String = js.native
  
  var timestamp: Double = js.native
  
  var tname: String = js.native
}
object ComplainEntry {
  
  @scala.inline
  def apply(fcldbid: String, fname: String, message: String, tcldbid: String, timestamp: Double, tname: String): ComplainEntry = {
    val __obj = js.Dynamic.literal(fcldbid = fcldbid.asInstanceOf[js.Any], fname = fname.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tcldbid = tcldbid.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tname = tname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplainEntry]
  }
  
  @scala.inline
  implicit class ComplainEntryMutableBuilder[Self <: ComplainEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFcldbid(value: String): Self = StObject.set(x, "fcldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcldbid(value: String): Self = StObject.set(x, "tcldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTname(value: String): Self = StObject.set(x, "tname", value.asInstanceOf[js.Any])
  }
}
