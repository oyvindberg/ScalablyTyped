package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Admin Data Transfer API
  *
  * Transfers user data from one user to another.
  *
  * @example
  * const {google} = require('googleapis');
  * const admin = google.admin('datatransfer_v1');
  *
  * @namespace admin
  * @type {Function}
  * @version datatransfer_v1
  * @variation datatransfer_v1
  * @param {object=} options Options for Admin
  */
@JSImport("googleapis/build/src/apis/admin/datatransfer_v1", "admin_datatransfer_v1.Admin")
@js.native
class Admin protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var applications: ResourceApplications = js.native
  
  var context: APIRequestContext = js.native
  
  var transfers: ResourceTransfers = js.native
}
