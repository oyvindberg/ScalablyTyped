package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleExpiration extends StObject {
  
  /**
    * Indicates at what date the object is to be deleted. Should be in GMT ISO 8601 format.
    */
  var Date: js.UndefOr[typings.awsSdk.s3controlMod.Date] = js.native
  
  /**
    * Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero positive integer.
    */
  var Days: js.UndefOr[typings.awsSdk.s3controlMod.Days] = js.native
  
  /**
    * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete marker will be expired. If set to false, the policy takes no action. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
    */
  var ExpiredObjectDeleteMarker: js.UndefOr[typings.awsSdk.s3controlMod.ExpiredObjectDeleteMarker] = js.native
}
object LifecycleExpiration {
  
  @scala.inline
  def apply(): LifecycleExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleExpiration]
  }
  
  @scala.inline
  implicit class LifecycleExpirationMutableBuilder[Self <: LifecycleExpiration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
    
    @scala.inline
    def setDays(value: Days): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysUndefined: Self = StObject.set(x, "Days", js.undefined)
    
    @scala.inline
    def setExpiredObjectDeleteMarker(value: ExpiredObjectDeleteMarker): Self = StObject.set(x, "ExpiredObjectDeleteMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiredObjectDeleteMarkerUndefined: Self = StObject.set(x, "ExpiredObjectDeleteMarker", js.undefined)
  }
}
