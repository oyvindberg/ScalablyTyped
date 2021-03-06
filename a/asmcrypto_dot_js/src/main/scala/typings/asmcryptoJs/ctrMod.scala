package typings.asmcryptoJs

import typings.asmcryptoJs.aesMod.AES
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ctrMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/ctr", "AES_CTR")
  @js.native
  class AES_CTR protected () extends AES {
    def this(key: Uint8Array, nonce: Uint8Array) = this()
    
    var AES_CTR_set_options: js.Any = js.native
    
    def decrypt(data: Uint8Array): Uint8Array = js.native
    
    def encrypt(data: Uint8Array): Uint8Array = js.native
  }
  /* static members */
  object AES_CTR {
    
    @JSImport("asmcrypto.js/dist_es8/aes/ctr", "AES_CTR.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
    
    @JSImport("asmcrypto.js/dist_es8/aes/ctr", "AES_CTR.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
  }
}
