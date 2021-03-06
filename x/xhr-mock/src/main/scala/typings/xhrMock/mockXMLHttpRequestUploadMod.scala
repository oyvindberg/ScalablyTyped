package typings.xhrMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockXMLHttpRequestUploadMod {
  
  @JSImport("xhr-mock/lib/MockXMLHttpRequestUpload", JSImport.Default)
  @js.native
  class default () extends MockXMLHttpRequestUpload
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.EventTarget because Already inherited
  - typings.std.XMLHttpRequestEventTarget because Already inherited
  - typings.std.XMLHttpRequestUpload because var conflicts: onabort, onerror, onload, onloadend, onloadstart, onprogress, ontimeout. Inlined  */ @js.native
  trait MockXMLHttpRequestUpload
    extends typings.xhrMock.mockXMLHttpRequestEventTargetMod.default
}
