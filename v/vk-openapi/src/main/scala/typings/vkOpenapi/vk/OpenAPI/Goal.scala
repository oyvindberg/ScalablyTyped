package typings.vkOpenapi.vk.OpenAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Goal {
  
  type API = js.Function2[/* goalEvent */ GoalEvent, /* goalParams */ js.UndefOr[GoalParams], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vkOpenapi.vkOpenapiStrings.add_to_cart
    - typings.vkOpenapi.vkOpenapiStrings.add_to_wishlist
    - typings.vkOpenapi.vkOpenapiStrings.customize_product
    - typings.vkOpenapi.vkOpenapiStrings.initiate_checkout
    - typings.vkOpenapi.vkOpenapiStrings.add_payment_info
    - typings.vkOpenapi.vkOpenapiStrings.purchase
    - typings.vkOpenapi.vkOpenapiStrings.contact
    - typings.vkOpenapi.vkOpenapiStrings.lead
    - typings.vkOpenapi.vkOpenapiStrings.schedule
    - typings.vkOpenapi.vkOpenapiStrings.complete_registration
    - typings.vkOpenapi.vkOpenapiStrings.submit_application
    - typings.vkOpenapi.vkOpenapiStrings.start_trial
    - typings.vkOpenapi.vkOpenapiStrings.subscribe
    - typings.vkOpenapi.vkOpenapiStrings.page_view
    - typings.vkOpenapi.vkOpenapiStrings.view_content
    - typings.vkOpenapi.vkOpenapiStrings.search
    - typings.vkOpenapi.vkOpenapiStrings.find_location
    - typings.vkOpenapi.vkOpenapiStrings.donate
    - typings.vkOpenapi.vkOpenapiStrings.conversion
  */
  trait GoalEvent extends StObject
  object GoalEvent {
    
    @scala.inline
    def add_payment_info: typings.vkOpenapi.vkOpenapiStrings.add_payment_info = "add_payment_info".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.add_payment_info]
    
    @scala.inline
    def add_to_cart: typings.vkOpenapi.vkOpenapiStrings.add_to_cart = "add_to_cart".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.add_to_cart]
    
    @scala.inline
    def add_to_wishlist: typings.vkOpenapi.vkOpenapiStrings.add_to_wishlist = "add_to_wishlist".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.add_to_wishlist]
    
    @scala.inline
    def complete_registration: typings.vkOpenapi.vkOpenapiStrings.complete_registration = "complete_registration".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.complete_registration]
    
    @scala.inline
    def contact: typings.vkOpenapi.vkOpenapiStrings.contact = "contact".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.contact]
    
    @scala.inline
    def conversion: typings.vkOpenapi.vkOpenapiStrings.conversion = "conversion".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.conversion]
    
    @scala.inline
    def customize_product: typings.vkOpenapi.vkOpenapiStrings.customize_product = "customize_product".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.customize_product]
    
    @scala.inline
    def donate: typings.vkOpenapi.vkOpenapiStrings.donate = "donate".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.donate]
    
    @scala.inline
    def find_location: typings.vkOpenapi.vkOpenapiStrings.find_location = "find_location".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.find_location]
    
    @scala.inline
    def initiate_checkout: typings.vkOpenapi.vkOpenapiStrings.initiate_checkout = "initiate_checkout".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.initiate_checkout]
    
    @scala.inline
    def lead: typings.vkOpenapi.vkOpenapiStrings.lead = "lead".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.lead]
    
    @scala.inline
    def page_view: typings.vkOpenapi.vkOpenapiStrings.page_view = "page_view".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.page_view]
    
    @scala.inline
    def purchase: typings.vkOpenapi.vkOpenapiStrings.purchase = "purchase".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.purchase]
    
    @scala.inline
    def schedule: typings.vkOpenapi.vkOpenapiStrings.schedule = "schedule".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.schedule]
    
    @scala.inline
    def search: typings.vkOpenapi.vkOpenapiStrings.search = "search".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.search]
    
    @scala.inline
    def start_trial: typings.vkOpenapi.vkOpenapiStrings.start_trial = "start_trial".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.start_trial]
    
    @scala.inline
    def submit_application: typings.vkOpenapi.vkOpenapiStrings.submit_application = "submit_application".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.submit_application]
    
    @scala.inline
    def subscribe: typings.vkOpenapi.vkOpenapiStrings.subscribe = "subscribe".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.subscribe]
    
    @scala.inline
    def view_content: typings.vkOpenapi.vkOpenapiStrings.view_content = "view_content".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.view_content]
  }
  
  @js.native
  trait GoalParams extends StObject {
    
    var value: js.UndefOr[Double] = js.native
  }
  object GoalParams {
    
    @scala.inline
    def apply(): GoalParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoalParams]
    }
    
    @scala.inline
    implicit class GoalParamsMutableBuilder[Self <: GoalParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
