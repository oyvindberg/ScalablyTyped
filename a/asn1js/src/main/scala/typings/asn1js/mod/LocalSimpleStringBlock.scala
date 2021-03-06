package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "LocalSimpleStringBlock")
@js.native
class LocalSimpleStringBlock () extends BaseBlock[LocalSimpleLocalSimpleStringValueBlock] {
  def this(params: LocalSimpleStringBlockParams) = this()
  
  /**
    * Function converting ArrayBuffer into ASN.1 internal string
    * 
    * @param {ArrayBuffer} inputBuffer ASN.1 BER encoded array
    * 
    * @memberOf LocalSimpleStringBlock
    */
  def fromBuffer(inputBuffer: ArrayBuffer): Unit = js.native
  
  /**
    * Function converting JavaScript string into ASN.1 internal class
    * 
    * @param {string} inputString ASN.1 BER encoded array
    * 
    * @memberOf LocalSimpleStringBlock
    */
  def fromString(inputString: String): Unit = js.native
}
