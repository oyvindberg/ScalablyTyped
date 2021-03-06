package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.AltFieldsHealthCheck
import typings.maximMazurokGapiClientCompute.anon.FieldsHealthCheckKey
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.HealthCheckKeyOauthtoken
import typings.maximMazurokGapiClientCompute.anon.OauthtokenPrettyPrintProjectQuotaUserRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionHealthChecksResource extends StObject {
  
  /** Deletes the specified HealthCheck resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: AltFieldsHealthCheck): Request[Operation] = js.native
  
  /** Returns the specified HealthCheck resource. Gets a list of available health checks by making a list() request. */
  def get(): Request[HealthCheck] = js.native
  def get(request: FieldsHealthCheckKey): Request[HealthCheck] = js.native
  
  /** Creates a HealthCheck resource in the specified project using the data included in the request. */
  def insert(request: OauthtokenPrettyPrintProjectQuotaUserRegion): Request[Operation] = js.native
  def insert(request: typings.maximMazurokGapiClientCompute.anon.Project, body: HealthCheck): Request[Operation] = js.native
  
  /** Retrieves the list of HealthCheck resources available to the specified project. */
  def list(): Request[HealthCheckList] = js.native
  def list(request: Filter): Request[HealthCheckList] = js.native
  
  def patch(request: AltFieldsHealthCheck, body: HealthCheck): Request[Operation] = js.native
  /**
    * Updates a HealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and
    * processing rules.
    */
  def patch(request: HealthCheckKeyOauthtoken): Request[Operation] = js.native
  
  def update(request: AltFieldsHealthCheck, body: HealthCheck): Request[Operation] = js.native
  /** Updates a HealthCheck resource in the specified project using the data included in the request. */
  def update(request: HealthCheckKeyOauthtoken): Request[Operation] = js.native
}
