package typings.reactRelay

import typings.react.mod.Context
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.reactRelay.anon.EntryPointReference
import typings.reactRelay.anon.FetchKey
import typings.reactRelay.anon.FetchPolicy
import typings.reactRelay.anon.FnCall
import typings.reactRelay.anon.UNSTABLErenderPolicy
import typings.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typings.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typings.reactRelay.entryPointTypesMod.LoadQueryOptions
import typings.reactRelay.entryPointTypesMod.PreloadableConcreteRequest
import typings.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import typings.reactRelay.entryPointTypesMod.PreloadedQuery
import typings.reactRelay.helpersMod.ArrayKeyType
import typings.reactRelay.helpersMod.ArrayKeyTypeData
import typings.reactRelay.helpersMod.GetEntryPointComponentFromEntryPoint
import typings.reactRelay.helpersMod.GetEntryPointParamsFromEntryPoint
import typings.reactRelay.helpersMod.KeyType
import typings.reactRelay.helpersMod.KeyTypeData
import typings.reactRelay.matchContainerMod.MatchContainerProps
import typings.reactRelay.profilerContextMod.ProfilerContextType
import typings.reactRelay.relayEnvironmentProviderMod.Props
import typings.reactRelay.useBlockingPaginationFragmentMod.ReturnTypeNode
import typings.reactRelay.useEntryPointLoaderMod.UseEntryPointLoaderHookType
import typings.reactRelay.useMutationMod.UseMutationConfig
import typings.reactRelay.usePaginationFragmentMod.ReturnType
import typings.reactRelay.useQueryLoaderMod.useQueryLoaderHookType
import typings.relayRuntime.commitMutationMod.MutationConfig
import typings.relayRuntime.commitMutationMod.MutationParameters
import typings.relayRuntime.mod.Observable
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayRuntimeTypesMod.VariablesOf
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.requestSubscriptionMod.GraphQLSubscriptionConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-relay/hooks", "EntryPointContainer")
  @js.native
  def EntryPointContainer[TPreloadedEntryPoint /* <: PreloadedEntryPoint[_] */](hasEntryPointReferenceProps: EntryPointReference[TPreloadedEntryPoint]): ReactElement = js.native
  
  @JSImport("react-relay/hooks", "MatchContainer")
  @js.native
  def MatchContainer[TProps, TFallback](props: MatchContainerProps[TProps, TFallback]): ElementType[TProps] | TFallback | Null = js.native
  
  @JSImport("react-relay/hooks", "ProfilerContext")
  @js.native
  val ProfilerContext: Context[ProfilerContextType] = js.native
  
  @JSImport("react-relay/hooks", "RelayEnvironmentProvider")
  @js.native
  def RelayEnvironmentProvider(props: Props): ReactElement = js.native
  
  @JSImport("react-relay/hooks", "fetchQuery")
  @js.native
  def fetchQuery[TQuery /* <: OperationType */](environment: Environment, query: GraphQLTaggedNode, variables: VariablesOf[TQuery]): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  @JSImport("react-relay/hooks", "fetchQuery")
  @js.native
  def fetchQuery[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: FetchPolicy
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  
  @JSImport("react-relay/hooks", "graphql")
  @js.native
  def graphql(strings: js.Any): GraphQLTaggedNode = js.native
  
  @JSImport("react-relay/hooks", "loadEntryPoint")
  @js.native
  def loadEntryPoint[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, _]]],
    entryPoint: TEntryPoint,
    entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]
  ): PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] = js.native
  
  @JSImport("react-relay/hooks", "loadQuery")
  @js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery]
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSImport("react-relay/hooks", "loadQuery")
  @js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: js.UndefOr[scala.Nothing],
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSImport("react-relay/hooks", "loadQuery")
  @js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSImport("react-relay/hooks", "loadQuery")
  @js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSImport("react-relay/hooks", "loadQuery")
  @js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](environment: Environment, preloadableRequest: GraphQLTaggedNode, variables: VariablesOf[TQuery]): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSImport("react-relay/hooks", "loadQuery")
  @js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: js.UndefOr[scala.Nothing],
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSImport("react-relay/hooks", "loadQuery")
  @js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSImport("react-relay/hooks", "loadQuery")
  @js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  
  @JSImport("react-relay/hooks", "useBlockingPaginationFragment")
  @js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  @JSImport("react-relay/hooks", "useBlockingPaginationFragment")
  @js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  @JSImport("react-relay/hooks", "useBlockingPaginationFragment")
  @js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  @JSImport("react-relay/hooks", "useBlockingPaginationFragment")
  @js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: Null, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  
  @JSImport("react-relay/hooks", "useEntryPointLoader")
  @js.native
  def useEntryPointLoader[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, _]]],
    entryPoint: TEntryPoint
  ): UseEntryPointLoaderHookType[TEntryPoint] = js.native
  
  @JSImport("react-relay/hooks", "useFragment")
  @js.native
  def useFragment[TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode): (KeyTypeData[TKey, _]) | Null = js.native
  @JSImport("react-relay/hooks", "useFragment")
  @js.native
  def useFragment[TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (KeyTypeData[TKey, _]) | Null = js.native
  @JSImport("react-relay/hooks", "useFragment")
  @js.native
  def useFragment_TKey_ArrayKeyTypeWildcard[TKey /* <: ArrayKeyType[_] */](fragmentInput: GraphQLTaggedNode): (ArrayKeyTypeData[TKey, _]) | Null = js.native
  @JSImport("react-relay/hooks", "useFragment")
  @js.native
  def useFragment_TKey_ArrayKeyTypeWildcard[TKey /* <: ArrayKeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (ArrayKeyTypeData[TKey, _]) | Null = js.native
  @JSImport("react-relay/hooks", "useFragment")
  @js.native
  def useFragment_TKey_ArrayKeyTypeWildcard_ArrayKeyTypeData[TKey /* <: ArrayKeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ArrayKeyTypeData[TKey, _] = js.native
  @JSImport("react-relay/hooks", "useFragment")
  @js.native
  def useFragment_TKey_KeyTypeWildcard_KeyTypeData[TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): KeyTypeData[TKey, _] = js.native
  
  @JSImport("react-relay/hooks", "useLazyLoadQuery")
  @js.native
  def useLazyLoadQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSImport("react-relay/hooks", "useLazyLoadQuery")
  @js.native
  def useLazyLoadQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery], options: FetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  
  @JSImport("react-relay/hooks", "useMutation")
  @js.native
  def useMutation[TMutation /* <: MutationParameters */](mutation: GraphQLTaggedNode): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = js.native
  @JSImport("react-relay/hooks", "useMutation")
  @js.native
  def useMutation[TMutation /* <: MutationParameters */](
    mutation: GraphQLTaggedNode,
    commitMutationFn: js.Function2[/* environment */ Environment, /* config */ MutationConfig[TMutation], Disposable]
  ): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = js.native
  
  @JSImport("react-relay/hooks", "usePaginationFragment")
  @js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, (KeyTypeData[TKey, _]) | Null] = js.native
  @JSImport("react-relay/hooks", "usePaginationFragment")
  @js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, (KeyTypeData[TKey, _]) | Null] = js.native
  
  @JSImport("react-relay/hooks", "usePreloadedQuery")
  @js.native
  def usePreloadedQuery[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, _]]]
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSImport("react-relay/hooks", "usePreloadedQuery")
  @js.native
  def usePreloadedQuery[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, _]]],
    options: UNSTABLErenderPolicy
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  
  @JSImport("react-relay/hooks", "useQueryLoader")
  @js.native
  def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: PreloadableConcreteRequest[TQuery]): useQueryLoaderHookType[TQuery] = js.native
  @JSImport("react-relay/hooks", "useQueryLoader")
  @js.native
  def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: GraphQLTaggedNode): useQueryLoaderHookType[TQuery] = js.native
  
  @JSImport("react-relay/hooks", "useRefetchableFragment")
  @js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  typings.reactRelay.useRefetchableFragmentMod.ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  @JSImport("react-relay/hooks", "useRefetchableFragment")
  @js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  typings.reactRelay.useRefetchableFragmentMod.ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  
  @JSImport("react-relay/hooks", "useRelayEnvironment")
  @js.native
  def useRelayEnvironment(): typings.relayRuntime.mod.Environment = js.native
  
  @JSImport("react-relay/hooks", "useSubscribeToInvalidationState")
  @js.native
  def useSubscribeToInvalidationState(dataIDs: js.Array[DataID], callback: js.Function0[Unit]): Disposable = js.native
  
  @JSImport("react-relay/hooks", "useSubscription")
  @js.native
  def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inference inside GraphQLSubscriptionConfig.s
  // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Unit = js.native
  @JSImport("react-relay/hooks", "useSubscription")
  @js.native
  def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inference inside GraphQLSubscriptionConfig.s
  // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload],
    requestSubscriptionFn: FnCall
  ): Unit = js.native
}
