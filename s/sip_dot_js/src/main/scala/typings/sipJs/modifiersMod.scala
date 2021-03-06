package typings.sipJs

import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.std.RTCSessionDescriptionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersMod {
  
  @JSImport("sip.js/lib/platform/web/modifiers", "addMidLines")
  @js.native
  def addMidLines(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js/lib/platform/web/modifiers", "cleanJitsiSdpImageattr")
  @js.native
  def cleanJitsiSdpImageattr(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js/lib/platform/web/modifiers", "holdModifier")
  @js.native
  def holdModifier(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js/lib/platform/web/modifiers", "stripG722")
  @js.native
  def stripG722(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js/lib/platform/web/modifiers", "stripRtpPayload")
  @js.native
  def stripRtpPayload(payload: String): SessionDescriptionHandlerModifier = js.native
  
  @JSImport("sip.js/lib/platform/web/modifiers", "stripTcpCandidates")
  @js.native
  def stripTcpCandidates(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js/lib/platform/web/modifiers", "stripTelephoneEvent")
  @js.native
  def stripTelephoneEvent(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js/lib/platform/web/modifiers", "stripVideo")
  @js.native
  def stripVideo(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
}
