package typings.vscodeLanguageclient.clientMod

import typings.vscodeJsonrpc.mod.TraceValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "Trace")
@js.native
object Trace extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.vscodeJsonrpc.mod.Trace with Double] = js.native
  
  /* 1 */ val Messages: typings.vscodeJsonrpc.mod.Trace.Messages with Double = js.native
  
  /* 0 */ val Off: typings.vscodeJsonrpc.mod.Trace.Off with Double = js.native
  
  /* 2 */ val Verbose: typings.vscodeJsonrpc.mod.Trace.Verbose with Double = js.native
  
  def fromString(value: String): typings.vscodeJsonrpc.mod.Trace = js.native
  
  def toString_(value: typings.vscodeJsonrpc.mod.Trace): TraceValues = js.native
}
