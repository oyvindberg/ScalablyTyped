package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.AmountBought
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.ClaimOfferAtom")
@js.native
class ClaimOfferAtom protected ()
  extends typings.stellarBase.mod.xdr.ClaimOfferAtom {
  def this(attributes: AmountBought) = this()
}
object ClaimOfferAtom {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimOfferAtom.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ClaimOfferAtom = js.native
  @JSImport("stellar-sdk", "xdr.ClaimOfferAtom.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ClaimOfferAtom = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimOfferAtom.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ClaimOfferAtom = js.native
  @JSImport("stellar-sdk", "xdr.ClaimOfferAtom.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ClaimOfferAtom = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimOfferAtom.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ClaimOfferAtom): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimOfferAtom.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ClaimOfferAtom = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimOfferAtom.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ClaimOfferAtom): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimOfferAtom.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ClaimOfferAtom.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimOfferAtom.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ClaimOfferAtom.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimOfferAtom.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ClaimOfferAtom, io: Buffer): Unit = js.native
}
