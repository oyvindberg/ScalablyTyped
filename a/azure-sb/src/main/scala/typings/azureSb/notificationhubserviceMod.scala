package typings.azureSb

import typings.azureSb.anon.Etag
import typings.azureSb.anon.HeadersObject
import typings.azureSb.mod.Azure.ServiceBus.ListNotificationHubsOptions
import typings.azureSb.mod.Azure.ServiceBus.NotificationHubInstallation
import typings.azureSb.mod.Azure.ServiceBus.NotificationHubRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationhubserviceMod {
  
  @JSImport("azure-sb/lib/notificationhubservice", JSImport.Namespace)
  @js.native
  class ^ protected () extends NotificationHubService {
    def this(
      hubName: String,
      endpointOrConnectionString: String,
      sharedAccessKeyName: String,
      sharedAccessKeyValue: String
    ) = this()
  }
  
  @js.native
  trait NotificationHubService extends StObject {
    
    var apns: typings.azureSb.apnsserviceMod.^ = js.native
    
    def createOrUpdateInstallation(
      installation: NotificationHubInstallation,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def createOrUpdateInstallation(
      installation: NotificationHubInstallation,
      options: js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def createOrUpdateRegistration(
      registration: NotificationHubRegistration,
      options: Etag,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def createRegistrationId(
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def deleteInstallation(
      installationId: String,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def deleteInstallation(
      installationId: String,
      options: js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def deleteRegistration(
      registrationId: String,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def deleteRegistration(
      registrationId: String,
      options: Etag,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    var gcm: typings.azureSb.gcmserviceMod.^ = js.native
    
    def getInstallation(
      installationId: String,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def getInstallation(
      installationId: String,
      options: js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def getRegistration(
      registrationId: String,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def getRegistration(
      registrationId: String,
      options: js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    var hubName: String = js.native
    
    def listRegistrations(
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def listRegistrations(
      options: ListNotificationHubsOptions,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def listRegistrationsByTag(
      tag: String,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def listRegistrationsByTag(
      tag: String,
      options: ListNotificationHubsOptions,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    var mpns: typings.azureSb.mpnserviceMod.^ = js.native
    
    def patchInstallation(
      installationId: String,
      partialUpdateOperations: js.Array[_],
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def patchInstallation(
      installationId: String,
      partialUpdateOperations: js.Array[_],
      options: js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def send(
      tags: String,
      payload: String,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def send(
      tags: String,
      payload: String,
      options: HeadersObject,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def send(
      tags: String,
      payload: js.Object,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def send(
      tags: String,
      payload: js.Object,
      options: HeadersObject,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def updateRegistration(
      registration: NotificationHubRegistration,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def updateRegistration(
      registration: NotificationHubRegistration,
      options: Etag,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    var wns: typings.azureSb.wnsserviceMod.^ = js.native
  }
}
