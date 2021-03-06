package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typings.ethers.mod.ethers.Wallet
import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectJsonWallets.keystoreMod.ProgressCallback
import typings.ethersprojectWordlists.mod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWallet extends Instantiable1[/* privateKey */ BytesLike, Wallet] {
  
  /**
    *  Static methods to create Wallet instances.
    */
  def createRandom(): typings.ethersprojectWallet.mod.Wallet = js.native
  def createRandom(options: js.Any): typings.ethersprojectWallet.mod.Wallet = js.native
  
  def fromEncryptedJson(json: String, password: String): js.Promise[typings.ethersprojectWallet.mod.Wallet] = js.native
  def fromEncryptedJson(json: String, password: String, progressCallback: ProgressCallback): js.Promise[typings.ethersprojectWallet.mod.Wallet] = js.native
  def fromEncryptedJson(json: String, password: Bytes): js.Promise[typings.ethersprojectWallet.mod.Wallet] = js.native
  def fromEncryptedJson(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[typings.ethersprojectWallet.mod.Wallet] = js.native
  
  def fromEncryptedJsonSync(json: String, password: String): typings.ethersprojectWallet.mod.Wallet = js.native
  def fromEncryptedJsonSync(json: String, password: Bytes): typings.ethersprojectWallet.mod.Wallet = js.native
  
  def fromMnemonic(mnemonic: String): typings.ethersprojectWallet.mod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: js.UndefOr[scala.Nothing], wordlist: Wordlist): typings.ethersprojectWallet.mod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String): typings.ethersprojectWallet.mod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): typings.ethersprojectWallet.mod.Wallet = js.native
}
