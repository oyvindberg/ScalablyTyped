package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudStorage.anon.StorageClass
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleRule extends StObject {
  
  var action: StorageClass | String = js.native
  
  var condition: StringDictionary[Boolean | Date | Double | String] = js.native
  
  var storageClass: js.UndefOr[String] = js.native
}
object LifecycleRule {
  
  @scala.inline
  def apply(action: StorageClass | String, condition: StringDictionary[Boolean | Date | Double | String]): LifecycleRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRule]
  }
  
  @scala.inline
  implicit class LifecycleRuleMutableBuilder[Self <: LifecycleRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: StorageClass | String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: StringDictionary[Boolean | Date | Double | String]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
  }
}
