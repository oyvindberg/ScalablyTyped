package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiStrings.delete
import typings.semanticUiApi.semanticUiApiStrings.get
import typings.semanticUiApi.semanticUiApiStrings.head
import typings.semanticUiApi.semanticUiApiStrings.options
import typings.semanticUiApi.semanticUiApiStrings.patch
import typings.semanticUiApi.semanticUiApiStrings.post
import typings.semanticUiApi.semanticUiApiStrings.put
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'method'> */
@js.native
trait PickImplmethod extends StObject {
  
  var method: post | get | put | delete | head | options | patch = js.native
}
object PickImplmethod {
  
  @scala.inline
  def apply(method: post | get | put | delete | head | options | patch): PickImplmethod = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmethod]
  }
  
  @scala.inline
  implicit class PickImplmethodMutableBuilder[Self <: PickImplmethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: post | get | put | delete | head | options | patch): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
