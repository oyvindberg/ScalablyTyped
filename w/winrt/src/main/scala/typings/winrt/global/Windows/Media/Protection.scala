package typings.winrt.global.Windows.Media

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Media.Protection.RenewalStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Protection {
  
  @JSGlobal("Windows.Media.Protection.ComponentLoadFailedEventArgs")
  @js.native
  class ComponentLoadFailedEventArgs ()
    extends typings.winrt.Windows.Media.Protection.ComponentLoadFailedEventArgs
  
  @JSGlobal("Windows.Media.Protection.ComponentRenewal")
  @js.native
  class ComponentRenewal ()
    extends typings.winrt.Windows.Media.Protection.ComponentRenewal
  /* static members */
  object ComponentRenewal {
    
    @JSGlobal("Windows.Media.Protection.ComponentRenewal.renewSystemComponentsAsync")
    @js.native
    def renewSystemComponentsAsync(information: typings.winrt.Windows.Media.Protection.RevocationAndRenewalInformation): IAsyncOperationWithProgress[RenewalStatus, Double] = js.native
  }
  
  @JSGlobal("Windows.Media.Protection.MediaProtectionManager")
  @js.native
  class MediaProtectionManager ()
    extends typings.winrt.Windows.Media.Protection.MediaProtectionManager
  
  @JSGlobal("Windows.Media.Protection.MediaProtectionServiceCompletion")
  @js.native
  class MediaProtectionServiceCompletion ()
    extends typings.winrt.Windows.Media.Protection.MediaProtectionServiceCompletion
  
  @JSGlobal("Windows.Media.Protection.RenewalStatus")
  @js.native
  object RenewalStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Protection.RenewalStatus with Double] = js.native
    
    /* 3 */ val appComponentsMayNeedUpdating: typings.winrt.Windows.Media.Protection.RenewalStatus.appComponentsMayNeedUpdating with Double = js.native
    
    /* 4 */ val noComponentsFound: typings.winrt.Windows.Media.Protection.RenewalStatus.noComponentsFound with Double = js.native
    
    /* 0 */ val notStarted: typings.winrt.Windows.Media.Protection.RenewalStatus.notStarted with Double = js.native
    
    /* 1 */ val updatesInProgress: typings.winrt.Windows.Media.Protection.RenewalStatus.updatesInProgress with Double = js.native
    
    /* 2 */ val userCancelled: typings.winrt.Windows.Media.Protection.RenewalStatus.userCancelled with Double = js.native
  }
  
  @JSGlobal("Windows.Media.Protection.RevocationAndRenewalInformation")
  @js.native
  class RevocationAndRenewalInformation ()
    extends typings.winrt.Windows.Media.Protection.RevocationAndRenewalInformation
  
  @JSGlobal("Windows.Media.Protection.RevocationAndRenewalItem")
  @js.native
  class RevocationAndRenewalItem ()
    extends typings.winrt.Windows.Media.Protection.RevocationAndRenewalItem
  
  @JSGlobal("Windows.Media.Protection.RevocationAndRenewalReasons")
  @js.native
  object RevocationAndRenewalReasons extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons with Double] = js.native
    
    /* 2 */ val appComponent: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.appComponent with Double = js.native
    
    /* 12 */ val bootDriverVerificationFailed: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.bootDriverVerificationFailed with Double = js.native
    
    /* 8 */ val componentCertificateRevoked: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentCertificateRevoked with Double = js.native
    
    /* 10 */ val componentHighSecurityCertificateRevoked: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentHighSecurityCertificateRevoked with Double = js.native
    
    /* 11 */ val componentLowSecurityCertificateRevoked: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentLowSecurityCertificateRevoked with Double = js.native
    
    /* 6 */ val componentRevoked: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentRevoked with Double = js.native
    
    /* 13 */ val componentSignedWithTestCertificate: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentSignedWithTestCertificate with Double = js.native
    
    /* 14 */ val encryptionFailure: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.encryptionFailure with Double = js.native
    
    /* 5 */ val globalRevocationListAbsent: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.globalRevocationListAbsent with Double = js.native
    
    /* 3 */ val globalRevocationListLoadFailed: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.globalRevocationListLoadFailed with Double = js.native
    
    /* 7 */ val invalidComponentCertificateExtendedKeyUse: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.invalidComponentCertificateExtendedKeyUse with Double = js.native
    
    /* 9 */ val invalidComponentCertificateRoot: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.invalidComponentCertificateRoot with Double = js.native
    
    /* 4 */ val invalidGlobalRevocationListSignature: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.invalidGlobalRevocationListSignature with Double = js.native
    
    /* 1 */ val kernelModeComponentLoad: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.kernelModeComponentLoad with Double = js.native
    
    /* 0 */ val userModeComponentLoad: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.userModeComponentLoad with Double = js.native
  }
  
  @JSGlobal("Windows.Media.Protection.ServiceRequestedEventArgs")
  @js.native
  class ServiceRequestedEventArgs ()
    extends typings.winrt.Windows.Media.Protection.ServiceRequestedEventArgs
}
