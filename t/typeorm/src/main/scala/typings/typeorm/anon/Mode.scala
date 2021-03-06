package typings.typeorm.anon

import typings.std.Date
import typings.typeorm.typeormStrings.optimistic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mode extends StObject {
  
  var mode: optimistic = js.native
  
  var version: Double | Date = js.native
}
object Mode {
  
  @scala.inline
  def apply(mode: optimistic, version: Double | Date): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit class ModeMutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: optimistic): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double | Date): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
