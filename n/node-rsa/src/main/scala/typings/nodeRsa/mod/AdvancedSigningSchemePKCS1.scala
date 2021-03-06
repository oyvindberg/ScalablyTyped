package typings.nodeRsa.mod

import typings.nodeRsa.nodeRsaStrings.pkcs1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedSigningSchemePKCS1 extends AdvancedSigningScheme {
  
  var hash: HashingAlgorithm = js.native
  
  var scheme: pkcs1 = js.native
}
object AdvancedSigningSchemePKCS1 {
  
  @scala.inline
  def apply(hash: HashingAlgorithm, scheme: pkcs1): AdvancedSigningSchemePKCS1 = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedSigningSchemePKCS1]
  }
  
  @scala.inline
  implicit class AdvancedSigningSchemePKCS1MutableBuilder[Self <: AdvancedSigningSchemePKCS1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: HashingAlgorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: pkcs1): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
