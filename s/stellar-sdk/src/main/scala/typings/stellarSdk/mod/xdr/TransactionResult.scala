package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.ExtFeeCharged
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.TransactionResult")
@js.native
class TransactionResult protected ()
  extends typings.stellarBase.mod.xdr.TransactionResult {
  def this(attributes: ExtFeeCharged) = this()
}
object TransactionResult {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionResult = js.native
  @JSImport("stellar-sdk", "xdr.TransactionResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionResult = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionResult = js.native
  @JSImport("stellar-sdk", "xdr.TransactionResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TransactionResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TransactionResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionResult, io: Buffer): Unit = js.native
}
