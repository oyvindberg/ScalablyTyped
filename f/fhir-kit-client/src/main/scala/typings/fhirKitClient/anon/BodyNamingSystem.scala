package typings.fhirKitClient.anon

import typings.fhir.fhir.NamingSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyNamingSystem extends StObject {
  
  var body: NamingSystem = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.NamingSystem = js.native
}
object BodyNamingSystem {
  
  @scala.inline
  def apply(body: NamingSystem, resourceType: typings.fhirKitClient.fhirKitClientStrings.NamingSystem): BodyNamingSystem = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyNamingSystem]
  }
  
  @scala.inline
  implicit class BodyNamingSystemMutableBuilder[Self <: BodyNamingSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: NamingSystem): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.NamingSystem): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
