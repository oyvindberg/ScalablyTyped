package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createTokenizationDictionary` operation. */
@js.native
trait CreateTokenizationDictionaryParams extends StObject {
  
  /** The ID of the collection. */
  var collection_id: String = js.native
  
  /** The ID of the environment. */
  var environment_id: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** An array of tokenization rules. Each rule contains, the original `text` string, component `tokens`, any alternate character set `readings`, and which `part_of_speech` the text is from. */
  var tokenization_rules: js.UndefOr[js.Array[TokenDictRule]] = js.native
}
object CreateTokenizationDictionaryParams {
  
  @scala.inline
  def apply(collection_id: String, environment_id: String): CreateTokenizationDictionaryParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTokenizationDictionaryParams]
  }
  
  @scala.inline
  implicit class CreateTokenizationDictionaryParamsMutableBuilder[Self <: CreateTokenizationDictionaryParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setTokenization_rules(value: js.Array[TokenDictRule]): Self = StObject.set(x, "tokenization_rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenization_rulesUndefined: Self = StObject.set(x, "tokenization_rules", js.undefined)
    
    @scala.inline
    def setTokenization_rulesVarargs(value: TokenDictRule*): Self = StObject.set(x, "tokenization_rules", js.Array(value :_*))
  }
}
