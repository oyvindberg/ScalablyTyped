package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.StellarMessage")
@js.native
class StellarMessage ()
  extends typings.stellarBase.xdrMod.default.StellarMessage
object StellarMessage {
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.auth")
  @js.native
  def auth(value: typings.stellarBase.xdrMod.xdr.Auth): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.dontHave")
  @js.native
  def dontHave(value: typings.stellarBase.xdrMod.xdr.DontHave): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.errorMsg")
  @js.native
  def errorMsg(value: typings.stellarBase.xdrMod.xdr.Error): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  @JSImport("stellar-base", "xdr.StellarMessage.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  @JSImport("stellar-base", "xdr.StellarMessage.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.getPeers")
  @js.native
  def getPeers(): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.getScpQuorumset")
  @js.native
  def getScpQuorumset(value: Buffer): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.getScpState")
  @js.native
  def getScpState(value: Double): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.getTxSet")
  @js.native
  def getTxSet(value: Buffer): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.hello")
  @js.native
  def hello(value: typings.stellarBase.xdrMod.xdr.Hello): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.StellarMessage): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.peers")
  @js.native
  def peers(value: js.Array[typings.stellarBase.xdrMod.xdr.PeerAddress]): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.scpMessage")
  @js.native
  def scpMessage(value: typings.stellarBase.xdrMod.xdr.ScpEnvelope): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.scpQuorumset")
  @js.native
  def scpQuorumset(value: typings.stellarBase.xdrMod.xdr.ScpQuorumSet): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.surveyRequest")
  @js.native
  def surveyRequest(value: typings.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.surveyResponse")
  @js.native
  def surveyResponse(value: typings.stellarBase.xdrMod.xdr.SignedSurveyResponseMessage): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.StellarMessage): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.transaction")
  @js.native
  def transaction(value: typings.stellarBase.xdrMod.xdr.TransactionEnvelope): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.txSet")
  @js.native
  def txSet(value: typings.stellarBase.xdrMod.xdr.TransactionSet): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.StellarMessage.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.StellarMessage.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.StellarMessage, io: Buffer): Unit = js.native
}
