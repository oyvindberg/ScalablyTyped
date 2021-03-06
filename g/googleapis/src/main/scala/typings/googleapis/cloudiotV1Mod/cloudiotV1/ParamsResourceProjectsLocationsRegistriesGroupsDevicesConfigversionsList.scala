package typings.googleapis.cloudiotV1Mod.cloudiotV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsRegistriesGroupsDevicesConfigversionsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The name of the device. For example,
    * `projects/p0/locations/us-central1/registries/registry0/devices/device0`
    * or
    * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The number of versions to list. Versions are listed in decreasing order
    * of the version number. The maximum number of versions retained is 10. If
    * this value is zero, it will return all the versions available.
    */
  var numVersions: js.UndefOr[Double] = js.native
}
object ParamsResourceProjectsLocationsRegistriesGroupsDevicesConfigversionsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsRegistriesGroupsDevicesConfigversionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistriesGroupsDevicesConfigversionsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsRegistriesGroupsDevicesConfigversionsListMutableBuilder[Self <: ParamsResourceProjectsLocationsRegistriesGroupsDevicesConfigversionsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumVersions(value: Double): Self = StObject.set(x, "numVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumVersionsUndefined: Self = StObject.set(x, "numVersions", js.undefined)
  }
}
