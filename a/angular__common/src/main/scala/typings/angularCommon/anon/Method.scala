package typings.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.angularCommonStrings.arraybuffer
import typings.angularCommon.angularCommonStrings.blob
import typings.angularCommon.angularCommonStrings.json
import typings.angularCommon.angularCommonStrings.text
import typings.angularCommon.httpHttpMod.HttpHeaders
import typings.angularCommon.httpHttpMod.HttpParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Method[T] extends StObject {
  
  var body: js.UndefOr[T | Null] = js.native
  
  var headers: js.UndefOr[HttpHeaders] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var params: js.UndefOr[HttpParams] = js.native
  
  var reportProgress: js.UndefOr[Boolean] = js.native
  
  var responseType: js.UndefOr[arraybuffer | blob | json | text] = js.native
  
  var setHeaders: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  
  var setParams: js.UndefOr[StringDictionary[String]] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object Method {
  
  @scala.inline
  def apply[T](): Method[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Method[T]]
  }
  
  @scala.inline
  implicit class MethodMutableBuilder[Self <: Method[_], T] (val x: Self with Method[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyNull: Self = StObject.set(x, "body", null)
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setParams(value: HttpParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
    
    @scala.inline
    def setResponseType(value: arraybuffer | blob | json | text): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setSetHeaders(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "setHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
    
    @scala.inline
    def setSetParams(value: StringDictionary[String]): Self = StObject.set(x, "setParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetParamsUndefined: Self = StObject.set(x, "setParams", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
