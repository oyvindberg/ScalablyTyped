package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.IAsyncOperation
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports the retrieval of a message from the SMS message store. */
@js.native
trait GetSmsMessageOperation extends StObject {
  
  /** Cancels the asynchronous SMS message retrieval operation. */
  def cancel(): Unit = js.native
  
  /** Closes the asynchronous SMS message retrieval operation. */
  def close(): Unit = js.native
  
  /** A handler for the completed event of an asynchronous SMS message retrieval operation. */
  def completed(asyncInfo: IAsyncOperation[ISmsMessage], asyncStatus: AsyncStatus): Unit = js.native
  /** A handler for the completed event of an asynchronous SMS message retrieval operation. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[ISmsMessage] = js.native
  
  /** Specifies the error code for the asynchronous SMS message retrieval operation. */
  var errorCode: WinRTError = js.native
  
  /**
    * Retrieves the result of the asynchronous SMS message retrieval operation.
    * @return An interface that accesses the retrieved message.
    */
  def getResults(): ISmsMessage = js.native
  
  /** Specifies the ID of the asynchronous SMS message retrieval operation. */
  var id: Double = js.native
  
  /** Specifies the status of the asynchronous SMS message retrieval operation. */
  var status: AsyncStatus = js.native
}
