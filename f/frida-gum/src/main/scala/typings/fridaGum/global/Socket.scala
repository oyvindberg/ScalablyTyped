package typings.fridaGum.global

import typings.fridaGum.SocketConnectOptions
import typings.fridaGum.SocketEndpointAddress
import typings.fridaGum.SocketListenOptions
import typings.fridaGum.SocketListener
import typings.fridaGum.SocketType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TCP and UNIX sockets.
  */
object Socket {
  
  /**
    * Connects to a TCP or UNIX server.
    */
  @JSGlobal("Socket.connect")
  @js.native
  def connect(options: SocketConnectOptions): js.Promise[typings.fridaGum.SocketConnection] = js.native
  
  /**
    * Opens a TCP or UNIX listening socket.
    *
    * Defaults to listening on both IPv4 and IPv6, if supported, and binding on all interfaces on a randomly
    * selected port.
    */
  @JSGlobal("Socket.listen")
  @js.native
  def listen(): js.Promise[SocketListener] = js.native
  @JSGlobal("Socket.listen")
  @js.native
  def listen(options: SocketListenOptions): js.Promise[SocketListener] = js.native
  
  /**
    * Inspects the OS socket `handle` and returns its local address, or `null` if invalid or unknown.
    */
  @JSGlobal("Socket.localAddress")
  @js.native
  def localAddress(handle: Double): SocketEndpointAddress | Null = js.native
  
  /**
    * Inspects the OS socket `handle` and returns its peer address, or `null` if invalid or unknown.
    */
  @JSGlobal("Socket.peerAddress")
  @js.native
  def peerAddress(handle: Double): SocketEndpointAddress | Null = js.native
  
  /**
    * Inspects the OS socket `handle` and returns its type, or `null` if invalid or unknown.
    */
  @JSGlobal("Socket.type")
  @js.native
  def `type`(handle: Double): SocketType | Null = js.native
}
