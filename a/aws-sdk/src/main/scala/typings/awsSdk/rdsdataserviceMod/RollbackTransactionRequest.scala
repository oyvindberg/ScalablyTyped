package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollbackTransactionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
    */
  var resourceArn: Arn = js.native
  
  /**
    * The name or ARN of the secret that enables access to the DB cluster.
    */
  var secretArn: Arn = js.native
  
  /**
    * The identifier of the transaction to roll back.
    */
  var transactionId: Id = js.native
}
object RollbackTransactionRequest {
  
  @scala.inline
  def apply(resourceArn: Arn, secretArn: Arn, transactionId: Id): RollbackTransactionRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackTransactionRequest]
  }
  
  @scala.inline
  implicit class RollbackTransactionRequestMutableBuilder[Self <: RollbackTransactionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArn(value: Arn): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionId(value: Id): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
  }
}
