package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import typings.azureSb.anon.Author
import typings.azureSb.mod.Azure.ServiceBus.DateString
import typings.azureSb.mod.Azure.ServiceBus.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queue extends ExtendedBase {
  
  var DeadLetteringOnMessageExpiration: String = js.native
  
  var LockDuration: Duration = js.native
  
  var MaxDeliveryCount: String = js.native
  
  var MessageCount: String = js.native
  
  var QueueName: String = js.native
  
  var RequiresSession: String = js.native
  
  var SupportOrdering: String = js.native
}
object Queue {
  
  @scala.inline
  def apply(
    AuthorizationRules: String,
    AutoDeleteOnIdle: String,
    CreatedAt: DateString,
    DeadLetteringOnMessageExpiration: String,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: Duration,
    EnableBatchedOperations: String,
    EnableExpress: String,
    EnablePartitioning: String,
    EntityAvailabilityStatus: String,
    IsAnonymousAccessible: String,
    LockDuration: Duration,
    MaxDeliveryCount: String,
    MaxSizeInMegabytes: String,
    MessageCount: String,
    QueueName: String,
    RequiresDuplicateDetection: String,
    RequiresSession: String,
    SizeInBytes: String,
    Status: EntityStatus,
    SupportOrdering: String,
    UpdatedAt: DateString,
    _underscore: Author
  ): Queue = {
    val __obj = js.Dynamic.literal(AuthorizationRules = AuthorizationRules.asInstanceOf[js.Any], AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnableExpress = EnableExpress.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], EntityAvailabilityStatus = EntityAvailabilityStatus.asInstanceOf[js.Any], IsAnonymousAccessible = IsAnonymousAccessible.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], MaxDeliveryCount = MaxDeliveryCount.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], MessageCount = MessageCount.asInstanceOf[js.Any], QueueName = QueueName.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], SupportOrdering = SupportOrdering.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
  
  @scala.inline
  implicit class QueueMutableBuilder[Self <: Queue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadLetteringOnMessageExpiration(value: String): Self = StObject.set(x, "DeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockDuration(value: Duration): Self = StObject.set(x, "LockDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDeliveryCount(value: String): Self = StObject.set(x, "MaxDeliveryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageCount(value: String): Self = StObject.set(x, "MessageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueName(value: String): Self = StObject.set(x, "QueueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresSession(value: String): Self = StObject.set(x, "RequiresSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportOrdering(value: String): Self = StObject.set(x, "SupportOrdering", value.asInstanceOf[js.Any])
  }
}
