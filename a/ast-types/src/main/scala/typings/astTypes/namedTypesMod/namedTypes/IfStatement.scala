package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> */
@js.native
trait IfStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var alternate: js.UndefOr[StatementKind | Null] = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var consequent: StatementKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var test: ExpressionKind = js.native
  
  var `type`: typings.astTypes.astTypesStrings.IfStatement = js.native
}
object IfStatement {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.IfStatement")
  @js.native
  val ^ : Type[IfStatement] = js.native
  
  @scala.inline
  implicit class IfStatementMutableBuilder[Self <: IfStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate(value: StatementKind): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateNull: Self = StObject.set(x, "alternate", null)
    
    @scala.inline
    def setAlternateUndefined: Self = StObject.set(x, "alternate", js.undefined)
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setConsequent(value: StatementKind): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setTest(value: ExpressionKind): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.IfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
