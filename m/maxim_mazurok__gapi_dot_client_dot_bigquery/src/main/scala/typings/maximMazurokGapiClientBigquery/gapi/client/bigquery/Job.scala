package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends StObject {
  
  /** [Required] Describes the job configuration. */
  var configuration: js.UndefOr[JobConfiguration] = js.native
  
  /** [Output-only] A hash of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** [Output-only] Opaque ID field of the job */
  var id: js.UndefOr[String] = js.native
  
  /** [Optional] Reference describing the unique-per-user name of the job. */
  var jobReference: js.UndefOr[JobReference] = js.native
  
  /** [Output-only] The type of the resource. */
  var kind: js.UndefOr[String] = js.native
  
  /** [Output-only] A URL that can be used to access this resource again. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** [Output-only] Information about the job, including starting time and ending time of the job. */
  var statistics: js.UndefOr[JobStatistics] = js.native
  
  /** [Output-only] The status of this job. Examine this value when polling an asynchronous job to see if the job is complete. */
  var status: js.UndefOr[JobStatus] = js.native
  
  /** [Output-only] Email address of the user who ran the job. */
  var user_email: js.UndefOr[String] = js.native
}
object Job {
  
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: JobConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setJobReference(value: JobReference): Self = StObject.set(x, "jobReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobReferenceUndefined: Self = StObject.set(x, "jobReference", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStatistics(value: JobStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUser_email(value: String): Self = StObject.set(x, "user_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_emailUndefined: Self = StObject.set(x, "user_email", js.undefined)
  }
}
