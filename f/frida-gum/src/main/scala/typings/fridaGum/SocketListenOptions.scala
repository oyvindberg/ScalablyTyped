package typings.fridaGum

import typings.fridaGum.fridaGumStrings.unix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.TcpListenOptions
  - typings.fridaGum.UnixListenOptions
*/
trait SocketListenOptions extends StObject
object SocketListenOptions {
  
  @scala.inline
  def TcpListenOptions(): typings.fridaGum.TcpListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fridaGum.TcpListenOptions]
  }
  
  @scala.inline
  def UnixListenOptions(family: unix, path: String): typings.fridaGum.UnixListenOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.UnixListenOptions]
  }
}
