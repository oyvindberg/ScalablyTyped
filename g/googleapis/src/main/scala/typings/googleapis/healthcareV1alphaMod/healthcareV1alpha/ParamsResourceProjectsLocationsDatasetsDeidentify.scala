package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsDatasetsDeidentify extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDeidentifyDatasetRequest] = js.native
  
  /**
    * Source dataset resource name. (e.g.,
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`).
    */
  var sourceDataset: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsDatasetsDeidentify {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsDatasetsDeidentify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsDeidentify]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsDatasetsDeidentifyMutableBuilder[Self <: ParamsResourceProjectsLocationsDatasetsDeidentify] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaDeidentifyDatasetRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSourceDataset(value: String): Self = StObject.set(x, "sourceDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDatasetUndefined: Self = StObject.set(x, "sourceDataset", js.undefined)
  }
}
