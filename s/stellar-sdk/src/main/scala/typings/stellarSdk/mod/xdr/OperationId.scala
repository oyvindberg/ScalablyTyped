package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.OperationId")
@js.native
class OperationId ()
  extends typings.stellarBase.mod.xdr.OperationId
object OperationId {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationId.envelopeTypeOpId")
  @js.native
  def envelopeTypeOpId(value: typings.stellarBase.xdrMod.xdr.OperationIdId): typings.stellarBase.xdrMod.xdr.OperationId = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationId.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OperationId = js.native
  @JSImport("stellar-sdk", "xdr.OperationId.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OperationId = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationId.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OperationId = js.native
  @JSImport("stellar-sdk", "xdr.OperationId.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OperationId = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationId.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.OperationId): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationId.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OperationId = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationId.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OperationId): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationId.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.OperationId.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationId.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.OperationId.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationId.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.OperationId, io: Buffer): Unit = js.native
}
