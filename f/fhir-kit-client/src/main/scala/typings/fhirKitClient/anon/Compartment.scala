package typings.fhirKitClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compartment extends StObject {
  
  var compartment: js.UndefOr[typings.fhirKitClient.mod.Compartment] = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.mod.ResourceType = js.native
  
  var searchParams: js.UndefOr[typings.fhirKitClient.mod.SearchParams] = js.native
}
object Compartment {
  
  @scala.inline
  def apply(resourceType: typings.fhirKitClient.mod.ResourceType): Compartment = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compartment]
  }
  
  @scala.inline
  implicit class CompartmentMutableBuilder[Self <: Compartment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompartment(value: typings.fhirKitClient.mod.Compartment): Self = StObject.set(x, "compartment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompartmentUndefined: Self = StObject.set(x, "compartment", js.undefined)
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.mod.ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchParams(value: typings.fhirKitClient.mod.SearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchParamsUndefined: Self = StObject.set(x, "searchParams", js.undefined)
  }
}
