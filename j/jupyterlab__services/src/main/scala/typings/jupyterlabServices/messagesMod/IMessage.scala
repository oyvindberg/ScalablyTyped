package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Allowstdin
import typings.jupyterlabServices.anon.Arguments
import typings.jupyterlabServices.anon.Body
import typings.jupyterlabServices.anon.Code
import typings.jupyterlabServices.anon.CodeString
import typings.jupyterlabServices.anon.Commid
import typings.jupyterlabServices.anon.Cursorpos
import typings.jupyterlabServices.anon.Data
import typings.jupyterlabServices.anon.Ename
import typings.jupyterlabServices.anon.Event
import typings.jupyterlabServices.anon.Executioncount
import typings.jupyterlabServices.anon.Executionstate
import typings.jupyterlabServices.anon.Metadata
import typings.jupyterlabServices.anon.Name
import typings.jupyterlabServices.anon.Password
import typings.jupyterlabServices.anon.Targetname
import typings.jupyterlabServices.anon.Transient
import typings.jupyterlabServices.anon.TransientDisplayidString
import typings.jupyterlabServices.anon.Wait
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessage[MSGTYPE /* <: MessageType */] extends StObject {
  
  /**
    * An optional list of binary buffers.
    */
  var buffers: js.UndefOr[js.Array[ArrayBuffer | ArrayBufferView]] = js.native
  
  /**
    * The channel on which the message is transmitted.
    */
  var channel: Channel = js.native
  
  /**
    * The content of the message.
    */
  var content: Wait | Commid | (ReplyContent[
    ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
  ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) with TransientDisplayidString) | Arguments | Body | Event = js.native
  
  /**
    * The message header.
    */
  var header: IHeader[MSGTYPE] = js.native
  
  /**
    * Metadata associated with the message.
    */
  var metadata: JSONObject = js.native
  
  /**
    * The parent message
    */
  var parent_header: IHeader[MessageType] | js.Object = js.native
}
object IMessage {
  
  @scala.inline
  def apply[MSGTYPE /* <: MessageType */](
    channel: Channel,
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) with TransientDisplayidString) | Arguments | Body | Event,
    header: IHeader[MSGTYPE],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IMessage[MSGTYPE] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage[MSGTYPE]]
  }
  
  @scala.inline
  implicit class IMessageMutableBuilder[Self <: IMessage[_], MSGTYPE /* <: MessageType */] (val x: Self with IMessage[MSGTYPE]) extends AnyVal {
    
    @scala.inline
    def setBuffers(value: js.Array[ArrayBuffer | ArrayBufferView]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffersUndefined: Self = StObject.set(x, "buffers", js.undefined)
    
    @scala.inline
    def setBuffersVarargs(value: (ArrayBuffer | ArrayBufferView)*): Self = StObject.set(x, "buffers", js.Array(value :_*))
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(
      value: Wait | Commid | (ReplyContent[
          ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
        ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) with TransientDisplayidString) | Arguments | Body | Event
    ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: IHeader[MSGTYPE]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: JSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_header(value: IHeader[MessageType] | js.Object): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
