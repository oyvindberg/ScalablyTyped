package typings.fhirKitClient.anon

import typings.fhir.fhir.Endpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyEndpoint extends StObject {
  
  var body: Endpoint = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Endpoint = js.native
}
object BodyEndpoint {
  
  @scala.inline
  def apply(body: Endpoint, resourceType: typings.fhirKitClient.fhirKitClientStrings.Endpoint): BodyEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyEndpoint]
  }
  
  @scala.inline
  implicit class BodyEndpointMutableBuilder[Self <: BodyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Endpoint): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Endpoint): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
