package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.NodeIdSignature
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.LedgerCloseValueSignature")
@js.native
class LedgerCloseValueSignature protected ()
  extends typings.stellarBase.xdrMod.xdr.LedgerCloseValueSignature {
  def this(attributes: NodeIdSignature) = this()
}
object LedgerCloseValueSignature {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseValueSignature.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerCloseValueSignature = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseValueSignature.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerCloseValueSignature = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseValueSignature.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerCloseValueSignature = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseValueSignature.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerCloseValueSignature = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseValueSignature.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerCloseValueSignature): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseValueSignature.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerCloseValueSignature = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseValueSignature.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerCloseValueSignature): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseValueSignature.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseValueSignature.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseValueSignature.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseValueSignature.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseValueSignature.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerCloseValueSignature, io: Buffer): Unit = js.native
}
