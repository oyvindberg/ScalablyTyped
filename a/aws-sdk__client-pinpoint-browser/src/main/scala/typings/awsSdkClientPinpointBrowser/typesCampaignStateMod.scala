package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DELETED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EXECUTING
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PAUSED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PENDING_NEXT_RUN
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.SCHEDULED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCampaignStateMod {
  
  @js.native
  trait CampaignState extends StObject {
    
    /**
      * The status of the campaign, or the status of a treatment that belongs to an A/B test campaign.
      *
      * Valid values: SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED
      */
    var CampaignStatus: js.UndefOr[SCHEDULED | EXECUTING | PENDING_NEXT_RUN | COMPLETED | PAUSED | DELETED | String] = js.native
  }
  object CampaignState {
    
    @scala.inline
    def apply(): CampaignState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CampaignState]
    }
    
    @scala.inline
    implicit class CampaignStateMutableBuilder[Self <: CampaignState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCampaignStatus(value: SCHEDULED | EXECUTING | PENDING_NEXT_RUN | COMPLETED | PAUSED | DELETED | String): Self = StObject.set(x, "CampaignStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignStatusUndefined: Self = StObject.set(x, "CampaignStatus", js.undefined)
    }
  }
  
  type UnmarshalledCampaignState = CampaignState
}
