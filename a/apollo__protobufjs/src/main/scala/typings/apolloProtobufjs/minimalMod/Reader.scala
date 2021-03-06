package typings.apolloProtobufjs.minimalMod

import typings.apolloProtobufjs.mod.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/minimal", "Reader")
@js.native
class Reader protected ()
  extends typings.apolloProtobufjs.mod.Reader {
  /**
    * Constructs a new reader instance using the specified buffer.
    * @param buffer Buffer to read from
    */
  def this(buffer: Uint8Array) = this()
}
/* static members */
object Reader {
  
  /**
    * Creates a new reader using the specified buffer.
    * @param buffer Buffer to read from
    * @returns A {@link BufferReader} if `buffer` is a Buffer, otherwise a {@link Reader}
    * @throws {Error} If `buffer` is not a valid buffer
    */
  @JSImport("@apollo/protobufjs/minimal", "Reader.create")
  @js.native
  def create(buffer: Buffer | Uint8Array): typings.apolloProtobufjs.mod.Reader | typings.apolloProtobufjs.mod.BufferReader = js.native
}
