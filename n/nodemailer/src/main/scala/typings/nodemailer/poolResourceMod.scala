package typings.nodemailer

import typings.node.eventsMod.EventEmitter
import typings.nodemailer.nodemailerStrings.available
import typings.nodemailer.nodemailerStrings.close
import typings.nodemailer.nodemailerStrings.error
import typings.nodemailer.sharedMod.Logger
import typings.nodemailer.smtpPoolMod.Options
import typings.nodemailer.smtpPoolMod.SentMessageInfo
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poolResourceMod {
  
  /**
    * Creates an element for the pool
    */
  @JSImport("nodemailer/lib/smtp-pool/pool-resource", JSImport.Namespace)
  @js.native
  class ^ protected () extends PoolResource {
    def this(pool: typings.nodemailer.smtpPoolMod.^) = this()
  }
  
  /**
    * Creates an element for the pool
    */
  @js.native
  trait PoolResource extends EventEmitter {
    
    @JSName("addListener")
    def addListener_available(event: available, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    var available: Boolean = js.native
    
    /** Closes the connection */
    def close(): Unit = js.native
    
    /** Initiates a connection to the SMTP server */
    def connect(callback: js.Function2[/* err */ Error | Null, /* established */ Boolean, Unit]): Unit = js.native
    
    @JSName("emit")
    def emit_available(event: available): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    
    var logger: Logger = js.native
    
    var messages: Double = js.native
    
    @JSName("on")
    def on_available(event: available, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("once")
    def once_available(event: available, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    var options: Options = js.native
    
    var pool: typings.nodemailer.smtpPoolMod.^ = js.native
    
    @JSName("prependListener")
    def prependListener_available(event: available, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_available(event: available, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_available(event: available, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    /** Sends an e-mail to be sent using the selected settings */
    def send(
      mail: typings.nodemailer.mailMessageMod.^,
      callback: js.Function2[/* err */ Error | Null, /* info */ SentMessageInfo, Unit]
    ): Unit = js.native
  }
}
