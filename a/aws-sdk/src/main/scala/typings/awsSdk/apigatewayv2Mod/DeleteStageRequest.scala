package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteStageRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  
  /**
    * The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var StageName: string = js.native
}
object DeleteStageRequest {
  
  @scala.inline
  def apply(ApiId: string, StageName: string): DeleteStageRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStageRequest]
  }
  
  @scala.inline
  implicit class DeleteStageRequestMutableBuilder[Self <: DeleteStageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: string): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
