package typings.ipfsCore.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DEK extends js.Object {
  
  var hash: String = js.native
  
  var iterationCount: Double = js.native
  
  var keyLength: Double = js.native
  
  var salt: String = js.native
}
object DEK {
  
  @scala.inline
  def apply(hash: String, iterationCount: Double, keyLength: Double, salt: String): DEK = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEK]
  }
  
  @scala.inline
  implicit class DEKOps[Self <: DEK] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationCount(value: Double): Self = this.set("iterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyLength(value: Double): Self = this.set("keyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalt(value: String): Self = this.set("salt", value.asInstanceOf[js.Any])
  }
}
