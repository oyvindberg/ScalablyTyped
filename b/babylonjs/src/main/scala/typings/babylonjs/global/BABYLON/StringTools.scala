package typings.babylonjs.global.BABYLON

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint16Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.StringTools")
@js.native
class StringTools ()
  extends typings.babylonjs.BABYLON.StringTools
/* static members */
object StringTools {
  
  @JSGlobal("BABYLON.StringTools.Decode")
  @js.native
  def Decode(buffer: Uint16Array): String = js.native
  /**
    * Decodes a buffer into a string
    * @param buffer The buffer to decode
    * @returns The decoded string
    */
  @JSGlobal("BABYLON.StringTools.Decode")
  @js.native
  def Decode(buffer: Uint8Array): String = js.native
  
  /**
    * Encode a buffer to a base64 string
    * @param buffer defines the buffer to encode
    * @returns the encoded string
    */
  @JSGlobal("BABYLON.StringTools.EncodeArrayBufferToBase64")
  @js.native
  def EncodeArrayBufferToBase64(buffer: ArrayBuffer): String = js.native
  @JSGlobal("BABYLON.StringTools.EncodeArrayBufferToBase64")
  @js.native
  def EncodeArrayBufferToBase64(buffer: ArrayBufferView): String = js.native
  
  /**
    * Checks for a matching suffix at the end of a string (for ES5 and lower)
    * @param str Source string
    * @param suffix Suffix to search for in the source string
    * @returns Boolean indicating whether the suffix was found (true) or not (false)
    */
  @JSGlobal("BABYLON.StringTools.EndsWith")
  @js.native
  def EndsWith(str: String, suffix: String): Boolean = js.native
  
  /**
    * Converts a number to string and pads with preceeding zeroes until it is of specified length.
    * @param num the number to convert and pad
    * @param length the expected length of the string
    * @returns the padded string
    */
  @JSGlobal("BABYLON.StringTools.PadNumber")
  @js.native
  def PadNumber(num: Double, length: Double): String = js.native
  
  /**
    * Checks for a matching suffix at the beginning of a string (for ES5 and lower)
    * @param str Source string
    * @param suffix Suffix to search for in the source string
    * @returns Boolean indicating whether the suffix was found (true) or not (false)
    */
  @JSGlobal("BABYLON.StringTools.StartsWith")
  @js.native
  def StartsWith(str: String, suffix: String): Boolean = js.native
}
