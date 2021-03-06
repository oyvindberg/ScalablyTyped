package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Statement extends _Node
object _Statement {
  
  @scala.inline
  def AssignmentStatement(
    init: js.Array[Expression],
    `type`: typings.luaparse.luaparseStrings.AssignmentStatement,
    variables: js.Array[IndexExpression | MemberExpression | Identifier]
  ): typings.luaparse.astMod.AssignmentStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.AssignmentStatement]
  }
  
  @scala.inline
  def CallStatement(
    expression: CallExpression | StringCallExpression | TableCallExpression,
    `type`: typings.luaparse.luaparseStrings.CallStatement
  ): typings.luaparse.astMod.CallStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.CallStatement]
  }
  
  @scala.inline
  def DoStatement(body: js.Array[Statement], `type`: typings.luaparse.luaparseStrings.DoStatement): typings.luaparse.astMod.DoStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.DoStatement]
  }
  
  @scala.inline
  def ForGenericStatement(
    body: js.Array[Statement],
    iterators: js.Array[Expression],
    `type`: typings.luaparse.luaparseStrings.ForGenericStatement,
    variables: js.Array[Identifier]
  ): typings.luaparse.astMod.ForGenericStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], iterators = iterators.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.ForGenericStatement]
  }
  
  @scala.inline
  def ForNumericStatement(
    body: js.Array[Statement],
    end: Expression,
    start: Expression,
    `type`: typings.luaparse.luaparseStrings.ForNumericStatement,
    variable: Identifier
  ): typings.luaparse.astMod.ForNumericStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.ForNumericStatement]
  }
  
  @scala.inline
  def FunctionDeclaration(
    body: js.Array[Statement],
    isLocal: Boolean,
    parameters: js.Array[Identifier | VarargLiteral],
    `type`: typings.luaparse.luaparseStrings.FunctionDeclaration
  ): typings.luaparse.astMod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.FunctionDeclaration]
  }
  
  @scala.inline
  def GotoStatement(label: Identifier, `type`: typings.luaparse.luaparseStrings.GotoStatement): typings.luaparse.astMod.GotoStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.GotoStatement]
  }
  
  @scala.inline
  def IfStatement(
    clauses: js.Array[IfClause | ElseifClause | ElseClause],
    `type`: typings.luaparse.luaparseStrings.IfStatement
  ): typings.luaparse.astMod.IfStatement = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.IfStatement]
  }
  
  @scala.inline
  def LabelStatement(label: Identifier, `type`: typings.luaparse.luaparseStrings.LabelStatement): typings.luaparse.astMod.LabelStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.LabelStatement]
  }
  
  @scala.inline
  def LocalStatement(
    init: js.Array[Expression],
    `type`: typings.luaparse.luaparseStrings.LocalStatement,
    variables: js.Array[Identifier]
  ): typings.luaparse.astMod.LocalStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.LocalStatement]
  }
  
  @scala.inline
  def RepeatStatement(
    body: js.Array[Statement],
    condition: Expression,
    `type`: typings.luaparse.luaparseStrings.RepeatStatement
  ): typings.luaparse.astMod.RepeatStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.RepeatStatement]
  }
  
  @scala.inline
  def ReturnStatement(arguments: js.Array[Expression], `type`: typings.luaparse.luaparseStrings.ReturnStatement): typings.luaparse.astMod.ReturnStatement = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.ReturnStatement]
  }
  
  @scala.inline
  def WhileStatement(
    body: js.Array[Statement],
    condition: Expression,
    `type`: typings.luaparse.luaparseStrings.WhileStatement
  ): typings.luaparse.astMod.WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.WhileStatement]
  }
}
