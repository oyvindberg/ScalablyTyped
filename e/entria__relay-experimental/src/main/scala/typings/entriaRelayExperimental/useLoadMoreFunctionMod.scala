package typings.entriaRelayExperimental

import typings.entriaRelayExperimental.anon.Cursor
import typings.entriaRelayExperimental.anon.OnComplete
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.readerNodeMod.ReaderPaginationMetadata
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayObservableMod.Observer
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLoadMoreFunctionMod {
  
  @JSImport("@entria/relay-experimental/lib/useLoadMoreFunction", "getConnectionState")
  @js.native
  def getConnectionState(
    direction: Direction,
    fragmentNode: ReaderFragment,
    fragmentData: js.Any,
    connectionPathInFragmentData: js.Array[String | Double]
  ): Cursor = js.native
  
  @JSImport("@entria/relay-experimental/lib/useLoadMoreFunction", "useLoadMoreFunction")
  @js.native
  def useLoadMoreFunction(args: UseLoadMoreFunctionArgs): js.Tuple3[LoadMoreFn, Boolean, js.Function0[Unit]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.entriaRelayExperimental.entriaRelayExperimentalStrings.forward
    - typings.entriaRelayExperimental.entriaRelayExperimentalStrings.backward
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def backward: typings.entriaRelayExperimental.entriaRelayExperimentalStrings.backward = "backward".asInstanceOf[typings.entriaRelayExperimental.entriaRelayExperimentalStrings.backward]
    
    @scala.inline
    def forward: typings.entriaRelayExperimental.entriaRelayExperimentalStrings.forward = "forward".asInstanceOf[typings.entriaRelayExperimental.entriaRelayExperimentalStrings.forward]
  }
  
  type LoadMoreFn = js.Function2[/* count */ Double, /* options */ js.UndefOr[OnComplete], Disposable]
  
  @js.native
  trait UseLoadMoreFunctionArgs extends StObject {
    
    var componentDisplayName: String = js.native
    
    var connectionPathInFragmentData: js.Array[String | Double] = js.native
    
    var direction: Direction = js.native
    
    var fragmentData: js.Any = js.native
    
    var fragmentIdentifier: String = js.native
    
    var fragmentNode: ReaderFragment = js.native
    
    var fragmentOwner: RequestDescriptor | (js.Array[RequestDescriptor | Null]) | Null = js.native
    
    var fragmentRefPathInResponse: js.Array[String | Double] = js.native
    
    var observer: Observer[GraphQLResponse] = js.native
    
    def onReset(): Unit = js.native
    
    var paginationMetadata: ReaderPaginationMetadata = js.native
    
    var paginationRequest: ConcreteRequest = js.native
  }
  object UseLoadMoreFunctionArgs {
    
    @scala.inline
    def apply(
      componentDisplayName: String,
      connectionPathInFragmentData: js.Array[String | Double],
      direction: Direction,
      fragmentData: js.Any,
      fragmentIdentifier: String,
      fragmentNode: ReaderFragment,
      fragmentRefPathInResponse: js.Array[String | Double],
      observer: Observer[GraphQLResponse],
      onReset: () => Unit,
      paginationMetadata: ReaderPaginationMetadata,
      paginationRequest: ConcreteRequest
    ): UseLoadMoreFunctionArgs = {
      val __obj = js.Dynamic.literal(componentDisplayName = componentDisplayName.asInstanceOf[js.Any], connectionPathInFragmentData = connectionPathInFragmentData.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], fragmentData = fragmentData.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any], fragmentNode = fragmentNode.asInstanceOf[js.Any], fragmentRefPathInResponse = fragmentRefPathInResponse.asInstanceOf[js.Any], observer = observer.asInstanceOf[js.Any], onReset = js.Any.fromFunction0(onReset), paginationMetadata = paginationMetadata.asInstanceOf[js.Any], paginationRequest = paginationRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseLoadMoreFunctionArgs]
    }
    
    @scala.inline
    implicit class UseLoadMoreFunctionArgsMutableBuilder[Self <: UseLoadMoreFunctionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentDisplayName(value: String): Self = StObject.set(x, "componentDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionPathInFragmentData(value: js.Array[String | Double]): Self = StObject.set(x, "connectionPathInFragmentData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionPathInFragmentDataVarargs(value: (String | Double)*): Self = StObject.set(x, "connectionPathInFragmentData", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentData(value: js.Any): Self = StObject.set(x, "fragmentData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentIdentifier(value: String): Self = StObject.set(x, "fragmentIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentNode(value: ReaderFragment): Self = StObject.set(x, "fragmentNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentOwner(value: RequestDescriptor | (js.Array[RequestDescriptor | Null])): Self = StObject.set(x, "fragmentOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentOwnerNull: Self = StObject.set(x, "fragmentOwner", null)
      
      @scala.inline
      def setFragmentOwnerVarargs(value: (RequestDescriptor | Null)*): Self = StObject.set(x, "fragmentOwner", js.Array(value :_*))
      
      @scala.inline
      def setFragmentRefPathInResponse(value: js.Array[String | Double]): Self = StObject.set(x, "fragmentRefPathInResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentRefPathInResponseVarargs(value: (String | Double)*): Self = StObject.set(x, "fragmentRefPathInResponse", js.Array(value :_*))
      
      @scala.inline
      def setObserver(value: Observer[GraphQLResponse]): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReset(value: () => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPaginationMetadata(value: ReaderPaginationMetadata): Self = StObject.set(x, "paginationMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationRequest(value: ConcreteRequest): Self = StObject.set(x, "paginationRequest", value.asInstanceOf[js.Any])
    }
  }
}
