package typings.fhirKitClient.anon

import typings.fhir.fhir.DeviceUseStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyDeviceUseStatementHeaders extends StObject {
  
  var body: DeviceUseStatement = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.DeviceUseStatement = js.native
}
object BodyDeviceUseStatementHeaders {
  
  @scala.inline
  def apply(
    body: DeviceUseStatement,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.DeviceUseStatement
  ): BodyDeviceUseStatementHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyDeviceUseStatementHeaders]
  }
  
  @scala.inline
  implicit class BodyDeviceUseStatementHeadersMutableBuilder[Self <: BodyDeviceUseStatementHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: DeviceUseStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.DeviceUseStatement): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
