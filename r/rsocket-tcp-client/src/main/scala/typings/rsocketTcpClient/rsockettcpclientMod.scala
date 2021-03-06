package typings.rsocketTcpClient

import typings.node.netMod.Socket
import typings.node.netMod.TcpSocketConnectOpts
import typings.node.tlsMod.ConnectionOptions
import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsockettcpclientMod {
  
  @JSImport("rsocket-tcp-client/RSocketTcpClient", "RSocketTcpClient")
  @js.native
  class RSocketTcpClient protected () extends RSocketTcpConnection {
    def this(options: TcpSocketConnectOpts) = this()
    def this(options: TcpSocketConnectOpts, encoders: Encoders[_]) = this()
  }
  
  @JSImport("rsocket-tcp-client/RSocketTcpClient", "RSocketTcpConnection")
  @js.native
  class RSocketTcpConnection () extends DuplexConnection {
    def this(socket: Socket) = this()
    def this(socket: js.UndefOr[scala.Nothing], encoders: Encoders[_]) = this()
    def this(socket: Socket, encoders: Encoders[_]) = this()
    
    def getConnectionState(): ConnectionStatus = js.native
    
    def setConnectionStatus(status: ConnectionStatus): Unit = js.native
    
    def setupSocket(socket: Socket): Unit = js.native
  }
  
  @JSImport("rsocket-tcp-client/RSocketTcpClient", "RSocketTlsClient")
  @js.native
  class RSocketTlsClient protected () extends RSocketTcpConnection {
    def this(options: ConnectionOptions) = this()
    def this(options: ConnectionOptions, encoders: Encoders[_]) = this()
  }
}
