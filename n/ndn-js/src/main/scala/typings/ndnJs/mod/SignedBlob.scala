package typings.ndnJs.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "SignedBlob")
@js.native
class SignedBlob ()
  extends typings.ndnJs.blobMod.SignedBlob {
  def this(value: js.Array[Double], signedPortionBeginOffset: Double, signedPortionEndOffset: Double) = this()
  def this(
    value: typings.ndnJs.blobMod.Blob,
    signedPortionBeginOffset: Double,
    signedPortionEndOffset: Double
  ) = this()
  def this(value: Buffer, signedPortionBeginOffset: Double, signedPortionEndOffset: Double) = this()
}
