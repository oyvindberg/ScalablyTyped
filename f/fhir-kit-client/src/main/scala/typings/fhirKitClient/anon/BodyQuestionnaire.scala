package typings.fhirKitClient.anon

import typings.fhir.fhir.Questionnaire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyQuestionnaire extends StObject {
  
  var body: Questionnaire = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Questionnaire = js.native
}
object BodyQuestionnaire {
  
  @scala.inline
  def apply(body: Questionnaire, resourceType: typings.fhirKitClient.fhirKitClientStrings.Questionnaire): BodyQuestionnaire = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyQuestionnaire]
  }
  
  @scala.inline
  implicit class BodyQuestionnaireMutableBuilder[Self <: BodyQuestionnaire] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Questionnaire): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Questionnaire): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
