package typings.rest

import org.scalablytyped.runtime.Shortcut
import typings.rest.anon.Name
import typings.rest.mod.Interceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptorJsonpMod extends Shortcut {
  
  @JSImport("rest/interceptor/jsonp", JSImport.Namespace)
  @js.native
  val ^ : Interceptor[Config] = js.native
  
  @js.native
  trait Config extends StObject {
    
    var callback: js.UndefOr[Name] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: Name): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    }
  }
  
  type _To = Interceptor[Config]
  
  /* This means you don't have to write `^`, but can instead just say `interceptorJsonpMod.foo` */
  override def _to: Interceptor[Config] = ^
}
