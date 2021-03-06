package typings.awsCryptoSha256Browser

import typings.awsSdkTypes.cryptoMod.Hash
import typings.awsSdkTypes.cryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webCryptoSha256Mod {
  
  @JSImport("@aws-crypto/sha256-browser/build/webCryptoSha256", "Sha256")
  @js.native
  class Sha256 () extends Hash {
    def this(secret: SourceData) = this()
    
    val key: js.Any = js.native
    
    var toHash: js.Any = js.native
  }
}
