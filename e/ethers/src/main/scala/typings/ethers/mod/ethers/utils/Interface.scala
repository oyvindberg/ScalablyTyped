package typings.ethers.mod.ethers.utils

import typings.ethersprojectAbi.fragmentsMod.JsonFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.utils.Interface")
@js.native
class Interface protected ()
  extends typings.ethers.ethersMod.utils.Interface {
  def this(fragments: String) = this()
  def this(fragments: js.Array[typings.ethersprojectAbi.fragmentsMod.Fragment | JsonFragment | String]) = this()
}
/* static members */
@JSImport("ethers", "ethers.utils.Interface")
@js.native
object Interface extends js.Object {
  
  def getAbiCoder(): typings.ethersprojectAbi.abiCoderMod.AbiCoder = js.native
  
  def getAddress(address: String): String = js.native
  
  def getEventTopic(eventFragment: typings.ethersprojectAbi.fragmentsMod.EventFragment): String = js.native
  
  def getSighash(functionFragment: typings.ethersprojectAbi.fragmentsMod.FunctionFragment): String = js.native
  
  def isInterface(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean = js.native
}
