package typings.mongodb.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Decimal128")
@js.native
class Decimal128 protected ()
  extends typings.bson.mod.Decimal128 {
  /**
    * @param bytes A buffer containing the raw Decimal128 bytes.
    */
  def this(bytes: Buffer) = this()
}
/* static members */
object Decimal128 {
  
  /** Create a Decimal128 instance from a string representation. */
  @JSImport("mongodb", "Decimal128.fromString")
  @js.native
  def fromString(s: String): typings.bson.mod.Decimal128 = js.native
}
