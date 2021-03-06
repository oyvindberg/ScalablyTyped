package typings.ipfsHttpServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cpMod {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/files/cp", "handler")
  @js.native
  def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  object options {
    
    object validate {
      
      object options1 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files/cp", "options.validate.options_1.allowUnknown")
        @js.native
        val allowUnknown: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files/cp", "options.validate.options_1.stripUnknown")
        @js.native
        val stripUnknown: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/files/cp", "options.validate.query")
      @js.native
      val query: js.Any = js.native
    }
  }
}
