package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ForInStatement
import typings.babelTypes.babelTypesStrings.ForOfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.ForInStatement_
  - typings.babelTypes.indexTs37Mod.ForOfStatement_
*/
trait ForXStatement extends _Node
object ForXStatement {
  
  @scala.inline
  def ForInStatement_(body: Statement, left: VariableDeclaration_ | LVal, right: Expression, `type`: ForInStatement): typings.babelTypes.indexTs37Mod.ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ForInStatement_]
  }
  
  @scala.inline
  def ForOfStatement_(
    await: Boolean,
    body: Statement,
    left: VariableDeclaration_ | LVal,
    right: Expression,
    `type`: ForOfStatement
  ): typings.babelTypes.indexTs37Mod.ForOfStatement_ = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ForOfStatement_]
  }
}
