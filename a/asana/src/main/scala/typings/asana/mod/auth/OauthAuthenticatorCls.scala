package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("asana", "auth.OauthAuthenticator")
@js.native
class OauthAuthenticatorCls protected () extends OauthAuthenticator {
  /**
    * Creates an authenticator that uses Oauth for authentication.
    *
    * @param {Object} options Configure the authenticator; must specify one
    *     of `flow` or `credentials`.
    * @option {App}           app           The app being authenticated for.
    * @option {OauthFlow}     [flow]        The flow to use to get credentials
    *     when needed.
    * @option {String|Object} [credentials] Initial credentials to use. This can
    *     be either the object returned from an access token request (which
    *     contains the token and some other metadata) or just the `access_token`
    *     field.
    * @constructor
    */
  def this(options: OauthAuthenticatorOptions) = this()
}
