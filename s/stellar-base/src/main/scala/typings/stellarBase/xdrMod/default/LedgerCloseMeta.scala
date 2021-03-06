package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.LedgerCloseMeta")
@js.native
class LedgerCloseMeta ()
  extends typings.stellarBase.xdrMod.xdr.LedgerCloseMeta
object LedgerCloseMeta {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseMeta.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerCloseMeta = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseMeta.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerCloseMeta = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseMeta.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerCloseMeta = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseMeta.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerCloseMeta = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseMeta.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerCloseMeta): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseMeta.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerCloseMeta = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseMeta.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerCloseMeta): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseMeta.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseMeta.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseMeta.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseMeta.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseMeta.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerCloseMeta, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerCloseMeta.0")
  @js.native
  def `0`(value: typings.stellarBase.xdrMod.xdr.LedgerCloseMetaV0): typings.stellarBase.xdrMod.xdr.LedgerCloseMeta = js.native
}
