package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Shared request debug options for all cloudsearch RPC methods.
  */
@js.native
trait SchemaDebugOptions extends StObject {
  
  /**
    * If set, the request will enable debugging features of Cloud Search. Only
    * turn on this field, if asked by Google to help with debugging.
    */
  var enableDebugging: js.UndefOr[Boolean] = js.native
}
object SchemaDebugOptions {
  
  @scala.inline
  def apply(): SchemaDebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDebugOptions]
  }
  
  @scala.inline
  implicit class SchemaDebugOptionsMutableBuilder[Self <: SchemaDebugOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableDebugging(value: Boolean): Self = StObject.set(x, "enableDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDebuggingUndefined: Self = StObject.set(x, "enableDebugging", js.undefined)
  }
}
