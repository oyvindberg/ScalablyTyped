package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.BucketEntry")
@js.native
class BucketEntry ()
  extends typings.stellarBase.mod.xdr.BucketEntry
object BucketEntry {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.deadentry")
  @js.native
  def deadentry(value: typings.stellarBase.xdrMod.xdr.LedgerKey): typings.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.BucketEntry = js.native
  @JSImport("stellar-sdk", "xdr.BucketEntry.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.BucketEntry = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.BucketEntry = js.native
  @JSImport("stellar-sdk", "xdr.BucketEntry.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.initentry")
  @js.native
  def initentry(value: typings.stellarBase.xdrMod.xdr.LedgerEntry): typings.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.BucketEntry): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.liveentry")
  @js.native
  def liveentry(value: typings.stellarBase.xdrMod.xdr.LedgerEntry): typings.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.metaentry")
  @js.native
  def metaentry(value: typings.stellarBase.xdrMod.xdr.BucketMetadata): typings.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.BucketEntry): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.BucketEntry.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.BucketEntry.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.BucketEntry, io: Buffer): Unit = js.native
}
