package typings.awsCryptoSha256Js

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object knownHashesFixtureMod {
  
  @JSImport("@aws-crypto/sha256-js/build/knownHashes.fixture", "hashTestVectors")
  @js.native
  val hashTestVectors: js.Array[js.Tuple2[Uint8Array, Uint8Array]] = js.native
  
  @JSImport("@aws-crypto/sha256-js/build/knownHashes.fixture", "hmacTestVectors")
  @js.native
  val hmacTestVectors: js.Array[js.Tuple3[Uint8Array, Uint8Array, Uint8Array]] = js.native
}
