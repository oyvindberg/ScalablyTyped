package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.executeDoterror
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.error',   transactionID :number,   error :std.Error}> */
@js.native
trait Readonlynameexecuteerrort extends LogEvent {
  
  val error: Error = js.native
  
  val name: executeDoterror = js.native
  
  val transactionID: Double = js.native
}
object Readonlynameexecuteerrort {
  
  @scala.inline
  def apply(error: Error, name: executeDoterror, transactionID: Double): Readonlynameexecuteerrort = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecuteerrort]
  }
  
  @scala.inline
  implicit class ReadonlynameexecuteerrortMutableBuilder[Self <: Readonlynameexecuteerrort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: executeDoterror): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: Double): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
  }
}
