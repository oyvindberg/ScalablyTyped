package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DeclaredPredicate
import typings.babelTypes.babelTypesStrings.InferredPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.DeclaredPredicate_
  - typings.babelTypes.mod.InferredPredicate_
*/
trait FlowPredicate extends _Node
object FlowPredicate {
  
  @scala.inline
  def DeclaredPredicate_(`type`: DeclaredPredicate, value: Flow): typings.babelTypes.mod.DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.DeclaredPredicate_]
  }
  
  @scala.inline
  def InferredPredicate_(`type`: InferredPredicate): typings.babelTypes.mod.InferredPredicate_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.InferredPredicate_]
  }
}
