package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object outputAstMod {
  
  @scala.inline
  def BOOL_TYPE: typings.angularCompiler.outputAstMod.BuiltinType = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].selectDynamic("BOOL_TYPE").asInstanceOf[typings.angularCompiler.outputAstMod.BuiltinType]
  
  @scala.inline
  def CATCH_ERROR_VAR: typings.angularCompiler.outputAstMod.ReadVarExpr = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].selectDynamic("CATCH_ERROR_VAR").asInstanceOf[typings.angularCompiler.outputAstMod.ReadVarExpr]
  
  @scala.inline
  def CATCH_STACK_VAR: typings.angularCompiler.outputAstMod.ReadVarExpr = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].selectDynamic("CATCH_STACK_VAR").asInstanceOf[typings.angularCompiler.outputAstMod.ReadVarExpr]
  
  @scala.inline
  def DYNAMIC_TYPE: typings.angularCompiler.outputAstMod.BuiltinType = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].selectDynamic("DYNAMIC_TYPE").asInstanceOf[typings.angularCompiler.outputAstMod.BuiltinType]
  
  @scala.inline
  def FUNCTION_TYPE: typings.angularCompiler.outputAstMod.BuiltinType = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].selectDynamic("FUNCTION_TYPE").asInstanceOf[typings.angularCompiler.outputAstMod.BuiltinType]
  
  @scala.inline
  def INFERRED_TYPE: typings.angularCompiler.outputAstMod.BuiltinType = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].selectDynamic("INFERRED_TYPE").asInstanceOf[typings.angularCompiler.outputAstMod.BuiltinType]
  
  @scala.inline
  def INT_TYPE: typings.angularCompiler.outputAstMod.BuiltinType = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].selectDynamic("INT_TYPE").asInstanceOf[typings.angularCompiler.outputAstMod.BuiltinType]
  
  @scala.inline
  def NONE_TYPE: typings.angularCompiler.outputAstMod.BuiltinType = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].selectDynamic("NONE_TYPE").asInstanceOf[typings.angularCompiler.outputAstMod.BuiltinType]
  
  @scala.inline
  def NULL_EXPR: typings.angularCompiler.outputAstMod.LiteralExpr = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].selectDynamic("NULL_EXPR").asInstanceOf[typings.angularCompiler.outputAstMod.LiteralExpr]
  
  @scala.inline
  def NUMBER_TYPE: typings.angularCompiler.outputAstMod.BuiltinType = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].selectDynamic("NUMBER_TYPE").asInstanceOf[typings.angularCompiler.outputAstMod.BuiltinType]
  
  @scala.inline
  def STRING_TYPE: typings.angularCompiler.outputAstMod.BuiltinType = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].selectDynamic("STRING_TYPE").asInstanceOf[typings.angularCompiler.outputAstMod.BuiltinType]
  
  @scala.inline
  def SUPER_EXPR: typings.angularCompiler.outputAstMod.ReadVarExpr = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].selectDynamic("SUPER_EXPR").asInstanceOf[typings.angularCompiler.outputAstMod.ReadVarExpr]
  
  @scala.inline
  def THIS_EXPR: typings.angularCompiler.outputAstMod.ReadVarExpr = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].selectDynamic("THIS_EXPR").asInstanceOf[typings.angularCompiler.outputAstMod.ReadVarExpr]
  
  @scala.inline
  def TYPED_NULL_EXPR: typings.angularCompiler.outputAstMod.LiteralExpr = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].selectDynamic("TYPED_NULL_EXPR").asInstanceOf[typings.angularCompiler.outputAstMod.LiteralExpr]
  
  @scala.inline
  def applySourceSpanToExpressionIfNeeded(expr: typings.angularCompiler.outputAstMod.Expression): typings.angularCompiler.outputAstMod.Expression = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("applySourceSpanToExpressionIfNeeded")(expr.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.Expression]
  @scala.inline
  def applySourceSpanToExpressionIfNeeded(
    expr: typings.angularCompiler.outputAstMod.Expression,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.Expression = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("applySourceSpanToExpressionIfNeeded")(expr.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.Expression]
  
  @scala.inline
  def applySourceSpanToStatementIfNeeded(stmt: typings.angularCompiler.outputAstMod.Statement): typings.angularCompiler.outputAstMod.Statement = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("applySourceSpanToStatementIfNeeded")(stmt.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.Statement]
  @scala.inline
  def applySourceSpanToStatementIfNeeded(
    stmt: typings.angularCompiler.outputAstMod.Statement,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.Statement = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("applySourceSpanToStatementIfNeeded")(stmt.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.Statement]
  
  @scala.inline
  def areAllEquivalent[T /* <: typings.angularCompiler.anon.IsEquivalent[T] */](base: js.Array[T], other: js.Array[T]): scala.Boolean = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("areAllEquivalent")(base.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def assertNotNull(expr: typings.angularCompiler.outputAstMod.Expression): typings.angularCompiler.outputAstMod.AssertNotNull_ = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("assertNotNull")(expr.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.AssertNotNull_]
  @scala.inline
  def assertNotNull(
    expr: typings.angularCompiler.outputAstMod.Expression,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.AssertNotNull_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("assertNotNull")(expr.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.AssertNotNull_]
  
  @scala.inline
  def collectExternalReferences(stmts: js.Array[typings.angularCompiler.outputAstMod.Statement]): js.Array[typings.angularCompiler.outputAstMod.ExternalReference] = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("collectExternalReferences")(stmts.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.angularCompiler.outputAstMod.ExternalReference]]
  
  @scala.inline
  def expressionType(expr: typings.angularCompiler.outputAstMod.Expression): typings.angularCompiler.outputAstMod.ExpressionType_ = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("expressionType")(expr.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.ExpressionType_]
  @scala.inline
  def expressionType(
    expr: typings.angularCompiler.outputAstMod.Expression,
    typeModifiers: js.UndefOr[scala.Nothing],
    typeParams: js.Array[typings.angularCompiler.outputAstMod.Type]
  ): typings.angularCompiler.outputAstMod.ExpressionType_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("expressionType")(expr.asInstanceOf[js.Any], typeModifiers.asInstanceOf[js.Any], typeParams.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ExpressionType_]
  @scala.inline
  def expressionType(
    expr: typings.angularCompiler.outputAstMod.Expression,
    typeModifiers: js.Array[typings.angularCompiler.outputAstMod.TypeModifier]
  ): typings.angularCompiler.outputAstMod.ExpressionType_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("expressionType")(expr.asInstanceOf[js.Any], typeModifiers.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ExpressionType_]
  @scala.inline
  def expressionType(
    expr: typings.angularCompiler.outputAstMod.Expression,
    typeModifiers: js.Array[typings.angularCompiler.outputAstMod.TypeModifier],
    typeParams: js.Array[typings.angularCompiler.outputAstMod.Type]
  ): typings.angularCompiler.outputAstMod.ExpressionType_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("expressionType")(expr.asInstanceOf[js.Any], typeModifiers.asInstanceOf[js.Any], typeParams.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ExpressionType_]
  
  @scala.inline
  def findReadVarNames(stmts: js.Array[typings.angularCompiler.outputAstMod.Statement]): typings.std.Set[java.lang.String] = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("findReadVarNames")(stmts.asInstanceOf[js.Any]).asInstanceOf[typings.std.Set[java.lang.String]]
  
  @scala.inline
  def fn(
    params: js.Array[typings.angularCompiler.outputAstMod.FnParam],
    body: js.Array[typings.angularCompiler.outputAstMod.Statement]
  ): typings.angularCompiler.outputAstMod.FunctionExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.FunctionExpr]
  @scala.inline
  def fn(
    params: js.Array[typings.angularCompiler.outputAstMod.FnParam],
    body: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typings.angularCompiler.outputAstMod.FunctionExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.FunctionExpr]
  @scala.inline
  def fn(
    params: js.Array[typings.angularCompiler.outputAstMod.FnParam],
    body: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: scala.Null,
    name: java.lang.String
  ): typings.angularCompiler.outputAstMod.FunctionExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.FunctionExpr]
  @scala.inline
  def fn(
    params: js.Array[typings.angularCompiler.outputAstMod.FnParam],
    body: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.FunctionExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.FunctionExpr]
  @scala.inline
  def fn(
    params: js.Array[typings.angularCompiler.outputAstMod.FnParam],
    body: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    name: java.lang.String
  ): typings.angularCompiler.outputAstMod.FunctionExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.FunctionExpr]
  @scala.inline
  def fn(
    params: js.Array[typings.angularCompiler.outputAstMod.FnParam],
    body: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: scala.Null,
    sourceSpan: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typings.angularCompiler.outputAstMod.FunctionExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.FunctionExpr]
  @scala.inline
  def fn(
    params: js.Array[typings.angularCompiler.outputAstMod.FnParam],
    body: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: scala.Null,
    sourceSpan: scala.Null,
    name: java.lang.String
  ): typings.angularCompiler.outputAstMod.FunctionExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.FunctionExpr]
  @scala.inline
  def fn(
    params: js.Array[typings.angularCompiler.outputAstMod.FnParam],
    body: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: scala.Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.FunctionExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.FunctionExpr]
  @scala.inline
  def fn(
    params: js.Array[typings.angularCompiler.outputAstMod.FnParam],
    body: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: scala.Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    name: java.lang.String
  ): typings.angularCompiler.outputAstMod.FunctionExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.FunctionExpr]
  @scala.inline
  def fn(
    params: js.Array[typings.angularCompiler.outputAstMod.FnParam],
    body: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: typings.angularCompiler.outputAstMod.Type
  ): typings.angularCompiler.outputAstMod.FunctionExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.FunctionExpr]
  @scala.inline
  def fn(
    params: js.Array[typings.angularCompiler.outputAstMod.FnParam],
    body: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typings.angularCompiler.outputAstMod.FunctionExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.FunctionExpr]
  @scala.inline
  def fn(
    params: js.Array[typings.angularCompiler.outputAstMod.FnParam],
    body: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: scala.Null,
    name: java.lang.String
  ): typings.angularCompiler.outputAstMod.FunctionExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.FunctionExpr]
  @scala.inline
  def fn(
    params: js.Array[typings.angularCompiler.outputAstMod.FnParam],
    body: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.FunctionExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.FunctionExpr]
  @scala.inline
  def fn(
    params: js.Array[typings.angularCompiler.outputAstMod.FnParam],
    body: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    name: java.lang.String
  ): typings.angularCompiler.outputAstMod.FunctionExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.FunctionExpr]
  
  @scala.inline
  def ifStmt(
    condition: typings.angularCompiler.outputAstMod.Expression,
    thenClause: js.Array[typings.angularCompiler.outputAstMod.Statement]
  ): typings.angularCompiler.outputAstMod.IfStmt_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("ifStmt")(condition.asInstanceOf[js.Any], thenClause.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.IfStmt_]
  @scala.inline
  def ifStmt(
    condition: typings.angularCompiler.outputAstMod.Expression,
    thenClause: js.Array[typings.angularCompiler.outputAstMod.Statement],
    elseClause: js.UndefOr[scala.Nothing],
    sourceSpan: js.UndefOr[scala.Nothing],
    leadingComments: js.Array[typings.angularCompiler.outputAstMod.LeadingComment_]
  ): typings.angularCompiler.outputAstMod.IfStmt_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("ifStmt")(condition.asInstanceOf[js.Any], thenClause.asInstanceOf[js.Any], elseClause.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], leadingComments.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.IfStmt_]
  @scala.inline
  def ifStmt(
    condition: typings.angularCompiler.outputAstMod.Expression,
    thenClause: js.Array[typings.angularCompiler.outputAstMod.Statement],
    elseClause: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.IfStmt_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("ifStmt")(condition.asInstanceOf[js.Any], thenClause.asInstanceOf[js.Any], elseClause.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.IfStmt_]
  @scala.inline
  def ifStmt(
    condition: typings.angularCompiler.outputAstMod.Expression,
    thenClause: js.Array[typings.angularCompiler.outputAstMod.Statement],
    elseClause: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    leadingComments: js.Array[typings.angularCompiler.outputAstMod.LeadingComment_]
  ): typings.angularCompiler.outputAstMod.IfStmt_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("ifStmt")(condition.asInstanceOf[js.Any], thenClause.asInstanceOf[js.Any], elseClause.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], leadingComments.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.IfStmt_]
  @scala.inline
  def ifStmt(
    condition: typings.angularCompiler.outputAstMod.Expression,
    thenClause: js.Array[typings.angularCompiler.outputAstMod.Statement],
    elseClause: js.Array[typings.angularCompiler.outputAstMod.Statement]
  ): typings.angularCompiler.outputAstMod.IfStmt_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("ifStmt")(condition.asInstanceOf[js.Any], thenClause.asInstanceOf[js.Any], elseClause.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.IfStmt_]
  @scala.inline
  def ifStmt(
    condition: typings.angularCompiler.outputAstMod.Expression,
    thenClause: js.Array[typings.angularCompiler.outputAstMod.Statement],
    elseClause: js.Array[typings.angularCompiler.outputAstMod.Statement],
    sourceSpan: js.UndefOr[scala.Nothing],
    leadingComments: js.Array[typings.angularCompiler.outputAstMod.LeadingComment_]
  ): typings.angularCompiler.outputAstMod.IfStmt_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("ifStmt")(condition.asInstanceOf[js.Any], thenClause.asInstanceOf[js.Any], elseClause.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], leadingComments.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.IfStmt_]
  @scala.inline
  def ifStmt(
    condition: typings.angularCompiler.outputAstMod.Expression,
    thenClause: js.Array[typings.angularCompiler.outputAstMod.Statement],
    elseClause: js.Array[typings.angularCompiler.outputAstMod.Statement],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.IfStmt_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("ifStmt")(condition.asInstanceOf[js.Any], thenClause.asInstanceOf[js.Any], elseClause.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.IfStmt_]
  @scala.inline
  def ifStmt(
    condition: typings.angularCompiler.outputAstMod.Expression,
    thenClause: js.Array[typings.angularCompiler.outputAstMod.Statement],
    elseClause: js.Array[typings.angularCompiler.outputAstMod.Statement],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    leadingComments: js.Array[typings.angularCompiler.outputAstMod.LeadingComment_]
  ): typings.angularCompiler.outputAstMod.IfStmt_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("ifStmt")(condition.asInstanceOf[js.Any], thenClause.asInstanceOf[js.Any], elseClause.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], leadingComments.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.IfStmt_]
  
  @scala.inline
  def importExpr(id: typings.angularCompiler.outputAstMod.ExternalReference): typings.angularCompiler.outputAstMod.ExternalExpr = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("importExpr")(id.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.ExternalExpr]
  @scala.inline
  def importExpr(
    id: typings.angularCompiler.outputAstMod.ExternalReference,
    typeParams: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.ExternalExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("importExpr")(id.asInstanceOf[js.Any], typeParams.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ExternalExpr]
  @scala.inline
  def importExpr(
    id: typings.angularCompiler.outputAstMod.ExternalReference,
    typeParams: js.Array[typings.angularCompiler.outputAstMod.Type]
  ): typings.angularCompiler.outputAstMod.ExternalExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("importExpr")(id.asInstanceOf[js.Any], typeParams.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ExternalExpr]
  @scala.inline
  def importExpr(
    id: typings.angularCompiler.outputAstMod.ExternalReference,
    typeParams: js.Array[typings.angularCompiler.outputAstMod.Type],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.ExternalExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("importExpr")(id.asInstanceOf[js.Any], typeParams.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ExternalExpr]
  @scala.inline
  def importExpr(
    id: typings.angularCompiler.outputAstMod.ExternalReference,
    typeParams: scala.Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.ExternalExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("importExpr")(id.asInstanceOf[js.Any], typeParams.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ExternalExpr]
  
  @scala.inline
  def importType(id: typings.angularCompiler.outputAstMod.ExternalReference): typings.angularCompiler.outputAstMod.ExpressionType_ | scala.Null = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("importType")(id.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.ExpressionType_ | scala.Null]
  @scala.inline
  def importType(
    id: typings.angularCompiler.outputAstMod.ExternalReference,
    typeParams: js.UndefOr[scala.Nothing],
    typeModifiers: js.Array[typings.angularCompiler.outputAstMod.TypeModifier]
  ): typings.angularCompiler.outputAstMod.ExpressionType_ | scala.Null = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("importType")(id.asInstanceOf[js.Any], typeParams.asInstanceOf[js.Any], typeModifiers.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ExpressionType_ | scala.Null]
  @scala.inline
  def importType(
    id: typings.angularCompiler.outputAstMod.ExternalReference,
    typeParams: js.Array[typings.angularCompiler.outputAstMod.Type]
  ): typings.angularCompiler.outputAstMod.ExpressionType_ | scala.Null = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("importType")(id.asInstanceOf[js.Any], typeParams.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ExpressionType_ | scala.Null]
  @scala.inline
  def importType(
    id: typings.angularCompiler.outputAstMod.ExternalReference,
    typeParams: js.Array[typings.angularCompiler.outputAstMod.Type],
    typeModifiers: js.Array[typings.angularCompiler.outputAstMod.TypeModifier]
  ): typings.angularCompiler.outputAstMod.ExpressionType_ | scala.Null = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("importType")(id.asInstanceOf[js.Any], typeParams.asInstanceOf[js.Any], typeModifiers.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ExpressionType_ | scala.Null]
  @scala.inline
  def importType(
    id: typings.angularCompiler.outputAstMod.ExternalReference,
    typeParams: scala.Null,
    typeModifiers: js.Array[typings.angularCompiler.outputAstMod.TypeModifier]
  ): typings.angularCompiler.outputAstMod.ExpressionType_ | scala.Null = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("importType")(id.asInstanceOf[js.Any], typeParams.asInstanceOf[js.Any], typeModifiers.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ExpressionType_ | scala.Null]
  
  @scala.inline
  def isNull(exp: typings.angularCompiler.outputAstMod.Expression): scala.Boolean = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(exp.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def jsDocComment(): typings.angularCompiler.outputAstMod.JSDocComment_ = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("jsDocComment")().asInstanceOf[typings.angularCompiler.outputAstMod.JSDocComment_]
  @scala.inline
  def jsDocComment(tags: js.Array[typings.angularCompiler.outputAstMod.JSDocTag]): typings.angularCompiler.outputAstMod.JSDocComment_ = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("jsDocComment")(tags.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.JSDocComment_]
  
  @scala.inline
  def leadingComment(text: java.lang.String): typings.angularCompiler.outputAstMod.LeadingComment_ = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.LeadingComment_]
  @scala.inline
  def leadingComment(text: java.lang.String, multiline: js.UndefOr[scala.Nothing], trailingNewline: scala.Boolean): typings.angularCompiler.outputAstMod.LeadingComment_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any], trailingNewline.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LeadingComment_]
  @scala.inline
  def leadingComment(text: java.lang.String, multiline: scala.Boolean): typings.angularCompiler.outputAstMod.LeadingComment_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LeadingComment_]
  @scala.inline
  def leadingComment(text: java.lang.String, multiline: scala.Boolean, trailingNewline: scala.Boolean): typings.angularCompiler.outputAstMod.LeadingComment_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any], trailingNewline.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LeadingComment_]
  
  @scala.inline
  def literal(value: js.Any): typings.angularCompiler.outputAstMod.LiteralExpr = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.LiteralExpr]
  @scala.inline
  def literal(
    value: js.Any,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.LiteralExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LiteralExpr]
  @scala.inline
  def literal(
    value: js.Any,
    `type`: scala.Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.LiteralExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LiteralExpr]
  @scala.inline
  def literal(value: js.Any, `type`: typings.angularCompiler.outputAstMod.Type): typings.angularCompiler.outputAstMod.LiteralExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LiteralExpr]
  @scala.inline
  def literal(
    value: js.Any,
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.LiteralExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LiteralExpr]
  
  @scala.inline
  def literalArr(values: js.Array[typings.angularCompiler.outputAstMod.Expression]): typings.angularCompiler.outputAstMod.LiteralArrayExpr = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("literalArr")(values.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.LiteralArrayExpr]
  @scala.inline
  def literalArr(
    values: js.Array[typings.angularCompiler.outputAstMod.Expression],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.LiteralArrayExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("literalArr")(values.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LiteralArrayExpr]
  @scala.inline
  def literalArr(
    values: js.Array[typings.angularCompiler.outputAstMod.Expression],
    `type`: scala.Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.LiteralArrayExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("literalArr")(values.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LiteralArrayExpr]
  @scala.inline
  def literalArr(
    values: js.Array[typings.angularCompiler.outputAstMod.Expression],
    `type`: typings.angularCompiler.outputAstMod.Type
  ): typings.angularCompiler.outputAstMod.LiteralArrayExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("literalArr")(values.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LiteralArrayExpr]
  @scala.inline
  def literalArr(
    values: js.Array[typings.angularCompiler.outputAstMod.Expression],
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.LiteralArrayExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("literalArr")(values.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LiteralArrayExpr]
  
  @scala.inline
  def literalMap(values: js.Array[typings.angularCompiler.anon.Key]): typings.angularCompiler.outputAstMod.LiteralMapExpr = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("literalMap")(values.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.LiteralMapExpr]
  @scala.inline
  def literalMap(
    values: js.Array[typings.angularCompiler.anon.Key],
    `type`: typings.angularCompiler.outputAstMod.MapType
  ): typings.angularCompiler.outputAstMod.LiteralMapExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("literalMap")(values.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LiteralMapExpr]
  
  @scala.inline
  def localizedString(
    metaBlock: typings.angularCompiler.metaMod.I18nMeta,
    messageParts: js.Array[typings.angularCompiler.outputAstMod.LiteralPiece],
    placeholderNames: js.Array[typings.angularCompiler.outputAstMod.PlaceholderPiece],
    expressions: js.Array[typings.angularCompiler.outputAstMod.Expression]
  ): typings.angularCompiler.outputAstMod.LocalizedString_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("localizedString")(metaBlock.asInstanceOf[js.Any], messageParts.asInstanceOf[js.Any], placeholderNames.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LocalizedString_]
  @scala.inline
  def localizedString(
    metaBlock: typings.angularCompiler.metaMod.I18nMeta,
    messageParts: js.Array[typings.angularCompiler.outputAstMod.LiteralPiece],
    placeholderNames: js.Array[typings.angularCompiler.outputAstMod.PlaceholderPiece],
    expressions: js.Array[typings.angularCompiler.outputAstMod.Expression],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.LocalizedString_ = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("localizedString")(metaBlock.asInstanceOf[js.Any], messageParts.asInstanceOf[js.Any], placeholderNames.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LocalizedString_]
  
  @scala.inline
  def not(expr: typings.angularCompiler.outputAstMod.Expression): typings.angularCompiler.outputAstMod.NotExpr = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("not")(expr.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.NotExpr]
  @scala.inline
  def not(
    expr: typings.angularCompiler.outputAstMod.Expression,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.NotExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("not")(expr.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.NotExpr]
  
  @scala.inline
  def nullSafeIsEquivalent[T /* <: typings.angularCompiler.anon.IsEquivalent[T] */](): scala.Boolean = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("nullSafeIsEquivalent")().asInstanceOf[scala.Boolean]
  @scala.inline
  def nullSafeIsEquivalent[T /* <: typings.angularCompiler.anon.IsEquivalent[T] */](base: T): scala.Boolean = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("nullSafeIsEquivalent")(base.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def nullSafeIsEquivalent[T /* <: typings.angularCompiler.anon.IsEquivalent[T] */](base: T, other: T): scala.Boolean = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("nullSafeIsEquivalent")(base.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def nullSafeIsEquivalent[T /* <: typings.angularCompiler.anon.IsEquivalent[T] */](base: scala.Null, other: T): scala.Boolean = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("nullSafeIsEquivalent")(base.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def typeofExpr(expr: typings.angularCompiler.outputAstMod.Expression): typings.angularCompiler.outputAstMod.TypeofExpr_ = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("typeofExpr")(expr.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.TypeofExpr_]
  
  @scala.inline
  def unary(
    operator: typings.angularCompiler.outputAstMod.UnaryOperator,
    expr: typings.angularCompiler.outputAstMod.Expression
  ): typings.angularCompiler.outputAstMod.UnaryOperatorExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("unary")(operator.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.UnaryOperatorExpr]
  @scala.inline
  def unary(
    operator: typings.angularCompiler.outputAstMod.UnaryOperator,
    expr: typings.angularCompiler.outputAstMod.Expression,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.UnaryOperatorExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("unary")(operator.asInstanceOf[js.Any], expr.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.UnaryOperatorExpr]
  @scala.inline
  def unary(
    operator: typings.angularCompiler.outputAstMod.UnaryOperator,
    expr: typings.angularCompiler.outputAstMod.Expression,
    `type`: typings.angularCompiler.outputAstMod.Type
  ): typings.angularCompiler.outputAstMod.UnaryOperatorExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("unary")(operator.asInstanceOf[js.Any], expr.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.UnaryOperatorExpr]
  @scala.inline
  def unary(
    operator: typings.angularCompiler.outputAstMod.UnaryOperator,
    expr: typings.angularCompiler.outputAstMod.Expression,
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.UnaryOperatorExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("unary")(operator.asInstanceOf[js.Any], expr.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.UnaryOperatorExpr]
  
  @scala.inline
  def variable(name: java.lang.String): typings.angularCompiler.outputAstMod.ReadVarExpr = typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("variable")(name.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.ReadVarExpr]
  @scala.inline
  def variable(
    name: java.lang.String,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.ReadVarExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("variable")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ReadVarExpr]
  @scala.inline
  def variable(
    name: java.lang.String,
    `type`: scala.Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.ReadVarExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("variable")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ReadVarExpr]
  @scala.inline
  def variable(name: java.lang.String, `type`: typings.angularCompiler.outputAstMod.Type): typings.angularCompiler.outputAstMod.ReadVarExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("variable")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ReadVarExpr]
  @scala.inline
  def variable(
    name: java.lang.String,
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): typings.angularCompiler.outputAstMod.ReadVarExpr = (typings.angularCompiler.outputAstMod.^.asInstanceOf[js.Dynamic].applyDynamic("variable")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.ReadVarExpr]
}
