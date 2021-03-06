package typings.xadesjs.mod

import typings.std.BufferSource
import typings.std.Date
import typings.std.Uint8Array
import typings.xmlCore.typesMod.XmlBufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs", "Convert")
@js.native
class Convert ()
  extends typings.xmlCore.mod.Convert
/* static members */
object Convert {
  
  @JSImport("xadesjs", "Convert.Base64Padding")
  @js.native
  def Base64Padding(base64: String): String = js.native
  
  @JSImport("xadesjs", "Convert.FromBase64")
  @js.native
  def FromBase64(base64Text: String): Uint8Array = js.native
  
  @JSImport("xadesjs", "Convert.FromBase64Url")
  @js.native
  def FromBase64Url(base64url: String): Uint8Array = js.native
  
  @JSImport("xadesjs", "Convert.FromBinary")
  @js.native
  def FromBinary(text: String): Uint8Array = js.native
  
  /**
    * Converts Date to string
    *
    * @static
    * @param {Date} dateTime
    * @returns {string}
    *
    * @memberOf Convert
    */
  @JSImport("xadesjs", "Convert.FromDateTime")
  @js.native
  def FromDateTime(dateTime: Date): String = js.native
  
  /**
    * Converts HEX string to buffer
    *
    * @static
    * @param {string} hexString
    * @returns {Uint8Array}
    *
    * @memberOf Convert
    */
  @JSImport("xadesjs", "Convert.FromHex")
  @js.native
  def FromHex(hexString: String): Uint8Array = js.native
  
  @JSImport("xadesjs", "Convert.FromString")
  @js.native
  def FromString(str: String): Uint8Array = js.native
  @JSImport("xadesjs", "Convert.FromString")
  @js.native
  def FromString(str: String, enc: XmlBufferEncoding): Uint8Array = js.native
  
  @JSImport("xadesjs", "Convert.FromUtf8String")
  @js.native
  def FromUtf8String(text: String): Uint8Array = js.native
  
  @JSImport("xadesjs", "Convert.ToBase64")
  @js.native
  def ToBase64(buf: Uint8Array): String = js.native
  
  @JSImport("xadesjs", "Convert.ToBase64Url")
  @js.native
  def ToBase64Url(data: Uint8Array): String = js.native
  
  @JSImport("xadesjs", "Convert.ToBinary")
  @js.native
  def ToBinary(buffer: Uint8Array): String = js.native
  
  /**
    * Converts string to Date
    *
    * @static
    * @param {string} dateTime
    * @returns {Date}
    *
    * @memberOf Convert
    */
  @JSImport("xadesjs", "Convert.ToDateTime")
  @js.native
  def ToDateTime(dateTime: String): Date = js.native
  
  /**
    * Converts buffer to HEX string
    * @param  {BufferSource} buffer Incoming buffer
    * @returns string
    */
  @JSImport("xadesjs", "Convert.ToHex")
  @js.native
  def ToHex(buffer: Uint8Array): String = js.native
  
  @JSImport("xadesjs", "Convert.ToString")
  @js.native
  def ToString(buffer: BufferSource): String = js.native
  @JSImport("xadesjs", "Convert.ToString")
  @js.native
  def ToString(buffer: BufferSource, enc: XmlBufferEncoding): String = js.native
  
  @JSImport("xadesjs", "Convert.ToUtf8String")
  @js.native
  def ToUtf8String(buffer: Uint8Array): String = js.native
}
