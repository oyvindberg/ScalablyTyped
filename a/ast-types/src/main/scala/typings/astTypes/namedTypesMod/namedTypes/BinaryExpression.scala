package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.astTypesStrings.Ampersand
import typings.astTypes.astTypesStrings.Asterisk
import typings.astTypes.astTypesStrings.AsteriskAsterisk
import typings.astTypes.astTypesStrings.EqualssignEqualssign
import typings.astTypes.astTypesStrings.EqualssignEqualssignEqualssign
import typings.astTypes.astTypesStrings.ExclamationmarkEqualssign
import typings.astTypes.astTypesStrings.ExclamationmarkEqualssignEqualssign
import typings.astTypes.astTypesStrings.Greaterthansign
import typings.astTypes.astTypesStrings.GreaterthansignEqualssign
import typings.astTypes.astTypesStrings.GreaterthansignGreaterthansign
import typings.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typings.astTypes.astTypesStrings.Lessthansign
import typings.astTypes.astTypesStrings.LessthansignEqualssign
import typings.astTypes.astTypesStrings.LessthansignLessthansign
import typings.astTypes.astTypesStrings.Percentsign
import typings.astTypes.astTypesStrings.Plussign
import typings.astTypes.astTypesStrings.Slash
import typings.astTypes.astTypesStrings.Verticalline
import typings.astTypes.astTypesStrings.`-_`
import typings.astTypes.astTypesStrings.in
import typings.astTypes.astTypesStrings.instanceof
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
@js.native
trait BinaryExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var left: ExpressionKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | Ampersand | Verticalline | typings.astTypes.astTypesStrings.^ | in | instanceof | AsteriskAsterisk = js.native
  
  var right: ExpressionKind = js.native
  
  var `type`: typings.astTypes.astTypesStrings.BinaryExpression = js.native
}
object BinaryExpression {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.BinaryExpression")
  @js.native
  val ^ : Type[BinaryExpression] = js.native
  
  @scala.inline
  implicit class BinaryExpressionMutableBuilder[Self <: BinaryExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLeft(value: ExpressionKind): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setOperator(
      value: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | Ampersand | Verticalline | typings.astTypes.astTypesStrings.^ | in | instanceof | AsteriskAsterisk
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: ExpressionKind): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.BinaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
