package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigquery.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowAccessPoliciesResource extends StObject {
  
  /** Lists all row access policies on the specified table. */
  def list(): Request[ListRowAccessPoliciesResponse] = js.native
  def list(request: PageSize): Request[ListRowAccessPoliciesResponse] = js.native
}
