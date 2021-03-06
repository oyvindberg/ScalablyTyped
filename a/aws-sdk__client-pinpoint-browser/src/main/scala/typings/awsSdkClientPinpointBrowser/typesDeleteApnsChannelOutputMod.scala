package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApnschannelresponseMod.UnmarshalledAPNSChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteApnsChannelOutputMod {
  
  @js.native
  trait DeleteApnsChannelOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * Apple Distribution Push Notification Service channel definition.
      */
    var APNSChannelResponse: UnmarshalledAPNSChannelResponse = js.native
  }
  object DeleteApnsChannelOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, APNSChannelResponse: UnmarshalledAPNSChannelResponse): DeleteApnsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteApnsChannelOutput]
    }
    
    @scala.inline
    implicit class DeleteApnsChannelOutputMutableBuilder[Self <: DeleteApnsChannelOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAPNSChannelResponse(value: UnmarshalledAPNSChannelResponse): Self = StObject.set(x, "APNSChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
