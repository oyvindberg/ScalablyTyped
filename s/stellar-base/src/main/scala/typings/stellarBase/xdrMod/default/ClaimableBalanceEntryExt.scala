package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.ClaimableBalanceEntryExt")
@js.native
class ClaimableBalanceEntryExt ()
  extends typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt
object ClaimableBalanceEntryExt {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ClaimableBalanceEntryExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt = js.native
  @JSImport("stellar-base/types/xdr", "default.ClaimableBalanceEntryExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ClaimableBalanceEntryExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt = js.native
  @JSImport("stellar-base/types/xdr", "default.ClaimableBalanceEntryExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ClaimableBalanceEntryExt.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ClaimableBalanceEntryExt.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ClaimableBalanceEntryExt.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ClaimableBalanceEntryExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.ClaimableBalanceEntryExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ClaimableBalanceEntryExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.ClaimableBalanceEntryExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ClaimableBalanceEntryExt.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ClaimableBalanceEntryExt.0")
  @js.native
  def `0`(): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt = js.native
}
