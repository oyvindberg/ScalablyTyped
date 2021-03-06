package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutThirdPartyJobSuccessResultInput extends StObject {
  
  /**
    * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
    */
  var clientToken: ClientToken = js.native
  
  /**
    * A token generated by a job worker, such as an AWS CodeDeploy deployment ID, that a successful job provides to identify a partner action in progress. Future jobs use this token to identify the running instance of the action. It can be reused to return more information about the progress of the partner action. When the action is complete, no continuation token should be supplied.
    */
  var continuationToken: js.UndefOr[ContinuationToken] = js.native
  
  /**
    * Represents information about a current revision.
    */
  var currentRevision: js.UndefOr[CurrentRevision] = js.native
  
  /**
    * The details of the actions taken and results produced on an artifact as it passes through stages in the pipeline. 
    */
  var executionDetails: js.UndefOr[ExecutionDetails] = js.native
  
  /**
    * The ID of the job that successfully completed. This is the same ID returned from PollForThirdPartyJobs.
    */
  var jobId: ThirdPartyJobId = js.native
}
object PutThirdPartyJobSuccessResultInput {
  
  @scala.inline
  def apply(clientToken: ClientToken, jobId: ThirdPartyJobId): PutThirdPartyJobSuccessResultInput = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutThirdPartyJobSuccessResultInput]
  }
  
  @scala.inline
  implicit class PutThirdPartyJobSuccessResultInputMutableBuilder[Self <: PutThirdPartyJobSuccessResultInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationToken(value: ContinuationToken): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationTokenUndefined: Self = StObject.set(x, "continuationToken", js.undefined)
    
    @scala.inline
    def setCurrentRevision(value: CurrentRevision): Self = StObject.set(x, "currentRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRevisionUndefined: Self = StObject.set(x, "currentRevision", js.undefined)
    
    @scala.inline
    def setExecutionDetails(value: ExecutionDetails): Self = StObject.set(x, "executionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionDetailsUndefined: Self = StObject.set(x, "executionDetails", js.undefined)
    
    @scala.inline
    def setJobId(value: ThirdPartyJobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
