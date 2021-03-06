package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiMqttEndpoint
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `18` extends StObject {
  
  def failure(error: Error): js.Any = js.native
  
  def success(response: KiiMqttEndpoint): js.Any = js.native
}
object `18` {
  
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiMqttEndpoint => js.Any): `18` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit class `18MutableBuilder`[Self <: `18`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: KiiMqttEndpoint => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
