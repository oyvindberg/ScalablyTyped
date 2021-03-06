package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicebroker/v1beta1", "servicebroker_v1beta1.Resource$V1beta1")
@js.native
class ResourceV1beta1 protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * servicebroker.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias servicebroker.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaGoogleIamV1Policy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def getIamPolicy(params: ParamsResourceV1beta1Getiampolicy): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def getIamPolicy(params: ParamsResourceV1beta1Getiampolicy, callback: BodyResponseCallback[SchemaGoogleIamV1Policy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceV1beta1Getiampolicy,
    options: BodyResponseCallback[SchemaGoogleIamV1Policy],
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceV1beta1Getiampolicy, options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def getIamPolicy(
    params: ParamsResourceV1beta1Getiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
  ): Unit = js.native
  
  /**
    * servicebroker.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias servicebroker.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().GoogleIamV1__SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaGoogleIamV1Policy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def setIamPolicy(params: ParamsResourceV1beta1Setiampolicy): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def setIamPolicy(params: ParamsResourceV1beta1Setiampolicy, callback: BodyResponseCallback[SchemaGoogleIamV1Policy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceV1beta1Setiampolicy,
    options: BodyResponseCallback[SchemaGoogleIamV1Policy],
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceV1beta1Setiampolicy, options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def setIamPolicy(
    params: ParamsResourceV1beta1Setiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
  ): Unit = js.native
  
  /**
    * servicebroker.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias servicebroker.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GoogleIamV1__TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceV1beta1Testiampermissions): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceV1beta1Testiampermissions,
    callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceV1beta1Testiampermissions,
    options: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceV1beta1Testiampermissions, options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceV1beta1Testiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]
  ): Unit = js.native
}
