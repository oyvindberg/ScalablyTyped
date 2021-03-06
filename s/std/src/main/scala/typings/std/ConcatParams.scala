package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcatParams extends Algorithm {
  
  var algorithmId: Uint8Array = js.native
  
  var hash: js.UndefOr[java.lang.String | Algorithm] = js.native
  
  var partyUInfo: Uint8Array = js.native
  
  var partyVInfo: Uint8Array = js.native
  
  var privateInfo: js.UndefOr[Uint8Array] = js.native
  
  var publicInfo: js.UndefOr[Uint8Array] = js.native
}
object ConcatParams {
  
  @scala.inline
  def apply(algorithmId: Uint8Array, name: java.lang.String, partyUInfo: Uint8Array, partyVInfo: Uint8Array): ConcatParams = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partyUInfo = partyUInfo.asInstanceOf[js.Any], partyVInfo = partyVInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatParams]
  }
  
  @scala.inline
  implicit class ConcatParamsMutableBuilder[Self <: ConcatParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmId(value: Uint8Array): Self = StObject.set(x, "algorithmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: java.lang.String | Algorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setPartyUInfo(value: Uint8Array): Self = StObject.set(x, "partyUInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartyVInfo(value: Uint8Array): Self = StObject.set(x, "partyVInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateInfo(value: Uint8Array): Self = StObject.set(x, "privateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateInfoUndefined: Self = StObject.set(x, "privateInfo", js.undefined)
    
    @scala.inline
    def setPublicInfo(value: Uint8Array): Self = StObject.set(x, "publicInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicInfoUndefined: Self = StObject.set(x, "publicInfo", js.undefined)
  }
}
