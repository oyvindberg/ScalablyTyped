package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePartnersVendorsCustomersList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The maximum number of results to be returned.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * A token identifying a page of results returned by the server.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Required. The resource name in the format
    * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourcePartnersVendorsCustomersList {
  
  @scala.inline
  def apply(): ParamsResourcePartnersVendorsCustomersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersVendorsCustomersList]
  }
  
  @scala.inline
  implicit class ParamsResourcePartnersVendorsCustomersListMutableBuilder[Self <: ParamsResourcePartnersVendorsCustomersList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
