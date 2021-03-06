package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZonePrivateVisibilityConfigNetwork extends StObject {
  
  var kind: js.UndefOr[String] = js.native
  
  /** The fully qualified URL of the VPC network to bind to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network} */
  var networkUrl: js.UndefOr[String] = js.native
}
object ManagedZonePrivateVisibilityConfigNetwork {
  
  @scala.inline
  def apply(): ManagedZonePrivateVisibilityConfigNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZonePrivateVisibilityConfigNetwork]
  }
  
  @scala.inline
  implicit class ManagedZonePrivateVisibilityConfigNetworkMutableBuilder[Self <: ManagedZonePrivateVisibilityConfigNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNetworkUrl(value: String): Self = StObject.set(x, "networkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUrlUndefined: Self = StObject.set(x, "networkUrl", js.undefined)
  }
}
