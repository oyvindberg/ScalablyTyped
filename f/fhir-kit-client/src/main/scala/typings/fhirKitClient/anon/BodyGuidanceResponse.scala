package typings.fhirKitClient.anon

import typings.fhir.fhir.GuidanceResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyGuidanceResponse extends StObject {
  
  var body: GuidanceResponse = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.GuidanceResponse = js.native
}
object BodyGuidanceResponse {
  
  @scala.inline
  def apply(body: GuidanceResponse, resourceType: typings.fhirKitClient.fhirKitClientStrings.GuidanceResponse): BodyGuidanceResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyGuidanceResponse]
  }
  
  @scala.inline
  implicit class BodyGuidanceResponseMutableBuilder[Self <: BodyGuidanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: GuidanceResponse): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.GuidanceResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
