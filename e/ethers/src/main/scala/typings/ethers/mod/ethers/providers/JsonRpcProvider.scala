package typings.ethers.mod.ethers.providers

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbstractProvider.mod.TransactionRequest
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectWeb.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.providers.JsonRpcProvider")
@js.native
class JsonRpcProvider ()
  extends typings.ethers.ethersMod.providers.JsonRpcProvider {
  def this(url: String) = this()
  def this(url: ConnectionInfo) = this()
  def this(url: js.UndefOr[scala.Nothing], network: Networkish) = this()
  def this(url: String, network: Networkish) = this()
  def this(url: ConnectionInfo, network: Networkish) = this()
}
/* static members */
@JSImport("ethers", "ethers.providers.JsonRpcProvider")
@js.native
object JsonRpcProvider extends js.Object {
  
  def defaultUrl(): String = js.native
  
  def hexlifyTransaction(transaction: TransactionRequest): StringDictionary[String] = js.native
  def hexlifyTransaction(transaction: TransactionRequest, allowExtra: StringDictionary[Boolean]): StringDictionary[String] = js.native
}
