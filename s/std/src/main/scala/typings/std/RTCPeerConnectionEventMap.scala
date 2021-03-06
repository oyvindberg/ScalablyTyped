package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCPeerConnectionEventMap extends StObject {
  
  var connectionstatechange: Event = js.native
  
  var datachannel: RTCDataChannelEvent = js.native
  
  var icecandidate: RTCPeerConnectionIceEvent = js.native
  
  var icecandidateerror: RTCPeerConnectionIceErrorEvent = js.native
  
  var iceconnectionstatechange: Event = js.native
  
  var icegatheringstatechange: Event = js.native
  
  var negotiationneeded: Event = js.native
  
  var signalingstatechange: Event = js.native
  
  var statsended: RTCStatsEvent = js.native
  
  var track: RTCTrackEvent = js.native
}
object RTCPeerConnectionEventMap {
  
  @scala.inline
  def apply(
    connectionstatechange: Event,
    datachannel: RTCDataChannelEvent,
    icecandidate: RTCPeerConnectionIceEvent,
    icecandidateerror: RTCPeerConnectionIceErrorEvent,
    iceconnectionstatechange: Event,
    icegatheringstatechange: Event,
    negotiationneeded: Event,
    signalingstatechange: Event,
    statsended: RTCStatsEvent,
    track: RTCTrackEvent
  ): RTCPeerConnectionEventMap = {
    val __obj = js.Dynamic.literal(connectionstatechange = connectionstatechange.asInstanceOf[js.Any], datachannel = datachannel.asInstanceOf[js.Any], icecandidate = icecandidate.asInstanceOf[js.Any], icecandidateerror = icecandidateerror.asInstanceOf[js.Any], iceconnectionstatechange = iceconnectionstatechange.asInstanceOf[js.Any], icegatheringstatechange = icegatheringstatechange.asInstanceOf[js.Any], negotiationneeded = negotiationneeded.asInstanceOf[js.Any], signalingstatechange = signalingstatechange.asInstanceOf[js.Any], statsended = statsended.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionEventMap]
  }
  
  @scala.inline
  implicit class RTCPeerConnectionEventMapMutableBuilder[Self <: RTCPeerConnectionEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionstatechange(value: Event): Self = StObject.set(x, "connectionstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatachannel(value: RTCDataChannelEvent): Self = StObject.set(x, "datachannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcecandidate(value: RTCPeerConnectionIceEvent): Self = StObject.set(x, "icecandidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcecandidateerror(value: RTCPeerConnectionIceErrorEvent): Self = StObject.set(x, "icecandidateerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceconnectionstatechange(value: Event): Self = StObject.set(x, "iceconnectionstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcegatheringstatechange(value: Event): Self = StObject.set(x, "icegatheringstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegotiationneeded(value: Event): Self = StObject.set(x, "negotiationneeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalingstatechange(value: Event): Self = StObject.set(x, "signalingstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsended(value: RTCStatsEvent): Self = StObject.set(x, "statsended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: RTCTrackEvent): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
