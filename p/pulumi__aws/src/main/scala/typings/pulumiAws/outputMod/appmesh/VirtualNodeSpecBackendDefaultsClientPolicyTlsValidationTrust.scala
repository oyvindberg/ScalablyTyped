package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust extends StObject {
  
  /**
    * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm] = js.native
  
  /**
    * The TLS validation context trust for a local file.
    */
  var file: js.UndefOr[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile] = js.native
}
object VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust {
  
  @scala.inline
  def apply(): VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustMutableBuilder[Self <: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcm(value: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    @scala.inline
    def setFile(value: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
