package typings.vscodeLanguageclient.clientMod

import typings.node.childProcessMod.ChildProcess
import typings.node.processMod.global.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends typings.vscodeLanguageserverProtocol.mod.IPCMessageWriter {
  def this(process: ChildProcess) = this()
  def this(process: Process) = this()
}
