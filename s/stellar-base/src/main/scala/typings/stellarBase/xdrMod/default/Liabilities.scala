package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.Selling
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.Liabilities")
@js.native
class Liabilities protected ()
  extends typings.stellarBase.xdrMod.xdr.Liabilities {
  def this(attributes: Selling) = this()
}
object Liabilities {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Liabilities.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Liabilities = js.native
  @JSImport("stellar-base/types/xdr", "default.Liabilities.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Liabilities = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Liabilities.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Liabilities = js.native
  @JSImport("stellar-base/types/xdr", "default.Liabilities.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Liabilities = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Liabilities.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Liabilities): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Liabilities.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Liabilities = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Liabilities.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Liabilities): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Liabilities.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.Liabilities.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Liabilities.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.Liabilities.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Liabilities.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Liabilities, io: Buffer): Unit = js.native
}
