package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationCloudwatchLoggingOptions extends StObject {
  
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String = js.native
  
  /**
    * The ARN of the CloudWatch Log Stream.
    */
  var logStreamArn: String = js.native
  
  /**
    * The ARN of the IAM Role used to send application messages.
    */
  var roleArn: String = js.native
}
object AnalyticsApplicationCloudwatchLoggingOptions {
  
  @scala.inline
  def apply(id: String, logStreamArn: String, roleArn: String): AnalyticsApplicationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], logStreamArn = logStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationCloudwatchLoggingOptions]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationCloudwatchLoggingOptionsMutableBuilder[Self <: AnalyticsApplicationCloudwatchLoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamArn(value: String): Self = StObject.set(x, "logStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
