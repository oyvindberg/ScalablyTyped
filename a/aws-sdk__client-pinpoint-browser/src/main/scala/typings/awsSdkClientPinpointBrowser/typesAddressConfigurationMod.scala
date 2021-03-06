package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ADM
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS_SANDBOX
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS_VOIP
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS_VOIP_SANDBOX
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.BAIDU
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CUSTOM
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EMAIL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.GCM
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.SMS
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAddressConfigurationMod {
  
  @js.native
  trait AddressConfiguration extends StObject {
    
    /**
      * Body override. If specified will override default body.
      */
    var BodyOverride: js.UndefOr[String] = js.native
    
    /**
      * The channel type.
      *
      * Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
      */
    var ChannelType: js.UndefOr[
        GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
      ] = js.native
    
    /**
      * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
      */
    var Context: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
    
    /**
      * The Raw JSON formatted string to be used as the payload. This value overrides the message.
      */
    var RawContent: js.UndefOr[String] = js.native
    
    /**
      * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions on this map take precedence over the all other substitutions.
      */
    var Substitutions: js.UndefOr[
        (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ] = js.native
    
    /**
      * Title override. If specified will override default title if applicable.
      */
    var TitleOverride: js.UndefOr[String] = js.native
  }
  object AddressConfiguration {
    
    @scala.inline
    def apply(): AddressConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressConfiguration]
    }
    
    @scala.inline
    implicit class AddressConfigurationMutableBuilder[Self <: AddressConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyOverride(value: String): Self = StObject.set(x, "BodyOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyOverrideUndefined: Self = StObject.set(x, "BodyOverride", js.undefined)
      
      @scala.inline
      def setChannelType(
        value: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
      ): Self = StObject.set(x, "ChannelType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelTypeUndefined: Self = StObject.set(x, "ChannelType", js.undefined)
      
      @scala.inline
      def setContext(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
      
      @scala.inline
      def setRawContent(value: String): Self = StObject.set(x, "RawContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawContentUndefined: Self = StObject.set(x, "RawContent", js.undefined)
      
      @scala.inline
      def setSubstitutions(
        value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
      
      @scala.inline
      def setTitleOverride(value: String): Self = StObject.set(x, "TitleOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOverrideUndefined: Self = StObject.set(x, "TitleOverride", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledAddressConfiguration extends AddressConfiguration {
    
    /**
      * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
      */
    @JSName("Context")
    var Context_UnmarshalledAddressConfiguration: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions on this map take precedence over the all other substitutions.
      */
    @JSName("Substitutions")
    var Substitutions_UnmarshalledAddressConfiguration: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  }
  object UnmarshalledAddressConfiguration {
    
    @scala.inline
    def apply(): UnmarshalledAddressConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAddressConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledAddressConfigurationMutableBuilder[Self <: UnmarshalledAddressConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: StringDictionary[String]): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
      
      @scala.inline
      def setSubstitutions(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
}
