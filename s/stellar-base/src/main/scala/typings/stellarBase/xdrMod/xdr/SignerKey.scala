package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignerKey extends StObject {
  
  def ed25519(): Buffer = js.native
  def ed25519(value: Buffer): Buffer = js.native
  
  def hashX(): Buffer = js.native
  def hashX(value: Buffer): Buffer = js.native
  
  def preAuthTx(): Buffer = js.native
  def preAuthTx(value: Buffer): Buffer = js.native
  
  def switch(): SignerKeyType = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def value(): Buffer = js.native
}
