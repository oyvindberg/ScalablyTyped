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
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIOPubMessage[T /* <: IOPubMessageType */] extends IMessage[T] {
  
  @JSName("channel")
  var channel_IIOPubMessage: iopub = js.native
}
object IIOPubMessage {
  
  @scala.inline
  def apply[T /* <: IOPubMessageType */](
    channel: iopub,
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) with TransientDisplayidString) | Arguments | Body | Event,
    header: IHeader[T],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IIOPubMessage[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIOPubMessage[T]]
  }
  
  @scala.inline
  implicit class IIOPubMessageMutableBuilder[Self <: IIOPubMessage[_], T /* <: IOPubMessageType */] (val x: Self with IIOPubMessage[T]) extends AnyVal {
    
    @scala.inline
    def setChannel(value: iopub): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
