package typings.fhirKitClient.anon

import typings.fhir.fhir.DataElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyDataElementHeaders extends StObject {
  
  var body: DataElement = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.DataElement = js.native
}
object BodyDataElementHeaders {
  
  @scala.inline
  def apply(
    body: DataElement,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.DataElement
  ): BodyDataElementHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyDataElementHeaders]
  }
  
  @scala.inline
  implicit class BodyDataElementHeadersMutableBuilder[Self <: BodyDataElementHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: DataElement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.DataElement): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
