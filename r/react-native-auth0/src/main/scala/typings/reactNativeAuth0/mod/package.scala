package typings.reactNativeAuth0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AuthParams = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type UserInfo[CustomClaims] = typings.reactNativeAuth0.anon.Email with CustomClaims
  
  @scala.inline
  def users: typings.reactNativeAuth0.mod.Users_ = typings.reactNativeAuth0.mod.^.asInstanceOf[js.Dynamic].selectDynamic("users").asInstanceOf[typings.reactNativeAuth0.mod.Users_]
}
