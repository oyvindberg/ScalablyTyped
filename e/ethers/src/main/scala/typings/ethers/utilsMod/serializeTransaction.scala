package typings.ethers.utilsMod

import typings.ethersprojectBytes.mod.SignatureLike
import typings.ethersprojectTransactions.mod.UnsignedTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/utils", "serializeTransaction")
@js.native
object serializeTransaction extends js.Object {
  
  def apply(transaction: UnsignedTransaction): String = js.native
  def apply(transaction: UnsignedTransaction, signature: SignatureLike): String = js.native
}
