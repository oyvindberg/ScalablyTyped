package typings.winrt.Windows.Networking.Connectivity

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Networking.EndpointPair
import typings.winrt.Windows.Networking.HostName
import typings.winrt.Windows.Networking.HostNameSortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INetworkInformationStatics extends StObject {
  
  def getConnectionProfiles(): IVectorView[ConnectionProfile] = js.native
  
  def getHostNames(): IVectorView[HostName] = js.native
  
  def getInternetConnectionProfile(): ConnectionProfile = js.native
  
  def getLanIdentifiers(): IVectorView[LanIdentifier] = js.native
  
  def getProxyConfigurationAsync(uri: Uri): IAsyncOperation[ProxyConfiguration] = js.native
  
  def getSortedEndpointPairs(destinationList: IIterable[EndpointPair], sortOptions: HostNameSortOptions): IVectorView[EndpointPair] = js.native
  
  var onnetworkstatuschanged: js.Any = js.native
}
object INetworkInformationStatics {
  
  @scala.inline
  def apply(
    getConnectionProfiles: () => IVectorView[ConnectionProfile],
    getHostNames: () => IVectorView[HostName],
    getInternetConnectionProfile: () => ConnectionProfile,
    getLanIdentifiers: () => IVectorView[LanIdentifier],
    getProxyConfigurationAsync: Uri => IAsyncOperation[ProxyConfiguration],
    getSortedEndpointPairs: (IIterable[EndpointPair], HostNameSortOptions) => IVectorView[EndpointPair],
    onnetworkstatuschanged: js.Any
  ): INetworkInformationStatics = {
    val __obj = js.Dynamic.literal(getConnectionProfiles = js.Any.fromFunction0(getConnectionProfiles), getHostNames = js.Any.fromFunction0(getHostNames), getInternetConnectionProfile = js.Any.fromFunction0(getInternetConnectionProfile), getLanIdentifiers = js.Any.fromFunction0(getLanIdentifiers), getProxyConfigurationAsync = js.Any.fromFunction1(getProxyConfigurationAsync), getSortedEndpointPairs = js.Any.fromFunction2(getSortedEndpointPairs), onnetworkstatuschanged = onnetworkstatuschanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkInformationStatics]
  }
  
  @scala.inline
  implicit class INetworkInformationStaticsMutableBuilder[Self <: INetworkInformationStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetConnectionProfiles(value: () => IVectorView[ConnectionProfile]): Self = StObject.set(x, "getConnectionProfiles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHostNames(value: () => IVectorView[HostName]): Self = StObject.set(x, "getHostNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInternetConnectionProfile(value: () => ConnectionProfile): Self = StObject.set(x, "getInternetConnectionProfile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLanIdentifiers(value: () => IVectorView[LanIdentifier]): Self = StObject.set(x, "getLanIdentifiers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProxyConfigurationAsync(value: Uri => IAsyncOperation[ProxyConfiguration]): Self = StObject.set(x, "getProxyConfigurationAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSortedEndpointPairs(value: (IIterable[EndpointPair], HostNameSortOptions) => IVectorView[EndpointPair]): Self = StObject.set(x, "getSortedEndpointPairs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnnetworkstatuschanged(value: js.Any): Self = StObject.set(x, "onnetworkstatuschanged", value.asInstanceOf[js.Any])
  }
}
