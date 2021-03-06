package typings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object webappsecCredentialManagement {
  
  /**
    * @see {@link https://www.w3.org/TR/credential-management-1/#typedefdef-credentialbodytype}
    */
  type CredentialBodyType = typings.std.FormData | typings.std.URLSearchParams
  
  /**
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dictdef-federatedcredentialinit}
    */
  type FederatedCredentialInit = typings.webappsecCredentialManagement.FederatedCredentialData
  
  /**
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#typedefdef-passwordcredentialinit}
    */
  type PasswordCredentialInit = typings.webappsecCredentialManagement.PasswordCredentialData | typings.std.HTMLFormElement
}
