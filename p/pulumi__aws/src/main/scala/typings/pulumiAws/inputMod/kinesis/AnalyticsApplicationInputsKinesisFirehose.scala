package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationInputsKinesisFirehose extends StObject {
  
  /**
    * The ARN of the Kinesis Firehose delivery stream.
    */
  var resourceArn: Input[String] = js.native
  
  /**
    * The ARN of the IAM Role used to access the stream.
    */
  var roleArn: Input[String] = js.native
}
object AnalyticsApplicationInputsKinesisFirehose {
  
  @scala.inline
  def apply(resourceArn: Input[String], roleArn: Input[String]): AnalyticsApplicationInputsKinesisFirehose = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsKinesisFirehose]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsKinesisFirehoseMutableBuilder[Self <: AnalyticsApplicationInputsKinesisFirehose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
