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
import typings.awsSdkClientPinpointBrowser.typesEndpointDemographicMod.EndpointDemographic
import typings.awsSdkClientPinpointBrowser.typesEndpointDemographicMod.UnmarshalledEndpointDemographic
import typings.awsSdkClientPinpointBrowser.typesEndpointLocationMod.EndpointLocation
import typings.awsSdkClientPinpointBrowser.typesEndpointLocationMod.UnmarshalledEndpointLocation
import typings.awsSdkClientPinpointBrowser.typesEndpointUserMod.EndpointUser
import typings.awsSdkClientPinpointBrowser.typesEndpointUserMod.UnmarshalledEndpointUser
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEndpointBatchItemMod {
  
  @js.native
  trait EndpointBatchItem extends StObject {
    
    /**
      * The destination for messages that you send to this endpoint. The address varies by channel. For mobile push channels, use the token provided by the push notification service, such as the APNs device token or the FCM registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email channel, use an email address.
      */
    var Address: js.UndefOr[String] = js.native
    
    /**
      * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
      *
      * The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not display attributes that include these characters in the name. This limitation does not apply to attribute values.
      */
    var Attributes: js.UndefOr[
        (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ] = js.native
    
    /**
      * The channel type.
      *
      * Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
      */
    var ChannelType: js.UndefOr[
        GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
      ] = js.native
    
    /**
      * The endpoint demographic attributes.
      */
    var Demographic: js.UndefOr[EndpointDemographic] = js.native
    
    /**
      * The last time the endpoint was updated. Provided in ISO 8601 format.
      */
    var EffectiveDate: js.UndefOr[String] = js.native
    
    /**
      * Unused.
      */
    var EndpointStatus: js.UndefOr[String] = js.native
    
    /**
      * The unique Id for the Endpoint in the batch.
      */
    var Id: js.UndefOr[String] = js.native
    
    /**
      * The endpoint location attributes.
      */
    var Location: js.UndefOr[EndpointLocation] = js.native
    
    /**
      * Custom metrics that your app reports to Amazon Pinpoint.
      */
    var Metrics: js.UndefOr[StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])] = js.native
    
    /**
      * Indicates whether a user has opted out of receiving messages with one of the following values:
      *
      * ALL - User has opted out of all messages.
      *
      * NONE - Users has not opted out and receives all messages.
      */
    var OptOut: js.UndefOr[String] = js.native
    
    /**
      * The unique ID for the most recent request to update the endpoint.
      */
    var RequestId: js.UndefOr[String] = js.native
    
    /**
      * Custom user-specific attributes that your app reports to Amazon Pinpoint.
      */
    var User: js.UndefOr[EndpointUser] = js.native
  }
  object EndpointBatchItem {
    
    @scala.inline
    def apply(): EndpointBatchItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointBatchItem]
    }
    
    @scala.inline
    implicit class EndpointBatchItemMutableBuilder[Self <: EndpointBatchItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
      
      @scala.inline
      def setAttributes(
        value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setChannelType(
        value: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
      ): Self = StObject.set(x, "ChannelType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelTypeUndefined: Self = StObject.set(x, "ChannelType", js.undefined)
      
      @scala.inline
      def setDemographic(value: EndpointDemographic): Self = StObject.set(x, "Demographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemographicUndefined: Self = StObject.set(x, "Demographic", js.undefined)
      
      @scala.inline
      def setEffectiveDate(value: String): Self = StObject.set(x, "EffectiveDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectiveDateUndefined: Self = StObject.set(x, "EffectiveDate", js.undefined)
      
      @scala.inline
      def setEndpointStatus(value: String): Self = StObject.set(x, "EndpointStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointStatusUndefined: Self = StObject.set(x, "EndpointStatus", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setLocation(value: EndpointLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
      
      @scala.inline
      def setMetrics(value: StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
      
      @scala.inline
      def setOptOut(value: String): Self = StObject.set(x, "OptOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptOutUndefined: Self = StObject.set(x, "OptOut", js.undefined)
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
      
      @scala.inline
      def setUser(value: EndpointUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledEndpointBatchItem extends EndpointBatchItem {
    
    /**
      * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
      *
      * The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not display attributes that include these characters in the name. This limitation does not apply to attribute values.
      */
    @JSName("Attributes")
    var Attributes_UnmarshalledEndpointBatchItem: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
    
    /**
      * The endpoint demographic attributes.
      */
    @JSName("Demographic")
    var Demographic_UnmarshalledEndpointBatchItem: js.UndefOr[UnmarshalledEndpointDemographic] = js.native
    
    /**
      * The endpoint location attributes.
      */
    @JSName("Location")
    var Location_UnmarshalledEndpointBatchItem: js.UndefOr[UnmarshalledEndpointLocation] = js.native
    
    /**
      * Custom metrics that your app reports to Amazon Pinpoint.
      */
    @JSName("Metrics")
    var Metrics_UnmarshalledEndpointBatchItem: js.UndefOr[StringDictionary[Double]] = js.native
    
    /**
      * Custom user-specific attributes that your app reports to Amazon Pinpoint.
      */
    @JSName("User")
    var User_UnmarshalledEndpointBatchItem: js.UndefOr[UnmarshalledEndpointUser] = js.native
  }
  object UnmarshalledEndpointBatchItem {
    
    @scala.inline
    def apply(): UnmarshalledEndpointBatchItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEndpointBatchItem]
    }
    
    @scala.inline
    implicit class UnmarshalledEndpointBatchItemMutableBuilder[Self <: UnmarshalledEndpointBatchItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setDemographic(value: UnmarshalledEndpointDemographic): Self = StObject.set(x, "Demographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemographicUndefined: Self = StObject.set(x, "Demographic", js.undefined)
      
      @scala.inline
      def setLocation(value: UnmarshalledEndpointLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
      
      @scala.inline
      def setMetrics(value: StringDictionary[Double]): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
      
      @scala.inline
      def setUser(value: UnmarshalledEndpointUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    }
  }
}
