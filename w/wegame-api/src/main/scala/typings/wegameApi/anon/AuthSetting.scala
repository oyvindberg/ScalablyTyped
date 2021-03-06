package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthSetting extends StObject {
  
  var authSetting: typings.wegameApi.wx.types.AuthSetting = js.native
}
object AuthSetting {
  
  @scala.inline
  def apply(authSetting: typings.wegameApi.wx.types.AuthSetting): AuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
  
  @scala.inline
  implicit class AuthSettingMutableBuilder[Self <: AuthSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthSetting(value: typings.wegameApi.wx.types.AuthSetting): Self = StObject.set(x, "authSetting", value.asInstanceOf[js.Any])
  }
}
