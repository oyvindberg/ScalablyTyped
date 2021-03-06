package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.DNS_
import typings.ipfsCore.componentsMod.IsOnline_
import typings.ipfsCore.dnsMod.DNSSettings
import typings.ipfsCore.ipnsMod.^
import typings.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsOnline extends js.Object {
  
  def dns(domain: String): js.Promise[String] = js.native
  def dns(domain: String, options: DNSSettings with AbortOptions): js.Promise[String] = js.native
  @JSName("dns")
  var dns_Original: DNS_ = js.native
  
  var ipns: ^ = js.native
  
  def isOnline(): Boolean = js.native
  @JSName("isOnline")
  var isOnline_Original: IsOnline_ = js.native
  
  var options: Offline = js.native
  
  var peerId: typings.peerId.mod.^ = js.native
}
