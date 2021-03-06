package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAppInstanceAdminRequest extends StObject {
  
  /**
    * The ARN of the app instance administrator.
    */
  var AppInstanceAdminArn: ChimeArn = js.native
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: ChimeArn = js.native
}
object DescribeAppInstanceAdminRequest {
  
  @scala.inline
  def apply(AppInstanceAdminArn: ChimeArn, AppInstanceArn: ChimeArn): DescribeAppInstanceAdminRequest = {
    val __obj = js.Dynamic.literal(AppInstanceAdminArn = AppInstanceAdminArn.asInstanceOf[js.Any], AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppInstanceAdminRequest]
  }
  
  @scala.inline
  implicit class DescribeAppInstanceAdminRequestMutableBuilder[Self <: DescribeAppInstanceAdminRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceAdminArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceAdminArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
  }
}
