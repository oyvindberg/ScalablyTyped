package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "FnParam")
@js.native
class FnParam protected () extends StObject {
  def this(name: String) = this()
  def this(name: String, `type`: Type) = this()
  
  def isEquivalent(param: FnParam): Boolean = js.native
  
  var name: String = js.native
  
  var `type`: Type | Null = js.native
}
