package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassDeclaration
import typings.babelTypes.babelTypesStrings.ClassExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.ClassExpression_
  - typings.babelTypes.mod.ClassDeclaration_
*/
trait Class extends _Node
object Class {
  
  @scala.inline
  def ClassDeclaration_(body: ClassBody_, id: Identifier_, `type`: ClassDeclaration): typings.babelTypes.mod.ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ClassDeclaration_]
  }
  
  @scala.inline
  def ClassExpression_(body: ClassBody_, `type`: ClassExpression): typings.babelTypes.mod.ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ClassExpression_]
  }
}
