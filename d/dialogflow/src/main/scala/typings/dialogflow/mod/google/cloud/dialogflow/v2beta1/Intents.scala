package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intents.BatchDeleteIntentsCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intents.BatchUpdateIntentsCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intents.CreateIntentCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intents.DeleteIntentCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intents.GetIntentCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intents.ListIntentsCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intents.UpdateIntentCallback
import typings.dialogflow.mod.google.longrunning.Operation
import typings.dialogflow.mod.google.protobuf.Empty
import typings.protobufjs.mod.RPCImpl
import typings.protobufjs.mod.rpc.Service
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Intents */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intents")
@js.native
class Intents protected () extends Service {
  /**
    * Constructs a new Intents service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  
  /**
    * Calls BatchDeleteIntents.
    * @param request BatchDeleteIntentsRequest message or plain object
    * @returns Promise
    */
  def batchDeleteIntents(request: IBatchDeleteIntentsRequest): js.Promise[Operation] = js.native
  /**
    * Calls BatchDeleteIntents.
    * @param request BatchDeleteIntentsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def batchDeleteIntents(request: IBatchDeleteIntentsRequest, callback: BatchDeleteIntentsCallback): Unit = js.native
  
  /**
    * Calls BatchUpdateIntents.
    * @param request BatchUpdateIntentsRequest message or plain object
    * @returns Promise
    */
  def batchUpdateIntents(request: IBatchUpdateIntentsRequest): js.Promise[Operation] = js.native
  /**
    * Calls BatchUpdateIntents.
    * @param request BatchUpdateIntentsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def batchUpdateIntents(request: IBatchUpdateIntentsRequest, callback: BatchUpdateIntentsCallback): Unit = js.native
  
  /**
    * Calls CreateIntent.
    * @param request CreateIntentRequest message or plain object
    * @returns Promise
    */
  def createIntent(request: ICreateIntentRequest): js.Promise[Intent] = js.native
  /**
    * Calls CreateIntent.
    * @param request CreateIntentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Intent
    */
  def createIntent(request: ICreateIntentRequest, callback: CreateIntentCallback): Unit = js.native
  
  /**
    * Calls DeleteIntent.
    * @param request DeleteIntentRequest message or plain object
    * @returns Promise
    */
  def deleteIntent(request: IDeleteIntentRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteIntent.
    * @param request DeleteIntentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteIntent(request: IDeleteIntentRequest, callback: DeleteIntentCallback): Unit = js.native
  
  /**
    * Calls GetIntent.
    * @param request GetIntentRequest message or plain object
    * @returns Promise
    */
  def getIntent(request: IGetIntentRequest): js.Promise[Intent] = js.native
  /**
    * Calls GetIntent.
    * @param request GetIntentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Intent
    */
  def getIntent(request: IGetIntentRequest, callback: GetIntentCallback): Unit = js.native
  
  /**
    * Calls ListIntents.
    * @param request ListIntentsRequest message or plain object
    * @returns Promise
    */
  def listIntents(request: IListIntentsRequest): js.Promise[ListIntentsResponse] = js.native
  /**
    * Calls ListIntents.
    * @param request ListIntentsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListIntentsResponse
    */
  def listIntents(request: IListIntentsRequest, callback: ListIntentsCallback): Unit = js.native
  
  /**
    * Calls UpdateIntent.
    * @param request UpdateIntentRequest message or plain object
    * @returns Promise
    */
  def updateIntent(request: IUpdateIntentRequest): js.Promise[Intent] = js.native
  /**
    * Calls UpdateIntent.
    * @param request UpdateIntentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Intent
    */
  def updateIntent(request: IUpdateIntentRequest, callback: UpdateIntentCallback): Unit = js.native
}
object Intents {
  
  /**
    * Creates new Intents service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intents.create")
  @js.native
  def create(rpcImpl: RPCImpl): Intents = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intents.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean): Intents = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intents.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): Intents = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intents.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): Intents = js.native
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Intents#batchDeleteIntents}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type BatchDeleteIntentsCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Intents#batchUpdateIntents}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type BatchUpdateIntentsCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Intents#createIntent}.
    * @param error Error, if any
    * @param [response] Intent
    */
  type CreateIntentCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Intent], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Intents#deleteIntent}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteIntentCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Intents#getIntent}.
    * @param error Error, if any
    * @param [response] Intent
    */
  type GetIntentCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Intent], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Intents#listIntents}.
    * @param error Error, if any
    * @param [response] ListIntentsResponse
    */
  type ListIntentsCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[ListIntentsResponse], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Intents#updateIntent}.
    * @param error Error, if any
    * @param [response] Intent
    */
  type UpdateIntentCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Intent], Unit]
}
