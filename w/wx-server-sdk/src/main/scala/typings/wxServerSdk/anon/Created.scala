package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Created extends StObject {
  
  var created: typings.wxServerSdk.wxServerSdkNumbers.`0` | typings.wxServerSdk.wxServerSdkNumbers.`1` = js.native
  
  var updated: typings.wxServerSdk.wxServerSdkNumbers.`0` | typings.wxServerSdk.wxServerSdkNumbers.`1` = js.native
}
object Created {
  
  @scala.inline
  def apply(
    created: typings.wxServerSdk.wxServerSdkNumbers.`0` | typings.wxServerSdk.wxServerSdkNumbers.`1`,
    updated: typings.wxServerSdk.wxServerSdkNumbers.`0` | typings.wxServerSdk.wxServerSdkNumbers.`1`
  ): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
  
  @scala.inline
  implicit class CreatedMutableBuilder[Self <: Created] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: typings.wxServerSdk.wxServerSdkNumbers.`0` | typings.wxServerSdk.wxServerSdkNumbers.`1`): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: typings.wxServerSdk.wxServerSdkNumbers.`0` | typings.wxServerSdk.wxServerSdkNumbers.`1`): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
