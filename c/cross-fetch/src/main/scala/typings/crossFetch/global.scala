package typings.crossFetch

import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.ResponseInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  /* was `typeof Headers` */
  @JSGlobal("_Headers")
  @js.native
  class Headers ()
    extends typings.std.global.Headers {
    def this(init: HeadersInit) = this()
  }
  /* was `typeof Headers` */
  object Headers
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  /* was `typeof Request` */
  @JSGlobal("_Request")
  @js.native
  class Request protected ()
    extends typings.std.global.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  /* was `typeof Request` */
  object Request
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  /* was `typeof Response` */
  @JSGlobal("_Response")
  @js.native
  class Response ()
    extends typings.std.global.Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
    def this(body: Null, init: ResponseInit) = this()
  }
  /* was `typeof Response` */
  object Response {
    
    @JSGlobal("_Response.error")
    @js.native
    def error(): typings.std.Response = js.native
    
    @JSGlobal("_Response.redirect")
    @js.native
    def redirect(url: String): typings.std.Response = js.native
    @JSGlobal("_Response.redirect")
    @js.native
    def redirect(url: String, status: Double): typings.std.Response = js.native
  }
  
  /* was `typeof fetch` */
  @JSGlobal("_fetch")
  @js.native
  def fetch(input: RequestInfo): js.Promise[typings.std.Response] = js.native
  /* was `typeof fetch` */
  @JSGlobal("_fetch")
  @js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[typings.std.Response] = js.native
}
