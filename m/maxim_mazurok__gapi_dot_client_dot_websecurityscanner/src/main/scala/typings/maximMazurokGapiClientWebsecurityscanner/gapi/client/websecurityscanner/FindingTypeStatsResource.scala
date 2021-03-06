package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientWebsecurityscanner.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingTypeStatsResource extends StObject {
  
  /** List all FindingTypeStats under a given ScanRun. */
  def list(): Request[ListFindingTypeStatsResponse] = js.native
  def list(request: Fields): Request[ListFindingTypeStatsResponse] = js.native
}
