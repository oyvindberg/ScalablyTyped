package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegrationsApi extends StObject {
  
  def create(body: CreateIntegrationRequest): CreateIntegrationResponse = js.native
  def create(body: CreateIntegrationRequest, callback: RequestCallback): CreateIntegrationResponse = js.native
  
  def get(integration: String): GetIntegrationResponse = js.native
  def get(integration: String, callback: RequestCallback): GetIntegrationResponse = js.native
  
  def list(): ListIntegrationsResponse = js.native
  def list(callback: RequestCallback): ListIntegrationsResponse = js.native
  
  def remove(integration: String): DeleteIntegrationResponse = js.native
  def remove(integration: String, callback: RequestCallback): DeleteIntegrationResponse = js.native
}
