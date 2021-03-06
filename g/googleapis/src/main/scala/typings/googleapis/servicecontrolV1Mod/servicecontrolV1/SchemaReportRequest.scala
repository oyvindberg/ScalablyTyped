package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for the Report method.
  */
@js.native
trait SchemaReportRequest extends StObject {
  
  /**
    * Operations to be reported.  Typically the service should report one
    * operation per request. Putting multiple operations into a single request
    * is allowed, but should be used only when multiple operations are natually
    * available at the time of the report.  If multiple operations are in a
    * single request, the total request size should be no larger than 1MB. See
    * ReportResponse.report_errors for partial failure behavior.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.native
  
  /**
    * Specifies which version of service config should be used to process the
    * request.  If unspecified or no matching version can be found, the latest
    * one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}
object SchemaReportRequest {
  
  @scala.inline
  def apply(): SchemaReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportRequest]
  }
  
  @scala.inline
  implicit class SchemaReportRequestMutableBuilder[Self <: SchemaReportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperations(value: js.Array[SchemaOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: SchemaOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
    
    @scala.inline
    def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
  }
}
