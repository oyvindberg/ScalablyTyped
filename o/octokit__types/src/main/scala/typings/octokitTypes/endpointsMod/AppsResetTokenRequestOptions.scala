package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.SlashapplicationsSlashColonclient_idSlashtoken
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsResetTokenRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: PATCH = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: SlashapplicationsSlashColonclient_idSlashtoken = js.native
}
object AppsResetTokenRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PATCH,
    request: RequestRequestOptions,
    url: SlashapplicationsSlashColonclient_idSlashtoken
  ): AppsResetTokenRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsResetTokenRequestOptions]
  }
  
  @scala.inline
  implicit class AppsResetTokenRequestOptionsMutableBuilder[Self <: AppsResetTokenRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashapplicationsSlashColonclient_idSlashtoken): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
